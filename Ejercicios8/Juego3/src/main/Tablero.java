package main;

import java.util.Scanner;

public class Tablero {

	private Scanner scan = new Scanner(System.in);
	private String[][] tablero = new String[3][3];

	Tablero() {
		vaciarTableros();
	}

	public void vaciarTableros() {
		for (int x = 0; x < this.tablero.length; x++) {
			for (int i = 0; i < this.tablero[0].length; i++) {
				this.tablero[x][i] = " ";
			}
		}
	}

	public String[][] getTablero() {
		return tablero;
	}

	public void visualizar() {
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
	}

	public void rellenar(int jugador) {
		int x, y;

		do {
			System.out.println("Introduce x/y");
			System.out.print("X:");
			x = scan.nextInt();
			System.out.print("Y:");
			y = scan.nextInt();
		} while ((x < 1 || x > 3) || (y < 1 || y > 3) || tablero[x-1][y-1]!=" ");

		if (jugador == 1) {
			tablero[x - 1][y - 1] = "X";
		}
		if (jugador == 2) {
			tablero[x - 1][y - 1] = "O";
		}

	}

	public boolean ganado() {

		for (int i = 0; i < tablero.length; i++) {
			if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][0] != " ") {
				return true;
			}
		}
		// Columna
		for (int c = 0; c < tablero[0].length; c++) {
			if (tablero[0][c] == tablero[1][c] && tablero[1][c] == tablero[2][c] && tablero[0][c] != " ") {
				return true;
			}
		}
		//DIAGONAL
		if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != " ") {
			return true;
		}
		if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != " ") {
			return true;
		}

		return false;
	}
	
	public boolean empate() {
		boolean empate = true;
		
		for (int x = 0; x < this.tablero.length; x++) {
			for (int i = 0; i < this.tablero[0].length; i++) {
				if (this.tablero[x][i] == " ") {
					empate = false;
				}
			}
		}
		
		return empate;
		
	}

}
