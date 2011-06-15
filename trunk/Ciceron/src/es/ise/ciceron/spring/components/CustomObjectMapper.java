package es.ise.ciceron.spring.components;

import java.text.SimpleDateFormat;

import org.codehaus.jackson.map.ObjectMapper;

public class CustomObjectMapper extends ObjectMapper
{
	public CustomObjectMapper()
	{
		super();
		//se formatea las fechas al formato que acepta el plugin de javascript: 2009-12-18 10:54:50.546
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		getSerializationConfig().setDateFormat(sdf);
	}
}
