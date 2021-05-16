package Alimentacion;

import java.util.Scanner;

public class Articulo {

	private String descripcion;
	private float precioCompra;
	private Scanner scan = new Scanner(System.in);

	public Articulo() {
		this.descripcion = "";
		this.precioCompra = 0;
	}

	public Articulo(String descripcion, int precioCompra) {
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public float getPrecioCompra() {
		return precioCompra;
	}

	public void rellenar() {

		System.out.println("Introduce la descripcion: ");
		this.descripcion = scan.next();

		boolean error = true;
		do {
			try {
				System.out.println("Introduce el precio");
				this.precioCompra = scan.nextInt();
				error = false;
			} catch (Exception e) {
				System.out.println("Introduce un numero");
				scan.next();
				error = true;
			}
		} while (error);

	}

	public void visualizar() {

		System.out.println("Descripcion: "+this.descripcion);
		System.out.println("Precio compra: "+this.precioCompra);
		
	}

}
