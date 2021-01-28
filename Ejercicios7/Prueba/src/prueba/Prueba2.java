package prueba;

import java.util.Scanner;

public class Prueba2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Frase:");
		String frase = scan.nextLine();

		int espacio = 0;
		String frasenueva = "";

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				frasenueva += "";
			} else {
				frasenueva += frase.charAt(i);
			}
		}

		System.out.println(frasenueva);
		
		scan.close();
	}
}
