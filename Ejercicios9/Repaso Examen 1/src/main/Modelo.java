package main;

import java.util.Scanner;



public class Modelo {
	

	private Scanner scan = new Scanner(System.in);
	private String nombre;
	private int stock;
	
	Modelo(){
		this.nombre = "";
		this.stock = 0;
	}
	
	void rellenar() {
		boolean continuar = true;
		do {
			System.out.println("Introduce nombre del modelo: ");
			this.nombre = scan.nextLine();
			System.out.println("Introduce stock");
			int num = scan.nextInt();
			this.stock = num;
			if (num > Marca.max) {
				Marca.max = num;
			}
			System.out.println("Deseas continuar?");
			String respuesta = scan.nextLine();
			if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
				continuar=false;
			}
		} while (continuar);
		
	}

	public void visualizar() {
		
		System.out.println("Modelo: "+this.nombre);
		System.out.println("Stock: "+this.stock);
		
	
	}
	
	
	
	
}
