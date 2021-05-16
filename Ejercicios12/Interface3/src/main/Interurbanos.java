package main;

import java.util.Scanner;

public class Interurbanos extends Autobus_class {

	private int km;
	private Scanner scan = new Scanner(System.in);

	public void rellenar() {
		super.rellenar();

		System.out.println("Introduce KM: ");
		this.km = scan.nextInt();

	}

	public void visualizar() {
		super.visualizar();

		System.out.println("Km: " + this.km);
		System.out.println("Precio Final: " + calcularPrecio());

	}

	@Override
	public float calcularPrecio() {

		return (super.getPrecioBase() * this.km);

	}

}
