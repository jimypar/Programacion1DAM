package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce una frase");

		String cadena = scan.nextLine();

		String SinEspacios = cadena.replaceAll(" ", "").toLowerCase();

		int longitud = SinEspacios.length();

		String reverse = "";

		for (int i = longitud - 1; i >= 0; i--) {

			reverse += SinEspacios.charAt(i);

		}

		if (SinEspacios.equals(reverse)) {

			System.out.println("Es un palindromo");

		}

		else {

			System.out.println("No es un palindromo");

		}

		scan.close();

	}

}
