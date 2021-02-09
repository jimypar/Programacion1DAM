package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperacionesMatriz {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void rellenar(String[][] matriz) throws NumberFormatException, IOException {

		for (int x = 0; x < matriz.length; x++) {
			System.out.println("Fila: " + (x + 1));

			for (int i = 0; i < matriz[0].length; i++) {
				System.out.print("Columna " + (i + 1) + ": ");
				matriz[x][i] = in.readLine();
			}
		}

	}

	public static void visualizar(String[][] matriz) {

		for (int x = 0; x < matriz.length; x++) {
			System.out.println();
			for (int i = 0; i < matriz[0].length; i++) {
				System.out.print(matriz[x][i] + " ");
			}
		}

	}

	public static void ordenar(String[][] matriz) {

		for (int k = 0; k < matriz.length; k++) {

			String aux;
			for (int i = 1; i < matriz.length; i++) {

				for (int j = matriz.length - 1; j >= 1; j--) {
					if (matriz[k][j].compareTo(matriz[k][j - 1])<0 ) {
						aux = matriz[k][j];
						matriz[k][j] = matriz[k][j - 1];
						matriz[k][(j - 1)] = aux;

					}

				}
			}
		}

	}

}
