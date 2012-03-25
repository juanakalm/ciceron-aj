package es.ise.ciceron.spring.command;

import java.math.BigDecimal;

public class BusquedaUsuario {
	
	private String nombre;
	private String dni;
	private String accion = "";

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

		
}
