package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un numero par (2-100)");
		int num = scan.nextInt();
		int num2 = 0;

		while (num % 2 != 0 && num < 2 || num > 100) {
			System.out.println("ERROR");
			System.out.println("Introduce un numero par (2-100)");
			num = scan.nextInt();
		}

		for (int a = num2; a <= num; a += 2) {

			for (int i = a; i >= 0; i = i-2) {

				System.out.print(i + " ");

			}
			
			System.out.println();
		}

		scan.close();

	}

}
