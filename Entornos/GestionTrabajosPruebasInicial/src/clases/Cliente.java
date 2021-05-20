package clases;

import java.time.LocalDate;

public class Cliente {

	private String dni;
	private String nombre;
	private LocalDate FechaCompra;

	public Cliente(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaCompra() {
		return FechaCompra;
	}

	public void setFechaCompra(LocalDate fechaCompra) {
		FechaCompra = fechaCompra;
	}

	@Override
	public String toString() {
		return dni + " - " + nombre + " - " + FechaCompra.toString();

	}
}
