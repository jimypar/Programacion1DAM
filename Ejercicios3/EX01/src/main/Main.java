package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un dia de la semana");
		
		String dia = scan.nextLine();

		switch (dia) {
		case "lunes":

			System.out.println("Hoy toca marcas a primera hora");

			break;

		case "martes":

			System.out.println("Hoy toca fol a primera hora");

			break;

		case "miercoles":

			System.out.println("Hoy toca fol a primera hora");

			break;

		case "jueves":

			System.out.println("Hoy toca marcas a primera hora");

			break;

		case "viernes":

			System.out.println("Hoy toca sistemas a primera hora");

			break;
			
		case "sabado":

			System.out.println("It`s party time");

			break;
			
		case "domingo":

			System.out.println("It`s party time");

			break;

		default:
			
			System.out.println("Introduce un dia valido");
			
			break;
		}

		scan.close();
	}

}
