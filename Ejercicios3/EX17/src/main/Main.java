package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		
		int num = scan.nextInt();
		
		int cifra = num%10;
		
		System.out.println("La ultima cifra es: "+ cifra);

		scan.close();
	}

}
