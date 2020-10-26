package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner scan1 = new Scanner(System.in);
		
		try {
			
			System.out.println("Introduce tiempo en minutos de llamada:");
			
			double num = scan1.nextDouble();			
			double dinero = 0.10;
			int pasos = 5;
			
			if (num < 0) {
				
				System.out.println("El numero es menor que 0");
				
			}
			
			if (num > 3) {
				
				dinero = dinero + ((num - 3) * 0.05);
				pasos =  pasos + ((int)num - 3);
				System.out.println("El coste es de: " +dinero);
				System.out.println("Los pasos son: " +pasos);
			}
			
			System.out.println("Cuesta 0.1€");
			
		scan1.close();	
		}
		
		catch (Exception e) {
			
			System.out.println("Algo ha fallado.");
			
		}
		
		
	}

}
