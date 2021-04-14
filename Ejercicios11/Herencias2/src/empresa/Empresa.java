package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {

	private String nombreEmpresa;
	private ArrayList<Empleado> empleados;
	private ArrayList<Jefe> jefes;

	public Empresa() {
		this.nombreEmpresa = "";
		this.empleados = new ArrayList<Empleado>();
		this.jefes = new ArrayList<Jefe>();
	}

	public Empresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
		this.empleados = new ArrayList<Empleado>();
		this.jefes = new ArrayList<Jefe>();
	}

	public void rellenarEmpresa() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Nombre de la empresa:");
		this.nombreEmpresa = scan.next();

		String respuesta = null;
		do {
			Empleado unEmpleado = new Empleado();
			unEmpleado.rellenarEmpleado();
			empleados.add(unEmpleado);

			System.out.println("Deseas continuar?(si/no)");
			respuesta = scan.next();
		} while (respuesta.equalsIgnoreCase("si"));

		respuesta = null;
		do {
			Jefe unJefe = new Jefe();
			unJefe.rellenarJefe();
			jefes.add(unJefe);

			System.out.println("Deseas continuar?(si/no)");
			respuesta = scan.next();
		} while (respuesta.equalsIgnoreCase("si"));

	}

	public void visualizarEmpresa() {
		
		System.out.println("Empresa: "+this.nombreEmpresa);
		for (Empleado empleado : empleados) {
			System.out.println();
			empleado.visualizarEmpleado();
		}
		for (Jefe jefe : jefes) {
			System.out.println();
			jefe.visualizarJefe();
		}

	}

}
