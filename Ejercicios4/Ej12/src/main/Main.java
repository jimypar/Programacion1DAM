package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;
		int i;
		int mult = 0;

		System.out.print("Introduce un numero: ");
		for (num = scan.nextInt() ; num >= 1; num--) {

			System.out.println(" ");
			System.out.println("Tabla del " + num);

			for (i = 1; i <= 10; i++) {

				mult = num * i;
				System.out.println(num + "x" + i + "=" + mult);
			}

		}

	}

}