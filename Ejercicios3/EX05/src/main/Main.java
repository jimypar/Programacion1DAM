package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce a y b");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int x = -b/a;		
				
		System.out.println("x = " +x);
		
		
		
		scan.close();
	}

}
