package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un numero: ");
		int num = scan.nextInt();
		int b = (num*2)-2;

		for (int i = 1; i <= num; i++) {

			for (int a = i; a > 1; a--) {

				System.out.print(" ");
			}
			
			System.out.print("*");

			for (int c = b; c > 0; c--) {

				System.out.print("*");
			}
			b -= 2;
			System.out.println();
			
		}

		scan.close();
	}

}
