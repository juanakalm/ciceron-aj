package es.ise.ciceron.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.ise.ciceron.model.MenusUsuario;
import es.ise.ciceron.model.Usuario;
import es.ise.ciceron.spring.annotations.SessionParam;
import es.ise.ciceron.spring.repositories.GenericDAO;

@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	private GenericDAO genericDAO;
	
	@RequestMapping
	public ModelAndView model(@SessionParam Usuario usuario){
		ModelAndView mav = new ModelAndView("menu");
		
		List<MenusUsuario>listaMenus = genericDAO.list(MenusUsuario.class, "idUsuario", usuario.getIdUsuario());
		mav.addObject("listaMenus",listaMenus);
		
		return mav;
	}

}
