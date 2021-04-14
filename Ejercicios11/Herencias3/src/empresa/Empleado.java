package empresa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Empleado {

	private String nombre;
	private int edad;
	private boolean casado;
	private double salario;

	public Empleado() {
		this.nombre = "";
		this.edad = 0;
		this.casado = false;
		this.salario = 0;
	}

	public Empleado(String nombre, int edad, boolean casado, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	void rellenarEmpleado() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Nombre: ");
		this.nombre = scan.next();

		boolean fin = false;
		do {
			try {
				int edad;
				do {
					System.out.println("Edad: ");
					edad = scan.nextInt();
				} while (edad < 18 || edad > 45);
				this.edad = edad;
				fin = true;
			} catch (InputMismatchException e) {
				fin = false;
				scan.next();
			}
		} while (!fin);
		fin = false;
		do {
			System.out.println("Esta casado?");
			String casado = scan.next();
			if (casado.trim().toLowerCase().equalsIgnoreCase("si")) {
				this.casado = true;
				fin = true;
			}
			if (casado.trim().toLowerCase().equalsIgnoreCase("no")) {
				this.casado = false;
				fin = true;
			}
		} while (!fin);

		fin = false;

		do {
			try {
				double salario;
				System.out.println("Salario:");
				salario = scan.nextDouble();
				this.salario = salario;
				fin = true;
			} catch (InputMismatchException e) {
				fin = false;
				scan.next();
			}
		} while (!fin);

	}

	void visualizarEmpleado() {

		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Clasificacion: " + clasificacion(this.edad));
		if (this.casado) {
			System.out.println("Casado: si");
		}
		else {
			System.out.println("Casado: no");
		}
		System.out.println("Salario: " + this.salario);

	}

	private String clasificacion(int edad) {

		if (edad <= 21) {
			return "Principiante";
		}
		if (edad >= 22 && edad <= 35) {
			return "Intermedio";
		}
		if (edad > 35) {
			return "Senior";
		}
		return "";
	}
}
