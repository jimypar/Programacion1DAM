package main;

import java.util.Scanner;

public class Estudiante extends Persona_class {

	private Ciclos ciclo;
	private int curso;
	private Scanner scan = new Scanner(System.in);

	@Override
	public void rellenar() {

		super.rellenar();

		boolean fin = false;
		do {
			try {
				System.out.println("Introduce el Departamento");
				for (Ciclos ciclo : Ciclos.values()) {
					System.out.println(ciclo.toString());
				}
				String unciclo = scan.next();
				this.ciclo = Ciclos.valueOf(unciclo.toUpperCase());
				fin = true;
			} catch (IllegalArgumentException e) {
				fin = false;
			}
		} while (!fin);

		System.out.println("Introduce el ciclo");
		this.curso = scan.nextInt();

	}

	@Override
	public void visualizar() {

		super.visualizar();
		System.out.println("Ciclo: " + this.ciclo);
		System.out.println("Curso: " + this.curso);
		System.out.println("Curso: " + familiaProfesional());

	}

	@Override
	public String familiaProfesional() {

		if (this.curso == 1) {
			return "Informatica";
		}
		if (this.curso == 2) {
			return "Marketing";
		}
		return null;

	}

}
