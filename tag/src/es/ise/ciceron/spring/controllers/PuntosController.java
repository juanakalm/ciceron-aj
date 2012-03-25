package es.ise.ciceron.spring.controllers;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.ise.ciceron.model.Bloque;
import es.ise.ciceron.model.Punto;
import es.ise.ciceron.model.Usuario;
import es.ise.ciceron.spring.annotations.SessionParam;
import es.ise.ciceron.spring.repositories.GenericDAO;

@Controller
@RequestMapping("/puntos")
public class PuntosController {
	
	@Autowired
	private GenericDAO genericDAO;
	
	@RequestMapping(value="/nuevo", method=RequestMethod.GET)
	public ModelAndView nuevoBloque()
	{
		ModelAndView mav = new ModelAndView("puntos/punto");
		Punto punto = new Punto();
		mav.addObject("punto", punto);
		mav.addObject("listaBloque", genericDAO.list(Bloque.class));
		return mav;
	}
	
	@RequestMapping(value="/guardar", method=RequestMethod.POST)
	public ModelAndView guardarBloque(@SessionParam Usuario usuario ,Punto punto, BindingResult result)
	{
		ModelAndView mav = new ModelAndView(String.format("redirect:/app/puntos/editar/%s", punto.getId().toString()));
		boolean nuevo = punto.getId() == null;
		if(nuevo){
			punto.setCreacion(new Date(), usuario);
			punto.setActualizacion(new Date(), usuario);
		}else{
			punto.copyCreacion(genericDAO.get(Punto.class, punto.getId()));
			punto.setActualizacion(new Date(), usuario);
		}
		genericDAO.insertOrUpdate(Punto.class, punto);
		return mav;
	}
	
	@RequestMapping(value="/editar/{idPunto}", method=RequestMethod.GET)
	public ModelAndView editarPunto(@PathVariable BigDecimal idPunto)
	{
		ModelAndView mav = new ModelAndView("puntos/punto");
		mav.addObject("punto", genericDAO.get(Punto.class, idPunto));
		mav.addObject("listaBloque", genericDAO.list(Bloque.class));
		return mav;
	}
}
