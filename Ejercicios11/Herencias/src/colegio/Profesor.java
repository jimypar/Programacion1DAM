package colegio;

import java.util.Scanner;

public class Profesor extends Persona {

	private float salario;
	private String departamento;

	public Profesor() {
		this.salario = 0;
		this.departamento = "";
	}

	public Profesor(String nombre, String apellido,float salario,String departamento) {
		super(nombre, apellido);
		this.salario = salario;
		this.departamento = departamento;
	}

	public void rellenarProfesor() {

		super.rellenarPersona();

		Scanner scan = new Scanner(System.in);
		System.out.println("Salario:");
		this.salario = scan.nextFloat();
		System.out.println("Depto:");
		this.departamento = scan.next();

	}

	public void visualizarProfesor() {

		super.visualizarPersona();
		System.out.println("Salario: " + this.salario);
		System.out.println("Departamento: " + this.departamento);

	}

}
