package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			Scanner scan1 = new Scanner(System.in);
			try {

				System.out.println("Escribe un numero:");
				long num = scan1.nextLong();
								
				if ( num % 2 == 0)
					
				    System.out.println("El número es par");
				
				else
					
				    System.out.println("El número es impar");
			
			
			}
			finally {
			
			scan1.close();
				
			}
		
		}
		catch (Exception e) {
			
			System.out.println("Introduce un numero entero");
			
		}
		
	}

}
