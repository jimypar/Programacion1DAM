package colegio;

import java.util.Scanner;

public class Profesor extends Persona {

	private Departamentos departamento;

	public Profesor() {
		this.departamento = null;
	}

	public Profesor(String nombre, String apellido, Departamentos departamento) {
		super(nombre, apellido);
		this.departamento = departamento;
	}

	public void rellenarProfesor() {

		super.rellenarPersona();

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		boolean fin = false;
		do {
			try {
				System.out.println("Introduce el departamento: ");
				for (Departamentos unDepto : Departamentos.values()) {
					System.out.println(unDepto.toString());
				}
				String dpto = scan.next();
				this.departamento = Departamentos.valueOf(dpto.toUpperCase());
				fin = true;
			} catch (IllegalArgumentException e) {
				System.out.println("Introduce un departamento valido");
				fin = false;
			}
		} while (!fin);

	}

	public void visualizarProfesor() {

		super.visualizarPersona();
		System.out.println("Departamento: " + this.departamento.toString());

	}

}
