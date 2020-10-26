package main;

import java.util.Scanner;

public class Main {
	
	public static Scanner scan1 = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		boolean restart = programa();
		
		
		do {
			
			restart = programa();
			
		}

		while (restart == true);
		scan1.close();
	}

	private static boolean programa() {
		
		try {

			System.out.println("1-Procesador de textos ");
			System.out.println("2-Hoja de cálculo");
			System.out.println("3-Base de datos");
			System.out.println("4-Presentación con diapositivas");

			int num1 = scan1.nextInt();
			
			switch (num1) {

			
			case 1:
				System.out.println("Bienvenido a Procesador de textos ");
				break;

			case 2:
				System.out.println("Bienvenido a Hoja de cálculo");
				break;

			case 3:
				System.out.println("Bienvenido a Base de datos");
				break;

			case 4:
				System.out.println("Bienvenido a Presentación con diapositivas");
				break;

			default:
				System.out.println("Introduce un numero comprendido entre 1 y 4");
			
				return true;
			}

		} catch (Exception e) {

			System.out.println("Introduce un numero entero");
			
			return true;

		}

		

		return false;

	}
}
