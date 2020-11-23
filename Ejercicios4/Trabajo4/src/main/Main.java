package main;

import java.util.Scanner;

public class Main {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("CAJERO AUTOMATICO:");
		System.out.println("_________________");
		System.out.println("");

		for (int i = 0; i < 3; i++) {

			System.out.print("Introduce clave PIN:");
			int num = scan.nextInt();
			String numS = num + "";
			int longitud = numS.length();

			if (num == 1234) {

				System.out.println("Clave correcta");
				menu();
			}

			else if (longitud != 4) {

				System.out.println("El PIN debe contener 4 numeros");

			}

			else {

				System.out.println("Clave incorrecta");

			}

		}
		System.out.println("Numero maximo de intentos(3) superado.");
		System.exit(0);

	}

	private static void menu() {

		int saldo = 0;

		int menu = -1;
		while (menu != 4) {

			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("---MENU CAJERO AUTOMATICO---");
			System.out.println("	1- Ingresar ");
			System.out.println("	2- Retirar");
			System.out.println("	3- Consultar saldo");
			System.out.println("	4- Salir");
			System.out.print("	");

			menu = scan.nextInt();

			switch (menu) {
			case 4:
				System.exit(0);
				break;

			case 1:

				System.out.print("¿Cuanto deseas ingresar?: ");
				int ingreso = scan.nextInt();
				System.out.println("Se han ingresado: " + ingreso + "€");
				saldo += ingreso;
				break;

			case 2:

				System.out.print("¿Cuanto deseas retirar?: ");
				int retirada = scan.nextInt();
				System.out.println("Se han retirado: " + retirada + "€");
				saldo -= retirada;
				break;

			case 3:
				System.out.println("Su saldo es: " + saldo + "€");
				break;

			default:

				System.out.println("Introduce un numero entre 1 y 4 por favor:");
				break;
			}

		}

	}

}
