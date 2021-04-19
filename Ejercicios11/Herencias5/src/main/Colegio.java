package main;

import java.util.ArrayList;
import java.util.Scanner;

import colegio.Alumno;
import colegio.Persona;
import colegio.Profesor;

public class Colegio {

	private String nombre;
	private ArrayList<Persona> personas;

	public Colegio() {
		super();
		this.nombre = "";
		this.personas = new ArrayList<Persona>();
	}

	public Colegio(String nombre, ArrayList<Persona> personas) {
		super();
		this.nombre = nombre;
		this.personas = personas;
	}

	public void rellenar() {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Nombre del colegio");
		this.nombre = scan.next();
		String respuesta = "";
		do {
			System.out.println("1.Profesor");
			System.out.println("2.Alumno");
			System.out.print("Elige: ");
			int opcion = scan.nextInt();
			if (opcion == 1) {
				Profesor unProfesor = new Profesor();
				personas.add(unProfesor);
			}
			if (opcion == 2) {
				Alumno unAlumno = new Alumno();
				personas.add(unAlumno);
			}
			System.out.println("Deseas continuar?");
			respuesta = scan.next();

		} while (respuesta.equalsIgnoreCase("si"));

	}

	public void visualiza() {

		System.out.println("COLEGIO: " + this.nombre);
		for (Persona persona : personas) {
			if (persona.getClass().getName().equalsIgnoreCase("Profesor")) {
				((Profesor)persona).visualizarProfesor();
			}
			else {
				((Alumno)persona).visualizarAlumno();
			}
		}
	}

}
