package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Ciclos miCiclo = Ciclos.DAM;

		System.out.println(miCiclo);

		System.out.println("Ciclos:");
		for (Ciclos ciclo : Ciclos.values()) {
			System.out.println(ciclo.toString());
		}
		System.out.println();

		Scanner scan = new Scanner(System.in);
		boolean fin = false;
		do {
			try {
				System.out.println("Elige un ciclo de la lista:");
				String ciclo = scan.nextLine();
				miCiclo = Ciclos.valueOf(ciclo.toUpperCase());
				fin = true;
			} catch (IllegalArgumentException e) {
				fin = false;
			}
		} while (!fin);
		System.out.println("El ciclo elegido es " + miCiclo.toString());
		scan.close();

	}

}
