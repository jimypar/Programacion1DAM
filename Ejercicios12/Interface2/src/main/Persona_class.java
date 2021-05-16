package main;

import java.util.Scanner;

public abstract class Persona_class implements Persona_interface {

	private String nombre;
	private int edad;
	private Scanner scan = new Scanner(System.in);

	void rellenar() {
		System.out.println("Introduce el nombre:");
		this.nombre = scan.next();
		System.out.println("Introduce la edad:");
		this.edad = scan.nextInt();
	}

	void visualizar() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
	}
	
	

}
