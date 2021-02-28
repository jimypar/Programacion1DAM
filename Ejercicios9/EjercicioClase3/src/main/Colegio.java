package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Colegio {

	private static Scanner scan = new Scanner(System.in);
	private String nombre;
	private String direccion;
	private static ArrayList<Aula> aulas = new ArrayList<Aula>();
	
	Colegio() {
		this.nombre = "";
		this.direccion = "";
	}

	Colegio(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}

	void rellenarAula() {

		boolean continuar = true;
		do {
			System.out.println("Introduce el nombre de la clase ");
			aulas.add(new Aula(scan.next()));

			System.out.println("Deseas crear otra? (si/no)");
			String respuesta = scan.next();
			if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
				continuar = false;
			}

		} while (continuar);
		menu();
	}

	void menu() {
		boolean salir = false;
		do {
			int numClase = -1;
			do {
				System.out.println();
				System.out.println("Elige una clase");
				String busqueda = scan.next();
				for (Aula aula : aulas) {
					if (aula.getNombre().equalsIgnoreCase(busqueda)) {
						numClase = aulas.indexOf(aula);
					}
				}
			} while (numClase == -1);

			System.out.println("Que deseas hacer?");
			System.out.println("1-Rellenar alumno");
			System.out.println("2-Modificar alumnos");
			System.out.println("3-Visualizar alumnos");
			System.out.println("4-Cambiar colegio");
			int menu = scan.nextInt();
			switch (menu) {
			case 1:
				aulas.get(numClase).rellenar();
				break;
			case 2:
				aulas.get(numClase).menu();
				break;
			case 3:
				aulas.get(numClase).visualizar();
				break;
			case 4:
				salir=true;
			}
		} while (!salir);

	}
	
	void visualizar() {
		System.out.println();
		System.out.println("COLEGIO: "+this.nombre);
		System.out.println("DIRECCION: "+this.direccion);
		
		for (Aula aula : aulas) {
			System.out.println();
			System.out.print("  Aula: ");
			aula.visualizar();
		}
	}
	
	
}
