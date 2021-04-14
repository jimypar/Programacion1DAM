package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int jugador = 1;

		char[][] tablero = new char[3][3];

		for (int x = 0; x < tablero.length; x++) {
			for (int i = 0; i < tablero[0].length; i++) {
				tablero[x][i] = ' ';
			}
		}

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

		int x = 0, y = 0;
		boolean error = true;
		do {
			try {
				System.out.println("Introduce x/y");
				System.out.print("X:");
				x = scan.nextInt();
				System.out.print("Y:");
				y = scan.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.out.println("Introduce un numero valido");
				scan.nextLine();
				error = true;
			}
		} while ((x < 1 || x > 3) || (y < 1 || y > 3) || tablero[x - 1][y - 1] != ' ' || error);

		if (jugador == 1) {
			tablero[x - 1][y - 1] = 'X';
		}
		if (jugador == 2) {
			tablero[x - 1][y - 1] = 'O';
		}

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

		x = 0,y = 0;
		error = true;
		do {
			try {
				System.out.println("Introduce x/y");
				System.out.print("X:");
				x = scan.nextInt();
				System.out.print("Y:");
				y = scan.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.out.println("Introduce un numero valido");
				scan.nextLine();
				error = true;
			}
		} while ((x < 1 || x > 3) || (y < 1 || y > 3) || tablero[x - 1][y - 1] != ' ' || error);

		if (jugador == 1) {
			tablero[x - 1][y - 1] = 'X';
		}
		if (jugador == 2) {
			tablero[x - 1][y - 1] = 'O';
		}

	}

}
