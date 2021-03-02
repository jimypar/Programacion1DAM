package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Aeropuerto {

	private Scanner scan = new Scanner(System.in);
	private String nombre;
	private String direccion;
	private ArrayList<Compania> companias;
	
	Aeropuerto(){
		this.nombre = "";
		this.direccion = "";
		this.companias = new ArrayList<Compania>();
	}
	
	Aeropuerto(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.companias =  new ArrayList<Compania>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return "Aeropuerto [nombre=" + nombre + ", companias=" + companias + "]";
	}

	void rellenar() {
		
		System.out.println("Introduce el nombre del aeropuerto");
		this.nombre = scan.nextLine();
		System.out.println("Introduce la direccion:");
		this.direccion = scan.nextLine();
		
		String respuesta="";
		do {
			Compania compania = new Compania();
			compania.rellenar();
			this.companias.add(compania);
			
			System.out.println("Deseas continuar");
			respuesta = scan.nextLine();
			
		} while (respuesta.toLowerCase().trim().equalsIgnoreCase("si"));
		
		
	}

	void visualizar() {
		System.out.println("- Aeropuerto: "+this.nombre);
		System.out.println("- Direccion: "+this.direccion);
		for (Compania compania : companias) {
			compania.visualizar();
		}
		maximo();
	}

	void maximo() {
		int maximo = 0;
		String companiaMax = "";
		for (Compania compania : companias) {
			compania.maximo();
			if (compania.getTotpasj()>maximo) {
				maximo = compania.getTotpasj();
				companiaMax = compania.getNombreComp();
			}			
		}
		System.out.println("Compañia mas grande es "+companiaMax+" con "+maximo+" pasajeros");
	}

	public void ordenarCompanias() {
		
		 for(int i = 0; i<companias.size()-1; i++) {
	         for (int j = i+1; j<companias.size(); j++) {
	            if(companias.get(i).getNombreComp().compareTo(companias.get(j).getNombreComp())>0) {
	               Compania temp = companias.get(i);
	               companias.set(i,companias.get(j));
	               companias.set(j, temp);
	            }
	         }
	      }
		
		 for (Compania compania : companias) {
			 compania.ordenarDestinos();
		}
		 
	}
	
	
}


	