package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {

			Scanner scan1 = new Scanner(System.in);

				System.out.println("1-Procesador de textos ");
				System.out.println("2-Hoja de cálculo");
				System.out.println("3-Base de datos");
				System.out.println("4-Presentación con diapositivas");

				int num1 = scan1.nextInt();


				if (num1 == 1) {

					System.out.println("Bienvenido a Procesador de textos ");

				}

				else if (num1 == 2) {

					System.out.println("Bienvenido a Hoja de cálculo");

				}

				else if (num1 == 3) {

					System.out.println("Bienvenido a Base de datos");

				}

				else if (num1 == 4) {

					System.out.println("Bienvenido a Presentación con diapositivas");

				}

				else {

					System.out.println("Introduce un numero comprendido entre 1 y 4");

				}

			scan1.close();

				
 

		} catch (Exception e) {

				System.out.println("Introduce un numero entero");
			
		}
	

}}
