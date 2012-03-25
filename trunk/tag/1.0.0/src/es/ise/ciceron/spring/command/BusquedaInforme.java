package es.ise.ciceron.spring.command;

import java.math.BigDecimal;

public class BusquedaInforme
{
	private BigDecimal secuencia;
	private String codigoExpediente;
	private String descripcionExpediente;
	private BigDecimal idUnidadContratacion;
	
	private String accion = "";
	
	public BigDecimal getSecuencia()
	{
		return secuencia;
	}

	public void setSecuencia(BigDecimal secuencia)
	{
		this.secuencia = secuencia;
	}

	public String getCodigoExpediente()
	{
		return codigoExpediente;
	}

	public void setCodigoExpediente(String codigoExpediente)
	{
		this.codigoExpediente = codigoExpediente;
	}

	public String getDescripcionExpediente()
	{
		return descripcionExpediente;
	}

	public void setDescripcionExpediente(String descripcionExpediente)
	{
		this.descripcionExpediente = descripcionExpediente;
	}

	public BigDecimal getIdUnidadContratacion()
	{
		return idUnidadContratacion;
	}

	public void setIdUnidadContratacion(BigDecimal idUnidadContratacion)
	{
		this.idUnidadContratacion = idUnidadContratacion;
	}

	public String getAccion()
	{
		return accion;
	}

	public void setAccion(String accion)
	{
		this.accion = accion;
	}
	
}
