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
		
		if (media < 5 ) {
			
			System.out.println("Insuficiente");
		}
		if (media <= 5 && media < 6) {
			
			System.out.println("Suficiente");
		}
		if (media >= 6 && media < 7) {
			
			System.out.println("Bien");
		}
		if (media >= 7 && media < 8) {
			
			System.out.println("Notable");
		}

		if (media >= 8 && media <= 10) {
			
			System.out.println("Puto amo");
		}
		
		

		
		
		scan.close();
	}

}
