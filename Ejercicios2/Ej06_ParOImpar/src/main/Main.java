package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {

			Scanner scan1 = new Scanner(System.in);
<<<<<<< Updated upstream

			System.out.println("Escribe un numero:");
			long num = scan1.nextLong();

						
			if (num <1 || num >10) {
				
				System.out.println("Introduce un numero entre 1 y 10");
				
			}
			
			else {
			
					if (num % 2 == 0) {
		
						System.out.println("El número es par");
						
					}	
		
					else {
		
						System.out.println("El número es impar");
					}

				}
=======
			

				System.out.println("Escribe un numero:");
				long num = scan1.nextLong();
								
				if (num <1 || num >10) {
					
					System.out.println("Escribe numeros entre 1 y 10");
					
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
>>>>>>> Stashed changes
			
			scan1.close();

		} catch (Exception e) {

			System.out.println("Introduce un numero entero. " + e.getMessage());
			

		}

	}

}
