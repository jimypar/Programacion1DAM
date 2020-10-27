package main;

import java.util.Scanner;

public class Main {

	static boolean restart;
	
	
	public static void main(String[] args) {	
		
	do {
		programa();
	}
	while (programa() false);
		
	
	
	}
	
	public static boolean programa(){
		
		try {
			
			Scanner scan1 = new Scanner(System.in);
			

				System.out.println("Escribe un numero:");
				long num = scan1.nextLong();
								
				if (num <1 || num >10) {
					
					System.out.println("Escribe numeros entre 1 y 10");
					return true;
					
				}
				
				else {
				
						if ( num % 2 == 0)
							
						    System.out.println("El número es par");
						
						else
							
						    System.out.println("El número es impar");
			
				}
			
			scan1.close();
						
		}
		catch (Exception e) {
			
			System.out.println("Introduce un numero entero");
			
		}
		return restart;
		
	}

}
