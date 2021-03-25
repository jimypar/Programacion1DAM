package main;

//cambiados los imports
import java.util.Scanner;

/*
 * Clase para refactorizar
 * Se deben comentar todas las refactorizaciones realizadas,
 * mediante comentarios de una linea o de bloque.
 */

public class Refactor {

	// Crear el scanner al principio y cambio de nombre
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// separadas las declaraciones
		// cambiado el nombre del int con lowerCamelCase
		int i;
		int cantidadMaximaAlumnos = 10;
		//nombre del array por notas
		int[] notas = new int[cantidadMaximaAlumnos];
		// cambio de n por i en el for
		for (i = 0; i < notas.length; i++) {
			System.out.println("Introduce nota media de alumno");
			notas[i] = scan.nextInt();
		}

		System.out.println("El resultado es: " + recorrerArray(notas));

	}

	//cambiado el nombre del metodo
	static double recorrerArray(int[] vector) {
		// cambiado el nombre del double
		double totalNotas = 0;
		// cambiado el iterador de a por i
		for (int i = 0; i < 10; i++) {
			totalNotas = totalNotas + vector[i];
		}
		return totalNotas / 10;
	}

}
