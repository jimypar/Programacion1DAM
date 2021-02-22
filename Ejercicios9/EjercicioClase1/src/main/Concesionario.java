package main;

import java.util.Scanner;
import java.util.Vector;

public class Concesionario {

	private String nombre;
	private Vector<String> v = new Vector<String>();
	private Scanner scan = new Scanner(System.in);

	Concesionario() {
		this.nombre = "";
	}

	Concesionario(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	void rellenar() {
		String respuesta;
		boolean continuar = true;

		do {
			System.out.println("Introduce un coche:");
			v.add(scan.nextLine());
			System.out.println("Deseas continuar?");
			respuesta = scan.nextLine();
			if (respuesta.trim().toLowerCase().equalsIgnoreCase("si")) {
				continuar = true;
			} else {
				continuar = false;
			}
		} while (continuar);

	}

	public void visualizar() {
		System.out.println(this.nombre);
		for (int i = 0; i < this.v.size(); i++) {
			System.out.println("Coche " + (i + 1) + " = " + this.v.elementAt(i));
		}
	}

	public void remplazar() {

		System.out.println("Borrar un coche:");
		System.out.println("Que coche quieres remplazar?");
		String coche = scan.next();
		if (v.contains(coche)) {
			int pos = v.indexOf(coche);
			System.out.println("Que coche quieres remplazar por "+coche);
			v.set(pos,scan.next());			
		} else {
			System.out.println("No esta");
		}

	}

	public void eliminarCoche() {

		System.out.println("Borrar un coche:");
		System.out.println("Que coche quieres borrar?");
		String coche = scan.next();
		if (v.contains(coche)) {
			v.remove(coche);
			System.out.println(coche + " borrado.");
		} else {
			System.out.println("No esta");
		}

	}

}
