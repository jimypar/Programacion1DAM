package parque;

import java.util.Scanner;

public class ReservaCaza extends Parquenacional {

	private Scanner scan = new Scanner(System.in);
	private int costeLicencia;
	private String tipoArma;

	ReservaCaza() {
		super();
		this.costeLicencia = 0;
		this.tipoArma = "";
	}

	ReservaCaza(String nombre, int km, int numespecie, int coste, String tipo) {
		super(nombre, km, numespecie);
		this.costeLicencia = coste;
		this.tipoArma = tipo;
	}

	@Override
	boolean calcularSubvencion() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce precio entrada: ");
		int precio = scan.nextInt();
		if (this.costeLicencia < precio) {
			return true;
		}
		return false;
	}

	void rellenar() {
		Scanner scan = new Scanner(System.in);
		super.rellenar();

		System.out.println("Introduce coste licencia:");
		this.costeLicencia = scan.nextInt();
		System.out.println("Introduce tipo arma: ");
		this.tipoArma = scan.next();
		
		
	}

	void visualizar() {
		super.visualizar();
		System.out.println("El coste de la licencia es " + this.costeLicencia);
		System.out.println("El tipo de arma es " + this.tipoArma);
		if (calcularSubvencion()) {
			System.out.println("Hay subvencion.");
		} else {
			System.out.println("No hay subvencion");
		}
		
	}
}
