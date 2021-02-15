package coche;

import java.util.Scanner;

public class Coches {

	Scanner scan = new Scanner(System.in);
	
	public String marca;
	public String modelo;
	public int cilindrada;
	
	public Coches() {
		this.marca = "";
		this.modelo = "";
		this.cilindrada = 1000;
	}
	

	public void rellenar() {

		System.out.println("Introduce:");
		System.out.print("MARCA:");
		this.marca = scan.next();
		System.out.print("MODELO:");
		this.modelo = scan.next();
		System.out.print("CILINDRADA:");
		this.cilindrada = scan.nextInt();
				
	}

	public char clasecoche() {	
		if (this.cilindrada >= 2000) {			
			return 'A';
		}
		if (this.cilindrada >= 1600 && this.cilindrada < 2000) {
			return 'B';
		}
		if (this.cilindrada < 1600) {
			return 'C';
		}
		return ' ';
	}


	public void visualizar() {
		System.out.println("----------------");
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Cilindrada: "+this.cilindrada);
		System.out.println("----------------");
		
	}
	
}
