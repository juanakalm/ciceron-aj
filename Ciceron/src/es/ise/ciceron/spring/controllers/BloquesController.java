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
import es.ise.ciceron.model.Tipologia;
import es.ise.ciceron.model.Usuario;
import es.ise.ciceron.spring.annotations.SessionParam;
import es.ise.ciceron.spring.repositories.GenericDAO;

@Controller
@RequestMapping("/bloques")
public class BloquesController {

	@Autowired
	private GenericDAO genericDAO;
	
	@RequestMapping(value="/nuevo", method=RequestMethod.GET)
	public ModelAndView nuevoBloque()
	{
		ModelAndView mav = new ModelAndView("bloques/bloque");
		Bloque bloque = new Bloque();
		mav.addObject("bloque", bloque);
		mav.addObject("listaTipo", genericDAO.list(Tipologia.class));
		return mav;
	}
	
	@RequestMapping(value="/guardar", method=RequestMethod.POST)
	public ModelAndView guardarBloque(@SessionParam Usuario usuario,Bloque bloque, BindingResult result)
	{
		ModelAndView mav = new ModelAndView(String.format("redirect:/app/bloques/editar/%s", bloque.getId().toString()));
		boolean nuevo = bloque.getId()== null;
		if(nuevo){
			bloque.setCreacion(new Date(), usuario);
			bloque.setActualizacion(new Date(), usuario);
		}else{
			bloque.copyCreacion(genericDAO.get(Bloque.class, bloque.getId()));
			bloque.setActualizacion(new Date(), usuario);
		}
		genericDAO.insertOrUpdate(Bloque.class, bloque);
		return mav;
	}
	
	@RequestMapping(value="/editar/{idBloque}", method=RequestMethod.GET)
	public ModelAndView editarBloque(@PathVariable BigDecimal idBloque)
	{
		ModelAndView mav = new ModelAndView("bloques/bloque");
		mav.addObject("bloque", genericDAO.get(Bloque.class, idBloque));
		mav.addObject("listaTipo", genericDAO.list(Tipologia.class));
		return mav;
	}
}
