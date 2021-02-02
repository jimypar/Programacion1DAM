package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperacionesMatriz {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void rellenar(int[][] m) throws NumberFormatException, IOException {

		for (int x = 0; x < m.length; x++) {
			System.out.println("Fila: " + (x + 1));

			for (int i = 0; i < m[0].length; i++) {
				System.out.print("Columna " + (i + 1) + ": ");
				m[x][i] = Integer.parseInt(in.readLine());
			}
		}

	}

	public static void visualizar(int[][] m) {

		for (int x = 0; x < m.length; x++) {
			System.out.println();
			for (int i = 0; i < m[0].length; i++) {
				System.out.print(m[x][i] + " ");
			}
		}

	}

	public static boolean simetrica(int[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int x = 0; x < m.length; x++) {
				if (m[i][x] != m[x][i]) {
					return false;
				}
			}

		}
		return true;
	}

}
