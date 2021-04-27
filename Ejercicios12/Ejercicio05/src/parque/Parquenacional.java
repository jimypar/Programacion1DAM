package parque;

import java.util.Scanner;

public abstract class Parquenacional {

	private Scanner scan = new Scanner(System.in);
	private int km;
	private int numeroEspecies;
	private String nombre;

	Parquenacional() {
		this.nombre = "";
		this.km = 0;
		this.numeroEspecies = 0;
	}

	Parquenacional(String nombre, int km, int numeroEspecies) {
		this.nombre = nombre;
		this.km = km;
		this.numeroEspecies = numeroEspecies;
	}

	void rellenar() {
		
		

		System.out.println("Introduce km:");
		this.km = scan.nextInt();
		System.out.println("Introduce numero de especies:");
		this.numeroEspecies = scan.nextInt();
		System.out.println("Introduce el nombre: ");
		this.nombre = scan.next();

	}

	void visualizar() {

		System.out.println("Nombre: " + this.nombre);
		System.out.println("KM: " + this.km);
		System.out.println("Numero especies:" + this.numeroEspecies);

	}

	abstract boolean calcularSubvencion();
}
