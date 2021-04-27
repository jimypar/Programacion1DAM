package Personal;

import java.util.Scanner;

public abstract class Empleado {

	private Scanner scan = new Scanner(System.in);
	private String numeroDNI;
	private String nombre;
	private String apellido;
	private int year;

	public Empleado() {
		this.numeroDNI = "";
		this.nombre = "";
		this.apellido = "";
		this.year = 0;
	}

	public Empleado(Scanner scan, String numeroDNI, String nombre, String apellido, int year) {
		this.scan = scan;
		this.numeroDNI = numeroDNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	void rellenar() {

		System.out.println("Introduce DNI: ");
		this.numeroDNI = scan.next();
		System.out.println("Introduce el nombre: ");
		this.nombre = scan.next();
		System.out.println("Introduce el apellido: ");
		this.apellido = scan.next();
		System.out.println("Introduce el año de ingreso: ");
		this.year = scan.nextInt();

	}

	void visualizar() {

		System.out.println("DNI: " + this.numeroDNI);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("Año de ingreso: " + this.year);

	}

	abstract void imprimir();

	abstract int obtenerSalario();

}
