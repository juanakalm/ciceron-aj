package es.ise.ciceron.spring.controllers;

import java.io.IOException;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import es.ise.ciceron.model.Archivo;
import es.ise.ciceron.model.Usuario;
import es.ise.ciceron.spring.annotations.SessionParam;
import es.ise.ciceron.spring.repositories.GenericDAO;
import es.ise.ciceron.spring.util.Fichero;

@Controller
@RequestMapping("/archivo")
public class ArchivoController
{
	@Autowired
	private GenericDAO genericDAO;
	
	@RequestMapping("/{idESDocumento}")
	public ModelAndView model(@PathVariable BigDecimal idESDocumento)
	{
		ModelAndView mav = new ModelAndView("archivo");
		mav.addObject("listaArchivos", genericDAO.listWithBlob(Archivo.class, "idArchivo", idESDocumento));
		mav.addObject("idESDocumento", idESDocumento);
		return mav;
	}
	
	@RequestMapping("/subir/{idESDocumento}")
	public ModelAndView subir(@PathVariable BigDecimal idESDocumento, @SessionParam Usuario usuario, Archivo archivo, @RequestParam MultipartFile file) throws IOException{
		
		String url = "redirect:/app/archivo/"+idESDocumento;
		ModelAndView mav = new ModelAndView(url);
		if(file != null && !file.isEmpty()){
			archivo.setMime(file.getContentType());
			Fichero fich = new Fichero(file.getOriginalFilename());
			archivo.setNombre(fich.getNameWithoutExtension());
			archivo.setExtension(fich.getExtension());
			archivo.setArchivo(file.getBytes());
			archivo.setCreacion(new Date(), usuario);
			archivo.setIdArchivo(idESDocumento);
			genericDAO.insertOrUpdateWithBlob(Archivo.class, archivo);
		}
		return mav;
	}
	
	
//	@RequestMapping("/sustituir")
//	public ModelAndView sustituirDocumento (@SessionParam Usuario usuario, @RequestParam BigDecimal id, @RequestParam MultipartFile file) throws IOException{
//		ModelAndView mav = new ModelAndView("redirect:/app/documentos");
//		if(file != null && !file.isEmpty()){
//			ESDocumento doc = genericDAO.getWithBlob(ESDocumento.class, id);
//			Fichero fich = new Fichero(file.getOriginalFilename());
//			doc.setFichero(file.getBytes());
//			doc.setNombreFichero(fich.getNameWithoutExtension());
//			doc.setExtension(fich.getExtension());
//			doc.setActualizacion(new Date(), usuario);
//			genericDAO.insertOrUpdateWithBlob(ESDocumento.class, doc);
//		}
//		return mav;
//	}
	
	@RequestMapping("/eliminar/{idArchivo}")
	public ModelAndView eliminarArchivo(@PathVariable BigDecimal idArchivo){
		Archivo arch = genericDAO.get(Archivo.class, idArchivo);
		ModelAndView mav = new ModelAndView("redirect:/app/archivo/"+arch.getIdArchivo());
		genericDAO.delete(Archivo.class, idArchivo);
		return mav;
	}
	
	@RequestMapping("/abrir/{idArchivo}")
	public void abrirArchivo(@PathVariable BigDecimal idArchivo, HttpServletResponse response) throws IOException{
		
		Archivo archivo = genericDAO.get(Archivo.class, idArchivo);
		byte [] fichero = archivo.getArchivo();
		
		response.setHeader("Content-type", archivo.getMime());
		response.setHeader("Content-Disposition","attachment; filename=\"archivo."+archivo.getExtension()+"\"");
		
		PrintStream pout = new PrintStream(response.getOutputStream());
		pout.write(fichero);
		
	}
	
}


