package main;

import java.util.Scanner;

public class Medico {

	private Scanner scan = new Scanner(System.in);
	private String nombre;
	private String apellido;
	
	Medico(){
		this.nombre = "";
		this.apellido = "";
	}
	
	Medico(String nombre,String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	void rellenar() {
		
		System.out.print("Medico: ");
		this.nombre = scan.nextLine();
		System.out.print("Direccion: ");
		this.apellido = scan.nextLine();
		
	}
	
	void visualizar() {
		
		System.out.println("      -Nombre: "+this.nombre);	
		System.out.println("      -Apellido: "+this.apellido);
		
	}
	
	
}
