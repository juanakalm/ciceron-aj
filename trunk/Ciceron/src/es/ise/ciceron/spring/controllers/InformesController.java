package es.ise.ciceron.spring.controllers;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.mail.internet.AddressException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.xml.sax.SAXException;

import es.ise.ciceron.model.AccesoContratos;
import es.ise.ciceron.model.Bloque;
import es.ise.ciceron.model.Correo;
import es.ise.ciceron.model.Descripciones;
import es.ise.ciceron.model.Documentos;
import es.ise.ciceron.model.Expedientes;
import es.ise.ciceron.model.FirmantesInformes;
import es.ise.ciceron.model.Informe;
import es.ise.ciceron.model.InformeJuridico;
import es.ise.ciceron.model.InformeJuridicoModificado;
import es.ise.ciceron.model.Modificados;
import es.ise.ciceron.model.Observaciones;
import es.ise.ciceron.model.Punto;
import es.ise.ciceron.model.PuntosEditados;
import es.ise.ciceron.model.TextoInforme;
import es.ise.ciceron.model.Tipologia;
import es.ise.ciceron.model.UnidadesContratacion;
import es.ise.ciceron.model.Usuario;
import es.ise.ciceron.spring.annotations.SessionParam;
import es.ise.ciceron.spring.command.BusquedaInforme;
import es.ise.ciceron.spring.repositories.GenericDAO;
import es.ise.ciceron.spring.repositories.GenericDAO.Property;
import es.ise.ciceron.spring.repositories.GenericDAO.Property.Operator;
import es.ise.ciceron.spring.repositories.GenericDAO.Sort;
import es.ise.ciceron.spring.services.MailService;
import es.ise.ciceron.spring.services.PortafirmaService;
import es.ise.ciceron.spring.services.ProceduresService;
import es.ise.ciceron.spring.services.ReportService;
import es.ise.ciceron.spring.util.Fichero;

@Controller
@RequestMapping("/informes")
public class InformesController
{

	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@Controller
	@RequestMapping("/informes/ajax")
	public static class InformesAjaxController
	{
		@Autowired
		private GenericDAO genericDAO;

		@RequestMapping("/bloques/{idTipologia}")
		public ModelAndView obtenerBloquesTipologia(@PathVariable BigDecimal idTipologia)
		{
			ModelAndView mav = new ModelAndView("json");
			mav.addObject(genericDAO.list(Bloque.class, new Sort<Bloque>("orden"), "idTipologia", idTipologia));
			return mav;
		}

		@RequestMapping("/puntos/{idBloque}")
		public ModelAndView obtenerPuntosBloques(@PathVariable BigDecimal idBloque)
		{
			ModelAndView mav = new ModelAndView("json");
			mav.addObject(genericDAO.list(Punto.class, new Sort<Punto>("orden"), "idBloque", idBloque));
			return mav;
		}

		@RequestMapping("/comprobarPunto/{idPunto}")
		public ModelAndView comprobarPuntoEnInforme(@PathVariable BigDecimal idPunto)
		{
			ModelAndView mav = new ModelAndView("json");
			if (genericDAO.list(TextoInforme.class, "idPunto", idPunto).size() > 0)
			{
				mav.addObject("comprobarPunto", "No puede eliminarse el punto porque ha sido usado en algún Informe");
			}
			return mav;
		}

		@RequestMapping("/comprobarBloqueConPunto/{idBloque}")
		public ModelAndView comprobarBloqueConPuntoEnInforme(@PathVariable BigDecimal idBloque)
		{
			ModelAndView mav = new ModelAndView("json");
			List<BigDecimal> puntos = new ArrayList<BigDecimal>();
			for (Punto p : genericDAO.list(Punto.class, "idBloque", idBloque))
			{
				puntos.add(p.getId());
			}
			if (!puntos.isEmpty())
			{
				if (genericDAO.list(TextoInforme.class, new Property("idPunto", puntos, Operator.IN)).size() > 0)
				{
					mav.addObject("comprobarBloqueConPunto", "No puede eliminarse el bloque porque tiene puntos que han sido usados en algún Informe");
				}
			}
			return mav;
		}
	}

	@Autowired
	private GenericDAO genericDAO;

	@Autowired
	private ReportService reportService;

	@Autowired
	private ProceduresService proceduresService;

	@Autowired
	private PortafirmaService portafirmaService;

	@Autowired
	private MailService mailService;

	@ModelAttribute("busqueda")
	public BusquedaInforme getBusquedaInforme()
	{
		return new BusquedaInforme();
	}

