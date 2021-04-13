package main;

import java.util.Scanner;

public class Alumno {

	private String nombre;
	private String apellidos;
	private String ciclo;

	void rellenarAlumno() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el nombre: ");
		this.nombre = scan.next();
		System.out.println("Introduce el apellido: ");
		this.apellidos = scan.next();
		System.out.println("Introduce el ciclo: (ASI,DAM o MARKETING) ");
		
		
	}
	
}
