package main;

import java.util.Scanner;

public class Instrumentos {
	
	Scanner scan = new Scanner(System.in);

	String nombre;
	String tipo;
	int precio;
	
	Instrumentos(){
		
		nombre = "";
		tipo = "";
		precio = 0;
		
	}
	
	void rellenar() {
		
		System.out.println();
		System.out.println("Introducir Instrumento");
		System.out.print("Nombre: ");
		this.nombre=scan.next();
		System.out.print("Tipo: ");
		this.tipo=scan.next();
		System.out.print("Precio: ");
		this.precio=scan.nextInt();
		
		
	}

	void visualizar() {
		
		System.out.println();
		System.out.println("\nInstrumento:" +this.nombre);
		System.out.println("tipo: "+this.tipo);
		System.out.println("precio: "+this.precio);
	}

	boolean precio(int num) {
		
		boolean esmayor = false;		
		if(this.precio > num) {
			esmayor = true;
		}
		return esmayor;
	}
	
}
