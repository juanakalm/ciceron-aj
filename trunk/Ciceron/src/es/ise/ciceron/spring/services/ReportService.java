package es.ise.ciceron.spring.services;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

@Service
public class ReportService
{
	private String servletUrl;
	private String key;
	
	@Autowired
	public void setProperties(@Qualifier("appProperties") Properties properties)
	{
		servletUrl = properties.getProperty("report.servlet");
		key = properties.getProperty("report.key");
	}

	private String getUrlReport(String nombreReport, String... params)
	{
		if(params.length%2 !=0)
		{
			throw new IllegalArgumentException("El parámetro params debe tener longitud par (clave/valor)");
		}
		StringBuilder sb = new StringBuilder(String.format("%s?%s&REPORT=%s&statusformat=xml", servletUrl, key, nombreReport));
		for(int i = 0; i < params.length; i+=2)
		{
			sb.append(String.format("&%s=%s", params[i], params[i+1]));
		}
		return sb.toString();
	}
	
	public void sendPdfToBrowser(byte[] pdf, HttpServletResponse response) throws IOException
	{
		sendPdfToBrowser(new ByteArrayInputStream(pdf), response);
	}
	
	public void sendPdfToBrowser(InputStream in, HttpServletResponse response) throws IOException
	{
		response.setHeader("Content-type", "application/pdf");
		PrintStream pout = new PrintStream(response.getOutputStream());
		int b = 0;
		while((b = in.read()) >= 0)
		{
			pout.write(b);
		}
		in.close();
	}
	
	public byte[] getReport(String nombreReport, String... params)throws IOException, SAXException
	{
		byte[] fichero = null;
		String urlReport = getUrlReport(nombreReport, params);
		
		//Creamos un HTTPConnection mediante un objeto URL
		URL url = new URL(urlReport);
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		fichero = leerContenido(conn.getInputStream());
		
		return fichero;
	}
	
	
	private byte[] leerContenido(InputStream in) throws IOException
	{
		BufferedInputStream buf = new BufferedInputStream(in);
		ByteArrayOutputStream byout = new ByteArrayOutputStream();
		PrintStream out = new PrintStream(byout);
		int b = 0;
		while((b = buf.read()) >= 0)
		{
			out.write(b);
		}
		out.close();
		buf.close();
		return byout.toByteArray();
	}
	
}
