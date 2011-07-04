package es.ise.ciceron.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.ise.ciceron.model.Usuario;
import es.ise.ciceron.spring.annotations.SessionParam;

@Controller
@RequestMapping("/documentos")
public class DocumentosController {	
	
	@RequestMapping
	public ModelAndView model(@SessionParam Usuario usuario)
	{
		ModelAndView mav = new ModelAndView();
		return mav;
	}
	

}
