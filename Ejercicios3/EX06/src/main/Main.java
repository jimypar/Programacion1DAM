package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

			System.out.println("Introduce la altura:");
		
		double altura = scan.nextInt();
		
		double t = Math.sqrt(2*9.81*altura);
			
		System.out.println("El tiempo es: "+t);	
			
		scan.close();
	}

}
