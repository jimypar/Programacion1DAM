package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);
	private static ArrayList<Colegio> colegios = new ArrayList<Colegio>();

	public static void main(String[] args) {
		rellenarColegio();
		menu();
	}

	static void rellenarColegio() {

		boolean continuar = true;
		do {
			
			System.out.println("Introduce el nombre del colegio ");
			String nombre = scan.nextLine();
			System.out.println("Introduce la direccion del colegio ");
			String direccion = scan.nextLine();
			colegios.add(new Colegio(nombre,direccion));

			System.out.println("Deseas crear otro? (si/no)");
			String respuesta = scan.next();
			if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
				continuar = false;
			}
			scan.nextLine();
		} while (continuar);

	}

	static void menu() {

		do {
			int numColegio = -1;
			do {
				System.out.println();
				System.out.println("Elige un colegio");
				String busqueda = scan.next();
				for (Colegio clase : colegios) {
					if (clase.getNombre().equalsIgnoreCase(busqueda)) {
						numColegio = colegios.indexOf(clase);
					}
				}
			} while (numColegio == -1);

			System.out.println("Que deseas hacer?");
			System.out.println("1-Crear clase");
			System.out.println("2-Modificar clase");
			System.out.println("3-Visualizar Clases");
			System.out.println("4-Salir");
			int menu = scan.nextInt();
			switch (menu) {
			case 1:
				colegios.get(numColegio).rellenarAula();
				break;
			case 2:
				colegios.get(numColegio).menu();
				break;
			case 3:
				colegios.get(numColegio).visualizar();
				break;
			case 4:
				System.exit(0);
				scan.close();
			}
		} while (true);

	}
}
