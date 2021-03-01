package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Aeropuerto {
	
	static String compa�iamax;
	static int max = 0;
	private Scanner scan = new Scanner(System.in);
	private String nombre;
	private String direccion;
	private ArrayList<Compa�ia> compa�ias;
	
	Aeropuerto(){
		this.nombre="";
		this.direccion="";
		this.compa�ias = new ArrayList<Compa�ia>();
	}
	
	Aeropuerto(String nombre,String direccion){
		this.nombre=nombre;
		this.direccion=direccion;
		this.compa�ias = new ArrayList<Compa�ia>();
	}
		
	public String getNombre() {
		return nombre;
	}

	void rellenar() {
		
		boolean continuar = true;
		do {
			System.out.println("Introduce el nombre de Compa�ia");
			String nombre =  scan.next();
			compa�ias.add(new Compa�ia(nombre));
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
		
		for (Compa�ia compa�ia : compa�ias) {
			
			System.out.println("Max Compa�ia: " +compa�iamax+ " = "+max);
			System.out.println();
			System.out.print("  Compa�ia: ");
			compa�ia.visualizar();
		}
	}

	public void menu() {
		
		boolean salir = false;
		do {
			int numClase = -1;
			do {
				System.out.println();
				System.out.println("Elige una compa�ia");
				String busqueda = scan.next();
				for (Compa�ia compa�ia : compa�ias) {
					if (compa�ia.getNombre().equalsIgnoreCase(busqueda)) {
						numClase = compa�ias.indexOf(compa�ia);
					}
				}
			} while (numClase == -1);

			System.out.println("Que deseas hacer?");
			System.out.println("1-Rellenar compa�ia");
			System.out.println("2-Modificar compa�ia");
			System.out.println("3-Visualizar compa�ia");
			System.out.println("4-Cambiar aeropuerto");
			int menu = scan.nextInt();
			switch (menu) {
			case 1:
				compa�ias.get(numClase).rellenar();
				break;
			case 2:
				compa�ias.get(numClase).menu();
				break;
			case 3:
				compa�ias.get(numClase).visualizar();
				break;
			case 4:
				salir=true;
			}
		} while (!salir);
		
	}

	
	
	
}
