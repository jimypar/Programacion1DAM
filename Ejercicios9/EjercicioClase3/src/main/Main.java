package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static Scanner scan = new Scanner(System.in);
	private static ArrayList<Clase> clase = new ArrayList<Clase>();
	
	public static void main(String[] args) {
		rellenarClase();
		menu();
	}

	static void rellenarClase() {

		for (int i = 1; i > 0; i++) {
			System.out.println("Introduce el nombre de la clase " + i);
			clase.add(new Clase(scan.next()));

			System.out.println("Deseas crear otra? (si/no)");
			String respuesta = scan.next();
			if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
				i = -1;
			}

		}

	}

	static void menu() {

		do {
			int numClase = -1;
			do {
				System.out.println("Elige una clase");
				String busqueda = scan.next();
				for (int i = 0; i < clase.size(); i++) {
					if (clase.get(i).getNombre().equals(busqueda)) {
						numClase = i;
					}
				}
			} while (numClase == -1);

			System.out.println("Que deseas hacer?");
			System.out.println("1-Rellenar clase");
			System.out.println("2-Modificar alumnos");
			System.out.println("3-Visualizar alumnos");
			System.out.println("4-Salir");
			int menu = scan.nextInt();
			switch (menu) {
			case 1:
				clase.get(numClase).rellenar();
				break;
			case 2:
				clase.get(numClase).menu();
				break;
			case 3:
				clase.get(numClase).visualizar();
				break;
			case 4:
				System.exit(0);
				scan.close();
			}
		} while (true);

	}}

