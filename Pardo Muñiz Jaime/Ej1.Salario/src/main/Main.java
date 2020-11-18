package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce las horas trabajadas:(semanal)");
		int h = scan.nextInt();
		System.out.println("Introduce la tarifa/h");
		double tar = scan.nextDouble();
		double sal = 0;

		if (h <= 0) {

			System.out.println("Introduce un valor valido:");
		}

		else if (h > 0 && h <= 40) {

			sal = h * tar;

		}

		else if (h > 40) {

			
			sal = (40 * tar) + (h-40) * (tar * 2);

		}

		System.out.println("      MENU ");
		System.out.println("1.Mostrar salario neto.");
		System.out.println("2.Mostrar salario bruto.");
		System.out.println("3.Mostrar impuesto.");
		System.out.println("4.Salir.");
		System.out.println("Elegir una opcion:");

		int menu = scan.nextInt();

		switch (menu) {
		case 1:

			System.out.println("Tu sueldo neto es:" + sal);
			break;

		case 2:

			if (sal <= 1500) {

				System.out.println("Tu sueldo bruto es:" + sal);

			}

			else if (sal > 1500 && sal <= 3500) {

				double salNeto = sal + (sal * 0.15);
				System.out.println("Tu sueldo bruto es:" + salNeto);

			} else if (sal > 3500) {

				double salNeto = sal + (sal * 0.20);
				System.out.println("Tu sueldo bruto es:" + salNeto);

			}

			break;

		case 3:

			if (sal <= 1500) {

				System.out.println("Tu impuesto es del: 0%");

			}

			else if (sal > 1500 && sal <= 3500) {

				System.out.println("Tu impuesto es del: 15%");

			} else if (sal > 3500) {

				System.out.println("Tu impuesto es del: 20%");

			}

			break;
			
		case 4:
			
			System.exit(0);
			
			break;
			
		default:
			
			System.exit(0);
			
			break;
		}

		scan.close();
		
		}
		catch (Exception e) {
			
			System.out.println("Algo ha fallado");
			
		}
	}

}
