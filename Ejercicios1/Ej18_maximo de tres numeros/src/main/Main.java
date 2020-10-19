package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		try {
		Scanner scan1 = new Scanner(System.in) ;

		try {
			
		System.out.println("Introduce un numero: ");	
		int num1= scan1.nextInt();
		System.out.println("Introduce un numero: ");	
		int num2= scan1.nextInt();
		System.out.println("Introduce un numero: ");	
		int num3= scan1.nextInt();
		System.out.println("Introduce un numero: ");	
		int num4= scan1.nextInt();
		int maxTotal;
		
		maxTotal=Math.max(Math.max(num1, num2), (Math.max(num3, num4)))
				;
		//maxTotal= Math.max(maxEntre1y2, nota3);
		System.out.println("Numero 1 = " + num1);
		System.out.println("Numero 2 = " + num2);
		System.out.println("Numero 3 = " + num3);
		System.out.println("Numero 4 = " + num4);
		System.out.println("Numero máximo = "+ maxTotal);
		}
		finally {
			
			scan1.close();
		}
		} catch (Exception e) {
		      System.out.println("Introduce solo numeros enteros.");
		
		}
	}
	
}
