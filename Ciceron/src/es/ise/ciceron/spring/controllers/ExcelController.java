package es.ise.ciceron.spring.controllers;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import es.ise.ciceron.model.ParametrosSolicitudes;
import es.ise.ciceron.model.Solicitudes;
import es.ise.ciceron.spring.repositories.GenericDAO;
import es.ise.ciceron.spring.repositories.SqlDAO;

@Controller
@RequestMapping("/excel")
public class ExcelController extends AbstractExcelView{
	
	@Autowired
	private GenericDAO genericDAO;
	
	@Autowired
	private SqlDAO sqlDAO;
	
	@RequestMapping(value="/{parametro}", method = RequestMethod.GET)
	public void generarExcel(@PathVariable BigDecimal parametro, HttpServletResponse response) throws IOException{
	
		Solicitudes paramSol = genericDAO.select(Solicitudes.class, "id", parametro);
		String consulta = paramSol.getConsultaExcelWeb();
		
		HSSFWorkbook book = new HSSFWorkbook();
		//crear una hoja
		HSSFSheet hoja = book.createSheet("Hoja");
		//recuperar datos de la consulta
		List<Map<String,Object>> result = sqlDAO.query(consulta);
		//guardar valores en toda la tabla
		HSSFCell celda;
		
		
		int row = 0;
		int rowValor = 1;
		int col;
		
		
		
		List<String> titulos=new ArrayList<String>();
		for(Map<String, Object> mapa: result){
				titulos.addAll(mapa.keySet());
				break;
		}
		col=0;
		for(String titulo: titulos){
			celda = getCell(hoja, row, col++);
			setText(celda, titulo);
		}
		
		
		for(Map<String, Object> m: result){
			col = 0;
			//guardar valores en una fila
			for(String titulo: titulos){
				celda = getCell(hoja, rowValor, col++);
				setText(celda, null == m.get(titulo) ? "" : m.get(titulo).toString());
			}
			rowValor++;
		}
		
		response.setHeader("Content-type", "application/vnd.ms-excel");
        response.setHeader("Content-Disposition","attachment; filename=\"excel.xls\"");
        book.write(response.getOutputStream());
       
    	
	}

	@Override
	protected void buildExcelDocument(Map<String, Object> m, HSSFWorkbook book, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		// TODO Auto-generated method stub
		
	}
}
