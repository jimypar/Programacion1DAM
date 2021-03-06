package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tablero {

	private Scanner scan = new Scanner(System.in);
	private String tablero1[][] = new String[5][5];
	private String tablero2[][] = new String[5][5];
	private int barcoundido;
	private int intento;
	private boolean acierto;

	// CONSTRUCTOR TABLERO
	Tablero() {
		vaciarTableros();
		barcoundido = 0;
		intento = 1;
		acierto = false;

	}

	// GETTERS Y SETTERS
	public int getBarcoundido() {
		return barcoundido;
	}

	public void setBarcoundido(int barcoundido) {
		this.barcoundido = barcoundido;
	}

	public String[][] getTablero1() {
		return tablero1;
	}

	public String[][] getTablero2() {
		return tablero2;
	}

	public boolean getAcierto() {
		return acierto;
	}

	public void setAcierto(boolean acierto) {
		this.acierto = acierto;
	}

	// VISUALIZAR TABLA
	public void visualizar(String[][] m) {
		System.out.println("Y-> 1   2   3   4   5  ");
		for (int x = 0; x < m.length; x++) {
			System.out.println(" ----------------------");
			System.out.print((x + 1) + "-| ");
			for (int i = 0; i < m[0].length; i++) {
				System.out.print(m[x][i] + " | ");
			}
			System.out.println();
		}
		System.out.println("  ----------------------");

	}

	public void introducirBarco(String[][] m) {

		int x = 0, y = 0;

		for (int i = 0; i < 3; i++) {

			do {

				try {

					System.out.println("Introduce las cordenadas x/y (Barco " + (i + 1) + ")");
					System.out.print("X:");
					x = scan.nextInt();
					System.out.print("Y:");
					y = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Introduce caracteres validos");
					scan.nextLine();
					i = 0;
				}

			} while ((x < 1 || x > 5) || (y < 1 || y > 5) || m[x - 1][y - 1] == "O");

			m[x - 1][y - 1] = "O";

		}

	}

	public void vaciarTableros() {
		for (int x = 0; x < this.tablero1.length; x++) {
			for (int i = 0; i < this.tablero1[0].length; i++) {
				this.tablero1[x][i] = " ";
				this.tablero2[x][i] = " ";
			}
		}
	}

	public boolean repetirBarco() {
		String respuesta = "";
		do {
			System.out.println("Estan bien asi los barcos? (si/no)");
			respuesta = scan.next();
			if (respuesta.trim().toLowerCase().equalsIgnoreCase("si")) {
				return false;
			}
			if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
				return true;
			}
		} while (!respuesta.trim().toLowerCase().equalsIgnoreCase("no")
				|| !respuesta.trim().toLowerCase().equalsIgnoreCase("si"));
		return false;
	}

	public void ataque(String[][] tab1, String[][] tab2) {
		int x = 0;
		int y = 0;

		do {
			try {
				System.out.println("Introduce las cordenadas x/y (Intento: " + this.intento + ", " + this.barcoundido
						+ " aciertos, " + ((this.intento - this.barcoundido) - 1) + " fallos)");
				System.out.print("X:");
				x = scan.nextInt();
				System.out.print("Y:");
				y = scan.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Introduce caracteres validos");
				scan.nextLine();
			}

		} while ((x < 1 || x > 5) || (y < 1 || y > 5) || tab2[x - 1][y - 1] == "o" || tab2[x - 1][y - 1] == "X");
		if (tab1[x - 1][y - 1].contentEquals("O")) {
			tab2[x - 1][y - 1] = "X";
			this.barcoundido++;
			this.acierto = true;
		} else if (tab1[x][y].contentEquals(" ")) {
			tab2[x - 1][y - 1] = "o";
			this.acierto = false;
		}
		this.intento++;

	}

	public boolean ganado() {
		if (this.barcoundido == 3) {
			return true;
		}
		return false;
	}

}
