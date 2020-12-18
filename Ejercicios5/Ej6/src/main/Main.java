package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce un numero:");
		int num1 = scan.nextInt();
		while (num1 < 0) {
			System.out.print("Introduce un numero valido:");
			num1 = scan.nextInt();
		}

		System.out.print("Introduce un numero:");
		int num2 = scan.nextInt();
		while (num2 < 0) {
			System.out.print("Introduce un numero valido:");
			num2 = scan.nextInt();
		}

		System.out.print("Introduce un numero:");
		int num3 = scan.nextInt();
		while (num3 < 0) {
			System.out.print("Introduce un numero valido:");
			num3 = scan.nextInt();
		}

		media(num1, num2, num3);

		System.out.println("La media de "+num1+", "+num2+" y "+num3);
		System.out.println("Es ("+num1+"+"+num2+"+"+num3+")/3 = "+media(num1, num2, num3) );
				
		scan.close();

	}

	private static float media(int num1, int num2, int num3) {
		float media = (num1+num2+num3)/3;
		return media;	
		
	}
}
