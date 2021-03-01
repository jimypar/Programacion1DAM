package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Aeropuerto {
	
	static String compañiamax;
	static int max = 0;
	private Scanner scan = new Scanner(System.in);
	private String nombre;
	private String direccion;
	private ArrayList<Compañia> compañias;
	
	Aeropuerto(){
		this.nombre="";
		this.direccion="";
		this.compañias = new ArrayList<Compañia>();
	}
	
	Aeropuerto(String nombre,String direccion){
		this.nombre=nombre;
		this.direccion=direccion;
		this.compañias = new ArrayList<Compañia>();
	}
		
	public String getNombre() {
		return nombre;
	}

	void rellenar() {
		
		boolean continuar = true;
		do {
			System.out.println("Introduce el nombre de Compañia");
			String nombre =  scan.next();
			compañias.add(new Compañia(nombre));
			System.out.println("Deseas crear otro? (si/no)");
			String respuesta = scan.next();
			if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
				continuar = false;
			}

		} while (continuar);
		menu();
	
		
	}
	
	void visualizar() {
		System.out.println();
		System.out.println("Aeropuerto: "+this.nombre);
		System.out.println("Direccion: "+this.direccion);
		
		for (Compañia compañia : compañias) {
			
			System.out.println("Max Compañia: " +compañiamax+ " = "+max);
			System.out.println();
			System.out.print("  Compañia: ");
			compañia.visualizar();
		}
	}

	public void menu() {
		
		boolean salir = false;
		do {
			int numClase = -1;
			do {
				System.out.println();
				System.out.println("Elige una compañia");
				String busqueda = scan.next();
				for (Compañia compañia : compañias) {
					if (compañia.getNombre().equalsIgnoreCase(busqueda)) {
						numClase = compañias.indexOf(compañia);
					}
				}
			} while (numClase == -1);

			System.out.println("Que deseas hacer?");
			System.out.println("1-Rellenar compañia");
			System.out.println("2-Modificar compañia");
			System.out.println("3-Visualizar compañia");
			System.out.println("4-Cambiar aeropuerto");
			int menu = scan.nextInt();
			switch (menu) {
			case 1:
				compañias.get(numClase).rellenar();
				break;
			case 2:
				compañias.get(numClase).menu();
				break;
			case 3:
				compañias.get(numClase).visualizar();
				break;
			case 4:
				salir=true;
			}
		} while (!salir);
		
	}

	
	
	
}
