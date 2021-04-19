package colegio;

import java.util.Scanner;

public class Persona {

	private String nombre;
	private String apellido;

	public Persona() {
		this.nombre = "";
		this.apellido = "";
	}

	public Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	void rellenarPersona() {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Nombre:");
		this.nombre = scan.next();
		System.out.println("Apellido:");
		this.apellido = scan.next();
		

	}

	void visualizarPersona() {

		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);

	}

}
