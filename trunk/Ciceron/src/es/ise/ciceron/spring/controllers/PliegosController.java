package es.ise.ciceron.spring.controllers;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import es.ise.ciceron.model.ListaDePliegos;
import es.ise.ciceron.model.Naturaleza;
import es.ise.ciceron.model.Normativa;
import es.ise.ciceron.model.Procedimiento;
import es.ise.ciceron.model.TipoServicio;
import es.ise.ciceron.model.Usuario;
import es.ise.ciceron.model.VersionesPliegos;
import es.ise.ciceron.spring.annotations.SessionParam;
import es.ise.ciceron.spring.command.VersionesPliegosCommand;
import es.ise.ciceron.spring.repositories.GenericDAO;
import es.ise.ciceron.spring.services.ProceduresService;
import es.ise.ciceron.spring.services.ReportService;
import es.ise.ciceron.spring.util.Fichero;

@Controller
@RequestMapping("/pliegos")
public class PliegosController {
	
	@Autowired
	private GenericDAO genericDAO;
	
	@Autowired
	private ReportService reportService;
	
	@Autowired
	private ProceduresService proceduresService;
	
	@RequestMapping()
	public ModelAndView model(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("listaPliegos",genericDAO.list(ListaDePliegos.class));
		mav.addObject("naturalezas",genericDAO.list(Naturaleza.class));
		mav.addObject("normativas",genericDAO.list(Normativa.class));
		mav.addObject("procedimientos",genericDAO.list(Procedimiento.class));
		mav.addObject("tipoServicios",genericDAO.list(TipoServicio.class));
		return mav;
	}
	
	@RequestMapping("/editar/{idPliego}")
	public ModelAndView editarPliego(@SessionParam Usuario usuario, @PathVariable BigDecimal idPliego){
		ModelAndView mav = new ModelAndView("json");
		mav.addObject("elimina", proceduresService.estadoPliego(idPliego, usuario.getIdUsuario()));
		return mav;
	}
	
	@RequestMapping(value="/guardar", method=RequestMethod.POST)
	public ModelAndView guardarPliego(@SessionParam Usuario usuario, VersionesPliegosCommand pliego, BindingResult result) throws IOException 
	{
		ModelAndView mav = new ModelAndView("redirect:/app/pliegos");
		
		if(pliego.getFile() != null && !pliego.getFile().isEmpty()){
			Fichero fich = new Fichero(pliego.getFile().getOriginalFilename());
			pliego.setFichero(pliego.getFile().getBytes());
			pliego.setNombreFichero(fich.getNameWithoutExtension());
			pliego.setExtension(fich.getExtension());
		} else if(pliego.getId() != null) {
			VersionesPliegos pliego2 = genericDAO.getWithBlob(VersionesPliegos.class, pliego.getId());
			pliego.setFichero(pliego2.getFichero());
			pliego.setNombreFichero(pliego2.getNombreFichero());
			pliego.setExtension(pliego2.getExtension());
		}
		
		if(pliego.getId() == null){
			pliego.setCreacion(new Date(), usuario);
		}else{
			pliego.copyCreacion(genericDAO.get(VersionesPliegos.class, pliego.getId()));
			pliego.setActualizacion(new Date(), usuario);
		}
		
		genericDAO.insertOrUpdateWithBlob(VersionesPliegos.class, pliego);
		return mav;
	}
	
	@RequestMapping("/visualizar/{idPliego}")
	public void visualizarPliego(@PathVariable BigDecimal idPliego, HttpServletResponse response) throws IOException
	{
		VersionesPliegos pliegos = genericDAO.getWithBlob(VersionesPliegos.class, idPliego);
		reportService.sendPdfToBrowser(pliegos.getFichero(), response);
	}
	
	@RequestMapping("/sustituir")
	public ModelAndView sustituirPliego (@SessionParam Usuario usuario, @RequestParam BigDecimal id, @RequestParam MultipartFile file) throws IOException{
		ModelAndView mav = new ModelAndView("redirect:/app/pliegos");
		if(file != null && !file.isEmpty()){
			VersionesPliegos pliego = genericDAO.getWithBlob(VersionesPliegos.class, id);
			Fichero fich = new Fichero(file.getOriginalFilename());
			pliego.setFichero(file.getBytes());
			pliego.setNombreFichero(fich.getNameWithoutExtension());
			pliego.setExtension(fich.getExtension());
			pliego.setActualizacion(new Date(), usuario);
			genericDAO.insertOrUpdateWithBlob(VersionesPliegos.class, pliego);
		}
		return mav;
	}
	
	@RequestMapping("/eliminar/{idPliego}")
	public ModelAndView borrarPliego(@PathVariable BigDecimal idPliego){
		ModelAndView mav = new ModelAndView("redirect:/app/pliegos");
		genericDAO.delete(VersionesPliegos.class, idPliego);
		return mav;
	}

}
