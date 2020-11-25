package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduce un numero par (2-100)");
		int num = scan.nextInt();
		
		while (num%2!=0 && num<2 || num>100) {
			System.out.println("ERROR");
			System.out.println("Introduce un numero par (2-100)");
			num = scan.nextInt();
		}
		
		/*for (int filas = 0; filas<=(8/2); filas++) {
			System.out.println();*/
			
			for (int i=num; i<=0; i-=2 ) {
				System.out.println(num);
			}
			
		
		
		scan.close();
		
	}

}
