package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Horas:");
		
		int h = scan.nextInt();
		
		System.out.println("minutos:");
		
		int m = scan.nextInt();
		
		int mtot = (h*60)+m;
		
		int quedan = 1440-mtot;
		
		System.out.println("Quedan: "+quedan*60+ " segundos");
		
		
		
		
		scan.close();
	}

}
