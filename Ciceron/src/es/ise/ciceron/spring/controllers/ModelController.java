package es.ise.ciceron.spring.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.ise.ciceron.model.Usuario;
import es.ise.ciceron.spring.repositories.GenericDAO;
import es.ise.ciceron.spring.repositories.GenericDAO.Property;

@Controller
@RequestMapping("/inicio")
public class ModelController
{

	@Autowired
	private GenericDAO genericDAO;

	@RequestMapping
	public ModelAndView model(Usuario usuario, BindingResult result, HttpSession session)
	{
		ModelAndView mav = new ModelAndView("inicio");

		if (usuario.getIdentificador() != null && !usuario.getIdentificador().isEmpty() && usuario.getClass() != null && !usuario.getClave().isEmpty())
		{
			// comprobar que exista el usuario
			Usuario user = genericDAO.select(Usuario.class, new Property("identificador", usuario.getIdentificador().toUpperCase()), new Property("clave", usuario.getClave()));
			if (user != null)
			{
				session.setAttribute("usuario", user);
				mav.setViewName("redirect:/app/menu");
			} else
			{
				mav.addObject("mensaje", "Usuario o contraseña incorrecta");
			}
		}

		mav.addObject(usuario);
		return mav;
	}

}
