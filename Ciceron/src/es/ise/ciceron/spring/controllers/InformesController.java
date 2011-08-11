package es.ise.ciceron.spring.controllers;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
import es.ise.ciceron.model.Documentos;
import es.ise.ciceron.model.Expedientes;
import es.ise.ciceron.model.FirmantesInformes;
import es.ise.ciceron.model.Informe;
import es.ise.ciceron.model.InformeJuridico;
import es.ise.ciceron.model.InformeJuridicoModificado;
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
import es.ise.ciceron.spring.services.PortafirmaService;
import es.ise.ciceron.spring.services.ProceduresService;
import es.ise.ciceron.spring.services.ReportService;
import es.ise.ciceron.spring.util.Fichero;

@Controller
@RequestMapping("/informes")
public class InformesController {
	
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
			mav.addObject(genericDAO.list(Bloque.class, new Sort<Bloque>("orden"),"idTipologia", idTipologia));
			return mav;
		}
		
		@RequestMapping("/puntos/{idBloque}")
		public ModelAndView obtenerPuntosBloques(@PathVariable BigDecimal idBloque)
		{
			ModelAndView mav = new ModelAndView("json");
			mav.addObject(genericDAO.list(Punto.class, new Sort<Punto>("orden"),"idBloque", idBloque));
			return mav;
		}
		
		@RequestMapping("/comprobarPunto/{idPunto}")
		public ModelAndView comprobarPuntoEnInforme(@PathVariable BigDecimal idPunto)
		{
			ModelAndView mav = new ModelAndView("json");
			if(genericDAO.list(TextoInforme.class, "idPunto", idPunto).size()>0)
			{
				mav.addObject("comprobarPunto","No puede eliminarse el punto porque ha sido usado en algún Informe");
			}
			return mav;
		}
		
		@RequestMapping("/comprobarBloqueConPunto/{idBloque}")
		public ModelAndView comprobarBloqueConPuntoEnInforme(@PathVariable BigDecimal idBloque)
		{
			ModelAndView mav = new ModelAndView("json");
			List<BigDecimal>puntos = new ArrayList<BigDecimal>();
			for(Punto p: genericDAO.list(Punto.class, "idBloque",idBloque))
			{
				puntos.add(p.getId());
			}
			if(!puntos.isEmpty()){
				if(genericDAO.list(TextoInforme.class, new Property ("idPunto", puntos, Operator.IN)).size()>0)
				{
					mav.addObject("comprobarBloqueConPunto","No puede eliminarse el bloque porque tiene puntos que han sido usados en algún Informe");
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
	
	@ModelAttribute("busqueda")
	public BusquedaInforme getBusquedaInforme(){
		return new BusquedaInforme();
	}
	
	@RequestMapping	
	public ModelAndView model(@ModelAttribute("busqueda") BusquedaInforme busqueda, BindingResult result){
		ModelAndView mav = new ModelAndView("informes");
		
		GenericDAO.Property[] propiedades = {};
		GenericDAO.Property[] propiedadesMod = {};
		//creamos las propiedad de la busqueda
		if(!busqueda.getAccion().isEmpty())
		{
			List<GenericDAO.Property> listaPropiedades = new ArrayList<GenericDAO.Property>();
			List<GenericDAO.Property> listaPropiedadesMod = new ArrayList<GenericDAO.Property>();
			if(busqueda.getCodigoExpediente() != null && !busqueda.getCodigoExpediente().isEmpty()){
				listaPropiedades.add(new GenericDAO.Property("codigoExpediente", String.format("%%%s%%", busqueda.getCodigoExpediente().toUpperCase()), GenericDAO.Property.Operator.LIKE));
				listaPropiedadesMod.add(new GenericDAO.Property("codigoExpediente", String.format("%%%s%%", busqueda.getCodigoExpediente().toUpperCase()), GenericDAO.Property.Operator.LIKE));
			}
			if(busqueda.getDescripcionExpediente() !=null && !busqueda.getDescripcionExpediente().isEmpty()){
				listaPropiedades.add(new GenericDAO.Property("descripcionExpediente", String.format("%%%s%%", busqueda.getDescripcionExpediente().toUpperCase()), GenericDAO.Property.Operator.LIKE));
				listaPropiedadesMod.add(new GenericDAO.Property("descripcionContrato", String.format("%%%s%%", busqueda.getDescripcionExpediente().toUpperCase()), GenericDAO.Property.Operator.LIKE));
			}
			if(busqueda.getIdUnidadContratacion() !=null){
				listaPropiedades.add(new GenericDAO.Property("idUnidadContratacion", busqueda.getIdUnidadContratacion()));
				listaPropiedadesMod.add(new GenericDAO.Property("idUnidadContratacion", busqueda.getIdUnidadContratacion()));
			}
			if(busqueda.getSecuencia() !=null){
				listaPropiedades.add(new GenericDAO.Property("secuenciaExpediente", busqueda.getSecuencia()));
				listaPropiedadesMod.add(new GenericDAO.Property("secuenciaExpediente", busqueda.getSecuencia()));
			}			
			propiedades = listaPropiedades.toArray(new GenericDAO.Property[]{});
			propiedadesMod = listaPropiedadesMod.toArray(new GenericDAO.Property[]{});
		}
		
		//Lista de Unidades Organizativas
		mav.addObject("listaUniOrg",genericDAO.list(UnidadesContratacion.class));
		
		if(!busqueda.getAccion().isEmpty())
		{
			mav.addObject("listaInformes",genericDAO.list(InformeJuridico.class, propiedades));
			mav.addObject("listaInformesMod",genericDAO.list(InformeJuridicoModificado.class, propiedadesMod));
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
		String url = String.format("http://%s:%d/ContratosISE/autologin.do?token=%s",request.getServerName(), request.getServerPort(), acceso.getId());
		return new ModelAndView("redirect:"+url);
	}
	
	@RequestMapping("/elaborarInforme/{idExpediente}")
	public ModelAndView elaborarInforme(@PathVariable BigDecimal idExpediente, @SessionParam Usuario usuario)
	{
		ModelAndView mav = new ModelAndView("elaborarInforme");
		Expedientes expediente = genericDAO.get(Expedientes.class, idExpediente);
		Informe informe = genericDAO.select(Informe.class, "idExpediente", idExpediente);
		if(informe == null)
		{
			informe = new Informe();
			informe.setCreacion(new Date(), usuario);
			informe.setIdExpediente(idExpediente);
			genericDAO.insert(informe);
		}
		mav.addObject("firmantes", genericDAO.list(FirmantesInformes.class,"idUnidadContracion",expediente.getExpUcId()));
		mav.addObject("estado", proceduresService.estadoInforme(informe.getId()));
		mav.addObject("tipologias", genericDAO.list(Tipologia.class));
		mav.addObject("listaPuntosInforme",genericDAO.list(PuntosEditados.class, "idInforme", informe.getId()));
		mav.addObject("informe", informe);
		return mav;
	}

	@RequestMapping(value="/elaborarInforme/guardar", method=RequestMethod.POST)
	public ModelAndView guardarElaboracionInforme(@SessionParam Usuario usuario, TextoInforme textoInforme, BindingResult result)
	{
		Informe informe = genericDAO.get(Informe.class, textoInforme.getIdInforme());
		ModelAndView mav = new ModelAndView(String.format("redirect:/app/informes/elaborarInforme/"+informe.getIdExpediente()));
		boolean nuevo = textoInforme.getId() == null;
		if(nuevo){
			textoInforme.setCreacion(new Date(), usuario);
			textoInforme.setActualizacion(new Date(), usuario);
		}
		else{
			textoInforme.copyCreacion(genericDAO.get(TextoInforme.class, textoInforme.getId()));
			textoInforme.setActualizacion(new Date(), usuario);
		}
		genericDAO.insertOrUpdate(TextoInforme.class, textoInforme);
		return mav;
	}
	
	@RequestMapping(value="/elaborarInforme/eliminarLineaInforme/{idTextoInforme}", method=RequestMethod.GET)
	public ModelAndView eliminarPunto(@PathVariable BigDecimal idTextoInforme)
	{
		TextoInforme textoInforme = genericDAO.get(TextoInforme.class, idTextoInforme);
		Informe informe = genericDAO.get(Informe.class, textoInforme.getIdInforme());
		ModelAndView mav = new  ModelAndView("redirect:/app/informes/elaborarInforme/"+informe.getIdExpediente());
		genericDAO.delete(TextoInforme.class, idTextoInforme);
		return mav;
	}
	
	@RequestMapping("/elaborarInforme/generarBorrador/{idInforme}")
	public ModelAndView generarBorrador(@PathVariable BigDecimal idInforme, HttpServletResponse response) throws IOException, SAXException
	{
		String url = reportService.getUrlReport("AJ_INFORME", "P_INF_ID", idInforme.toString());
		return new ModelAndView("redirect:"+url);
//		reportService.sendPdfToBrowser(reportService.getReport("AJ_INFORME", "P_INF_ID", idInforme.toString()), response);
	}
	
	
	
	@RequestMapping(value="/elaborarInforme/generarReport/{idInforme}")
	public ModelAndView generarReport(@PathVariable BigDecimal idInforme, @SessionParam Usuario usuario)throws IOException, SAXException
	{
		Informe informe = genericDAO.get(Informe.class, idInforme);
		InformeJuridicoModificado informeModif= genericDAO.select(InformeJuridicoModificado.class, "idExpediente", informe.getIdExpediente()); 
		ModelAndView mav = new ModelAndView("redirect:/app/informes/elaborarInforme/"+informe.getIdExpediente());
		
		Documentos doc = new Documentos();
		doc.setIdTipoDocumento(new BigDecimal(7));
		doc.setIdExpediente(informe.getIdExpediente());
		doc.setFichero(reportService.getReport("AJ_INFORME", "P_INF_ID", idInforme.toString()));
		doc.setNombreFichero(String.format("Informe_%s", informe.getIdExpediente()));
		doc.setExtension("pdf");
		doc.setCreacion(new Date(), usuario);
		if(informeModif != null)
			doc.setIdModificado(informeModif.getIdModificado());
		genericDAO.insert(doc);
		informe.setIdDocumento(doc.getId());
		informe.setActualizacion(new Date(), usuario);
		genericDAO.insertOrUpdate(Informe.class, informe);
		
		return mav;
	}
	
	@RequestMapping("/elaborarInforme/visualizar/{idDocumento}")
	public void visualizarInforme(@PathVariable BigDecimal idDocumento, OutputStream out,HttpServletResponse response) throws IOException
	{
		Documentos documento = genericDAO.selectWithBlob(Documentos.class, "id", idDocumento);
		reportService.sendPdfToBrowser(portafirmaService.getDocInputStream(documento), response);
	}
	
	@RequestMapping("/elaborarInforme/sustituir/{idInforme}")
	public ModelAndView sustituirInforme(@PathVariable BigDecimal idInforme, @RequestParam MultipartFile fichero, @SessionParam Usuario usuario, HttpSession session) throws IOException
	{
		Informe informe = genericDAO.get(Informe.class, idInforme);
		ModelAndView mav = new ModelAndView("redirect:/app/informes/elaborarInforme/"+informe.getIdExpediente());
		if(fichero != null ){
			if(fichero.getContentType().equals("application/pdf")){
				Documentos doc = genericDAO.get(Documentos.class, informe.getIdDocumento());
				Fichero fich = new Fichero(fichero.getOriginalFilename());
				doc.setFichero(fichero.getBytes());
				doc.setNombreFichero(fich.getNameWithoutExtension());
				doc.setExtension(fich.getExtension());
				doc.setActualizacion(new Date(), usuario);
				genericDAO.insertOrUpdateWithBlob(Documentos.class, doc);
			}
//			else{
//				session.setAttribute("mensaje", "Seleccione un fichero .pdf");
//			}
		}
		return mav;
	}
	
	@RequestMapping(value="/elaborarInforme/eliminar/{idInforme}", method=RequestMethod.GET)
	public ModelAndView eliminarInforme (@PathVariable BigDecimal idInforme, @SessionParam Usuario usuario)
	{
		Informe informe = genericDAO.get(Informe.class, idInforme);
		BigDecimal idDocumento = informe.getIdDocumento();
		ModelAndView mav = new ModelAndView("redirect:/app/informes/elaborarInforme/"+informe.getIdExpediente());
		informe.setIdDocumento(null);
		informe.setActualizacion(new Date(), usuario);
		genericDAO.insertOrUpdate(Informe.class, informe);
		genericDAO.delete(Documentos.class, idDocumento);
		return mav;
	}
	
	@RequestMapping(value="/elaborarInforme/enviar/{idInforme}", method=RequestMethod.POST)
	public ModelAndView enviarInforme(@PathVariable BigDecimal idInforme, @RequestParam String firmante,@SessionParam Usuario usuario)
	{
		Informe informe = genericDAO.get(Informe.class, idInforme);
		Expedientes exp = genericDAO.get(Expedientes.class, informe.getIdExpediente());
		ModelAndView mav = new ModelAndView("redirect:/app/informes/elaborarInforme/"+informe.getIdExpediente());
		Documentos doc = genericDAO.getWithBlob(Documentos.class, informe.getIdDocumento());
		String asunto = String.format("Informe Asesoría Jurídica. Expediente %s", exp.getExpCodigo());
		portafirmaService.enviarDocumentoAPortafirma(doc, asunto, usuario, firmante);
		doc.setFechaEnvio(new Date());
		doc.setActualizacion(new Date(), usuario);
		genericDAO.insertOrUpdate(Documentos.class, doc);
		return mav;
	}
	
	@RequestMapping("/observaciones/{idExpediente}")
	public ModelAndView observacion(@PathVariable BigDecimal idExpediente, @SessionParam Usuario usuario){
		ModelAndView mav = new ModelAndView("observaciones");
		Expedientes exp = genericDAO.get(Expedientes.class, idExpediente);
		mav.addObject("expediente", exp);
		return mav;
	}

}
