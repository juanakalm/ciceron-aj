package es.ise.ciceron.spring.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.ise.ciceron.spring.repositories.GenericDAO;

@Controller
@RequestMapping("/ajax")
public class AjaxController
{
	@Autowired
	private GenericDAO genericDAO;
	
	@RequestMapping("/dao/{daoName}/{id}")
	public ModelAndView getDAOConID(@PathVariable String daoName, @PathVariable BigDecimal id) throws ClassNotFoundException
	{
		ModelAndView mav = new ModelAndView("json");
		Class<?> daoClass = Class.forName(String.format("es.ise.ciceron.model.%s", daoName));
		mav.addObject(genericDAO.get(daoClass, id));
		return mav;
	}
	
	@RequestMapping("/dao/{daoName}/{propiedad}/{id}")
	public ModelAndView getDAO2(@PathVariable String daoName, @PathVariable String propiedad, @PathVariable BigDecimal id) throws ClassNotFoundException
	{
		ModelAndView mav = new ModelAndView("json");
		Class<?> daoClass = Class.forName(String.format("es.ise.ciceron.model.%s", daoName));
		mav.addObject(genericDAO.select(daoClass, propiedad, id));
		return mav;
	}
	
	@RequestMapping("/dao/{daoName}/{propiedad}/string/{value}")
	public ModelAndView getDAO3(@PathVariable String daoName, @PathVariable String propiedad, @PathVariable String value) throws ClassNotFoundException
	{
		ModelAndView mav = new ModelAndView("json");
		Class<?> daoClass = Class.forName(String.format("es.ise.ciceron.model.%s", daoName));
		mav.addObject(genericDAO.select(daoClass, propiedad, value));
		return mav;
	}
	
	@RequestMapping("/daolist/{daoName}/{propiedad}/{id}")
	public ModelAndView getDAOList(@PathVariable String daoName, @PathVariable String propiedad, @PathVariable BigDecimal id) throws ClassNotFoundException
	{
		ModelAndView mav = new ModelAndView("json");
		Class<?> daoClass = Class.forName(String.format("es.ise.ciceron.model.%s", daoName));
		mav.addObject(genericDAO.list(daoClass, propiedad, id));
		return mav;
	}
	
	@RequestMapping("/daolist/{daoName}")
	public ModelAndView getDAO(@PathVariable String daoName) throws ClassNotFoundException
	{
		ModelAndView mav = new ModelAndView("json");
		Class<?> daoClass = Class.forName(String.format("es.ise.ciceron.model.%s", daoName));
		mav.addObject(genericDAO.list(daoClass));
		return mav;
	}
}
