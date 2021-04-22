package main;

//Cambiado el import * por los que realmente se usan.
//import java.util.*;
import java.util.Scanner;

public class Refactorizar10 {

	public static void main(String[] args) {

		// Cambiado nombre del scanner a uno mas descriptivo.
		// Scanner paraguas = new Scanner(System.in);
		Scanner in = new Scanner(System.in);

		// Cambiado el nombre de las variables a lowerCamelCase.
		// int CANTIDAD_FILAS = 5;
		// int CANTIDAD_COLUMNAS = 5;
		int cantidadFilas = 5;
		int cantidadColumnas = 5;
		// Cambiado el lugar de los corchetes en la declaracion de la matriz
		// char t[][] = new char[cantidadFilas][cantidadColumnas];
		char[][] t = new char[cantidadFilas][cantidadColumnas];
		// Cambiado la variable iterador por i y jamon por j
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[0].length; j++) {
				t[i][j] = ' ';
			}
		}
		// Cambiado la variable iterador por i
		for (int i = 0; i < t.length; i++) {
			t[i][0] = '*';
			t[i][t.length - 1] = '*';
			t[0][i] = '*';
			t[t.length - 1][i] = '*';
		}

		// Cambiado el nombre de las variable a lowerCamelCase. Y con nombre mas
		// descriptivos.
		while (true) {
			int posicionFicha = 0;
			while (posicionFicha < 1 || posicionFicha > 3) {
				System.out.println("Dime la fila");
				posicionFicha = in.nextInt();
				if (posicionFicha < 1 || posicionFicha > 3) {
					System.out.println("Error. El número debe estar entre 1 y 3");
				}
			}
			int posicionA = posicionFicha;
			posicionFicha = 0;
			while (posicionFicha < 1 || posicionFicha > 3) {
				System.out.println("Dime la columna");
				posicionFicha = in.nextInt();
				if (posicionFicha < 1 || posicionFicha > 3) {
					System.out.println("Error. El número debe estar entre 1 y 3");
				}
				int posicionB = posicionFicha;

				while (t[posicionA][posicionB] != ' ') {
					System.out.println("Error. Esa posición está ocupada");
					System.out.println();
					for (int i = 0; i < t.length; i++) {
						for (int j = 0; j < t[0].length; j++) {
							System.out.print(t[i][j]);
							if (j == t.length - 1) {
								System.out.print("\n");
							}
						}
					}
					System.out.println();
					posicionFicha = 0;
					while (posicionFicha < 1 || posicionFicha > 3) {
						System.out.println("Dime la fila");
						posicionFicha = in.nextInt();
						if (posicionFicha < 1 || posicionFicha > 3) {
							System.out.println("Error. El número debe estar entre 1 y 3");
						}
					}
					posicionA = posicionFicha;
					posicionFicha = 0;
					while (posicionFicha < 1 || posicionFicha > 3) {
						System.out.println("Dime la fila");
						posicionFicha = in.nextInt();
						if (posicionFicha < 1 || posicionFicha > 3) {
							System.out.println("Error. El número debe estar entre 1 y 3");
						}
					}
					posicionB = posicionFicha;
				}
				t[posicionA][posicionB] = 'X';
				System.out.println();
				for (int i = 0; i < t.length; i++) {
					for (int j = 0; j < t[0].length; j++) {
						System.out.print(t[i][j]);
						if (j == t.length - 1) {
							System.out.print("\n");
						}
					}
				}
				System.out.println();
				// comprobamos filas

				// Cambiado el iterador f por i
				for (int i = 0; i < t.length; i++) {
					if (t[i][1] == t[i][2] && t[i][2] == t[i][3]) {
						if (t[i][1] == 'X') {
							System.out.println("¡HAS GANADO!");
							System.exit(0);
						} else if (t[i][1] == 'O') {
							System.out.println("LO SIENTO, HAS PERDIDO");
							System.exit(0);
						}
					}
				}
				// comprobamos columnas

				// Cambiado el iterador c por i
				for (int i = 0; i < t.length; i++) {
					if (t[1][i] == t[2][i] && t[2][i] == t[3][i]) {
						if (t[1][i] == 'X') {
							System.out.println("¡HAS GANADO!");
							System.exit(0);
						} else if (t[1][i] == 'O') {
							System.out.println("LO SIENTO, HAS PERDIDO");
							System.exit(0);
						}
					}
				}

				// comprobamos diagonales
				if (t[1][1] == t[2][2] && t[2][2] == t[3][3]) {
					if (t[1][1] == 'X') {
						System.out.println("¡HAS GANADO!");
						System.exit(0);
					} else if (t[1][1] == 'O') {
						System.out.println("LO SIENTO, HAS PERDIDO");
						System.exit(0);
					}
				}
				if (t[1][3] == t[2][2] && t[2][2] == t[3][1]) {
					if (t[1][3] == 'X') {
						System.out.println("¡HAS GANADO!");
						System.exit(0);
					} else if (t[1][3] == 'O') {
						System.out.println("LO SIENTO, HAS PERDIDO");
						System.exit(0);
					}
				}

				// Cambiado el nombre de las variable a lowerCamelCase. Y con nombre mas
				// descriptivos.
				// boolean NO_QUEDAN_MAS_HUECOS = true;
				boolean sinHuecos = true;
				// Cambiado el iterador I por i y el J por j
				for (int i = 0; i < t.length; i = i + 1) {
					for (int j = 0; j < t[0].length; j++) {
						if (t[i][j] == ' ')
							sinHuecos = false;
					}
				}
				if (sinHuecos == true) {
					System.out.println("¡EMPATE!");

					System.exit(0);
				}

				// Cambiado el nombre de las variables a uno mas descriptivo y declarados
				// aparte.
				// int iii, jjj;

				int numAleatorio1;
				int numAleatorio2;
				do {
					numAleatorio1 = (int) Math.floor(Math.random() * 3 + 1);
					numAleatorio2 = (int) Math.floor(Math.random() * 3 + 1);
				} while (t[numAleatorio1][numAleatorio2] != ' ');
				t[numAleatorio1][numAleatorio2] = 'O';
				System.out.println();
				for (int i = 0; i < t.length; i++) {
					for (int j = 0; j < t[0].length; j++) {
						System.out.print(t[i][j]);
						if (j == t.length - 1) {
							System.out.print("\n");
						}
					}
				}
				System.out.println();
				// comprobamos filas

				// Cambiado el nombre de las variables a lowerCamelCase.
				for (int fila = 0; fila < t.length; fila++) {
					if (t[fila][1] == t[fila][2] && t[fila][2] == t[fila][3]) {
						if (t[fila][1] == 'X') {
							System.out.println("¡HAS GANADO!");
							System.exit(0);
						} else if (t[fila][1] == 'O') {
							System.out.println("LO SIENTO, HAS PERDIDO");
							System.exit(0);
						}
					}
				}
				// comprobamos columnas
				for (int columna = 0; columna < t.length; columna++) {
					if (t[1][columna] == t[2][columna] && t[2][columna] == t[3][columna]) {
						if (t[1][columna] == 'X') {
							System.out.println("¡HAS GANADO!");
							System.exit(0);
						} else if (t[1][columna] == 'O') {
							System.out.println("LO SIENTO, HAS PERDIDO");
							System.exit(0);
						}
					}
				}

				// comprobamos diagonales
				if (t[1][1] == t[2][2] && t[2][2] == t[3][3]) {
					if (t[1][1] == 'X') {
						System.out.println("¡HAS GANADO!");
						System.exit(0);
					} else if (t[1][1] == 'O') {
						System.out.println("LO SIENTO, HAS PERDIDO");
						System.exit(0);
					}
				}
				if (t[1][3] == t[2][2] && t[2][2] == t[3][1]) {
					if (t[1][3] == 'X') {
						System.out.println("¡HAS GANADO!");
						System.exit(0);
					} else if (t[1][3] == 'O') {
						System.out.println("LO SIENTO, HAS PERDIDO");
						System.exit(0);
					}
				}
				sinHuecos = true;

				// Cambiado el nombre de las variables a lowerCamelCase. Y declaradas en el for
				// diferentes
				// int I, J;
				for (int i = 0; i < t.length; i++) {
					for (int j = 0; j < t[0].length; j++) {
						if (t[i][j] == ' ')
							sinHuecos = false;
					}
				}
				if (sinHuecos == true) {
					System.out.println("¡EMPATE!");
					System.exit(0);
				}
			}
		}
	}
}