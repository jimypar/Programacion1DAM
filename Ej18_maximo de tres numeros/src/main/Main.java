package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
		System.out.println("Introduce cuatro numeros:");
		Scanner scan1 = new Scanner(System.in) ;
		Scanner scan2 = new Scanner(System.in) ;
		Scanner scan3 = new Scanner(System.in) ;
		Scanner scan4 = new Scanner(System.in) ;
		try {
			
		int num1= scan1.nextInt();
		int num2= scan2.nextInt();
		int num3= scan3.nextInt();
		int num4= scan4.nextInt();
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
			scan2.close();
			scan3.close();
			scan4.close();
		}
		} catch (Exception e) {
		      System.out.println("Introduce solo numeros.");
		
		}
	}
	
}
