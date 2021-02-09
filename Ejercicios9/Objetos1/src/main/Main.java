package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	/*  CLASE   OBJETO = NEW CLASE();*/
		
		Persona alumno = new Persona();
		Persona profesor = new Persona();
		
		/* RELLENAR */		
		alumno.rellenar();
		
		/* VISUALIZAR */		
		alumno.visualizar();
		System.out.println("Nombre completo= "+alumno.nombrecompleto());
		if (alumno.mayoredad()) {
			System.out.println("Es mayor de edad");
		}
		else {
			System.out.println("No es mayor de edad");
			}

		
		/* RELLENAR */		
		profesor.rellenar();

		/* VISUALIZAR */
		profesor.visualizar();
		System.out.println("Nombre completo= "+profesor.nombrecompleto());
		if (profesor.mayoredad()) {
			System.out.println("Es mayor de edad");
		}
		else {
			System.out.println("No es mayor de edad");
			}
		
		scan.close();
		
		
	}

}
