package alimentacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Articulo implements Comparable<Articulo> {

	private String descripcion;
	private double precio;

	public Articulo(String descripcion, double precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public Articulo() {
		this.descripcion = "";
		this.precio = 0;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void rellenar() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce la descripcion:");
		this.descripcion = scan.next();

		boolean error = false;
		do {
			try {
				System.out.println("Introduce el precio:");
				this.precio = scan.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.out.println("Introduce un numero");
				error = true;
				scan.next();
			}
		} while (error);

	}

	public void visualizar() {

		System.out.println("Descripcion: " + this.descripcion);
		System.out.println("Precio: " + this.precio);

	}

	public abstract double CalularPrecioVenta();

	@Override
	public int compareTo(Articulo a) {

		if (this.descripcion.compareTo(a.getDescripcion()) > 0) {
			return 1;
		}
		if (this.descripcion.compareTo(a.getDescripcion()) < 0) {
			return -1;
		}
		if (this.descripcion.compareTo(a.getDescripcion()) == 0) {
			if (this.precio > a.getPrecio()) {
				return 1;
			}
			if (this.precio < a.getPrecio()) {
				return -1;
			}

		}

		return 0;
	}

}
