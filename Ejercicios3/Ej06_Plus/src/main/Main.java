package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		try {
				
		
		System.out.println("Introducir estado Civil: S,C,V o D");
		
		
		char civil = scan.nextLine().charAt(0);
		
		civil = Character.toUpperCase(civil);
		
		if (civil!='S' && civil!='C' && civil!='V' && civil!='D') {
			
			System.out.println("Error, no es un estado civil correcto.");
			System.exit(0);
			
		}
		
		
		char nivel;
		System.out.println("Nivel de estudios: p, m y s.");
		
		nivel = scan.nextLine().charAt(0);
		
		if (nivel!='P' && nivel!='M' && nivel!='S')
		System.out.println("Error no existe de estudios");
		
		
		switch (civil) {
		case 'S':
			
			System.out.println("Plus de 6 euros");
			
			break;

		case 'V' : 
			
			if (nivel == 'M')
				
				System.out.println("Plus de 9 euros");
			
			else {
			
				System.out.println("Plus de 6 euros");
			
				}
			break;
			
		case 'C' : 
			
			if (nivel == 'P')
				
				System.out.println("Plus de 12 euros");
			
			if (nivel == 'M')
				
				System.out.println("Plus de 15 euros");
			
			else {
			
				System.out.println("Plus de 18 euros");
			
				}
			
			break;
			
		case 'D' :
			
			if (nivel == 'P')
				
				System.out.println("Plus de 12 euros");
			
			if (nivel == 'M')
				
				System.out.println("Plus de 14 euros");
			
			else {
			
				System.out.println("Plus de 16 euros");
			
				}
			
			break;
			
		default:
			
			 System.out.println("OK");
			break;
			
			
			

		}
		}	
		catch(Exception e) {
			System.out.println("Error");
			
		}
			
			
		scan.close();
	
	}

}
