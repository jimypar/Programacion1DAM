package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		
		int num = scan.nextInt();
		
		String numero = Integer.toString(num);
		
		int cifra = (int) (num/(Math.pow(10,(numero.length()-1))));
		
		System.out.println("La primera cifra es: "+ cifra);
		
		
		scan.close();

	}

}