	@RequestMapping
	public ModelAndView model(@ModelAttribute("busqueda") BusquedaInforme busqueda, BindingResult result)
	{
		ModelAndView mav = new ModelAndView("informes");

		GenericDAO.Property[] propiedades = {};
		GenericDAO.Property[] propiedadesMod = {};
		// creamos las propiedad de la busqueda
		if (!busqueda.getAccion().isEmpty())
		{
			List<GenericDAO.Property> listaPropiedades = new ArrayList<GenericDAO.Property>();
			List<GenericDAO.Property> listaPropiedadesMod = new ArrayList<GenericDAO.Property>();
			if (busqueda.getCodigoExpediente() != null && !busqueda.getCodigoExpediente().isEmpty())
			{
				listaPropiedades.add(new GenericDAO.Property("codigoExpediente", String.format("%%%s%%", busqueda.getCodigoExpediente().toUpperCase()),
						GenericDAO.Property.Operator.LIKE));
				listaPropiedadesMod.add(new GenericDAO.Property("codigoExpediente", String.format("%%%s%%", busqueda.getCodigoExpediente().toUpperCase()),
						GenericDAO.Property.Operator.LIKE));
			}
			if (busqueda.getDescripcionExpediente() != null && !busqueda.getDescripcionExpediente().isEmpty())
			{
				listaPropiedades.add(new GenericDAO.Property("descripcionExpediente", String.format("%%%s%%", busqueda.getDescripcionExpediente().toUpperCase()),
						GenericDAO.Property.Operator.LIKE));
				listaPropiedadesMod.add(new GenericDAO.Property("descripcionContrato", String.format("%%%s%%", busqueda.getDescripcionExpediente().toUpperCase()),
						GenericDAO.Property.Operator.LIKE));
			}
			if (busqueda.getIdUnidadContratacion() != null)
			{
				listaPropiedades.add(new GenericDAO.Property("idUnidadContratacion", busqueda.getIdUnidadContratacion()));
				listaPropiedadesMod.add(new GenericDAO.Property("idUnidadContratacion", busqueda.getIdUnidadContratacion()));
			}
			if (busqueda.getSecuencia() != null)
			{
				listaPropiedades.add(new GenericDAO.Property("secuenciaExpediente", busqueda.getSecuencia()));
				listaPropiedadesMod.add(new GenericDAO.Property("secuenciaExpediente", busqueda.getSecuencia()));
			}
			propiedades = listaPropiedades.toArray(new GenericDAO.Property[] {});
			propiedadesMod = listaPropiedadesMod.toArray(new GenericDAO.Property[] {});
		}

		// Lista de Unidades Organizativas
		mav.addObject("listaUniOrg", genericDAO.list(UnidadesContratacion.class));

		if (!busqueda.getAccion().isEmpty())
		{
			mav.addObject("listaInformes", genericDAO.list(InformeJuridico.class, propiedades));
			mav.addObject("listaInformesMod", genericDAO.list(InformeJuridicoModificado.class, propiedadesMod));
		}

		return mav;
	}

	@RequestMapping("/expediente/abrir/{idExpediente}")
	public ModelAndView abrirExpediente(@PathVariable BigDecimal idExpediente, @SessionParam Usuario usuario, HttpServletRequest request)
	{
		AccesoContratos acceso = new AccesoContratos();
		acceso.setNifUsuario(usuario.getDni());
		acceso.setPaginaEntrada(String.format("/ContratosISE/cargaexpediente.do?id=%s", idExpediente));
		genericDAO.insert(acceso);
		String url = String.format("http://%s:%d/ContratosISE/autologin.do?token=%s", request.getServerName(), request.getServerPort(), acceso.getId());
		return new ModelAndView("redirect:" + url);
	}

	@RequestMapping("/elaborarInforme/{idExpediente}")
	public ModelAndView elaborarInforme(@PathVariable BigDecimal idExpediente, @SessionParam Usuario usuario)
	{
		ModelAndView mav = new ModelAndView("elaborarInforme");
		Expedientes expediente = genericDAO.get(Expedientes.class, idExpediente);
		Informe informe = genericDAO.select(Informe.class, "idExpediente", idExpediente);
		if (informe == null)
		{
			informe = new Informe();
			informe.setCreacion(new Date(), usuario);
			informe.setIdExpediente(idExpediente);
			genericDAO.insert(informe);
		}
		mav.addObject("firmantes", genericDAO.list(FirmantesInformes.class, "idUnidadContracion", expediente.getExpUcId()));
		mav.addObject("estado", proceduresService.estadoInforme(informe.getId()));
		mav.addObject("tipologias", genericDAO.list(Tipologia.class));
		mav.addObject("listaPuntosInforme", genericDAO.list(PuntosEditados.class, "idInforme", informe.getId()));
		mav.addObject("informe", informe);
		return mav;
	}

