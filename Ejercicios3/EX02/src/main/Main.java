package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce la hora:");
		
		int h = scan.nextInt();
		
		if (h >= 6 && h <= 12) {
			
			System.out.println("Buenos dias crack");
			
		}
		
		else if (h >= 13 && h <= 20) {
			
			System.out.println("Buenos tardes crack");
			
		}
		
		else if ((h >= 21 && h <= 23) || (h >= 0 && h <= 5 )) {
			
			System.out.println("Buenos noches crack");
			
		}
		
		else {
			
			System.out.println("Estas borracho o que?");
			
		}
		
		
		scan.close();
	}

}
