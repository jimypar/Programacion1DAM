package main;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		int n = 0;
		int tot = 0;
		
			
		for (n = 0;n<10;n++) {
			num =0;
			System.out.print("Introduce un numero:");
			num = scan.nextInt();
			tot = tot+num;
		}
		
		System.out.println("La suma es: "+ tot);
		
		scan.close();
		
	}

}
