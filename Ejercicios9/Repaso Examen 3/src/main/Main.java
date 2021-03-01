package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);
	private static ArrayList<Aeropuerto> aeropuertos = new ArrayList<Aeropuerto>();

	public static void main(String[] args) {

		rellenarAeropuerto();
		menu();
		
	}

	static void rellenarAeropuerto() {
		
			for (int i = 0; i < 2; i++) {
				System.out.println("Aeropuerto " + (i+1));
				System.out.println("Introduce el nombre del Aeropuerto ");
				String nombre = scan.nextLine();
				System.out.println("Introduce la direccion del Aeropuerto ");
				String direccion = scan.nextLine();
				aeropuertos.add(new Aeropuerto(nombre, direccion));
			}

	}

	static void menu() {

		do {
			int numAeropuerto = -1;
			do {
				System.out.println();
				System.out.println("Elige un aeropuerto");
				String busqueda = scan.next();
				for (Aeropuerto aeropuerto : aeropuertos) {
					if (aeropuerto.getNombre().equalsIgnoreCase(busqueda)) {
						numAeropuerto = aeropuertos.indexOf(aeropuerto);
					}
				}
			} while (numAeropuerto == -1);

			System.out.println("Que deseas hacer?");
			System.out.println("1-Crear aeropuerto");
			System.out.println("2-Modificar aeropuerto");
			System.out.println("3-Visualizar aeropuerto");
			System.out.println("4-Salir");
			int menu = scan.nextInt();
			switch (menu) {
			case 1:
				aeropuertos.get(numAeropuerto).rellenar();
				break;
			case 2:
				aeropuertos.get(numAeropuerto).menu();
				break;
			case 3:
				aeropuertos.get(numAeropuerto).visualizar();
				break;
			case 4:
				System.exit(0);
				scan.close();
			}
		} while (true);

	}

}
