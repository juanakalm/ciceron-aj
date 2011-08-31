package es.ise.ciceron.spring.controllers;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


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
import org.springframework.web.servlet.ModelAndView;

import es.ise.ciceron.model.ContratosV;
import es.ise.ciceron.model.DocumentosES;
import es.ise.ciceron.model.ESDocumento;
import es.ise.ciceron.model.Entidades;
import es.ise.ciceron.model.OtrasUnidades;
import es.ise.ciceron.model.TipoOperacion;
import es.ise.ciceron.model.UnidadesContratacion;
import es.ise.ciceron.model.Usuario;
import es.ise.ciceron.spring.annotations.SessionParam;
import es.ise.ciceron.spring.command.BusquedaContrato;
import es.ise.ciceron.spring.command.BusquedaDocumento;
import es.ise.ciceron.spring.command.BusquedaEntidad;
import es.ise.ciceron.spring.repositories.GenericDAO;
import es.ise.ciceron.spring.services.ReportService;
import es.ise.ciceron.spring.util.Fichero;

@Controller
@RequestMapping("/documentos")
public class DocumentosController {	
	
	@Autowired
	private GenericDAO genericDAO;
	
	@InitBinder
    public void initBinder(WebDataBinder binder)
	{
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
	
	@ModelAttribute("busqueda")
	public BusquedaDocumento getBusquedaDocumento(){
		return new BusquedaDocumento();
	}
	
	@RequestMapping	
	public ModelAndView model(@ModelAttribute("busquedaDocumento") BusquedaDocumento busqueda, BindingResult result){
		ModelAndView mav = new ModelAndView("documentos");
		
		GenericDAO.Property[] propiedades = {};
		
		if(!busqueda.getAccion().isEmpty()){
			List<GenericDAO.Property> listaPropiedades = new ArrayList<GenericDAO.Property>();
			
			if(busqueda.getIdUniInterna() !=null){
				listaPropiedades.add(new GenericDAO.Property("idUnidadContratacion", busqueda.getIdUniInterna()));
			}
			if(busqueda.getIdUniExterna() !=null){
				listaPropiedades.add(new GenericDAO.Property("idOtraUnidad", busqueda.getIdUniExterna()));
			}
			if(busqueda.getIdOperacion() !=null){
				listaPropiedades.add(new GenericDAO.Property("idTipoOperacion", busqueda.getIdOperacion()));
			}
			if(busqueda.getTipoEntradaSalida() !=null){
				listaPropiedades.add(new GenericDAO.Property("tipoEntradaSalida",busqueda.getTipoEntradaSalida()));
			}
			if(busqueda.getDescripcionFormato() !=null && !busqueda.getDescripcionFormato().isEmpty()){
				listaPropiedades.add(new GenericDAO.Property("descripcionFormato", String.format("%%%s%%", busqueda.getDescripcionFormato().toUpperCase()), GenericDAO.Property.Operator.LIKE));
			}
			if(busqueda.getEntidad() !=null && !busqueda.getEntidad().isEmpty()){
				listaPropiedades.add(new GenericDAO.Property("nombreEntidad", String.format("%%%s%%", busqueda.getEntidad().toUpperCase()), GenericDAO.Property.Operator.LIKE));
			}
			if(busqueda.getCodigo() != null && !busqueda.getCodigo().isEmpty()){
				listaPropiedades.add(new GenericDAO.Property("codigoExpediente", String.format("%%%s%%", busqueda.getCodigo().toUpperCase()), GenericDAO.Property.Operator.LIKE));
			}
			if(busqueda.getSecuencia() !=null){
				listaPropiedades.add(new GenericDAO.Property("secuenciaOperacion", busqueda.getSecuencia()));
			}
			if(busqueda.getCifEntidad() != null && !busqueda.getCifEntidad().isEmpty()){
				listaPropiedades.add(new GenericDAO.Property("cif", String.format("%%%s%%", busqueda.getCifEntidad().toUpperCase()), GenericDAO.Property.Operator.LIKE));
			}
			if(busqueda.getEntidadTerceros() !=null && !busqueda.getEntidadTerceros().isEmpty()){
				listaPropiedades.add(new GenericDAO.Property("nombreTercerosFormato", String.format("%%%s%%", busqueda.getEntidadTerceros().toUpperCase()), GenericDAO.Property.Operator.LIKE));
			}
			if(busqueda.getCifEntidadTerceros() != null && !busqueda.getCifEntidadTerceros().isEmpty()){
				listaPropiedades.add(new GenericDAO.Property("cifEntidadTerceros", String.format("%%%s%%", busqueda.getCifEntidadTerceros().toUpperCase()), GenericDAO.Property.Operator.LIKE));
			}
			if(busqueda.getEstadoTramite() !=null){
				listaPropiedades.add(new GenericDAO.Property("estado",busqueda.getEstadoTramite()));
			}
			
			propiedades = listaPropiedades.toArray(new GenericDAO.Property[]{});
		}
		
		mav.addObject("tiposOperacion",genericDAO.list(TipoOperacion.class));
		mav.addObject("listaUnidades", genericDAO.list(UnidadesContratacion.class));
		mav.addObject("listaOtrasUnidades", genericDAO.list(OtrasUnidades.class));
		
		if(!busqueda.getAccion().isEmpty()){
			mav.addObject("listaDocumentos",genericDAO.list(DocumentosES.class, propiedades));
		}
		
		return mav;
	}
	
	
//	@RequestMapping("/visualizar/{idDocumento}")
//	public void visualizarDoc (@PathVariable BigDecimal idDocumento, HttpServletResponse response) throws IOException{
//		ESDocumento doc = genericDAO.getWithBlob(ESDocumento.class, idDocumento);
//		reportService.sendPdfToBrowser(doc.getFichero(), response);
//	}
	
	@RequestMapping("/eliminar/{idDocumento}")
	public ModelAndView borrarPliego(@PathVariable BigDecimal idDocumento){
		ModelAndView mav = new ModelAndView("redirect:/app/documentos");
		genericDAO.delete(ESDocumento.class, idDocumento);
		return mav;
	}
	
//	@RequestMapping("/sustituir")
//	public ModelAndView sustituirDocumento (@SessionParam Usuario usuario, @RequestParam BigDecimal id, @RequestParam MultipartFile file) throws IOException{
//		ModelAndView mav = new ModelAndView("redirect:/app/documentos");
//		if(file != null && !file.isEmpty()){
//			ESDocumento doc = genericDAO.getWithBlob(ESDocumento.class, id);
//			Fichero fich = new Fichero(file.getOriginalFilename());
//			doc.setFichero(file.getBytes());
//			doc.setNombreFichero(fich.getNameWithoutExtension());
//			doc.setExtension(fich.getExtension());
//			doc.setActualizacion(new Date(), usuario);
//			genericDAO.insertOrUpdateWithBlob(ESDocumento.class, doc);
//		}
//		return mav;
//	}
	
	@ModelAttribute("busqueda")
	public BusquedaEntidad getBusquedaInforme(){
		return new BusquedaEntidad();
	}
	
	@RequestMapping("/busquedaEntidad/buscar")
	public ModelAndView buscarEntidad(@ModelAttribute("busquedaEntidad") BusquedaEntidad busqueda, BindingResult result){
		ModelAndView mav = new ModelAndView("busquedaEntidad");
		
		GenericDAO.Property[] propiedades={};
		//Creamos las propiedades de la busqueda
		
		if(!busqueda.getAccion().isEmpty()){
			List<GenericDAO.Property> listaPropiedades = new ArrayList<GenericDAO.Property>();
			
			if(busqueda.getCif() != null && !busqueda.getCif().isEmpty()){
				listaPropiedades.add(new GenericDAO.Property("cif", String.format("%%%s%%", busqueda.getCif().toUpperCase()), GenericDAO.Property.Operator.LIKE));
			}
			if(busqueda.getNombre() != null && !busqueda.getNombre().isEmpty()){
				listaPropiedades.add(new GenericDAO.Property("nombre", String.format("%%%s%%", busqueda.getNombre().toUpperCase()), GenericDAO.Property.Operator.LIKE));
			}
			propiedades = listaPropiedades.toArray(new GenericDAO.Property[]{});
		}
		if(!busqueda.getAccion().isEmpty())	{
			mav.addObject("listaEntidades",genericDAO.list(Entidades.class, propiedades));
		}
		return mav;
	}
	
	@ModelAttribute("busqueda")
	public BusquedaContrato getBusquedaContrato(){
		return new BusquedaContrato();
	}
	
	@RequestMapping("/busquedaContrato/buscar")
	public ModelAndView buscarContrato(@ModelAttribute("busquedaContrato") BusquedaContrato busqueda, BindingResult result){
		ModelAndView mav = new ModelAndView("busquedaContrato");
		
		GenericDAO.Property[] propiedades={};
		
		if(!busqueda.getAccion().isEmpty()){
			List<GenericDAO.Property> listaPropiedades = new ArrayList<GenericDAO.Property>();
				
			if(busqueda.getSecuencia() !=null){
				listaPropiedades.add(new GenericDAO.Property("secuencia", busqueda.getSecuencia()));
			}	
			if(busqueda.getCodigo() != null && !busqueda.getCodigo().isEmpty()){
				listaPropiedades.add(new GenericDAO.Property("codigo", String.format("%%%s%%", busqueda.getCodigo().toUpperCase()), GenericDAO.Property.Operator.LIKE));
			}
			if(busqueda.getDescripcion() != null && !busqueda.getDescripcion().isEmpty()){
				listaPropiedades.add(new GenericDAO.Property("descripcion", String.format("%%%s%%", busqueda.getDescripcion().toUpperCase()), GenericDAO.Property.Operator.LIKE));
			}
			propiedades = listaPropiedades.toArray(new GenericDAO.Property[]{});
		}
		if(!busqueda.getAccion().isEmpty()){
			mav.addObject("listaContratos", genericDAO.list(ContratosV.class, propiedades));
		}
		return mav;
	}
	
	@RequestMapping(value="/guardar", method=RequestMethod.POST)
	public ModelAndView guardarDocumentoES (@SessionParam Usuario usuario, ESDocumento documento, BindingResult result){
		ModelAndView mav = new ModelAndView("redirect:/app/documentos");
		
		TipoOperacion operacion = genericDAO.get(TipoOperacion.class, documento.getIdTipoOperacion());
		documento.setSecuencia(operacion.getNumero());
		
		BigDecimal num = operacion.getNumero();
		
		operacion.setNumero(num.add(new BigDecimal(1)));
		operacion.setActualizacion(new Date(), usuario);
		
		if(documento.getId() != null){
			documento.setActualizacion(new Date(), usuario);
		}else
			documento.setCreacion(new Date(), usuario);
		
		genericDAO.insertOrUpdate(ESDocumento.class, documento);
		genericDAO.insertOrUpdate(TipoOperacion.class, operacion);
		
		return mav;
	}
	
	
	
}
