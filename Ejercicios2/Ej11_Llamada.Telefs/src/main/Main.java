package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		try {

			System.out.println("Elige el metodo de tiempo:");
			System.out.println("1-Minutos");
			System.out.println("2-Pasos");
			int menu = scan1.nextInt();

			double dinero = 0.10;
			int pasos = 5;
			switch (menu) {

			case 1:

				System.out.println("Introduce tiempo en minutos de llamada:");
				double num = scan1.nextDouble();

				if (num < 0) {

					System.out.println("El numero es menor que 0");

				}
				else {
					
					if (num > 3) {
	
						dinero = dinero + ((num - 3) * 0.05)+ 0.10;
						System.out.println("El coste es de: " + dinero + "€");
					}
					
					else {
						
						System.out.println("Cuesta 0.1€");
						
					}
				}
				

				break;

			case 2:

				System.out.println("Introduce tiempo en pasos de llamadas:");
				pasos = scan1.nextInt();

				if (pasos < 0) {

					System.out.println("El numero es menor que 0");

				}

				if (pasos > 3) {

					pasos = pasos + ((int) pasos - 3);
					System.out.println("El coste es de: " + dinero);
					System.out.println("Los pasos son: " + pasos);
				}
				break;

			default:
				System.out.println("Caracter no valido");
			}

			scan1.close();
		}

		catch (Exception e) {

			System.out.println("Algo ha fallado.");

		}

	}

}
