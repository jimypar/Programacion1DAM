package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
	
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
	
	void rellenar() {
		
		
		
	}
	
	void visualizar() {
		
		
	}
	
	
}
