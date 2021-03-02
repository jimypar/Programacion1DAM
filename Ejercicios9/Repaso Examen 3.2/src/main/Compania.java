package main;

import java.util.ArrayList;
import java.util.Scanner;


public class Compania {

	private int totpasj;
	private Scanner scan = new Scanner(System.in);
	private String nombreComp;
	private ArrayList<Destino> destinos;

	Compania(String nombreComp,int totpasj) {

		this.nombreComp = nombreComp;
		this.totpasj = totpasj;
		this.destinos = new ArrayList<Destino>();
	}

	Compania() {

		this.nombreComp = "";
		this.totpasj = 0;
		this.destinos = new ArrayList<Destino>();
	}

	public String getNombreComp() {
		return nombreComp;
	}

	public void setNombreComp(String nombreComp) {
		this.nombreComp = nombreComp;
	}
	
	public int getTotpasj() {
		return totpasj;
	}

	public void setTotpasj(int totpasj) {
		this.totpasj = totpasj;
	}

	@Override
	public String toString() {
		return "Compania [nombreComp=" + nombreComp + ", destinos=" + destinos + "]";
	}

	public void rellenar() {

		System.out.println("Introduce el nombre de la compañia");
		this.nombreComp = scan.nextLine();
		System.out.println("Vuelos de la compañia "+this.nombreComp);
		System.out.println("Cuantos vuelos tiene la compañia?");
		int nvuelos = scan.nextInt();

		for (int i = 1; i <= nvuelos; i++) {
			Destino destino = new Destino();
			destino.rellenar();
			this.destinos.add(destino);
		}
	}

	void visualizar() {
		System.out.println("   -Compañia: " + this.nombreComp);
		for (Destino destino : destinos) {
			destino.visualizar();
		}
	}
	
	void maximo() {
		
		for (Destino destino : destinos) {
			this.totpasj+=destino.getPasajeros();
		}
		
	}

	public void ordenarDestinos() {
		
		 for(int i = 0; i<destinos.size()-1; i++) {
	         for (int j = i+1; j<destinos.size(); j++) {
	            if(destinos.get(i).getNombreComp().compareTo(destinos.get(j).getNombreComp())>0) {
	               Destino temp = destinos.get(i);
	               destinos.set(i,destinos.get(j));
	               destinos.set(j, temp);
	            }
	         }
	      }
		
	}
	
}
