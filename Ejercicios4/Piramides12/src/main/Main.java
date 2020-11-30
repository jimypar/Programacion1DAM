package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un numero: ");
		int num = scan.nextInt();
		int c = 1;

		for (int i = num; i > 0; i--) {

			for (int a = i; a > 1; a--) {

				System.out.print(" "+" ");
			}
						
			for (int b = 0 ; b < c; b++) {
				
				System.out.print("*"+" ");
				
			}
			
			System.out.println();
			c++;
		}
		
		c = 1;
		
		for (int i = (num-1); i > 0; i--) {

			for (int a = 0; a < c; a++) {

				System.out.print(" "+" ");
			}
						
			for (int b = i ; b > 0; b--) {
				
				System.out.print("*"+" ");
				
			}
			c++;
			System.out.println();
		}

		scan.close();
	}

}
