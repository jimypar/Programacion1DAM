package empresa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programador extends Empleado {

	private int LineasPorHora;
	private Lenguajes lenguaje;

	public Programador() {
		super();
		this.LineasPorHora = 0;
		this.lenguaje = null;
	}

	public Programador(String nombre, int edad, boolean casado, double salario, int LineasPorHora, Lenguajes lenguaje) {
		super(nombre, edad, casado, salario);
		this.LineasPorHora = LineasPorHora;
		this.lenguaje = lenguaje;
	}

	void rellenarProg() {

		Scanner scan = new Scanner(System.in);

		super.rellenarEmpleado();
		boolean fin = false;
		do {
			try {
				System.out.println("Lineas por hora: ");
				this.LineasPorHora = scan.nextInt();
				fin = true;
			} catch (InputMismatchException e) {
				fin = false;
				scan.next();
			}
		} while (!fin);
		fin = false;
		do {
			try {
				System.out.println("Introduce el departamento: " + "\n(PHP,JAVA,C o BASIC) ");
				String leng = scan.next();
				this.lenguaje = Lenguajes.valueOf(leng.toUpperCase());
				fin = true;
			} catch (IllegalArgumentException e) {
				fin = false;
			}
		} while (!fin);

	}

	void visualizarProg() {

		super.visualizarEmpleado();
		System.out.println("Lineas por hora: " + this.LineasPorHora);
		System.out.println("Lenguaje: " + this.lenguaje);

	}

}
