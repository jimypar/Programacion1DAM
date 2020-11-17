package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Primera nota:");

		int nota1 = scan.nextInt();

		System.out.println("Segunda nota:");

		int nota2 = scan.nextInt();

		double media = (nota1 + nota2) / 2;

		System.out.println("La nota media es: " + media);

		if (media >= 5) {

			System.out.println("Has aprobado.");
			
		}
		
		else {
			
			System.out.println("Resultado de la recuperación: (apto/no apto)");
			
			boolean recu;
			
			while (true) {
			String ask = scan.nextLine();
			if (ask.equals("apto")) {
				recu = true;
				break;
			} else if (ask.equals("no apto")) {
				recu = false;
				break;
			}
			}
			
			if (recu == true) {
				
				System.out.println("un 5");
				
			}
			
			if (recu == false) {
				
				System.out.println("un " + media);
				
			}
			
			else {
				
		System.out.println("Error");
				
			}
			
		}

		scan.close();
	}
}

