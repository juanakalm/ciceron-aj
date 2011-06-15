package es.ise.ciceron.spring.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.ise.ciceron.model.Usuario;
import es.ise.ciceron.spring.repositories.GenericDAO;


@Controller
@RequestMapping("/salir")
public class CerrarSesionController {
	@Autowired
	private GenericDAO genericDAO;
	@RequestMapping
	public ModelAndView model(Usuario usuario, HttpSession session){
		ModelAndView mav = new ModelAndView("inicio");
		session.removeAttribute("usuario");
		mav.setViewName("redirect:/app/inicio");
		return mav;
	}
}
