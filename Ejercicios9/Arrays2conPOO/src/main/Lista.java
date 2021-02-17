package main;

import java.util.Scanner;
import java.util.Vector;

public class Lista {

	private Vector<String> v = new Vector<String>();
	private Scanner scan = new Scanner(System.in);
	
	void Rellenar() {

		String respuesta;

		do {
			System.out.print("Nombre= ");
			v.add(scan.next());
			System.out.println("¿Deseas continuar? si/no");
			respuesta = scan.next();
		} while (respuesta.equalsIgnoreCase("si"));
	}

	// Visualizar
	void Visualizar() {
		for (int i = 0; i < v.size(); i++) {
			System.out.println("Nombre en " + (i + 1) + " = " + v.elementAt(i));
		}
	}
	// Borrar

	void Borrar() {
		System.out.println("Borrar un nombre:");
		System.out.println("Que nombre quieres buscar?");

		String nombreEliminar = scan.next();
		if (v.contains(nombreEliminar)) {
			v.remove(nombreEliminar);
		} else {
			System.out.println("No esta");
		}
	}

}
