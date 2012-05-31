package es.ise.ciceron.spring.command;

import java.math.BigDecimal;

public class BusquedaContrato
{
	private BigDecimal idContrato;
	private BigDecimal idExpediente;
	private String descripcion;
	private String codigo;
	private BigDecimal secuencia;
	private BigDecimal idEntidad;
	private String nombre;
	private String cif;
	
	private String accion = "";
	
	public String getAccion()
	{
		return accion;
	}
	public void setAccion(String accion)
	{
		this.accion = accion;
	}
	public BigDecimal getIdContrato()
	{
		return idContrato;
	}
	public void setIdContrato(BigDecimal idContrato)
	{
		this.idContrato = idContrato;
	}
	public BigDecimal getIdExpediente()
	{
		return idExpediente;
	}
	public void setIdExpediente(BigDecimal idExpediente)
	{
		this.idExpediente = idExpediente;
	}
	public String getDescripcion()
	{
		return descripcion;
	}
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}
	public String getCodigo()
	{
		return codigo;
	}
	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	}
	public BigDecimal getSecuencia()
	{
		return secuencia;
	}
	public void setSecuencia(BigDecimal secuencia)
	{
		this.secuencia = secuencia;
	}
	public BigDecimal getIdEntidad()
	{
		return idEntidad;
	}
	public void setIdEntidad(BigDecimal idEntidad)
	{
		this.idEntidad = idEntidad;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getCif()
	{
		return cif;
	}
	public void setCif(String cif)
	{
		this.cif = cif;
	}
}
