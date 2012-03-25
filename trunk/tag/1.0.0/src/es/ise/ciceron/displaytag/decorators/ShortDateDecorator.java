package es.ise.ciceron.displaytag.decorators;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.PageContext;

import org.displaytag.decorator.DisplaytagColumnDecorator;
import org.displaytag.decorator.TableDecorator;
import org.displaytag.exception.DecoratorException;
import org.displaytag.properties.MediaTypeEnum;

public class ShortDateDecorator extends TableDecorator implements DisplaytagColumnDecorator
{

	@Override
	public Object decorate(Object value, PageContext pageContext, MediaTypeEnum mediaTypeEnum) throws DecoratorException
	{
		if(value instanceof Date)
		{
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			return format.format((Date)value);
		}
		else
		{
			return value;
		}
	}
	
}
