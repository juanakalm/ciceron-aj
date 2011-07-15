package es.ise.ciceron.spring.controllers;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.xml.sax.SAXException;

import es.ise.ciceron.model.ParametrosSolicitudes;
import es.ise.ciceron.model.Solicitudes;
import es.ise.ciceron.model.Usuario;
import es.ise.ciceron.spring.annotations.SessionParam;
import es.ise.ciceron.spring.repositories.GenericDAO;
import es.ise.ciceron.spring.repositories.GenericDAO.Sort;
import es.ise.ciceron.spring.repositories.SqlDAO;
import es.ise.ciceron.spring.services.ReportService;

@Controller
@RequestMapping("/listados")
public class ListadosController
{
	@Autowired
	private GenericDAO genericDAO;
	
	@Autowired
	private SqlDAO sqlDAO;
	
	@Autowired
	private ReportService reportService;
	
	@RequestMapping
	public ModelAndView model()
	{
		ModelAndView mav = new ModelAndView();
		Comparator<Solicitudes> comparador = new Comparator<Solicitudes>(){
			@Override
			public int compare(Solicitudes s1, Solicitudes s2)
			{
				return s1.getEjec().toLowerCase().compareTo(s2.getEjec().toLowerCase());
			}
		};
		List<Solicitudes> lista = genericDAO.list(Solicitudes.class, comparador, "padre", new BigDecimal(35));
		for (Solicitudes elem: lista){
			if(elem.getConsultaExcelWeb() != null){
				elem.setTipo(new BigDecimal(2));
			}else{
				elem.setTipo(new BigDecimal(1));
			}
		}
		mav.addObject("listaSolicitudes",lista);
		return mav;
	}
	
	@RequestMapping("/parametros/{idSolicitud}")
	public ModelAndView elaborar(@PathVariable BigDecimal idSolicitud, @SessionParam Usuario usuario){
		ModelAndView mav = new ModelAndView("parametros");
		Map<BigDecimal, List<Map<String,Object>>> map = new HashMap<BigDecimal, List<Map<String,Object>>>();
		List<ParametrosSolicitudes>lista = genericDAO.list(ParametrosSolicitudes.class, "idSolicitud", idSolicitud);
		for (ParametrosSolicitudes elem: lista){
			if(("USUARIO").equals(elem.getNombre())){
				elem.setValorDefecto(usuario.getIdentificador());
			}else if(("UNIDAD").equals(elem.getNombre())){
				elem.setValorDefecto(usuario.getIdUnidadOrganizativa().toString());
			}
			else if(("SYSDATE").equals(elem.getValorDefecto())){
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				elem.setValorDefecto(formato.format	(new Date()));	
			}
			
			String lov = elem.getLvSelectWeb();
			if(lov != null ){
				map.put(elem.getId(), sqlDAO.query(lov));
			}
		}
		mav.addObject("mapaValores",map);
		mav.addObject("listaParametros", lista);
		return mav;
	}
	
//	@RequestMapping("/parametros/generarBorrador/{idSolicitud}")
//	public void generarBorrador(@PathVariable BigDecimal idSolicitud, HttpServletResponse response) throws IOException, SAXException
//	{
//		Solicitudes sol = genericDAO.get(Solicitudes.class, idSolicitud);
//		ParametrosSolicitudes param = genericDAO.select(ParametrosSolicitudes.class, "idSolicitud", idSolicitud);
//		reportService.sendPdfToBrowser(reportService.getReport(sol.getEjec(), param.getParamReport(), idInforme.toString()), response);
//	}
	
}
