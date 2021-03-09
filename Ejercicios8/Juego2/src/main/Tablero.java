package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tablero {

	private Scanner scan = new Scanner(System.in);
	private String tablero1[][] = new String[10][10];
	private int tablero2[][] = new int[10][10];
	private int media;

	// CONSTRUCTOR TABLERO
	Tablero() {
		vaciarTableros();
		media = 0;
	}

	// VISUALIZAR TABLA
	public void visualizar() {
		System.out.println();
		System.out.println("     1    2    3    4    5    6    7    8    9   10");
		System.out.print("   ");
		for (int i = 0; i < tablero1.length; i++) {
			System.out.print("-----");
		}
		System.out.println();
		for (int x = 0; x < tablero1.length; x++) {

			if (x + 1 == tablero1.length) {
				System.out.print(x + 1 + "| ");
			} else {
				System.out.print(x + 1 + "-| ");
			}

			for (int i = 0; i < tablero1[0].length; i++) {
				System.out.print(tablero1[x][i] + " | ");
			}
			System.out.println();
			System.out.print("   ");
			for (int i = 0; i < tablero1.length; i++) {
				System.out.print("-----");
			}
			System.out.println();
		}
		System.out.println();
		

	}

	public void rellenarMapa() {

		for (int x = 0; x < this.tablero1.length; x++) {
			for (int i = 0; i < this.tablero1[0].length; i++) {
				int num = (int) (Math.random() * (100 - 1) + 1);

				if (num < 10) {
					this.tablero1[x][i] = num + " ";
					this.tablero2[x][i] = num;
				} else {
					this.tablero1[x][i] = num + "";
					this.tablero2[x][i] = num;
				}
			}
		}

	}

	public void reemplazarOro() {

		for (int x = 0; x < this.tablero1.length; x++) {
			for (int i = 0; i < this.tablero1[0].length; i++) {

				// CUADRADO CENTRAL
				if (x > 0 && i > 0 && x < (tablero1.length - 1) && i < (tablero1.length - 1)) {

					this.media = 0;
					this.media += tablero2[x + 1][i];
					this.media += tablero2[x - 1][i];
					this.media += tablero2[x][i + 1];
					this.media += tablero2[x][i - 1];

					if (tablero2[x][i] > (this.media / 3)) {
						tablero1[x][i] = "* ";
					}
				}

				// SUPERIOR
				if (i == 0 && x > 0 && x < (tablero1.length - 1)) {

					this.media = 0;
					this.media += tablero2[x + 1][i];
					this.media += tablero2[x - 1][i];
					this.media += tablero2[x][i + 1];

					if (tablero2[x][i] > (this.media / 3)) {
						tablero1[x][i] = "* ";
					}
				}
				// INFERIOR
				if (i == (tablero1.length - 1) && x > 0 && x < (tablero1.length - 1)) {

					this.media = 0;
					this.media += tablero2[x + 1][i];
					this.media += tablero2[x - 1][i];
					this.media += tablero2[x][i - 1];

					if (tablero2[x][i] > (this.media / 3)) {
						tablero1[x][i] = "* ";
					}
				}
				// IZQDA
				if (x == 0 && i > 0 && i < (tablero1.length - 1)) {

					this.media = 0;
					this.media += tablero2[x + 1][i];
					this.media += tablero2[x][i + 1];
					this.media += tablero2[x][i - 1];

					if (tablero2[x][i] > (this.media / 3)) {
						tablero1[x][i] = "* ";
					}
				}
				// DCHA
				if ( x == (tablero1.length - 1) && i > 0 && i < (tablero1.length - 1)) {

					this.media = 0;
					this.media += tablero2[x - 1][i];
					this.media += tablero2[x][i + 1];
					this.media += tablero2[x][i - 1];

					if (tablero2[x][i] > (this.media / 3)) {
						tablero1[x][i] = "* ";
					}
				}
				//ESQUINA ARRIBA IZQDA
				if ( x == 0 && i == 0) {

					this.media = 0;
					this.media += tablero2[x + 1][i];
					this.media += tablero2[x][i + 1];

					if (tablero2[x][i] > (this.media / 2)) {
						tablero1[x][i] = "* ";
					}
				}				
				//ESQUINA ARRIBA DERECHA
				if ( x == (tablero1.length - 1) && i == 0) {

					this.media = 0;
					this.media += tablero2[x - 1][i];
					this.media += tablero2[x][i + 1];

					if (tablero2[x][i] > (this.media / 2)) {
						tablero1[x][i] = "* ";
					}
				}	
				//ESQUINA ABAJO DERECHA
				if ( x == (tablero1.length - 1) && i == (tablero1.length - 1)) {

					this.media = 0;
					this.media += tablero2[x - 1][i];
					this.media += tablero2[x][i - 1];

					if (tablero2[x][i] > (this.media / 2)) {
						tablero1[x][i] = "* ";
					}
				}	
				//ESQUINA ABAJO IZQDA
				if ( x == 0 && i == (tablero1.length - 1)) {

					this.media = 0;
					this.media += tablero2[x + 1][i];
					this.media += tablero2[x][i - 1];

					if (tablero2[x][i] > (this.media / 2)) {
						tablero1[x][i] = "* ";
					}
				}	
				
				
			}
		}

	}

	public void buscarOro() {
		int x = 0, y = 0;
		boolean error = true;
		
		do {
			try {
				System.out.println("Introduce las coordenadas (x/y):");
				System.out.print("X:");
				x = scan.nextInt();
				System.out.print("Y:");
				y = scan.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.out.println("Introduce un nuemero valido");
				error = true;
			} 
		} while (error);
		if (tablero1[x-1][y-1] == "* ") {
			System.out.println("Hay oro");
		} else {
			System.out.println("No hay oro");
		}

	}

	public boolean repetirOro() {
		String respuesta = "";
		do {
			System.out.println("Deseas buscar mas? (si/no)");
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

	public void vaciarTableros() {
		for (int x = 0; x < this.tablero1.length; x++) {
			for (int i = 0; i < this.tablero1[0].length; i++) {
				this.tablero1[x][i] = "  ";
				this.tablero2[x][i] = 0;
			}
		}
	}
}
