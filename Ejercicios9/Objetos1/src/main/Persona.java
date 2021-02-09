package main;

import java.util.Scanner;

public class Persona {
	
	Scanner scan = new Scanner(System.in);
	
	String nombre;
	String apellidos;
	int edad;

	void rellenar() {
		
		System.out.println("Introducir:");
		System.out.print("Nombre: ");
		this.nombre=scan.next();
		System.out.print("Apellido: ");
		this.apellidos=scan.next();
		System.out.print("Edad: ");
		this.edad=scan.nextInt();
		
	}
	
	void visualizar() {
		
		System.out.println("VER DATOS:");
		System.out.println("Nombre= "+this.nombre);
		System.out.println("Apellido= "+this.apellidos);
		System.out.println("Edad= "+this.edad);
		
	}
	
	String nombrecompleto() {
		
		String nombrecompleto = this.nombre+" "+this.apellidos;
		return nombrecompleto;
				
	}

	boolean mayoredad() {
		
		if (this.edad >= 18) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
