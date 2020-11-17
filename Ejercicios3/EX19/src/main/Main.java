package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		
		int num = scan.nextInt();
		
		String numero = Integer.toString(num);
		
		if (num>=0) {
		
		System.out.println("El numero tiene: "+ numero.length() + " digitos");

		}
		
		else {
			
		System.out.println("El numero tiene: "+ (numero.length()-1) + " digitos");

			
		}
		scan.close();
	}

}
