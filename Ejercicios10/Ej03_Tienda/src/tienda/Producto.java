package tienda;

public class Producto {
	private int codigo;
	private double precio;
	
	Producto(){
		this.codigo=0;
		this.precio=0.0;
	}
	Producto(int codigo, double precio){
		this.codigo=codigo;
		this.precio=precio;
	}
	@Override
	public String toString() {
		return "Codigo=" + codigo + ", precio=" + precio;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
