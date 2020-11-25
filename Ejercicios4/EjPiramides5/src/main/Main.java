package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Introduce un numero:");
		int numero = in.nextInt();
		int veces = numero;
		
		for (int fs = 1; fs<=numero; fs++) {
			
			System.out.println();
			
			
			for (int fila = 1; fila<=veces; fila++) {
				
			System.out.print(fila);	
				
			}
			
			veces--;
			
		}
		
		in.close();

	}

}
