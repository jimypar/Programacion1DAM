package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Destino {

	private Scanner scan = new Scanner(System.in);
	private String nombreDest;
	private int pasajeros;
	
	
	Destino(){
		this.nombreDest = "";
		this.pasajeros = 0;
	}
	
	Destino(String nombreComp, int pasajeros) {
		
		this.nombreDest = nombreComp;
		this.pasajeros = pasajeros;
	}

	public String getNombreComp() {
		return nombreDest;
	}

	public void setNombreComp(String nombreComp) {
		this.nombreDest = nombreComp;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	@Override
	public String toString() {
		return "Destino [nombreComp=" + nombreDest + ", pasajeros=" + pasajeros + "]";
	}
	
	void rellenar() {
		
		System.out.println("Introduce el nombre del destino");
		this.nombreDest = scan.nextLine();
		
			boolean error=false;
			do {
				try {
					System.out.println("Introduce el numero de pasajeros");
					this.pasajeros = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Error de formato");
					error=true;
				} catch (Exception e) {
					System.out.println("Error de teclado");
					error=true;
				} 
			} while (error);
			
		
	}
	
	void visualizar() {
		System.out.println("      -Destino: "+this.nombreDest);
		System.out.println("      -Pasajeros: "+this.pasajeros);
	}
	
	
}
