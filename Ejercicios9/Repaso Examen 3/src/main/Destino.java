package main;


public class Destino {

	private String nombre;
	private int pasajeros;
	
	Destino(){
		this.nombre = "";
		this.pasajeros = 0;
	}
	
	Destino(String name, int pasajeros) {
		this.nombre = name;
		this.pasajeros = pasajeros;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	void visualizar() {
		
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Pasajero: "+this.pasajeros);
		
	}
	
	
}
