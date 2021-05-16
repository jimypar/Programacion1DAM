package main;

import java.util.Scanner;

public class Profesor extends Persona_class {

	private Departamento departamento;
	private Scanner scan = new Scanner(System.in);

	@Override
	public void rellenar() {

		super.rellenar();

		boolean fin = false;
		do {
			try {
				System.out.println("Introduce el Departamento");
				for (Departamento dpto : Departamento.values()) {
					System.out.println(dpto.toString());
				}
				String undepartamento = scan.next();
				this.departamento = Departamento.valueOf(undepartamento.toUpperCase());
				fin = true;
			} catch (IllegalArgumentException e) {
				fin = false;
			}
		} while (!fin);

	}

	@Override
	public void visualizar() {

		super.visualizar();
		System.out.println(familiaProfesional());

	}

	@Override
	public String familiaProfesional() {

		return this.departamento.toString();
	}

}
