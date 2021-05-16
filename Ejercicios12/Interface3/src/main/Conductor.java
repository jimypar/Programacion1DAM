package main;

import java.util.Scanner;

public class Conductor {

	private String nombre;
	private int salario;
	private Scanner scan = new Scanner(System.in);

	public Conductor() {
		super();
		this.nombre = "";
		this.salario = 0;
	}

	public Conductor(String nombre, int salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}

	public void rellenar() {

		System.out.println("Introduce el nombre: ");
		this.nombre = scan.next();
		System.out.println("Introduce el salario:");
		this.salario = scan.nextInt();

	}

	public String getNombre() {
		return nombre;
	}

	public int getSalario() {
		return salario;
	}

}
