package main;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner pepe = new Scanner(System.in);

		char tablero[][] = new char[3][3];

		// Vaciar tablero

		for (int x = 0; x < 3; x++) {
			for (int i = 0; i < tablero[0].length; i++) {
				tablero[x][i] = ' ';
			}
		}

		// Turno 1

		do {
			int jugador = 1;
			System.out.println("  Jugador 1");
			jugador = 1;
			System.out.println("Y->  1   2   3 ");
			for (int x = 0; x < tablero.length; x++) {
				System.out.println("   -------------");
				System.out.print((x + 1) + "- | ");
				for (int i = 0; i < tablero.length; i++) {
					System.out.print(tablero[x][i] + " | ");
				}
				System.out.println();
			}
			System.out.println("   -------------");

			// Introducir datos

			int x = 0, y = 0;
			boolean miguel = true;
			do {
				try {
					System.out.println("Introduce x/y");
					System.out.print("X:");
					x = pepe.nextInt();
					System.out.print("Y:");
					y = pepe.nextInt();
					miguel = false;
				} catch (InputMismatchException e) {
					System.out.println("Introduce un numero valido");
					pepe.nextLine();
					miguel = true;
				}
			} while ((x < 1 || x > 3) || (y < 1 || y > 3) || tablero[x - 1][y - 1] != ' ' || miguel);

			tablero[x - 1][y - 1] = 'X';

			if (metodoQueSirveParaComprobarSiElJugadorHaGanadoLaPartida(tablero) != ' ') {
				System.out.println("Ha ganado el jugador 1");
				System.exit(0);
			}
			if (empate(tablero)) {
				System.out.println("Se ha empatado");
				System.exit(0);
			}

			// Turno 2
			System.out.println("  Jugador 2");
			jugador = 2;
			System.out.println("Y->  1   2   3 ");
			for (x = 0; x < tablero.length; x++) {
				System.out.println("   -------------");
				System.out.print((x + 1) + "- | ");
				for (int i = 0; i < tablero.length; i++) {
					System.out.print(tablero[x][i] + " | ");
				}
				System.out.println();
			}
			System.out.println("   -------------");

			// Introducir datos

			x = 0;
			y = 0;
			miguel = true;
			do {
				try {
					System.out.println("Introduce x/y");
					System.out.print("X:");
					x = pepe.nextInt();
					System.out.print("Y:");
					y = pepe.nextInt();
					miguel = false;
				} catch (InputMismatchException e) {
					System.out.println("Introduce un numero valido");
					pepe.nextLine();
					miguel = true;
				}
			} while ((x < 1 || x > 3) || (y < 1 || y > 3) || tablero[x - 1][y - 1] != ' ' || miguel);

			tablero[x - 1][y - 1] = 'O';

			if (metodoQueSirveParaComprobarSiElJugadorHaGanadoLaPartida(tablero) != ' ') {
				System.out.println("Ha ganado el jugador 2");
				System.exit(0);
			}
			if (empate(tablero)) {
				System.out.println("Se ha empatado");
				System.exit(0);
			}
		} while (true);

	}

	public static char metodoQueSirveParaComprobarSiElJugadorHaGanadoLaPartida(char[][] tablero) {

		// FILA
		for (int i = 0; i < tablero.length; i++) {
			if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][0] != ' ') {
				return tablero[i][0];
			}
		}
		// COLUMNA
		for (int c = 0; c < tablero[0].length; c++) {
			if (tablero[0][c] == tablero[1][c] && tablero[1][c] == tablero[2][c] && tablero[0][c] != ' ') {
				return tablero[0][c];
			}
		}
		// DIAGONAL
		if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != ' ') {
			return tablero[0][0];
		}
		if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != ' ') {
			return tablero[0][2];
		}

		return ' ';
	}

	public static boolean empate(char[][] tablero) {
		boolean empate = true;

		for (int x = 0; x < tablero.length; x++) {
			for (int i = 0; i < tablero[0].length; i++) {
				if (tablero[x][i] == ' ') {
					empate = false;
				}
			}
		}

		return empate;
	}

}
