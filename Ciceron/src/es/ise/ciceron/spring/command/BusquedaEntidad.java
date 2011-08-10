package es.ise.ciceron.spring.command;

public class BusquedaEntidad
{
	private String cif;
	private String nombre;
	
	private String accion = "";

	public String getCif()
	{
		return cif;
	}

	public void setCif(String cif)
	{
		this.cif = cif;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
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
