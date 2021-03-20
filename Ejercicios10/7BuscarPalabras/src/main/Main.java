package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {

//	7. BUSCAR PALABRAS. Se debe hacer un programa que abra el fichero mentor.txt, extraiga ciertas estad�sticas del
//	mismo, y realice unas operaciones sobre su contenido.
//	Concretamente es necesario:
//	 Comprobar que el fichero existe. Se puede usar la clase java.io.File (buscarla en el API de Java) y el
//	m�todo exists() .
//	 Leer el contenido del fichero a un Vector. Cada elemento del Vector debe contener un String con cada
//	l�nea del texto del fichero.
//	 Mostrar estad�sticas de cada l�nea por la salida est�ndar (consola).
//	 El n�mero letras de cada l�nea.
//	 El n�mero de vocales de cada l�nea.
//	 El n�mero de espacios en blanco de cada l�nea.
//	 Cuantas veces aparece la palabra "Mentor", tanto en may�sculas como en min�sculas.
//	 Convertir la segunda l�nea a may�sculas y la tercera a min�sculas.
//	 Guardar un fichero mentor2.txt con el texto tras sufrir estas transformaciones.

	public static void main(String[] args) {

		ArrayList<String> lineas = new ArrayList<String>();

		leer(lineas);
		mostrar(lineas);
		stats(lineas);
		escribir(lineas);

	}

	private static void leer(ArrayList<String> lineas) {

		File f = new File("mentor.txt");
		if (!f.exists()) {
			System.out.println("No se ha encontrado el archivo");
		} else {

			try {

				BufferedReader fuente = new BufferedReader(new FileReader("mentor.txt"));

				String linea = "";
				linea = fuente.readLine();
				while (linea != null) {
					lineas.add(linea);
					linea = fuente.readLine();
				}

				fuente.close();

			}catch (IOException e) {
				System.out.println("Algo ha fallado");
			}

		}
	}
	
	private static void mostrar(ArrayList<String> lineas) {

		System.out.println();
		for (int i = 0; i < lineas.size(); i++) {
			System.out.println(lineas.get(i));
		}

	}
	
	

	private static void stats(ArrayList<String> lineas) {
		System.out.println();
		for (int i = 0; i < lineas.size(); i++) {

			int letras = 0;
			int vocales = 0;
			int espacios = 0;
			int mentor = 0;

			for (int j = 0; j < (lineas.get(i).length()); j++) {
				if (Character.isLetter(lineas.get(i).toLowerCase().charAt(j))) {
					letras++;
				}
				if (lineas.get(i).toLowerCase().charAt(j) == 'a' || lineas.get(i).toLowerCase().charAt(j) == 'e'
						|| lineas.get(i).toLowerCase().charAt(j) == 'i' || lineas.get(i).toLowerCase().charAt(j) == 'o'
						|| lineas.get(i).toLowerCase().charAt(j) == 'u') {
					vocales++;
				}
				if (lineas.get(i).toLowerCase().charAt(j) == ' ') {
					espacios++;
				}
				if (lineas.get(i).substring(j).startsWith("mentor")) {
					mentor++;
				}

			}

			System.out.println("LINEA: " + (i + 1) + " = " + lineas.get(i));
			System.out.println(letras + " letras");
			System.out.println(vocales + " vocales");
			System.out.println(espacios + " espacios");
			System.out.println(mentor + " mentor");

		}

	}

	private static void escribir(ArrayList<String> lineas) {

		try {
			PrintWriter destino = new PrintWriter(new FileWriter("mentor2.txt", false));

			for (int i = 0; i < lineas.size(); i++) {

				if (i == 1) {
					destino.println(lineas.get(i).toUpperCase());
				}
				if (i == 2) {
					destino.println(lineas.get(i).toLowerCase());
					;
				}
				if (i != 1 && i != 2) {
					destino.println(lineas.get(i));
				}

			}

			destino.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	

}
