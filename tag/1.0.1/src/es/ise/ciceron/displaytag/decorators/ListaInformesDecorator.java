package es.ise.ciceron.displaytag.decorators;

import org.displaytag.decorator.TableDecorator;

import es.ise.ciceron.model.InformeJuridico;

public class ListaInformesDecorator extends TableDecorator
{
	@Override
	public String addRowId()
	{
		return String.format("informe_%s", ((InformeJuridico)getCurrentRowObject()).getIdExpediente());
	}
	
}
