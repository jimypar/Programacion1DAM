package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Concesionario> v = new ArrayList<Concesionario>();

		String nombre = "";
		while (!nombre.trim().toLowerCase().equalsIgnoreCase("*")) {

			System.out.println("Introduce el nombre del concesionario  (* para treminar)");
			nombre = scan.next();
			if (!nombre.trim().equalsIgnoreCase("*")) {
				v.add(new Concesionario(nombre));
			}

		}

		do

		{
			int numConcesionario = -1;
			do {
				System.out.println();
				System.out.println("Elige un concesionario:");
				for (int i = 0; i < v.size(); i++) {
					System.out.println("- " + v.get(i).getNombre());
				}
				System.out.print(":");
				String busqueda = scan.next();
				for (int i = 0; i < v.size(); i++) {
					if (v.get(i).getNombre().equals(busqueda)) {
						numConcesionario = i;
					}
				}
			} while (numConcesionario == -1);

			System.out.println("Que deseas hacer?");
			System.out.println("1-Rellenar concesionario");
			System.out.println("2-Ver concesionario");
			System.out.println("3-Remplazar coche");
			System.out.println("4-Eliminar coche concesionario");
			System.out.println("5-Salir");
			int menu = scan.nextInt();
			switch (menu) {
			case 1:
				v.get(numConcesionario).rellenar();
				break;
			case 2:
				v.get(numConcesionario).visualizar();
				break;
			case 3:
				v.get(numConcesionario).remplazar();
				break;
			case 4:
				v.get(numConcesionario).eliminarCoche();
				break;
			case 5:
				scan.close();
				System.exit(0);
			}
		} while (true);

	}

}
