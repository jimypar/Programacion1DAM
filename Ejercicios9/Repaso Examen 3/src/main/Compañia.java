package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Compañia {
	
	private Scanner scan = new Scanner(System.in);
	private String nombre;
	private ArrayList<Destino> destinos;
	private int pasjtot;
	
	Compañia(){
		this.nombre = "";
		this.destinos = new ArrayList<Destino>();
	}
		
	Compañia(String nombre) {
		this.nombre = nombre;
		this.destinos = new ArrayList<Destino>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	void rellenar() {

		boolean continuar = true;
		do {
			Destino destino = new Destino();
			System.out.println("Introduce el nombre de destino:");
			String nombre = scan.next();
			destino.setNombre(nombre);
			System.out.println("Introduce el numero de pasajeros:");
			int pasajeros = scan.nextInt();
			destino.setPasajeros(pasajeros);
			this.pasjtot += pasajeros;
			if (this.pasjtot > Aeropuerto.max) {
				Aeropuerto.max=this.pasjtot;
				Aeropuerto.compañiamax=this.nombre;
			}
			destinos.add(destino);
			System.out.println("Deseas crear otro? (si/no)");
			String respuesta = scan.next();
			if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
				continuar = false;
			}

		} while (continuar);
		

	}
			
	void ordenar() {
		ArrayList<String> dest = new ArrayList<String>();
		for (Destino destino : destinos) {
			dest.add(destino.getNombre());
		}
		Collections.sort(dest);
		System.out.println("ORDENADA:");
		  	for (String string : dest) {
				System.out.println("- "+string);
			}
	}
	
	void visualizar() {
		System.out.print(this.nombre);
		
		for (Destino destino : destinos) {
			System.out.println();
			ordenar();
			System.out.println();
			System.out.print(" Destino: ");
			destino.visualizar();
			
		}
	}

	public void remplazar() {

		System.out.println("");
		System.out.println("Que destino quieres remplazar?");
		String replace = scan.next();
		for (Destino destino : destinos) {
			if (destino.getNombre().equals(replace)) {
				System.out.println("Que destino quieres que remplace "+replace);
				destino.setNombre(scan.next());
			}
		}

	}
	
	public void menu() {
		
		boolean salir = false;
		do {
			int numClase = -1;
			do {
				System.out.println();
				System.out.println("Elige un destino");
				String busqueda = scan.next();
				for (Destino destino : destinos) {
					if (destino.getNombre().equalsIgnoreCase(busqueda)) {
						numClase = destinos.indexOf(destino);
					}
				}
			} while (numClase == -1);

			System.out.println("Que deseas hacer?");
			System.out.println("1-Modificar destino");
			System.out.println("2-Cambiar compañia");
			int menu = scan.nextInt();
			switch (menu) {
			case 1:
				destinos.get(numClase).visualizar();
				break;
			case 2:
				salir=true;
			}
		} while (!salir);
		
	}


}
