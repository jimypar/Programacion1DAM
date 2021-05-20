package clases;

import java.time.LocalDate;

public class Venta {

	private String nombre;
	private String electrodomestico;
	private Double presupuesto;
	private LocalDate fechaVenta;
	private Cliente cliente;

	public Venta(String nombre, String cliente, Double presupuesto, String electrodomestico) {
		super();
		this.nombre = nombre;
		this.electrodomestico = electrodomestico;
		this.presupuesto = presupuesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getElectrodomestico() {
		return electrodomestico;
	}

	public void setElectrodomestico(String electrodomestico) {
		this.electrodomestico = electrodomestico;
	}

	public Double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return nombre + " - " + electrodomestico + " - " + presupuesto + " - " + fechaVenta.toString() + " - "
				+ cliente.toString();

	}

}
