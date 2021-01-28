package prueba;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Frase:");
		String frase = scan.nextLine();

		int espacio = 0;

		for (int i = 0; i < (frase.length() - 1); i++) {
			if (frase.charAt(i) == ' ')
				espacio++;
		}

		Scanner scan2 = new Scanner(frase);
		scan2.useDelimiter(" ");

		for (int a = 0; a < espacio + 1; a++) {

			String palabra = scan2.next();
			System.out.print(palabra);

		}

		scan.close();
		scan2.close();
	}
}
