package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Colegio {

	private ArrayList<Persona_class> personas = new ArrayList<Persona_class>();
	private String nombreColegio;
	private Scanner scan = new Scanner(System.in);

	void rellenar() {

		System.out.println("Nombre de empresa");
		this.nombreColegio = scan.next();

		Profesor profesor = new Profesor();
		profesor.rellenar();
		personas.add(profesor);

		Estudiante estudiante = new Estudiante();
		estudiante.rellenar();
		personas.add(estudiante);

	}

	void visualizar() {

		System.out.println("Colegio: " + this.nombreColegio);

		for (Persona_class persona : personas) {
			if (persona.getClass().getSimpleName().equals("Profesor")) {
				System.out.println();
				System.out.println("Profesor: ");
				System.out.println();
			}
			if (persona.getClass().getSimpleName().equals("Estudiante")) {
				System.out.println();
				System.out.println("Estudiante: ");
				System.out.println();
			}
			persona.visualizar();
		}

	}

}
