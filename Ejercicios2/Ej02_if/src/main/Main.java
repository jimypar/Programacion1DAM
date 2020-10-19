package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			Scanner scan1 = new Scanner(System.in);
			
			try {
				
				System.out.println("Introduce un numero: ");
				int num1 = scan1.nextInt();
			
					if (num1>0) {
				
						System.out.println(num1+" : Es positivo");
						 
					}
					
					if (num1==0) {
						
						System.out.println("El numero es 0");
						
					}
					
					else {
				
						System.out.println(num1+" : Es negativo");
				
					}
					
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
