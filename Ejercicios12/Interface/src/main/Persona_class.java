package main;

import java.util.Scanner;

public class Persona_class {

	private String nombre;
	private String apellido;
	private int antiguedad;
	private Scanner scan = new Scanner(System.in);

	void rellenar() {
		System.out.println("Introduce el nombre:");
		this.nombre = scan.next();
		System.out.println("Introduce el apellido:");
		this.apellido = scan.next();
		System.out.println("Introduce la antiguedad");
		this.antiguedad = scan.nextInt();
	}

	void visualizar() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("Antiguedad: " + this.antiguedad);
	}
}
