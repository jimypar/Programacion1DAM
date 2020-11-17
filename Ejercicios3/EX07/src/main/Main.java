package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce 3 numero");

		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
	
		int media = (n1+n2+n3)/3;
		
		System.out.println("La media es: "+media);
		
		
		scan.close();
	}

}
