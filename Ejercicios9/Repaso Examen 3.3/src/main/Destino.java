package main;

import java.util.Scanner;

public class Destino {

	private Scanner scan = new Scanner(System.in);
	private String nombre;
	private int pasajeros;
	
	public Destino() {
		this.nombre = "";
		this.pasajeros = 0;
	}	
	
	public Destino(String nombre, int pasajeros) {
		this.nombre = nombre;
		this.pasajeros = pasajeros;
	}
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public void rellenar() {
		
		System.out.println("Introduce el nombre destino:");
		this.nombre = scan.nextLine();
		System.out.println("Introduce pasajeros:");
		this.pasajeros = scan.nextInt();
		
	}

	public void visualizar() {
		
		System.out.println("Destino: "+this.nombre);
		System.out.println("Pasajeros: "+this.pasajeros);
	}
	
	
	
}
