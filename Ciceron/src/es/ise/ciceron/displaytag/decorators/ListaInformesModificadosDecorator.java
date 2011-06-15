package es.ise.ciceron.displaytag.decorators;

import org.displaytag.decorator.TableDecorator;

import es.ise.ciceron.model.InformeJuridicoModificado;

public class ListaInformesModificadosDecorator extends TableDecorator
{
	@Override
	public String addRowId()
	{
		return String.format("informe_%s", ((InformeJuridicoModificado)getCurrentRowObject()).getIdExpediente());
	}
}
