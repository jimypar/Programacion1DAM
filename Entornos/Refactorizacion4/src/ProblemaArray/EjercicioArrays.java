package ProblemaArray;

import java.util.Arrays;
import java.util.List;

public class EjercicioArrays {

	// Cambiado todos los nombres mal explicados
	static int numAlumnos = 40;
	// vector con las notas generadas
	static Integer[] control = new Integer[numAlumnos];
	static int maxNota = 0;
	static int minNota = 0;
	static int indMaxNota = 0;
	static int indMinNota = 0;
	static int postEval = 0;

	public static void main(String[] args) {

		// Genera notas random entre 1 y 10
		generarNotas();

		// buscamos al mayor
		buscarMayor();

		// buscamos al menor
		buscarMenor();

		// creamos una lista de los alumnos de la clase
		int[] listaClase = new int[numAlumnos];
		crearListaAlumnos(listaClase);
		
		// Empezamos el uso de listas para facilitar la tarea de indices.
		List<Integer> notas = Arrays.asList(control);
		indMinNota = notas.indexOf(minNota) + 1;
		indMaxNota = notas.indexOf(maxNota) + 1;

		// Comprobamos el resultado del ejercicio
		ejercicioString(listaClase,notas);

		// creamos el array de notas "practicas"
		int[] practicas = new int[numAlumnos];
		for (int i = 0; i < practicas.length; i++) {
			practicas[i] = (int) (Math.random() * 11);
		}
		// Creamos el vector calificaciones
		float[] calificaciones = new float[numAlumnos];
		for (int i = 0; i < control.length; i++) {
			calificaciones[i] = (((float) control[i] + (float) practicas[i]) / 2);
		}
		System.out.println("Practicas      :" + Arrays.toString(practicas));
		System.out.println("Calificaciones :" + Arrays.toString(calificaciones));

		// Sacamos la estadÃ­stica de calificaciones
		// hacemos un array de 10 para la estadÃ­stica.
		float[] estadistica = new float[10];

		// Cambiado el limite del for por la longitud de estadistica
		for (int i = 0; i < estadistica.length; i++) {
			float count = 0;
			// float sum = 0;
			for (int j = 0; j < control.length; j++) {
				if ((i < calificaciones[j]) && ((i + 1) >= calificaciones[j])) {
					// sum += calificaciones[j];
					count += 1;
				}
			}
			if (count != 0) {
				estadistica[i] = ((float) count / numAlumnos);
			} else {
				estadistica[i] = 0;
			}
			double sol = (Math.round(estadistica[i] * 10000.0)) / 100.0;
			System.out.println("Estadistica nota tramo <=" + (i + 1) + " = " + sol + "%");
		}
		// Aprobados y suspensos
		int[] aprobados = new int[numAlumnos];
		int[] suspensos = new int[numAlumnos];
		int countAprobados = 0;
		int countSuspensos = 0;
		for (int i = 0; i < numAlumnos; i++) {
			if (calificaciones[i] < 5) {
				aprobados[i] = i;
				countAprobados += 1;
			} else {
				suspensos[i] = i;
				countSuspensos += 1;
			}
		}
		System.out.println("Relacion de aprobados por nº de lista: " + Arrays.toString(aprobados));
		System.out.println("Relacion de suspensos por nº de lista: " + Arrays.toString(suspensos));
		// Resumen de aprobados y suspensos
		int cont1 = 0;
		int cont2 = 0;
		int[] aprobado = new int[countAprobados];
		int[] suspenso = new int[countSuspensos];
		while (cont1 < aprobados.length) {
			if (aprobados[cont1] != 0) {
				aprobado[cont2] = aprobados[cont1];
				cont1++;
				cont2++;
			} else {
				cont1++;
			}
		}

		cont1 = 0;
		cont2 = 0;
		while (cont1 < suspensos.length) {
			if (suspensos[cont1] != 0) {
				suspenso[cont2] = suspensos[cont1];
				cont1++;
				cont2++;
			} else {
				cont1++;
			}
		}
		System.out.println("Resumen  de aprobados por nº de lista: " + Arrays.toString(aprobado));
		System.out.println("Resumen  de aprobados por nº de lista: " + Arrays.toString(suspenso));

		/*
		 * 6. Suponer un vector de Calificaciones de tamaÃ±o 40 (mÃ¡ximo de alumnos por
		 * clase), pero que solo almacena las notas de 31 alumnos. Realizar un programa
		 * que permita insertar en la posiciÃ³n 4 del vector la calificaciÃ³n de un
		 * nuevo alumno en clase al que supuestamente le corresponde como nota un 6.
		 */
		double[] calif = new double[40];
		int numNuevoAlumnos = 31;
		for (int i = 0; i < numNuevoAlumnos; i++) {
			calif[i] = (int) (Math.random() * 11);
		}
		System.out.println("Nota antigua alumno nº4: " + calif[3]);
		calif[3] = 6;
		System.out.println("Nota nueva   alumno nº4: " + calif[3]);
	}

	private static void ejercicioString(int[] listaClase, List<Integer> notas) {
		
		System.out.println("Minimo es: " + minNota);
		System.out.println("Maximo es: " + maxNota);
		System.out.println("Indice del minimo es : " + indMinNota);
		System.out.println("Indice del maximo es : " + indMaxNota);
		System.out.println("Lista de clase :" + Arrays.toString(listaClase));
		System.out.println("Array de Notas :" + notas);
		
	}

	private static void crearListaAlumnos(int[] listaClase) {
		
		
		for (int i = 0; i < control.length; i++) {
			listaClase[i] = i + 1;
		}
		
	}

	private static void buscarMenor() {

		postEval = 0;
		for (int i = 0; i < control.length; i++) {
			int preEval = control[i];
			if (preEval > postEval) {
				maxNota = preEval;
				postEval = control[i];
			}
		}

	}

	private static void buscarMayor() {

		postEval = 11;
		for (int i = 0; i < control.length; i++) {
			int preEval = control[i];
			if (preEval < postEval) {
				minNota = preEval;
				postEval = control[i];
			}
		}

	}

	private static void generarNotas() {

		for (int i = 0; i < control.length; i++) {
			control[i] = (int) (Math.random() * 11);
		}

	}
}
