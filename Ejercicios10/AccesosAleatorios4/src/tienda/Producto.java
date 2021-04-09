package tienda;

public class Producto {

	private int codigo;
	private double precio;

	public Producto() {
		this.codigo = 0;
		this.precio = 0;
	}

	public Producto(int codigo, double precio) {
		this.codigo = codigo;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "   Codigo=" + this.codigo + "\n   Precio=" + this.precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getPrecio() {
		return precio;
	}

}
