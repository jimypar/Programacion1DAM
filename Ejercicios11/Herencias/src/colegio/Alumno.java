package colegio;

import java.util.Scanner;

public class Alumno extends Persona {

	private String ciclo;
	private int nota;

	public Alumno() {
		this.ciclo = "";
		this.nota = 0;
	}

	public Alumno(String nombre, String apellido,String ciclo,int nota) {
		super(nombre, apellido);
		this.ciclo = ciclo;
		this.nota = nota;		
	}

	public void rellenarAlumno() {

		Scanner scan = new Scanner(System.in);

		super.rellenarPersona();

		System.out.println("Ciclo:");
		this.ciclo = scan.next();
		System.out.println("Nota:");
		this.nota = scan.nextInt();

	}

	public void visualizarAlumno() {

		super.visualizarPersona();
		System.out.println("Ciclo: " + this.ciclo);
		System.out.println("Nota: " + this.nota);

	}

}
