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
			System.out.println("");
			System.out.println("--------------------");
			System.out.println("---MENU PRINCIPAL---");
			System.out.println("1-Area del circulo ");
			System.out.println("2-Volumen de la esfera");
			System.out.println("3-Salir");

			int num1 = scan1.nextInt();

			switch (num1) {

			case 1:
				System.out.println("Introduce el radio de la circunferencia:");
				double radio = scan1.nextDouble();
				double area = Math.PI * Math.pow(radio, 2);
				System.out.println("Area= " + area);
				return true;

			case 2:
				System.out.println("Introduce el radio de la circunferencia:");
				double radio2 = scan1.nextDouble();
				double vol = (4 * Math.PI * Math.pow(radio2, 3)) / 3;
				System.out.println("Volumen= " + vol);
				return true;

			case 3:
				return false;

			default:
				System.out.println("Introduce un numero comprendido entre 1 y 2");

				return true;
			}
 
		} catch (Exception e) {

			System.out.println("Introduce un numero entero");

			return true;

		}

	}
}
