package es.ise.ciceron.spring.controllers;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import es.ise.ciceron.model.Documentos;
import es.ise.ciceron.model.Informe;
import es.ise.ciceron.model.InformeJuridico;
import es.ise.ciceron.model.InformeJuridicoModificado;
import es.ise.ciceron.model.PuntosEditados;
import es.ise.ciceron.model.TextoInforme;
import es.ise.ciceron.model.Tipologia;
import es.ise.ciceron.model.TiposDocumentos;
import es.ise.ciceron.model.UnidadesContratacion;
import es.ise.ciceron.model.Usuario;
import es.ise.ciceron.spring.annotations.SessionParam;
import es.ise.ciceron.spring.command.BusquedaInforme;
import es.ise.ciceron.spring.repositories.GenericDAO;
import es.ise.ciceron.spring.services.ProceduresService;
import es.ise.ciceron.spring.services.ReportService;
import es.ise.ciceron.spring.util.Fichero;

@Controller
@RequestMapping("/informes")
public class InformesController {
	
	@Autowired
	private GenericDAO genericDAO;
	
	@Autowired
	private ReportService reportService;
	
	@Autowired
	private ProceduresService proceduresService;
	
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
				listaPropiedades.add(new GenericDAO.Property("codigoExpediente", String.format("%%%s%%", busqueda.getCodigoExpediente()), GenericDAO.Property.Operator.LIKE));
				listaPropiedadesMod.add(new GenericDAO.Property("codigoExpediente", String.format("%%%s%%", busqueda.getCodigoExpediente()), GenericDAO.Property.Operator.LIKE));
			}
			if(busqueda.getDescripcionExpediente() !=null && !busqueda.getDescripcionExpediente().isEmpty()){
				listaPropiedades.add(new GenericDAO.Property("descripcionExpediente", String.format("%%%s%%", busqueda.getDescripcionExpediente()), GenericDAO.Property.Operator.LIKE));
				listaPropiedadesMod.add(new GenericDAO.Property("descripcionContrato", String.format("%%%s%%", busqueda.getDescripcionExpediente()), GenericDAO.Property.Operator.LIKE));
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
		
		Informe informe = genericDAO.select(Informe.class, "idExpediente", idExpediente);
		if(informe == null)
		{
			informe = new Informe();
			informe.setCreacion(new Date(), usuario);
			informe.setIdExpediente(idExpediente);
			genericDAO.insert(informe);
		}
		
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
	
	@RequestMapping(value="/elaborarInforme/eliminar/{idTextoInforme}", method=RequestMethod.GET)
	public ModelAndView eliminarPunto(@PathVariable BigDecimal idTextoInforme)
	{
		TextoInforme textoInforme = genericDAO.get(TextoInforme.class, idTextoInforme);
		Informe informe = genericDAO.get(Informe.class, textoInforme.getIdInforme());
		ModelAndView mav = new  ModelAndView("redirect:/app/informes/elaborarInforme/"+informe.getIdExpediente());
		genericDAO.delete(TextoInforme.class, idTextoInforme);
		return mav;
	}
	
	@RequestMapping("/elaborarInforme/generarBorrador/{idInforme}")
	public void generarBorrador(@PathVariable BigDecimal idInforme, HttpServletResponse response) throws IOException, SAXException
	{
		TiposDocumentos report = genericDAO.select(TiposDocumentos.class, "codigo", "INFORME");
		reportService.sendPdfToBrowser(reportService.getReport(report.getReport(), "P_INF_ID", idInforme.toString()), response);
	}
	
	@RequestMapping(value="/elaborarInforme/generarReport/{idInforme}")
	public ModelAndView generarReport(@PathVariable BigDecimal idInforme, @SessionParam Usuario usuario)throws IOException, SAXException
	{
		Informe informe = genericDAO.get(Informe.class, idInforme);
		ModelAndView mav = new ModelAndView("redirect:/app/informes/elaborarInforme/"+informe.getIdExpediente());
		
		TiposDocumentos report = genericDAO.select(TiposDocumentos.class, "codigo", "INFORME");
		Documentos doc = new Documentos();
		doc.setIdTiposDocumentos(report.getId());
		doc.setFichero(reportService.getReport(report.getReport(), "P_INF_ID", idInforme.toString()));
		doc.setNombreFichero(String.format("%s_%s", report.getCodigo().toLowerCase(), informe.getId()));
		doc.setExtension("pdf");
		doc.setCreacion(new Date(), usuario);
		genericDAO.insert(doc);
		informe.setIdDocumento(doc.getId());
		informe.setActualizacion(new Date(), usuario);
		genericDAO.insertOrUpdate(Informe.class, informe);
		
		return mav;
	}
	
	@RequestMapping("/elaborarInforme/visualizar/{idDocumento}")
	public void visualizarInforme(@PathVariable BigDecimal idDocumento, HttpServletResponse response) throws IOException
	{
		Documentos documento = genericDAO.selectWithBlob(Documentos.class, "id", idDocumento);
		reportService.sendPdfToBrowser(documento.getFichero(), response);
	}
	
	@RequestMapping("/elaborarInforme/sustituir/{idInforme}")
	public ModelAndView sustituirInforme(@PathVariable BigDecimal idInforme, @RequestParam MultipartFile fichero, @SessionParam Usuario usuario) throws IOException
	{
		Informe informe = genericDAO.get(Informe.class, idInforme);
		ModelAndView mav = new ModelAndView("redirect:/app/informes/elaborarInforme/"+informe.getIdExpediente());
		if(fichero != null && fichero.getContentType().equals("application/pdf"))
		{
			Documentos doc = genericDAO.get(Documentos.class, informe.getIdDocumento());
			Fichero fich = new Fichero(fichero.getOriginalFilename());
			doc.setFichero(fichero.getBytes());
			doc.setNombreFichero(fich.getNameWithoutExtension());
			doc.setExtension(fich.getExtension());
			doc.setActualizacion(new Date(), usuario);
			genericDAO.insertOrUpdateWithBlob(Documentos.class, doc);
		}else
		{
			mav.addObject("mensaje", "Seleccione un fichero .pdf");
		}
		return mav;
	}
}
