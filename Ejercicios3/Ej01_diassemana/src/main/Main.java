package main;

import java.util.Scanner;

public class Main {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		boolean restart = programa();

		do {

			restart = programa();

		}

		while (restart == true);
		scan.close();

	}

	private static boolean programa() {


		try {

			
			System.out.println("Introduce un numero del 1 al 7");

			int num = scan.nextInt();

			switch (num) {
			case 1:
				System.out.println("Es lunes");
				break;

			case 2:
				System.out.println("Es martes");
				break;

			case 3:
				System.out.println("Es miercoles");
				break;

			case 4:
				System.out.println("Es jueves");
				break;

			case 5:
				System.out.println("Es viernes");
				break;

			case 6:
				System.out.println("Es sabado");
				break;

			case 7:
				System.out.println("Es domingo");
				break;

			default:
				System.out.println("Introduce un numero entre 1 y 7");
				return true;
				
			}

		}

		catch (Exception e) {

			System.out.println("Introduce un caracter valido.");
			return true;
		}

		
		return true;
	}

}
