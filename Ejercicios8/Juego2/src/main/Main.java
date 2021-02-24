package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Tablero tablero = new Tablero();
		
		tablero.visualizar();
		tablero.rellenarMapa();
		tablero.visualizar();
		tablero.reemplazarOro();
		do {
			tablero.visualizar();
			tablero.buscarOro();
		} while (!tablero.repetirOro());

		scan.close();
		
	}
}
