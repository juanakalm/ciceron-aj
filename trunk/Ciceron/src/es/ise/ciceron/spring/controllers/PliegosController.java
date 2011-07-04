package es.ise.ciceron.spring.controllers;

import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
import es.ise.ciceron.spring.util.Fichero;

@Controller
@RequestMapping("/pliegos")
public class PliegosController {
	
	@Autowired
	private GenericDAO genericDAO;
	
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
	
	@RequestMapping(value="/guardar", method=RequestMethod.POST)
	public ModelAndView guardarPliego(@SessionParam Usuario usuario, VersionesPliegosCommand pliego, BindingResult result) throws IOException 
	{
		ModelAndView mav = new ModelAndView("redirect:/app/pliegos");
		if(pliego.getFile() != null && !pliego.getFile().isEmpty()){
			Fichero fich = new Fichero(pliego.getFile().getOriginalFilename());
			pliego.setFichero(pliego.getFile().getBytes());
			pliego.setNombreFichero(fich.getNameWithoutExtension());
			pliego.setExtension(fich.getExtension());
			String act = pliego.getActivo();
			if(act == "ON"){
				pliego.setActivo("S");
			}else{
				pliego.setActivo("N");
			}
			pliego.setCreacion(new Date(), usuario);
		}
		genericDAO.insertOrUpdateWithBlob(VersionesPliegos.class, pliego);
		return mav;
	}

}
