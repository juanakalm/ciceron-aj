package es.ise.ciceron.spring.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import es.ise.ciceron.model.Bloque;
import es.ise.ciceron.model.Punto;
import es.ise.ciceron.model.TipoBloquePuntos;
import es.ise.ciceron.model.Tipologia;
import es.ise.ciceron.spring.repositories.GenericDAO;

@Controller
@RequestMapping("/tipologia")
@SessionAttributes(types=Tipologia.class)
public class TipologiaController {
	
	@Autowired
	private GenericDAO genericDAO;
	
	
	@ModelAttribute
	public Tipologia getTipologia()
	{
		return new Tipologia();
	}
	
	@RequestMapping("/puntos/eliminar/{idPunto}")
	public ModelAndView eliminarPunto(@PathVariable BigDecimal idPunto)
	{
		ModelAndView mav = new  ModelAndView("redirect:/app/tipologia");
		genericDAO.delete(Punto.class, idPunto);
		return mav;
	}
	
	@RequestMapping("/bloques/eliminar/{idBloque}")
	public ModelAndView eliminarBloque(@PathVariable BigDecimal idBloque){
		ModelAndView mav = new ModelAndView("redirect:/app/tipologia");
		//Eliminamos los puntos correspondientes a ese bloque
		for(Punto punto: genericDAO.list(Punto.class, "idBloque", idBloque)){
			genericDAO.delete(Punto.class, punto.getId());
		}
		//Eliminamos el bloque
		genericDAO.delete(Bloque.class, idBloque);
		return mav;
	}
	
	@RequestMapping
	public ModelAndView inicio(@ModelAttribute Tipologia tipologia, BindingResult result){
		ModelAndView mav = new ModelAndView("tipologia");
		//Lista de Tipologias
		mav.addObject("listaTipo", genericDAO.list(Tipologia.class));
		mav.addObject("listaB", genericDAO.list(Bloque.class));
		if(tipologia.getId() != null) //si se ha elegido una tipología...
			//añado la lista de bloques de esa tipología...
			mav.addObject("listaBloques", genericDAO.list(TipoBloquePuntos.class, new GenericDAO.Sort<TipoBloquePuntos>("ordenBloque", "orderPunto"), "idTipo", tipologia.getId()));
		return mav;
	}
	
	@RequestMapping(value="/puntos/guardar", method=RequestMethod.POST)
	public ModelAndView guardarPunto(Punto punto, BindingResult result)
	{
		genericDAO.insertOrUpdate(Punto.class, punto);
		
		ModelAndView mav = new ModelAndView(String.format("redirect:/app/tipologia"));
		return mav;
	}
	
	@RequestMapping(value="/bloques/guardar", method=RequestMethod.POST)
	public ModelAndView guardarBloque(Bloque bloque, BindingResult result)
	{
		genericDAO.insertOrUpdate(Bloque.class, bloque);
		
		ModelAndView mav = new ModelAndView(String.format("redirect:/app/tipologia"));
		return mav;
	}

}