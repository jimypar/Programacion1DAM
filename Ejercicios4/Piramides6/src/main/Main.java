package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String pregunta = null;

		while (pregunta != "no") {

			System.out.println();
			System.out.println("Introduce un numero");
			int numero = scan.nextInt();

			// ERROR -0
			while (numero < 0) {
				System.out.println("ERROR");
				System.out.println("Introduce un numero");
				numero = scan.nextInt();
			}

			// ERROR PAR
			if (numero % 2 != 0) {
				numero = numero - 1;
			}

			for (int filas = 0; filas <= numero;) {

				System.out.println();

				for (int fila = numero; fila >= filas; fila = fila - 2) {

					System.out.print(fila + " ");

				}

				numero = numero - 2;

			}
			System.out.println();
			System.out.println();
			System.out.println("Deseas continuar");
			pregunta = scan.nextLine();

			while (true) {
				pregunta = scan.nextLine().toLowerCase().trim();
				if (pregunta.equals("si")) {
					break;
				} else if (pregunta.equals("no")) {
					System.exit(0);
					break;
				}
			}
			
			scan.close();
		}
	}
}
