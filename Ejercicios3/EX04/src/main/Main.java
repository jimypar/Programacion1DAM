package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Intoduce las horas:");
		
		int h = scan.nextInt();
		
		if (h >= 0 && h <= 40) {
			
			int sueldo = h*12 ;
			
			System.out.println("El sueldo es: "+sueldo+"€");
			
		}
		
		else if (h >= 40) {
			
			int sueldo = (40*12) + ((h-40)*16) ;
			
			System.out.println("El sueldo es: "+sueldo+"€");
			
		}
		
		else {
			
			System.out.println("Error");
			
		}
		
		
		scan.close();
	}

}
