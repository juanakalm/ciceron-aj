package es.ise.ciceron.displaytag.decorators;

import org.displaytag.decorator.TableDecorator;

import es.ise.ciceron.model.Archivo;

public class ListaArchivosDecorator extends TableDecorator
{
	@Override
	public String addRowId()
	{
		return String.format("archivo_%s", ((Archivo)getCurrentRowObject()).getId());
	}
	
}
