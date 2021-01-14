package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println();
			System.out.print("Contraseña:");
			String text = scan.nextLine();
			
			if (text.equals("exit")) {
				break;
			}			

			while (text.length() > 20) {
				System.out.println("Tiene que tener menos de 20 caracteres");
				System.out.println("Contraseña:");
				text = scan.nextLine();
			}

			boolean b1 = false, b2 = false, b3 = false, b4 = false;

			for (int i = 0; i < text.length(); i++) {

				char l = text.charAt(i);
				if (Character.isUpperCase(l)) {
					b1 = true;
				}
				;
				if (Character.isLowerCase(l)) {
					b2 = true;
				}
				;
				if (Character.isDigit(l)) {
					b3 = true;
				}
				if (!Character.isUpperCase(l) && !Character.isLowerCase(l) && !Character.isDigit(l)) {
					b4 = true;
				}

			}

			if (b1 && b2 && b3 && b4) {

				System.out.print("   ------> Dale no te hackearan esta vez.");

			}

			else {

				System.out.print("    ------> No va dar Bottas.");

			}

		}
		
		scan.close();

	}

}
