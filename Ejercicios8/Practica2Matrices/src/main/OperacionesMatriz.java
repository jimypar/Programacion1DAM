package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperacionesMatriz {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static int posx = 0;
	static int posy = 0;

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

	public static int MaxFila(int[][] m, int fila) {
		int max = -1;
		for (int j = 0; j < m[0].length; j++) {
			if (m[fila][j] > max) {
				posx = fila;
				posy = j;
				max = m[fila][j];
			}
		}
		return max;
	}

	public static int MaxColumna(int[][] m, int col) {
		int max = -1;
		for (int j = 0; j < m[0].length; j++) {
			if (m[j][col] > max) {
				posx = col;
				posy = j;
				max = m[j][col];
			}
		}
		return max;
	}

	public static void MaxMatriz(int[][] m) {

		int max = -1;
		for (int x = 0; x < m.length; x++) {
			for (int i = 0; i < m[0].length; i++) {
				if (m[x][i] > max) {
					posx = x;
					posy = i;
					max = m[x][i];
				}
			}
		}

	}

//	public static void MaxMatriz(int[][] m) {
//		int xmax = 0;
//		int ymax = 0;
//
//		for (int i = 0; i < m.length; i++) {
//			int max = MaxFila(m, i);
//			if (m[i][posy] > max) {
//				xmax = i;
//				ymax = posy;
//				max = m[i][posy];
//			}
//		}
//
//		posx = xmax;
//		posy = ymax;
//		
//	}

	public static void SumaFilas(int[][] m) {
		for (int x = 0; x < m.length; x++) {
			int suma = 0;
			System.out.println();
			System.out.print("Suma fila "+(x+1)+": ");
			for (int y = 0; y < m.length; y++) {
				suma+= m[x][y]; 
			}
			System.out.print(suma);
		}

	}

	public static void SumaColumnas(int[][] m) {
		for (int x = 0; x < m.length; x++) {
			int suma = 0;
			System.out.println();
			System.out.print("Suma columna "+(x+1)+": ");
			for (int y = 0; y < m[0].length; y++) {
				suma+= m[y][x]; 
			}
			System.out.print(suma);
		}
		
	}

}
