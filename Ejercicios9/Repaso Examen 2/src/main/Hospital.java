package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
	
	private Scanner scan = new Scanner(System.in);
	private String nombre;
	private String direccion;
	private ArrayList<Especialidad> especialidades;
	
	Hospital(){
		this.nombre="";
		this.direccion="";
		this.especialidades = new ArrayList<Especialidad>();
	}
	
	Hospital(String nombre,String direccion){
		this.nombre=nombre;
		this.direccion=direccion;
		this.especialidades = new ArrayList<Especialidad>();
	}
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	void rellenar() {
		
		System.out.print("Hospital: ");
		this.nombre = scan.nextLine();
		System.out.print("Direccion: ");
		this.direccion = scan.nextLine();
		
		String respuesta = "";
		do {
			
			Especialidad especialidad = new Especialidad();
			especialidad.rellenar();
			especialidades.add(especialidad);
			
			System.out.println("Deseas hacer otra especialidad?");
			respuesta = scan.nextLine();
			
		} while (respuesta.trim().toLowerCase().equalsIgnoreCase("si"));
		
	}
	
	void visualizar() {
		
		System.out.println("- Hospital: "+this.nombre);
		System.out.println("- Direccion: "+this.direccion);
		
		for (Especialidad especialidad : especialidades) {
			especialidad.visualizar();
		}
		
	}

	public void ordenarEspecialidad() {
		
		for(int i = 0; i<especialidades.size()-1; i++) {
	         for (int j = i+1; j<especialidades.size(); j++) {
	            if(especialidades.get(i).getNombre().compareTo(especialidades.get(j).getNombre())>0) {
	               Especialidad temp = especialidades.get(i);
	               especialidades.set(i,especialidades.get(j));
	               especialidades.set(j, temp);
	            }
	         }
	      }
		
		for (Especialidad especialidad : especialidades) {
			especialidad.ordenarMedico();
		}
		
	}
	
	
	
	
}
