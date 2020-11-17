package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe un numero del 1 al 7");
		
		int dia = scan.nextInt();
		
		switch (dia) {
		case 1:
			
			System.out.println("Hoy es Lunes");
			
			break;
			
		case 2:
			
			System.out.println("Hoy es Martes");
			
			break;
			
		case 3:
			
			System.out.println("Hoy es Miercoles");
			
			break;
			
		case 4:
			
			System.out.println("Hoy es Jueves");
			
			break;
			
		case 5:
			
			System.out.println("Hoy es Viernes");
			
			break;
			
		case 6:
			
			System.out.println("Hoy es Sabado");
			
			break;
			
		case 7:
			
			System.out.println("Hoy es Domingo");
			
			break;

		default:
			
			System.out.println("Eres bobo?");
			
			break;
		}
		
		
		
		scan.close();
	}

}
