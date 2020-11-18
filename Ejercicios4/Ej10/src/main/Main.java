package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un numero:");
		int num = scan.nextInt();
		int i;
		int mult = 0;

		while (num<1 || num > 10) {
			
			System.out.println("Introduce un numero correcto:");
			num = scan.nextInt();
		}
		
		
		
		for (i = 1; i <= 10; i ++) {

			mult =  num*i;
			System.out.println(num+"x"+i+"="+mult);
		}
	}

}