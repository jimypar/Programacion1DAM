package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce un numero: ");
		int num = scan.nextInt();
		int i;
		int a;
		int mult = 0;

		
		for (a = 2 ; a<= num; a+=2) {

			System.out.println(" ");
			System.out.println("Tabla del " + a);

			for (i = 1; i <= 10; i++) {

				mult = a * i;
				System.out.println(a + "x" + i + "=" + mult);
			}

		}

	}

}