package es.ise.ciceron.displaytag.decorators;

import java.text.NumberFormat;

import javax.servlet.jsp.PageContext;

import org.displaytag.decorator.DisplaytagColumnDecorator;
import org.displaytag.decorator.TableDecorator;
import org.displaytag.exception.DecoratorException;
import org.displaytag.properties.MediaTypeEnum;

public class ImporteSinDivisaDecorator extends TableDecorator implements DisplaytagColumnDecorator
{
	private static NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

	@Override
	public Object decorate(Object columnValue, PageContext context, MediaTypeEnum media) throws DecoratorException
	{
		if(columnValue == null)
			return "";
		String number = columnValue.toString();
		try
		{
			number = numberFormat.format(columnValue).replaceAll(" €", "");
		}
		catch(IllegalArgumentException e)
		{
			
		}
		return number;
	}
}
