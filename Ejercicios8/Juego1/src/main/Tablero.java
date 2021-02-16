package main;

import java.util.Scanner;

public class Tablero {

	private Scanner scan = new Scanner(System.in);

	private String tablero1[][] = new String[10][10];
	private String posicion[][] = new String[10][10];

	Tablero() {
		for (int x = 0; x < this.tablero1.length; x++) {
			for (int i = 0; i < this.tablero1[0].length; i++) {
				this.tablero1[x][i] = " ";
				this.posicion[x][i] = " ";
			}
		}
	}

	public String[][] getTablero1() {
		return tablero1;
	}
	public void setTablero1(String[][] tablero1) {
		this.tablero1 = tablero1;
	}
	public String[][] getPosicion() {
		return posicion;
	}
	public void setPosicion(String[][] posicion) {
		this.posicion = posicion;
	}

	public void visualizar(String[][] m) {
		System.out.println("Y-> 0   1   2   3   4   5   6   7   8   9   ");
		for (int x = 0; x < m.length; x++) {
			System.out.println(" -----------------------------------------");
			System.out.print(x + "-| ");
			for (int i = 0; i < m[0].length; i++) {
				System.out.print(m[x][i] + " | ");
			}
			System.out.println();
		}
		System.out.println("  -----------------------------------------");

	}

	public void introducirBarco(String[][] m) {
		int x, y;

		for (int i = 0; i < 3; i++) {
			do {
				System.out.println("Introduce el las cordenadas x/z (Barco " + (i+1) + ")");
				System.out.print("X:");
				x = scan.nextInt();
				System.out.print("Y:");
				y = scan.nextInt();
			} while ((x < 0 || x > 9) && (y < 0 || y > 9));

			m[x][y] = "O";
		}

	}

	public void vaciarTablero() {
		for (int x = 0; x < this.tablero1.length; x++) {
			for (int i = 0; i < this.tablero1[0].length; i++) {
				this.tablero1[x][i] = " ";
				this.posicion[x][i] = " ";
			}
		}
	}
	
	public boolean repetirBarco() {
		String respuesta = "";
		do {
		System.out.println("Estan bien asi los barcos? (si/no)");
		respuesta = scan.next();
		if(respuesta.trim().toLowerCase().equalsIgnoreCase("si")) {
			return false;
		}
		if(respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
			return true;
		}
		}while(!respuesta.trim().toLowerCase().equalsIgnoreCase("no") || !respuesta.trim().toLowerCase().equalsIgnoreCase("si"));
		return false;
	}
	
	public void ataque() {
		
	}
	
	public boolean 

}
