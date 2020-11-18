package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce un numero:");
		int num1 = scan.nextInt();
		System.out.print("Introduce otro numero:");
		int num2 = scan.nextInt();
		System.out.print("Introduce otro numero:");
		int num3 = scan.nextInt();
		int i;
		int mult = 0;
		System.out.println("--------------------------");
		System.out.println(" ");
		System.out.println("TABLA DEL "+num1);
		
		for (i = 1; i <= 10; i++) {

			mult = num1 * i;
			System.out.println(num1 + "x" + i + "=" + mult);
		
		}
		System.out.println("--------------------------");
		System.out.println(" ");
		System.out.println("TABLA DEL "+num2);
		

		for (i = 1; i <= 10; i++) {
		
		mult = num2 * i;
		System.out.println(num2 + "x" + i + "=" + mult);
		
		}
		System.out.println("--------------------------");
		System.out.println(" ");
		System.out.println("TABLA DEL "+num3);
		

		for (i = 1; i <= 10; i++) {
		
		mult = num3 * i;
		System.out.println(num3 + "x" + i + "=" + mult);
		
		}
	}

}