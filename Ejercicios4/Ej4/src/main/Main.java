package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int n = 0;
		
		int suma = 0;
			
		do {
			
			System.out.println(num +"+"+ n +"="+ suma);
			suma = num + n++;
			
		}

		while (n <= 50);
		
		scan.close();
		
	}

}
