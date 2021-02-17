package main;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Vector<Concesionario> v = new Vector<Concesionario>();

		for (int i = 1; i > 0; i++) {
			System.out.println("Introduce el nombre del concesionario " + i);
			v.add(new Concesionario(scan.next()));

			System.out.println("Deseas crear otro? (si/no)");
			String respuesta = scan.next();
			if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
				i = -1;
			}

		}

		do {
		int numConcesionario = -1;
		do {
			System.out.println("Elige un concesionario:");
			String busqueda = scan.next();
			for (int i = 0; i < v.size(); i++) {
				if (v.elementAt(i).getNombre().equals(busqueda)) {
					numConcesionario = i;
				}
			}
		} while (numConcesionario == -1);
		
		System.out.println("Que deseas hacer?");
		System.out.println("1-Rellenar concesionario");
		System.out.println("2-Ver concesionario");
		System.out.println("3-eliminar coche concesionario");
		System.out.println("4-salir");
		int menu = scan.nextInt();
		switch (menu) {
		case 1:
			v.elementAt(numConcesionario).rellenar();
			break;
		case 2:
			v.elementAt(numConcesionario).visualizar();
			break;
		case 3:
			v.elementAt(numConcesionario).eliminarCoche();
			break;
		case 4:
			System.exit(0);
		}
		}while(true);
		
	
	}
	

}
