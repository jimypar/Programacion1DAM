package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.print("Introduce un numero:");
			int num = scan.nextInt();
			while (num < 0) {
				System.out.print("Introduce un numero valido:");
				num = scan.nextInt();
			}

			System.out.println(num + "^3 = " + cubo(num));

			System.out.println("Deseas salir?");
			String pregunta;

			while (true) {
				pregunta = scan.nextLine().trim().toLowerCase();
				if (pregunta.equals("si")) {
					System.out.println("Adios");
					System.exit(0);
					break;
				} else if (pregunta.equals("no")) {
					main(args);
					break;
				}
			}

		}
	}

	private static int cubo(int num) {
		int potencia = 1;
		for (int i = 0; i < 3; i++) {
			potencia = potencia * num;
		}
		return potencia;
	}
}
