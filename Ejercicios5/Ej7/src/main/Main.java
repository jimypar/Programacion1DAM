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

		System.out.print("Introduce la potencia:");
		int num2 = scan.nextInt();
		while (num2 < 0) {
			System.out.print("Introduce un numero valido:");
			num2 = scan.nextInt();
		}

		System.out.println(num1 + "^" + num2 + " = " + potencia(num1, num2));

	}

	private static int potencia(int num1, int num2) {
		int potencia = 1;
		for (int i = 0; i < num2; i++) {
			potencia *= num1;
		}
		return potencia;
	}

}
