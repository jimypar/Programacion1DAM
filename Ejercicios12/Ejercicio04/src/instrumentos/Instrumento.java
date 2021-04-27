package instrumentos;

import java.util.Scanner;

public abstract class Instrumento {

	private String nombre;
	private String familia;

	public Instrumento() {
		this.nombre = "";
		this.familia = "";
	}

	public Instrumento(String nombre, String familia) {
		this.nombre = nombre;
		this.familia = familia;
	}

	void rellenar() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce el nombre: ");
		this.nombre = scan.next();
		System.out.println("Introduce la familia: ");
		this.familia = scan.next();

	}

	void visualizar() {

		System.out.println("Nombre: " + this.nombre);
		System.out.println("Familia: " + this.familia);

	}

	abstract void sonar();

}
