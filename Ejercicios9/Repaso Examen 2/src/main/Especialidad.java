package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Especialidad {
	
	private Scanner scan = new Scanner(System.in);
	private String nombre;
	private ArrayList<Medico> medicos;
	
	Especialidad(){
		this.nombre = "";
		this.medicos = new ArrayList<Medico>();
	}
		
	Especialidad(String nombre) {
		this.nombre = nombre;
		this.medicos = new ArrayList<Medico>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	void rellenar() {
		
		System.out.print("Especialidad: ");
		this.nombre = scan.nextLine();
		
		String respuesta = "";
		do {
			
			Medico medico = new Medico();
			medico.rellenar();
			medicos.add(medico);
			
			System.out.println("Deseas hacer otro medico?");
			respuesta = scan.nextLine();
			
		} while (respuesta.trim().toLowerCase().equalsIgnoreCase("si"));
		
	}
	
	void visualizar() {
		
		System.out.println("   -Especialidad: "+this.nombre);
		
		for (Medico medico : medicos) {
			medico.visualizar();
		}
	}



	public void ordenarMedico() {
		
		for(int i = 0; i<medicos.size()-1; i++) {
	         for (int j = i+1; j<medicos.size(); j++) {
	            if(medicos.get(i).getNombre().compareTo(medicos.get(j).getNombre())>0) {
	               Medico temp = medicos.get(i);
	               medicos.set(i,medicos.get(j));
	               medicos.set(j, temp);
	            }
	         }
	      }
		
	}

}
