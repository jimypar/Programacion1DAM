package juego;

import java.util.Scanner;

public class Juego {

	private static Scanner in = new Scanner(System.in);

	public static void Turno(char[][] t) {

		turnoJugador(t);
		comprobar(t);
		turnoMaquina(t);
		comprobar(t);

	}

	private static void turnoJugador(char[][] t) {

		int posicionFicha = 0;

		int posicionA = introducirFila(posicionFicha);

		posicionFicha = 0;

		introducirColumna(t, posicionFicha, posicionA);

	}

	private static void introducirColumna(char[][] t, int posicionFicha, int posicionA) {

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

		}

	}

	private static int introducirFila(int posicionFicha) {

		while (posicionFicha < 1 || posicionFicha > 3) {
			System.out.println("Dime la fila");
			posicionFicha = in.nextInt();
			if (posicionFicha < 1 || posicionFicha > 3) {
				System.out.println("Error. El número debe estar entre 1 y 3");
			}
		}
		return posicionFicha;

	}

	private static void turnoMaquina(char[][] t) {

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

	}

	private static void comprobar(char[][] t) {

		// comprobamos filas

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

		boolean sinHuecos = true;
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

	}

}
