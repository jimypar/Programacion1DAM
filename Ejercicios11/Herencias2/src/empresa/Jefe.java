package empresa;

import java.util.Scanner;

public class Jefe extends Empleado {

	private Departamentos departamento;

	public Jefe() {
		super();
		this.departamento = null;
	}

	public Jefe(String nombre, int sueldo, Departamentos departamento) {
		super(nombre, sueldo);
		this.departamento = departamento;
	}

	void rellenarJefe() {

		Scanner scan = new Scanner(System.in);

		super.rellenarEmpleado();
		boolean fin = false;
		do {
			try {
				System.out.println("Introduce el departamento: " + "\n(INFORMATICO,QUIMICO o FISICO) ");
				String dpto = scan.next();
				this.departamento = Departamentos.valueOf(dpto.toUpperCase());
				fin = true;
			} catch (IllegalArgumentException e) {
				fin = false;
			}
		} while (!fin);

	}

	void visualizarJefe() {

		super.visualizarEmpleado();
		System.out.println("Dpto: " + this.departamento);
		System.out.println("   - " + this.departamento.getCodigo());
		System.out.println("   - " + this.departamento.getDescripcion());

	}

}
