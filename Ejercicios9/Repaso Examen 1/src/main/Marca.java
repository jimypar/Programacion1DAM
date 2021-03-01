package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Marca {
	
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
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	void rellenar() {
		
		boolean continuar = true;
		do {
			Modelo modelo = new Modelo();
			System.out.println("Introduce nombre del modelo: ");
			String name = scan.next();
			System.out.println("Introduce stock");
			int stock = scan.nextInt();
			modelo.setNombre(name);
			modelo.setStock(stock);
			modelos.add(modelo);
			if (stock > Concesionario.max) {
				Concesionario.max = stock;
			}
			System.out.println("Deseas continuar?");
			String respuesta = scan.next();
			if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
				continuar=false;
			}
		} while (continuar);
		
	}

	void visualizar() {
		
		System.out.println("Marca: "+this.nombre);
		
		for (Modelo model : modelos) {
			model.visualizar();
		}
		
	}
	

}
