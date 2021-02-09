package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		Instrumentos instrumento = new Instrumentos();
		
		instrumento.rellenar();
		
		instrumento.visualizar();
			
		System.out.println("Introduce un precio");
		int num = scan.nextInt();
		if (instrumento.precio(num)) {
			System.out.println("El instrumento es caro");
		}
		else {
			System.out.println("Es barato");
		}
		
		scan.close();
	}

}
