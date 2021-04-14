package empresa;

import java.util.Scanner;

public class Empleado {

	private String nombre;
	private float sueldo;

	public Empleado() {
		this.nombre = "";
		this.sueldo = 0.0f;
	}

	public Empleado(String nombre, int sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	void rellenarEmpleado() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Nombre: ");
		this.nombre = scan.next();
		System.out.println("Sueldo: ");
		this.sueldo = scan.nextFloat();

	}

	void visualizarEmpleado() {

		System.out.println("Nombre: " + this.nombre);
		System.out.println("- Sueldo: " + this.sueldo);

	}
}
