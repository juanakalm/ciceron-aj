package es.ise.ciceron.spring.command;

import java.math.BigDecimal;

public class BusquedaDocumento
{
	private String descripcion;
	private BigDecimal secuencia;
	private String codigo;
	private String entidad;
	private BigDecimal idEntidad;
	private BigDecimal idExpediente;
	private String operacion;
	private BigDecimal idOperacion;
	private String uniInterna;
	private BigDecimal idUniInterna;
	private String uniExterna;
	private BigDecimal idUniExterna;
	private String descripcionFormato;
	private String tipoEntradaSalida;
	
	private String accion = "";
	
	public String getDescripcion()
	{
		return descripcion;
	}

	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}


	public BigDecimal getSecuencia()
	{
		return secuencia;
	}

	public void setSecuencia(BigDecimal secuencia)
	{
		this.secuencia = secuencia;
	}

	public String getCodigo()
	{
		return codigo;
	}

	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	}

	public String getEntidad()
	{
		return entidad;
	}

	public void setEntidad(String entidad)
	{
		this.entidad = entidad;
	}

	public BigDecimal getIdEntidad()
	{
		return idEntidad;
	}

	public void setIdEntidad(BigDecimal idEntidad)
	{
		this.idEntidad = idEntidad;
	}

	public BigDecimal getIdExpediente()
	{
		return idExpediente;
	}

	public void setIdExpediente(BigDecimal idExpediente)
	{
		this.idExpediente = idExpediente;
	}

	public String getOperacion()
	{
		return operacion;
	}

	public void setOperacion(String operacion)
	{
		this.operacion = operacion;
	}

	public BigDecimal getIdOperacion()
	{
		return idOperacion;
	}

	public void setIdOperacion(BigDecimal idOperacion)
	{
		this.idOperacion = idOperacion;
	}

	public String getUniInterna()
	{
		return uniInterna;
	}

	public void setUniInterna(String uniInterna)
	{
		this.uniInterna = uniInterna;
	}

	public BigDecimal getIdUniInterna()
	{
		return idUniInterna;
	}

	public void setIdUniInterna(BigDecimal idUniInterna)
	{
		this.idUniInterna = idUniInterna;
	}

	public String getUniExterna()
	{
		return uniExterna;
	}

	public void setUniExterna(String uniExterna)
	{
		this.uniExterna = uniExterna;
	}

	public BigDecimal getIdUniExterna()
	{
		return idUniExterna;
	}

	public void setIdUniExterna(BigDecimal idUniExterna)
	{
		this.idUniExterna = idUniExterna;
	}

	public String getAccion()
	{
		return accion;
	}

	public void setAccion(String accion)
	{
		this.accion = accion;
	}

	public void setDescripcionFormato(String descripcionFormato)
	{
		this.descripcionFormato = descripcionFormato;
	}

	public String getDescripcionFormato()
	{
		return descripcionFormato;
	}

	public void setTipoEntradaSalida(String tipoEntradaSalida)
	{
		this.tipoEntradaSalida = tipoEntradaSalida;
	}

	public String getTipoEntradaSalida()
	{
		return tipoEntradaSalida;
	}

}
