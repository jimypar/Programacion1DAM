package main;

import java.util.Scanner;

public abstract class Autobus_class implements Autobus_interface {

	private int id_autobus;
	private Conductor conductor;
	private float precioBase;
	private Scanner scan = new Scanner(System.in);

	public Autobus_class() {
		this.id_autobus = 0;
		this.conductor = new Conductor();
		this.precioBase = 0;
	}

	public Autobus_class(int id_autobus, Conductor conductor, float precioBase) {
		this.id_autobus = id_autobus;
		this.conductor = new Conductor();
		this.precioBase = precioBase;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public void rellenar() {

		System.out.println("Introduce id:");
		this.id_autobus = scan.nextInt();
		System.out.println("Conductor:");
		conductor.rellenar();
		System.out.println("Introduce el precio base: ");
		this.precioBase = scan.nextFloat();

	}

	public void visualizar() {

		System.out.println("ID: " + this.id_autobus);
		System.out.println("Conductor: ");
		System.out.println("   Nombre: " + this.conductor.getNombre());
		System.out.println("  Salario: " + this.conductor.getSalario());

	}

}
