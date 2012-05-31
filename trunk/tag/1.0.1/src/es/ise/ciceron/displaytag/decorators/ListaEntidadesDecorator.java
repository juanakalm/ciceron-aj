package es.ise.ciceron.displaytag.decorators;

import org.displaytag.decorator.TableDecorator;

import es.ise.ciceron.model.Entidades;

public class ListaEntidadesDecorator extends TableDecorator
{
	@Override
	public String addRowId()
	{
		return String.format("entidad_%s_%s", ((Entidades)getCurrentRowObject()).getId(), ((Entidades)getCurrentRowObject()).getNombre());
	}
}
