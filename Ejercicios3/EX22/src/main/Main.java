package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dia:");
		String dia = scan.nextLine();
		System.out.println("Hora:");
		int h = scan.nextInt();
		System.out.println("Minuto:");
		int m = scan.nextInt();
		int mtot = h*60+m;
		
		int queda = 0;
		int quedah = 0;
		int quedam = 0;
		
		switch (dia) {
		case "lunes":
			
				queda = 6660 - mtot ;
				quedah = queda/60;
				quedam = queda%60;
				
				System.out.println("Quedan : " +quedah+ " horas y " + quedam + " minutos para el viernes a las 15:00.");
			
			break;
			
		case "martes":
			
			queda = 5220 - mtot ;
			quedah = queda/60;
			quedam = queda%60;
			
			System.out.println("Quedan : " +quedah+ " horas y " + quedam + " minutos para el viernes a las 15:00.");
		
		break;
		
		case "miercoles":
			
			queda = 3780 - mtot ;
			quedah = queda/60;
			quedam = queda%60;
			
			System.out.println("Quedan : " +quedah+ " horas y " + quedam + " minutos para el viernes a las 15:00.");
		
		break;
		
		case "jueves":
			
			queda = 2340 - mtot ;
			quedah = queda/60;
			quedam = queda%60;
			
			System.out.println("Quedan : " +quedah+ " horas y " + quedam + " minutos para el viernes a las 15:00.");
		
		break;
		
		case "viernes":
			
			queda = 900 - mtot ;
			quedah = queda/60;
			quedam = queda%60;
			
			System.out.println("Quedan : " +quedah+ " horas y " + quedam + " minutos para el viernes a las 15:00.");
		
		break;
			
		

		default:
			
			System.out.println("Error fecha no valida");
			
			break;
		}
		
		scan.close();
	}

}
