package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Compania {

	private Scanner scan = new Scanner(System.in);
	private String nombre;
	private int totalPasj;
	private ArrayList<Destino> destinos;
	
	public Compania() {
		this.totalPasj = 0;
		this.nombre = "";
		this.destinos = new ArrayList<Destino>();
	}
	
	public Compania(String nombre) {
		this.nombre = nombre;
		this.destinos = new ArrayList<Destino>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getTotalPasj() {
		return totalPasj;
	}

	public void setTotalPasj(int totalPasj) {
		this.totalPasj = totalPasj;
	}
	
	public ArrayList<Destino> getDestinos() {
		return destinos;
	}

	public void setDestinos(ArrayList<Destino> destinos) {
		this.destinos = destinos;
	}

	public void rellenar() {
		
		System.out.println("Introduce el nombre compañia:");
		this.nombre = scan.nextLine();

		String respuesta = "";
		do {
			Destino destino = new Destino();
			destino.rellenar();
			this.destinos.add(destino);

			System.out.println("Deseas continuar");
			respuesta = scan.nextLine();

		} while (respuesta.toLowerCase().trim().equalsIgnoreCase("si"));
		
	}

	public void visualizar() {
		
		System.out.println("Compañia: "+this.nombre);
		
		for (Destino destino : destinos) {
			destino.visualizar();
		}
		
	}

	 void ordenar() {
		 
		 for (int i = 0; i < destinos.size() - 1; i++) {
				for (int j = i + 1; j < destinos.size(); j++) {
					if (destinos.get(i).getNombre().compareTo(destinos.get(j).getNombre()) > 0) {
						Destino temp = destinos.get(i);
						destinos.set(i, destinos.get(j));
						destinos.set(j, temp);
					}
				}
			}
		
	}
	 
	 void total() {
		 
		 for (Destino destino : destinos) {
			this.totalPasj+=destino.getPasajeros();
		}
		 
	 }

	public void modificar(String busca) {
		
		for (Destino destino : destinos) {
			if(destino.getNombre().equalsIgnoreCase(busca)) {
				System.out.println("Que nombre quieres poner a:"+busca);
				String nuevo = scan.nextLine();
				destino.setNombre(nuevo);
			}
		}
		
	}
	
	
}
