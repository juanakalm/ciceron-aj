package es.ise.ciceron.displaytag.decorators;

import org.displaytag.decorator.TableDecorator;

import es.ise.ciceron.model.DocumentosES;

public class ListaDocumentosDecorator extends TableDecorator
{
	@Override
	public String addRowId()
	{
		return String.format("documento_%s", ((DocumentosES)getCurrentRowObject()).getIdEsDocumento());
	}
}
