package main;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {

		// Crear lista de nombres
		Vector<String> v = new Vector<String>();

		// Rellenar
		Scanner scan = new Scanner(System.in);
		String respuesta;

		do {
			System.out.print("Nombre= ");
			v.add(scan.next());
			System.out.println("¿Deseas continuar? si/no");
			respuesta = scan.next();
		} while (respuesta.equalsIgnoreCase("si"));

		
		//Visualizar
		for (int i = 0; i < v.size(); i++) {
			System.out.println("Nombre en " + (i + 1) + " = " + v.elementAt(i));
		}

		//Borrar
		
		System.out.println("Borrar un nombre:");
		System.out.println("Que nombre quieres buscar?");
		String nombreEliminar = scan.next();
		if (v.contains(nombreEliminar)) {
			v.remove(nombreEliminar);
		}
		else {
			System.out.println("No esta");
		}
		
		//Visualizar
				for (int i = 0; i < v.size(); i++) {
					System.out.println("Nombre en " + (i + 1) + " = " + v.elementAt(i));
				}

		
		scan.close();
		
		
		
	}

}