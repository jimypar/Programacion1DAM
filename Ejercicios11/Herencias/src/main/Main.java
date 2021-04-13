package main;

import colegio.Alumno;
import colegio.Profesor;

public class Main {

	public static void main(String[] args) {

		// crear alumno y profesor
		Alumno unAlumno = new Alumno();
		Profesor unProfesor = new Profesor();

		unAlumno.rellenarAlumno();
		unProfesor.rellenarProfesor();

		unAlumno.visualizarAlumno();
		unProfesor.visualizarProfesor();

		unAlumno = new Alumno("Pepe", "Montilla", "DAM", 10);
		unAlumno.visualizarAlumno();
		unProfesor = new Profesor("Angel", "Perez", 3000, "ASIR");
		unProfesor.visualizarProfesor();
	}

}
