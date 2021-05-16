package main;

import java.util.Scanner;

public class Empleado extends Persona_class implements Persona_interface {

	private int sueldo;
	private Scanner scan = new Scanner(System.in);

	@Override
	public void rellenar() {

		super.rellenar();
		System.out.println("Introduce el sueldo: ");
		this.sueldo = scan.nextInt();

	}

	@Override
	public void visualizar() {

		super.visualizar();
		System.out.println("Sueldo: " + this.sueldo);

	}

	@Override
	public void calcularBonificacion() {

	}

}
