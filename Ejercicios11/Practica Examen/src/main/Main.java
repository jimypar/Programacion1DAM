package main;

import java.util.Scanner;

import tienda.Tienda;

public class Main {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Nombre tienda:");
		String nombreTienda = scan.next();

		Tienda tienda = new Tienda(nombreTienda);

		menu(tienda);

	}

	private static void menu(Tienda tienda) {

		do {
			System.out.println();
			System.out.println("1. Rellenar aparatos electrónicos en una lista");
			System.out.println("2. Visualizar la lista");
			System.out.println("3. Manipular archivo RAF");
			System.out.println("4. Salir");
			System.out.println();
			System.out.println("Elige una opcion");
			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				tienda.rellenarTienda();
				break;
			case 2:
				tienda.visualizarTienda();
				break;
			case 3:
				tienda.crearRAF();
				tienda.modificarRAF();
				tienda.visualizarRAF();
				break;
			case 4:
				System.exit(0);
				break;

			default:
				break;
			}

		} while (true);

	}

}
