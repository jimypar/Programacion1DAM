package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Frase:");
		String frase = "";
		frase = scan.nextLine();

		int ultimaPosicion = frase.length() - 1;
		int espacio = 0;

		for (int i = 0; i < ultimaPosicion; i++) {
			if (frase.charAt(i) == ' ')
				espacio++;
		}

		Scanner scan2 = new Scanner(frase);
		scan2.useDelimiter(" ");
		
		
		System.out.print("Palabra");
		System.out.print("   ");
		System.out.print("Minusculas");
		System.out.print("   ");
		System.out.print("Mayusculas");
		System.out.print("   ");
		System.out.print("vocal");
		System.out.print("   ");
		System.out.print("Longitud");
		System.out.print("   ");
		System.out.print("Invertida");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		

		for (int a = 0; a < espacio + 1; a++) {

			String palabra = scan2.next();

			int vocal = 0;

			String  palabraInvertida = "";
			
			for (int i = 0; i < palabra.length(); i++) {

				if (palabra.toLowerCase().charAt(i) == 'a' || palabra.toLowerCase().charAt(i) == 'e'
						|| palabra.toLowerCase().charAt(i) == 'i' || palabra.toLowerCase().charAt(i) == 'o'
						|| palabra.toLowerCase().charAt(i) == 'u') {
					vocal++;
				}
			}

			for (int x = palabra.length() - 1; x >= 0; x--) {
			palabraInvertida = palabraInvertida + palabra.charAt(x);
			}

			System.out.print(palabra);
			System.out.print("      ");
			System.out.print(palabra.toLowerCase());
			System.out.print("       ");
			System.out.print(palabra.toUpperCase());
			System.out.print("          ");
			System.out.print(vocal);
			System.out.print("        ");
			System.out.print(palabra.length());
			System.out.print("        ");
			System.out.print(palabraInvertida);
			System.out.println();
			
		}

		scan.close();
		scan2.close();
	}
}
