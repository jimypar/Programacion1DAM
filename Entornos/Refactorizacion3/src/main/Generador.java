package main;

import java.util.Scanner;

public class Generador {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Programa que genera passwords de la longitud indicada, y del rango de caracteres");
		System.out.println("1 - Caracteres desde A - Z");
		System.out.println("2 - Numeros del 0 al 9");
		System.out.println("3 - Letras y caracteres especiales");
		System.out.println("4 - Letras, numeros y caracteres especiales");
		System.out.println("Introduce la longitud de la cadena: ");
		int longitud = scanner.nextInt();
		System.out.println("Elige tipo de password: ");
		int opcion = scanner.nextInt();
		String password = "";
		switch (opcion) {
		case 1:
			for (int i = 0; i < longitud; i++) {
				char letra1;
				letra1 = (char) ((Math.random() * 26) + 65);
				password += letra1;
			}
			break;
		case 2:
			for (int i = 0; i < longitud; i++) {
				int numero2;
				numero2 = (int) (Math.random() * 10);
				password += numero2;
			}
			break;
		case 3:
			for (int i = 0; i < longitud; i++) {
				int n;
				n = (int) (Math.random() * 2);
				if (n == 1) {
					char letra3;
					letra3 = (char) ((Math.random() * 26) + 65);
					password += letra3;
				} else {
					char caracter3;
					caracter3 = (char) ((Math.random() * 15) + 33);
					password += caracter3;
				}
			}
			break;
		case 4:
			for (int i = 0; i < longitud; i++) {
				int n;
				n = (int) (Math.random() * 3);
				if (n == 1) {
					char letra4;
					letra4 = (char) ((Math.random() * 26) + 65);
					password += letra4;
				} else if (n == 2) {
					char caracter4;
					caracter4 = (char) ((Math.random() * 15) + 33);
					password += caracter4;
				} else {
					int numero4;
					numero4 = (int) (Math.random() * 10);
					password += numero4;
				}
			}
			break;
		}

		System.out.println(password);
		scanner.close();
	}

}
