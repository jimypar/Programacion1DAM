package clases;

import java.time.LocalDate;

public class Factura {
	private String codigoFactura;
	private LocalDate fecha;
	private String nombreProducto;
	private float precioUnidad;
	private int cantidad;
	private Cliente cliente;
	
	public Factura(String codigoFactura, LocalDate fecha, String nombreProducto, float precioUnidad, int cantidad,
			Cliente cliente) {
		super();
		this.codigoFactura = codigoFactura;
		this.fecha = fecha;
		this.nombreProducto = nombreProducto;
		this.precioUnidad = precioUnidad;
		this.cantidad = cantidad;
		this.cliente = cliente;
	}

	public Factura(String codigoFactura) {
		super();
		this.codigoFactura = codigoFactura;
	}

	public String getCodigoFactura() {
		return codigoFactura;
	}

	public void setCodigoFactura(String codigoFactura) {
		this.codigoFactura = codigoFactura;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public float getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(float precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return "Factura [codigoFactura=" + codigoFactura + ", fecha=" + fecha + ", cliente=" + cliente + "]";
	}
	
}
