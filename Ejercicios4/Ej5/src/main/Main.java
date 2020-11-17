package main;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		int n = 0;
		int tot = 0;
		
			
		do {
			num =0;
			System.out.println("Introduce un numero:");
			num = scan.nextInt();
			tot = tot+num;
			n++;
		}

		while (n<10);
		
		if (n==10)
			
			System.out.println("La suma es: "+ tot);
		
		scan.close();
		
	}

}
