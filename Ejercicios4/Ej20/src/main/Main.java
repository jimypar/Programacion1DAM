package main;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;
		int max = 0;

		for (int i = 0; i <= 4; i++) {

			System.out.print("Numero: ");
			n = scan.nextInt();

			while (n <= 0) {

				System.out.println("Introduce un valor correcto: ");
				n = scan.nextInt();

			}
			if (n > max) {

				max = n;

			}

			System.out.println("El maximo es: "+max);
		}

	}

}
