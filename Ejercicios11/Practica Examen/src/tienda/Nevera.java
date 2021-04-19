package tienda;

import java.util.Scanner;

public class Nevera extends Aparato {

	private String descripcion;
	private int numPuertas;

	public Nevera() {
		super();
		this.descripcion = "";
		this.numPuertas = 0;
	}

	public Nevera(int codigo, float pvp, int stock, String descripcion, int numPuertas) {
		super(codigo, pvp, stock);
		this.descripcion = descripcion;
		this.numPuertas = numPuertas;
	}

	public void rellenar() {
		Scanner scan = new Scanner(System.in);

		super.rellenarAparato();
		System.out.println("Descripcion");
		this.descripcion = scan.nextLine();

		boolean error = true;
		do {
			try {
				System.out.println("Numero Puertas: ");
				this.numPuertas = scan.nextInt();
				error = false;
			} catch (Exception e) {
				System.out.println("Introduce un numero");
				scan.next();
				error = true;
			}
		} while (error);

	}

	public void visualizar() {

		super.visualizarAparato();
		System.out.println("Descripcion: " + this.descripcion);
		System.out.println("Numero puertas: " + this.numPuertas);

	}

}
