package main;

import java.util.Scanner;

public class trabajo4 {

	public static void Trabajo4(Scanner scan) {

		System.out.println("CAJERO AUTOMATICO:");
		System.out.println("_________________");
		System.out.println("");

		int intento = 0;
		boolean valido = false;

		while (!valido && intento < 3) {

			System.out.print("Introduce clave PIN:");
			int num = scan.nextInt();
			String nume = num+"";
			int longitud = nume.length();
			
			
			while (longitud !=4 ) {
				System.out.println("La clave debe contener 4 digitos:");
				System.out.print("Introduce clave PIN:");
				num = scan.nextInt();
				nume = num+"";
				longitud = nume.length();
			}
			
			intento++;

			if (num != 1234) {
				System.out.println("Clave incorrecta");
				valido = false;
			}
			
			
			if (num == 1234) {

				System.out.println("Clave correcta");
				valido = true;
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

		System.out.println("Numero maximo de intentos(3) superado.");
		

	}

}
