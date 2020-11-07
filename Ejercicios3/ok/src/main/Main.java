package main;

import java.util.Scanner;

public class Main {
	
	static Scanner scan1 = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean restart = programa();

		do {

			restart = programa();

		}

		while (restart == true);
		scan1.close();
	}
	
	private static boolean programa() {
		
		
		try {
		
		
		System.out.println("---------------------------");
		System.out.println("Introduce numero (5 cifras)");
		System.out.println("-----");

		String entrada = scan1.nextLine();

		Scanner scan2 = new Scanner(entrada);

		scan2.useDelimiter("");

		int num1 = Integer.parseInt(scan2.next());
		int num2 = Integer.parseInt(scan2.next());
		int num3 = Integer.parseInt(scan2.next());
		int num4 = Integer.parseInt(scan2.next());
		int num5 = Integer.parseInt(scan2.next());
		
		num3 = num3+1;

		scan2.close();
		
		if (num1 == num5 && num2 == num4) {
			
			System.out.println(entrada+": Es capicua");
			return false;
		}
		
		else {
			
			System.out.println(entrada+": No es capicua");
			return true;
		}
		
		}
		
		catch (Exception e){
			
			System.out.println("Error");
			return true;
		}

	}

}
