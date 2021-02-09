package main;

import java.util.Scanner;

public class Coches {

	Scanner scan = new Scanner(System.in);
	
	String marca;
	String modelo;
	int cilindrada;
	
	Coches() {
		marca = "";
		modelo = "";
		cilindrada = 1000;
	}
	

	void rellenar() {

		System.out.println("Introduce:");
		System.out.print("MARCA:");
		this.marca = scan.next();
		System.out.print("MODELO:");
		this.modelo = scan.next();
		System.out.print("CILINDRADA:");
		this.cilindrada = scan.nextInt();
				
	}

	char clasecoche() {
		char clase = ' ';		
		if (this.cilindrada >= 2000) {
			clase = 'A';
			return clase;
		}
		if (this.cilindrada >= 1600 && this.cilindrada < 2000) {
			clase = 'B';
			return clase;
		}
		if (this.cilindrada < 1600) {
			clase = 'C';
			return clase;
		}
		return clase;
	}


	void visualizar() {
		
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Cilindrada: "+this.cilindrada);
		
	}
	
}