	@RequestMapping(value = "/elaborarInforme/guardar", method = RequestMethod.POST)
	public ModelAndView guardarElaboracionInforme(@SessionParam Usuario usuario, TextoInforme textoInforme, BindingResult result)
	{
		Informe informe = genericDAO.get(Informe.class, textoInforme.getIdInforme());
		ModelAndView mav = new ModelAndView(String.format("redirect:/app/informes/elaborarInforme/" + informe.getIdExpediente()));
		boolean nuevo = textoInforme.getId() == null;
		if (nuevo)
		{
			textoInforme.setCreacion(new Date(), usuario);
			textoInforme.setActualizacion(new Date(), usuario);
		} else
		{
			textoInforme.copyCreacion(genericDAO.get(TextoInforme.class, textoInforme.getId()));
			textoInforme.setActualizacion(new Date(), usuario);
		}
		genericDAO.insertOrUpdate(TextoInforme.class, textoInforme);
		return mav;
	}

	@RequestMapping(value = "/elaborarInforme/eliminarLineaInforme/{idTextoInforme}", method = RequestMethod.GET)
	public ModelAndView eliminarPunto(@PathVariable BigDecimal idTextoInforme)
	{
		TextoInforme textoInforme = genericDAO.get(TextoInforme.class, idTextoInforme);
		Informe informe = genericDAO.get(Informe.class, textoInforme.getIdInforme());
		ModelAndView mav = new ModelAndView("redirect:/app/informes/elaborarInforme/" + informe.getIdExpediente());
		genericDAO.delete(TextoInforme.class, idTextoInforme);
		return mav;
	}

	@RequestMapping("/elaborarInforme/generarBorrador/{idInforme}")
	public ModelAndView generarBorrador(@PathVariable BigDecimal idInforme, HttpServletResponse response) throws IOException, SAXException
	{
		String url = reportService.getUrlReport("AJ_INFORME", "P_INF_ID", idInforme.toString());
		return new ModelAndView("redirect:" + url);
		// reportService.sendPdfToBrowser(reportService.getReport("AJ_INFORME",
		// "P_INF_ID", idInforme.toString()), response);
	}

	@RequestMapping(value = "/elaborarInforme/generarReport/{idInforme}")
	public ModelAndView generarReport(@PathVariable BigDecimal idInforme, @SessionParam Usuario usuario) throws IOException, SAXException
	{
		Informe informe = genericDAO.get(Informe.class, idInforme);
		InformeJuridicoModificado informeModif = genericDAO.select(InformeJuridicoModificado.class, "idExpediente", informe.getIdExpediente());
		ModelAndView mav = new ModelAndView("redirect:/app/informes/elaborarInforme/" + informe.getIdExpediente());

		Documentos doc = new Documentos();
		doc.setIdTipoDocumento(new BigDecimal(7));
		doc.setIdExpediente(informe.getIdExpediente());
		doc.setFichero(reportService.getReport("AJ_INFORME", "P_INF_ID", idInforme.toString()));
		doc.setNombreFichero(String.format("Informe_%s", informe.getIdExpediente()));
		doc.setExtension("pdf");
		doc.setCreacion(new Date(), usuario);
		if (informeModif != null)
			doc.setIdModificado(informeModif.getIdModificado());
		genericDAO.insert(doc);
		informe.setIdDocumento(doc.getId());
		informe.setActualizacion(new Date(), usuario);
		genericDAO.insertOrUpdate(Informe.class, informe);

		return mav;
	}

	@RequestMapping("/elaborarInforme/visualizar/{idDocumento}")
	public void visualizarInforme(@PathVariable BigDecimal idDocumento, OutputStream out, HttpServletResponse response) throws IOException
	{
		Documentos documento = genericDAO.selectWithBlob(Documentos.class, "id", idDocumento);
		reportService.sendPdfToBrowser(portafirmaService.getDocInputStream(documento), response);
	}

