package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe una frase");
		String frase = scan.nextLine();

		System.out.println("Que letra deseas contar?");
		String letra = scan.next();

		int contarLetra = 0;

		for (int i = 0; i < frase.length(); i++) {

			String LetraFrase = frase.charAt(i) + "";

			if (LetraFrase.equals(letra)) {

				contarLetra++;

			}

		}

		System.out.println("Hay " + contarLetra + " letras " + letra);
		
		scan.close();
	}

}
