package main;

import juego.Juego;

public class Main {

	public static void main(String[] args) {

		int cantidadFilas = 5;
		int cantidadColumnas = 5;
		char[][] t = new char[cantidadFilas][cantidadColumnas];

		vaciarMatriz(t);
		dibujarTablero(t);

		while (true) {
			Juego.Turno(t);
		}

	}

	private static void vaciarMatriz(char[][] t) {

		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[0].length; j++) {
				t[i][j] = ' ';
			}
		}

	}

	private static void dibujarTablero(char[][] t) {

		for (int i = 0; i < t.length; i++) {
			t[i][0] = '*';
			t[i][t.length - 1] = '*';
			t[0][i] = '*';
			t[t.length - 1][i] = '*';
		}

	}

}