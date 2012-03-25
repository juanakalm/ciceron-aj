package es.ise.ciceron.displaytag.decorators;

import org.displaytag.decorator.TableDecorator;

import es.ise.ciceron.model.ListaDePliegos;

public class ListaPliegosDecorator extends TableDecorator
{
	@Override
	public String addRowId()
	{
		return String.format("pliego_%s", ((ListaDePliegos)getCurrentRowObject()).getId());
	}
}
