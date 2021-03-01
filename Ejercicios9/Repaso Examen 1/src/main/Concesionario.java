package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Concesionario {
	
	static int max = 0;
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
	
	public String getNombre() {
		return nombre;
	}

	void rellenar() {
		
			System.out.println("Introduce nombre del concesionario:");
			this.nombre = scan.next();
			System.out.println("Introduce la direccion del concesionario");
			this.direccion = scan.next();
			
			boolean continuar = true;
			do {
				Marca marca = new Marca();
				System.out.println("Introduce nombre de la marca:");
				marca.setNombre(scan.next());
				marcas.add(marca);
				marca.rellenar();
				System.out.println("Deseas continuar?");
				String respuesta = scan.next();
				if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
					continuar=false;
				}
				
			} while (continuar);
		
	}
	
	void visualizar() {
		
		System.out.println("Concesionario: "+this.nombre);
		System.out.println("Direccion: "+this.direccion);
		System.out.println("Maximo = "+max);
		for (Marca marc : marcas) {
			marc.visualizar();
		}
	}
	
	
}
