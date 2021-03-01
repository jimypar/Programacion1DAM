package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Marca {
	
	static int max = 0;
	private Scanner scan = new Scanner(System.in);
	private String nombre;
	private ArrayList<Modelo> modelos;
	
	Marca(){
		this.nombre = "";
		this.modelos = new ArrayList<Modelo>();
	}
	
	Marca(String nombre){
		this.nombre = nombre;
	}
	
	void rellenar() {
		boolean continuar = true;
		do {
			System.out.println("Introduce nombre de la marca:");
			this.nombre = scan.nextLine();
			System.out.println("Deseas continuar?");
			String respuesta = scan.nextLine();
			if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
				continuar=false;
			}
		} while (continuar);
		
	}

	public void visualizar() {
		
		System.out.println("Marca: "+this.nombre);
		
		for (Modelo modelo : modelos) {
			modelo.visualizar();
		}
		
	}
	

}
