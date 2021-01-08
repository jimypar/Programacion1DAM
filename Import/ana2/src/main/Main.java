package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Numero:");
		int num = scan.nextInt();
		scan.nextLine();
		System.out.print("Frase:");
		
		String frase = "";
		frase = scan.nextLine();
		
		System.out.println(frase);
		int ultimaPosicion = frase.length() - 1;
		int espacio = 0;

		for (int i = 0; i < ultimaPosicion; i++) {
			if (frase.charAt(i) == ' ')
				espacio++;
		}
		
		Scanner scan2 = new Scanner(frase);
		scan2.useDelimiter(" ");

		for (int i = 0; i < espacio + 1; i++) {

			String palabra = scan2.next();

			if (palabra.length() < num) {
				System.out.print(palabra);
				System.out.print(" ");
			}
		}

		scan.close();
		scan2.close();
	}
}
