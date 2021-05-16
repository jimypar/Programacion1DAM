package main;

import java.util.Scanner;

public class Urbano extends Autobus_class {

	private String ruta;
	private Scanner scan = new Scanner(System.in);

	public Urbano() {
		super();
		this.ruta = "A";
	}

	public Urbano(String ruta) {
		super();
		this.ruta = ruta;
	}

	public void rellenar() {

		super.rellenar();

		System.out.println("Introduce la ruta (A o B): ");
		this.ruta = scan.next();

	}

	public void visualizar() {

		super.visualizar();
		System.out.println("Ruta: " + this.ruta);
		System.out.println("Precio Final: " + calcularPrecio());

	}

	@Override
	public float calcularPrecio() {

		float precio = super.getPrecioBase();

		if (this.ruta.toUpperCase().equalsIgnoreCase("A")) {
			precio *= 1.1;
		} else {
			precio *= 1.2;
		}

		return precio;

	}

}
