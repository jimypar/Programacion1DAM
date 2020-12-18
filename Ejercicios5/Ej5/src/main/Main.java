package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce un numero:");
		int num1 = scan.nextInt();
		while (num1 < 0) {
			System.out.print("Introduce un numero valido:");
			num1 = scan.nextInt();
		}

		System.out.print("Introduce el segundo numero:");
		int num2 = scan.nextInt();
		while (num2 < 0) {
			System.out.print("Introduce un numero valido:");
			num2 = scan.nextInt();
		}

		suma(num1, num2);
		resta(num1, num2);
		multiplicar(num1, num2);

		System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma(num1, num2));
		System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta(num1, num2));
		System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + multiplicar(num1, num2));

		scan.close();

	}

	private static int suma(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}

	private static int resta(int num1, int num2) {
		int res = num1 - num2;
		return res;
	}

	private static int multiplicar(int num1, int num2) {
		int res = num1 * num2;
		return res;
	}

}
