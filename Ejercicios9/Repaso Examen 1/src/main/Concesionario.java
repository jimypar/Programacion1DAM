package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Concesionario {
	
	private Scanner scan = new Scanner(System.in);
	private String nombre;
	private String direccion;
	private ArrayList<Marca> marcas;
	
	Concesionario(){
		this.nombre="";
		this.direccion="";
		this.marcas = new ArrayList<Marca>();
	}
	
	Concesionario(String nombre,String direccion){
		this.nombre=nombre;
		this.direccion=direccion;
		this.marcas = new ArrayList<Marca>();
	}
	
	void rellenar() {
		
		boolean continuar = true;
		do {
			System.out.println("Introduce nombre del concesionario:");
			this.nombre = scan.nextLine();
			System.out.println("Introduce la direccion del concesionario");
			this.direccion = scan.nextLine();
			System.out.println("Deseas continuar?");
			String respuesta = scan.nextLine();
			if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
				continuar=false;
			}
			
		} while (continuar);
		
	}
	
	void visualizar() {
		
		System.out.println("Concesionario: "+this.nombre);
		System.out.println("Direccion: "+this.direccion);
		
		for (Marca marca : marcas) {
			marca.visualizar();
		}
	}
	
	
}
