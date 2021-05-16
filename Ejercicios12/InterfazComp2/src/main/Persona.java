package main;

import java.util.Scanner;

public class Persona implements Comparable<Persona> {

	private String nombre;
	private byte edad;
	private String dni;
	private Scanner scan = new Scanner(System.in);

	public byte getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.dni = "";
	}

	public Persona(String nombre, byte edad, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}

	void rellenar() {

		System.out.println("Introduce el nombre: ");
		this.nombre = scan.next();
		System.out.println("Introduce la edad: ");
		this.edad = scan.nextByte();
		System.out.println("Introduce el dni: ");
		this.dni = scan.next();

	}

	void visualizar() {

		System.out.println("Nombre " + this.nombre);
		System.out.println("Edad " + this.edad);
		System.out.println("Dni: " + this.dni);

	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Edad: " + edad + ", DNI: " + dni;
	}

	public int compareTo(Persona persona) {
		if (this.edad > persona.getEdad()) {
			return 1;
		} else if (this.edad < persona.getEdad()) {
			return -1;
		} else {
			if (this.dni.compareTo(persona.getDni()) < 0) {
				return 1;
			} else if (this.dni.compareTo(persona.getDni()) > 0) {
				return -1;
			}
		}
		return 0;
	}

}