	@RequestMapping("/elaborarInforme/sustituir/{idInforme}")
	public ModelAndView sustituirInforme(@PathVariable BigDecimal idInforme, @RequestParam MultipartFile fichero, @SessionParam Usuario usuario, HttpSession session)
			throws IOException
	{
		Informe informe = genericDAO.get(Informe.class, idInforme);
		ModelAndView mav = new ModelAndView("redirect:/app/informes/elaborarInforme/" + informe.getIdExpediente());
		if (fichero != null)
		{
			if (fichero.getContentType().equals("application/pdf"))
			{
				Documentos doc = genericDAO.get(Documentos.class, informe.getIdDocumento());
				Fichero fich = new Fichero(fichero.getOriginalFilename());
				doc.setFichero(fichero.getBytes());
				doc.setNombreFichero(fich.getNameWithoutExtension());
				doc.setExtension(fich.getExtension());
				doc.setActualizacion(new Date(), usuario);
				genericDAO.insertOrUpdateWithBlob(Documentos.class, doc);
			}
			// else{
			// session.setAttribute("mensaje", "Seleccione un fichero .pdf");
			// }
		}
		return mav;
	}

	@RequestMapping(value = "/elaborarInforme/eliminar/{idInforme}", method = RequestMethod.GET)
	public ModelAndView eliminarInforme(@PathVariable BigDecimal idInforme, @SessionParam Usuario usuario)
	{
		Informe informe = genericDAO.get(Informe.class, idInforme);
		BigDecimal idDocumento = informe.getIdDocumento();
		ModelAndView mav = new ModelAndView("redirect:/app/informes/elaborarInforme/" + informe.getIdExpediente());
		informe.setIdDocumento(null);
		informe.setActualizacion(new Date(), usuario);
		genericDAO.insertOrUpdate(Informe.class, informe);
		genericDAO.delete(Documentos.class, idDocumento);
		return mav;
	}

	@RequestMapping(value = "/elaborarInforme/enviar/{idInforme}", method = RequestMethod.POST)
	public ModelAndView enviarInforme(@PathVariable BigDecimal idInforme, @RequestParam String firmante, @SessionParam Usuario usuario)
	{
		Informe informe = genericDAO.get(Informe.class, idInforme);
		Expedientes exp = genericDAO.get(Expedientes.class, informe.getIdExpediente());
		ModelAndView mav = new ModelAndView("redirect:/app/informes/elaborarInforme/" + informe.getIdExpediente());
		Documentos doc = genericDAO.getWithBlob(Documentos.class, informe.getIdDocumento());
		String asunto = String.format("Informe Asesoría Jurídica. Expediente %s", exp.getExpCodigo());
		portafirmaService.enviarDocumentoAPortafirma(doc, asunto, usuario, firmante);
		doc.setFechaEnvio(new Date());
		doc.setActualizacion(new Date(), usuario);
		genericDAO.insertOrUpdate(Documentos.class, doc);
		return mav;
	}

	@RequestMapping("/observaciones/{idExpediente}")
	public ModelAndView observacionExp(@PathVariable BigDecimal idExpediente, @SessionParam Usuario usuario)
	{
		ModelAndView mav = new ModelAndView("observaciones");

		if (genericDAO.list(InformeJuridicoModificado.class, "idModificado", idExpediente).size() > 0)
		{
			Modificados mod = genericDAO.get(Modificados.class, idExpediente);
			mav.addObject("expediente", mod);
			mav.addObject("exp", genericDAO.select(Modificados.class, "id", idExpediente));
			// //Lista de comentarios
			// List<String>comentarios = new ArrayList<String>();
			// for(Observaciones elem: genericDAO.list(Observaciones.class,
			// "ident", idExpediente)){
			// comentarios.add(elem.getComentario());
			// }
			// //Lista de respuestas
			// List<String>respuesta = new ArrayList<String>();
			// for(Observaciones elem: genericDAO.list(Observaciones.class,
			// "ident", idExpediente)){
			// respuesta.add(elem.getRespuesta());
			// }

		} else
		{
			Expedientes exp = genericDAO.get(Expedientes.class, idExpediente);
			mav.addObject("expediente", exp);
			mav.addObject("exp", genericDAO.select(Descripciones.class, "id", idExpediente));
		}

		Comparator<Observaciones> comparador = new Comparator<Observaciones>() {
			@Override
			public int compare(Observaciones ob1, Observaciones ob2)
			{
				return ob1.getfActu().compareTo(ob2.getfActu());
			}
		};

		// mav.addObject("observaciones", genericDAO.list(Observaciones.class,
		// comparador, "ident",idExpediente));
		List<Observaciones> listaObs = genericDAO.list(Observaciones.class, comparador, "ident", idExpediente);
		if (!listaObs.isEmpty())
		{
			Observaciones ob = listaObs.get(listaObs.size() - 1);
			mav.addObject("observacion", ob);
		}

		// Probamos como concatenar los comentarios con sus correspondientes
		// respuestas
		// String ejemplo = "";
		// for(Observaciones obs: listaObs){
		// String coment = obs.getComentario();
		// String respuesta = obs.getRespuesta();
		// ejemplo += "\nComentario:\n\t"+coment;
		// if(respuesta != null)
		// ejemplo += "\n\nRespuesta:\n\t"+respuesta;
		// mav.addObject("ejemplo", ejemplo);
		// }

		// Lista de posibles personas a las que enviar correos
		mav.addObject("correos", genericDAO.list(Correo.class));
		mav.addObject("listaObservaciones", listaObs);

		return mav;
	}

