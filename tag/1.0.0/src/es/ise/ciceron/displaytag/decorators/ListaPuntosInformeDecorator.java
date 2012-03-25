package es.ise.ciceron.displaytag.decorators;

import org.displaytag.decorator.TableDecorator;

import es.ise.ciceron.model.PuntosEditados;
import es.ise.ciceron.model.TextoInforme;

public class ListaPuntosInformeDecorator extends TableDecorator
{
	@Override
	public String addRowId()
	{
		return String.format("informe_%s", ((PuntosEditados)getCurrentRowObject()).getIdTextoInforme());
	}
}
