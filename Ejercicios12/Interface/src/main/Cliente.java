package main;

import java.util.Scanner;

public class Cliente extends Persona_class implements Persona_interface {

	private String cif;
	private Scanner scan = new Scanner(System.in);

	@Override
	public void rellenar() {

		super.rellenar();
		System.out.println("Introduce el CIF:");
		this.cif = scan.next();
	}

	@Override
	public void visualizar() {

		super.visualizar();
		System.out.println("CIF: " + this.cif);

	}

	@Override
	public void calcularBonificacion() {

	}

}
