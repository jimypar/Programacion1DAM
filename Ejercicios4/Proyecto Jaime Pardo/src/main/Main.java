package main;

import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean salir = false;

		while (!salir) {

			int menu = 0;

			while (menu < 1 || menu > 5) {
				
				

				System.out.println("\n\n");
				System.out.println("TRABAJO BUCLES Y ACUMULADORES");
				System.out.println("---------Jaime Pardo---------");
				System.out.println(" 1 - Matriculas");
				System.out.println(" 2 - Grupos de alumnos");
				System.out.println(" 3 - Sueldo trabajadores");
				System.out.println(" 4 - Cajero automatico");
				System.out.println(" 5 - Salir");
				System.out.print(" ");
				menu = scan.nextInt();
				
				
			}

			switch (menu) {
			case 1:
				trabajo1.Trabajo1(scan);
				break;
			case 2:
				trabajo2.Trabajo2(scan);
				break;
			case 3:
				trabajo3.Trabajo3(scan);
				break;
			case 4:
				trabajo4.Trabajo4(scan);
				break;
			case 5:
				salir = true;

			default:
				salir = true;
				break;
			}

		}
		scan.close();
	}

}
