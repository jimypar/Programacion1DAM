package main;

import java.util.ArrayList;
import java.util.Scanner;

//ENUMERACION COMPLEJA EN VECTORES 
// Dise�a la siguiente clase enum que almacene la informaci�n
//(n�mero de alumnos y n�mero de asignaturas) de los ciclos de ASI, DAM y MARKETING.
//enum ciclos{
// ASI(20, 5), DAM(25,4), MARQKETING(30,7);
//}
//Un alumno contiene la siguiente informaci�n: nombre, apellidos y ciclo (clase enumerada).
//Rellenar una lista de alumnos, y a continuaci�n, mostrar toda la informaci�n de la lista. Por cada
//alumno mostrar su nombre, apellidos y el nombre abreviado del ciclo junto con la posici�n que ocupa
//en la lista y sus propiedades(n�mero de alumnos y n�mero de asignaturas).

public class Main {

	public static void main(String[] args) {

		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

		rellenarAlumnos(alumnos);
		visualizarAlumnos(alumnos);

	}

	

	private static void rellenarAlumnos(ArrayList<Alumno> alumnos) {
		
		
		
		Scanner scan = new Scanner(System.in);

		boolean end=false;
		do {
			System.out.println("Introduce el nombre: (*)");
			String nombre = scan.next();
			if (nombre.equalsIgnoreCase("*")) {
				end = true;
			} else {
				System.out.println("Introduce el apellido: ");
				String apellido = scan.next();
				boolean fin = false;
				do {
					try {
						System.out.println("Introduce el ciclo: (ASI,DAM o MARKETING) ");
						String miCiclo = scan.next();
						Ciclos ciclo = Ciclos.valueOf(miCiclo.toUpperCase());
						Alumno alumno = new Alumno(nombre,apellido,ciclo);
						alumnos.add(alumno);
						fin = true;
					} catch (IllegalArgumentException e) {
						fin = false;
					}
				} while (!fin);
			} 
		} while (!end);
		
		
		scan.close();
		
	}
	
	private static void visualizarAlumnos(ArrayList<Alumno> alumnos) {
		
		for (Alumno alumno : alumnos) {
			alumno.visualizarAlumno();
		}
		
	}

}
