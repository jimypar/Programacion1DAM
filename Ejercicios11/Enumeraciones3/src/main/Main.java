package main;

import java.util.ArrayList;
import java.util.Scanner;

//ENUMERACION COMPLEJA EN VECTORES 
// Diseña la siguiente clase enum que almacene la información
//(número de alumnos y número de asignaturas) de los ciclos de ASI, DAM y MARKETING.
//enum ciclos{
// ASI(20, 5), DAM(25,4), MARQKETING(30,7);
//}
//Un alumno contiene la siguiente información: nombre, apellidos y ciclo (clase enumerada).
//Rellenar una lista de alumnos, y a continuación, mostrar toda la información de la lista. Por cada
//alumno mostrar su nombre, apellidos y el nombre abreviado del ciclo junto con la posición que ocupa
//en la lista y sus propiedades(número de alumnos y número de asignaturas).

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Alumno> alumno = new ArrayList<Alumno>();
		
		

		Ciclos miCiclo = Ciclos.DAM;

		System.out.println(miCiclo);

		System.out.println("Ciclos:");
		for (Ciclos ciclo : Ciclos.values()) {
			System.out.println(ciclo.toString());
		}
		System.out.println();

		Scanner scan = new Scanner(System.in);
		boolean fin = false;
		do {
			try {
				System.out.println("Elige un ciclo de la lista:");
				String ciclo = scan.nextLine();
				miCiclo = Ciclos.valueOf(ciclo.toUpperCase());
				fin = true;
			} catch (IllegalArgumentException e) {
				fin = false;
			}
		} while (!fin);
		System.out.println("El ciclo elegido es " + miCiclo.toString());
		scan.close();

	}

}
