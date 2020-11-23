package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;
		int max = 0;
		int min = 0;
		
		for (int i = 1; i <= 10; i++) {

			System.out.print("Numero: ");
			n = scan.nextInt();
			if (i == 1) {
				max = n;
				min = n;
			}

			if (n > max) {
				max = n;
			}
			if (n < min) {
				min = n;
			}
		}

		System.out.println("El maximo es: " + max);
		System.out.println("El minimo es: " + min);
	}

}
