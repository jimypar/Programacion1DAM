package clases;

import java.time.LocalDate;

public class Cliente {
	private String dni;
	private String nombre;
	private LocalDate fechaAlta;
	
	public Cliente(String dni, String nombre, LocalDate fechaAlta) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaAlta = fechaAlta;
	}

	public Cliente(String dni) {
		super();
		this.dni = dni;
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

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", fechaAlta=" + fechaAlta + "]";
	}
	
}
