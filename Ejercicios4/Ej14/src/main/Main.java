package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce un numero: ");
		int num = scan.nextInt();
		int i;
		int mult = 0;
		int acierto = 0;
		int fallo= 0;

		for (i = 1; i <= 10; i++) {

			int res = 0;
			System.out.print(num + " x " + i + " es: ");
			res = scan.nextInt();
			mult = num * i;
			
			if (res == mult) {
				
				System.out.println("Correcto");
				acierto++;
				
			}
			
			else {
				
				System.out.println("Error");
				System.out.println("El resultado era: "+num + "x" + i + "=" + mult);
				fallo++;
			}
			
		}
		
		System.out.println("Has acertado: "+acierto);
		System.out.println("Has fallado: "+fallo);


	}

}