package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un numero: ");
		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {

			System.out.print("*"+" ");

		}

		for (int a = 0; a < (num-2); a++) {

			System.out.println();
			System.out.print("*"+" ");

			for (int b = 0; b < (num - 2); b++) {

				System.out.print(" "+" ");

			}

			System.out.print("*");

		}
		System.out.println();
		for (int i = 0; i < num; i++) {

			
			System.out.print("*"+" ");

		}

		scan.close();
	}

}
