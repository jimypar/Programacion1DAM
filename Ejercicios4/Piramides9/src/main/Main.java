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

		for (int a = 0; a < (num - 2); a++) {

			System.out.println();
			System.out.print("*");

			for (int c = 0; c < a; c++) {

				System.out.print(" "+" ");

			}

			System.out.print(" "+"*");
			
			for (int b = (num-(1+a)); b > 2; b--) {

				System.out.print(" "+" ");

			}
			
			

			System.out.print(" "+"*");

		}
		System.out.println();
		for (int i = 0; i < num; i++) {

			System.out.print("*"+" ");

		}

		scan.close();
	}

}
