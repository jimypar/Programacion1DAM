package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			try {
			
				System.out.println("Introduce las horas trabajadas:");
				int horas = scan.nextInt();
				int dinero = 0;
				int salario = 0;
				
				if (horas<=40 && horas>0 ) {
					
					dinero = 16 ;
					salario = 16 * horas ;
					System.out.println("Cobras "+dinero+"€/hora y un total de: " +salario+ "€.");
					
				}
				
				else if (horas>40) {
					
					dinero = 20 ;
					salario = (16 * 40)+((horas-40)*20) ;
					System.out.println("Cobras "+dinero+"€/hora extra y un total de: " +salario+ "€.");

				}			
				
					
				else if (horas == 0 ) {
					
					System.out.println("No hay horas");
					
				}
						
				
				scan.close();
				
				}
			
			catch (Exception e) {
				
				System.out.println("Caracter no valido");
				
			}
	}

}
