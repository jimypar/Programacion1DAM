package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Tablero tablero = new Tablero();
		System.out.println("TABLERO VACIO:");
		tablero.visualizar();
		System.out.println("TABLERO CON NUMEROS:");
		tablero.rellenarMapa();
		tablero.visualizar();
		System.out.println("TABLERO CON ORO:");
		tablero.reemplazarOro();
		do {
			tablero.visualizar();
			tablero.buscarOro();
		} while (!tablero.repetirOro());

		scan.close();
		
	}
}
