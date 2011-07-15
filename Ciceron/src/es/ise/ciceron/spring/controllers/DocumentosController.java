package es.ise.ciceron.spring.controllers;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import es.ise.ciceron.model.DocumentosES;
import es.ise.ciceron.model.ESDocumento;
import es.ise.ciceron.model.Usuario;
import es.ise.ciceron.model.VersionesPliegos;
import es.ise.ciceron.spring.annotations.SessionParam;
import es.ise.ciceron.spring.repositories.GenericDAO;
import es.ise.ciceron.spring.services.ReportService;
import es.ise.ciceron.spring.util.Fichero;

@Controller
@RequestMapping("/documentos")
public class DocumentosController {	
	
	@Autowired
	private GenericDAO genericDAO;
	
	@Autowired
	private ReportService reportService;
	
	@RequestMapping
	public ModelAndView model(@SessionParam Usuario usuario)
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("listaDocumentos",genericDAO.list(DocumentosES.class));
		return mav;
	}
	
	@RequestMapping("/visualizar/{idDocumento}")
	public void visualizarDoc (@PathVariable BigDecimal idDocumento, HttpServletResponse response) throws IOException{
		ESDocumento doc = genericDAO.getWithBlob(ESDocumento.class, idDocumento);
		reportService.sendPdfToBrowser(doc.getFichero(), response);
	}
	
	@RequestMapping("/eliminar/{idDocumento}")
	public ModelAndView borrarPliego(@PathVariable BigDecimal idDocumento){
		ModelAndView mav = new ModelAndView("redirect:/app/documentos");
		genericDAO.delete(ESDocumento.class, idDocumento);
		return mav;
	}
	
	@RequestMapping("/sustituir")
	public ModelAndView sustituirDocumento (@SessionParam Usuario usuario, @RequestParam BigDecimal id, @RequestParam MultipartFile file) throws IOException{
		ModelAndView mav = new ModelAndView("redirect:/app/documentos");
		if(file != null && !file.isEmpty()){
			ESDocumento doc = genericDAO.getWithBlob(ESDocumento.class, id);
			Fichero fich = new Fichero(file.getOriginalFilename());
			doc.setFichero(file.getBytes());
			doc.setNombreFichero(fich.getNameWithoutExtension());
			doc.setExtension(fich.getExtension());
			doc.setActualizacion(new Date(), usuario);
			genericDAO.insertOrUpdateWithBlob(ESDocumento.class, doc);
		}
		return mav;
	}
}
