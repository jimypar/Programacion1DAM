package colegio;

import java.util.Scanner;

public class Alumno extends Persona {

	private int nota;

	public Alumno() {
		this.nota = 0;
	}

	public Alumno(String nombre, String apellido, int nota) {
		super(nombre, apellido);
		this.nota = nota;
	}

	public void rellenarAlumno() {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		super.rellenarPersona();

		System.out.println("Nota:");
		this.nota = scan.nextInt();

	}

	public void visualizarAlumno() {

		super.visualizarPersona();
		System.out.println("Nota: " + this.nota);

	}

}
