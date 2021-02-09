package main;

import java.util.Scanner;

public class Libros{

	Scanner scan = new Scanner(System.in);
	
	String titulo;
	String autor;
	String genero;
	boolean premiado;
	int pvpsindescuento;
	double descuento;
	
	int cilindrada;
	
	Libros() {
		titulo = "";
		autor = "";
		genero = "Narrativa";
		premiado = false;
		pvpsindescuento = 0;
		descuento = 0;
	}
	

	void rellenar() {

		System.out.println("Introduce:");
		System.out.print("Titulo:");
		this.titulo = scan.next();
		System.out.print("Autor:");
		this.autor = scan.next();
		System.out.print("Genero:");
		this.genero = scan.next();
		System.out.print("Premiado (true/false):");
		this.premiado = scan.nextBoolean();
		System.out.print("PVP sin descuento:");
		this.pvpsindescuento = scan.nextInt();
		
				
	}
	
	void preciofinal() {
		
		if (this.premiado) {
			this.descuento= this.pvpsindescuento-(this.pvpsindescuento * 0.2);
		}
		else {
			this.descuento= this.pvpsindescuento-(this.pvpsindescuento * 0.1);
		}
		
	}
	

	void visualizar() {
		
		System.out.println("Titulo: "+this.titulo);
		System.out.println("Autor: "+this.autor);
		System.out.println("Genero: "+this.genero);
		System.out.println("Premiado?: "+this.premiado);
		System.out.println("PVP sin descuento: "+this.pvpsindescuento);
		System.out.println("Con descuento: "+this.descuento);
	}


	
}
