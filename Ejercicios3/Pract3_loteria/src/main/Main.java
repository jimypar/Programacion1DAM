package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);

		System.out.println("Introduce dos numeros entre 50 y 100.");
		System.out.println("numero 1 y numero 2");

		String entrada = scan1.nextLine();

		Scanner scan2 = new Scanner(entrada);

		scan2.useDelimiter(" y ");

		int num1 = Integer.parseInt(scan2.next());
		int num2 = Integer.parseInt(scan2.next());
		
			
		System.out.println("Introduce un numero entre 1 y 5");
		
		int numS = scan1.nextInt();
		
		if ((num1 < 100 && num1 > 50 ) && ( num2 < 100 && num2 > 50 ) && (numS <= 5 && numS > 1) ) {
			
			int nmax = Math.max(num1, num2);
			int nmin = Math.min(num1, num2);
						
			int numA = (int) (Math.random()*(nmax-nmin)+nmax);
			System.out.println("El numero aleatorio es: "+numA);
			System.out.println("");
			
			if (numA % numS == 0) {
				
				System.out.println("Es un numero de la suerte");
				
			}
			
			else {
				
				System.out.println("No hay premio");
				
			}
			
		}
		else {
			
			System.out.println("Introducir numero valido");
			
		}
		
				

		scan1.close();
		scan2.close();
	}

}