	@RequestMapping(value = "/observaciones/guardar/{idExpediente}", method = RequestMethod.POST)
	public ModelAndView guardarObservacion(@PathVariable BigDecimal idExpediente, @SessionParam Usuario usuario, Modificados mod, Descripciones des, BindingResult result)
	{
		ModelAndView mav = new ModelAndView("redirect:/app/informes/observaciones/" + idExpediente);

		if (genericDAO.list(InformeJuridicoModificado.class, "idModificado", idExpediente).size() > 0)
		{

			mod.copyCreacion(genericDAO.get(Modificados.class, mod.getId()));
			mod.setActualizacion(new Date(), usuario);
			genericDAO.insertOrUpdate(Modificados.class, mod);

		} else
		{
			Descripciones descripcion = genericDAO.select(Descripciones.class, "id", idExpediente);
			if(descripcion != null){
				des.setIdDescripcion(descripcion.getIdDescripcion());
			}
			des.setActualizacion(new Date(), usuario);
			genericDAO.insertOrUpdate(Descripciones.class, des);
		}
		return mav;

		// obs.setIdent(idExpediente);
		//
		// if(genericDAO.list(InformeJuridicoModificado.class, "idModificado",
		// idExpediente).size()>0)
		// obs.setTipo("mod");
		// else
		// obs.setTipo("exp");
		//
		// if(obs.getId() != null){
		// obs.copyCreacion(genericDAO.get(Observaciones.class, obs.getId()));
		// obs.setActualizacion(new Date(), usuario);
		// }else
		// obs.setCreacion(new Date(), usuario);
		//
		// genericDAO.insertOrUpdate(Observaciones.class, obs);

	}

	@RequestMapping("/observaciones/validar/{idExpediente}")
	public ModelAndView validarObservacion(@PathVariable BigDecimal idExpediente, @SessionParam Usuario usuario, Correo correo, Observaciones obs) throws AddressException
	{
		ModelAndView mav = new ModelAndView("redirect:/app/informes/observaciones/" + idExpediente);

		obs.setIdent(idExpediente);
		if (genericDAO.list(InformeJuridicoModificado.class, "idModificado", idExpediente).size() > 0)
		{
			obs.setTipo("mod");
			Modificados mod = genericDAO.get(Modificados.class, idExpediente);
			// obs.setComentario(mod.getComentarioAj());
			mod.setActualizacion(new Date(), usuario);
			mod.setComentarioAj(obs.getComentario());
			genericDAO.insertOrUpdate(Modificados.class, mod);

		} else
		{
			obs.setTipo("exp");
			Descripciones des = genericDAO.select(Descripciones.class, "id", idExpediente);
			des.setActualizacion(new Date(), usuario);
			des.setComentarioAj(obs.getComentario());
			genericDAO.insertOrUpdate(Descripciones.class, des);
			// obs.setComentario(des.getComentarioAj());
		}
		obs.setCreacion(new Date(), usuario);

		// Campos correspondientes al envio del email
		obs.setfEnvio(new Date());

		Correo c = genericDAO.select(Correo.class, "email", correo.getEmail());
		obs.setuRemitente(usuario.getIdentificador());
		obs.setuDestinatario(c.getIdentificador());
		obs.setMailDestinatario(c.getEmail());

		genericDAO.insert(obs);

		 mailService.sendMail(obs.getComentario(), obs.getMailDestinatario());
//		 mailService.sendMail(obs.getComentario(), "jlomir@gmail.com");

		return mav;
	}

}
