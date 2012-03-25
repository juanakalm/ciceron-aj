package es.ise.ciceron.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.ise.ciceron.spring.command.BusquedaInforme;

@Controller
@RequestMapping("/perfiles")
public class PerfilesController
{
	@ModelAttribute("busqueda")
	public BusquedaInforme getBusquedaInforme()
	{
		return new BusquedaInforme();
	}
	
	@RequestMapping
	public ModelAndView model(@ModelAttribute("busqueda") BusquedaInforme busqueda, BindingResult result)
	{
		ModelAndView mav = new ModelAndView("perfiles");
		
		return mav;
	}
}
