package es.ise.ciceron.displaytag.decorators;

import javax.servlet.jsp.PageContext;

import org.displaytag.decorator.DisplaytagColumnDecorator;
import org.displaytag.decorator.TableDecorator;
import org.displaytag.exception.DecoratorException;
import org.displaytag.properties.MediaTypeEnum;

public class CheckBoxDecorator extends TableDecorator implements DisplaytagColumnDecorator
{
	@Override
	public Object decorate(Object columnValue, PageContext context, MediaTypeEnum media) throws DecoratorException
	{
		return String.format("<input type=\"checkbox\" disabled=\"disabled\" value=\"S\"%s/>", columnValue != null && columnValue.equals("S") ? " checked=\"checked\"" : "");
	}
}
