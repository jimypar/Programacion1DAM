package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {

	private String nombre;
	private ArrayList<Integer> notas = new ArrayList<Integer>();
	private Scanner scan = new Scanner(System.in);

	Alumno() {
		this.nombre = "";
	}

	Alumno(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	void rellenar() {
		String respuesta;
		boolean continuar = true;

		do {
			System.out.println("Introduce una nota:");
			notas.add(scan.nextInt());
			System.out.println("Deseas continuar?");
			respuesta = scan.next();
			if (respuesta.trim().toLowerCase().equalsIgnoreCase("si")) {
				continuar = true;
			} else {
				continuar = false;
			}
		} while (continuar);

	}

	public void visualizar() {
		int sum = 0;
		System.out.println(this.nombre);
		for (int i = 0; i < this.notas.size(); i++) {
			System.out.println("Nota " + (i + 1) + " = " + this.notas.get(i));
			sum += this.notas.get(i);
		}
		if(this.notas.size()!=0) {
		System.out.println("Media = "+(sum/this.notas.size()));
		}
	}

	public void eliminarNota() {

		System.out.println("Borrar una nota:");
		System.out.println("Que nota quieres buscar?");
		int nota = scan.nextInt();
		if (notas.contains(nota)) {
			notas.remove(notas.indexOf(nota));
			System.out.println(nota + " borrada.");
		} else {
			System.out.println("No esta");
		}

	}

}
