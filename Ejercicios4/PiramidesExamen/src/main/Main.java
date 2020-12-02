package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int b = 0; b < i; b++) {
				
				if (b%2 ==0) {
					
					System.out.print("*");
					
				}

				else {
					
					System.out.print("?");
					
				}
				
			}

			System.out.println();
		}

	}

}
