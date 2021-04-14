package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {

	private String nombreEmpresa;
	private ArrayList<Empleado> empleados;
	private ArrayList<Programador> programadores;

	public Empresa() {
		this.nombreEmpresa = "";
		this.empleados = new ArrayList<Empleado>();
		this.programadores = new ArrayList<Programador>();
	}

	public Empresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
		this.empleados = new ArrayList<Empleado>();
		this.programadores = new ArrayList<Programador>();
	}

	public void rellenarEmpresa() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Nombre de la empresa:");
		this.nombreEmpresa = scan.next();

		String respuesta = null;
		do {
			System.out.println();
			System.out.println("**NUEVO EMPLEADO**");
			Empleado unEmpleado = new Empleado();
			unEmpleado.rellenarEmpleado();
			empleados.add(unEmpleado);
			System.out.println("Deseas continuar?(si/no)");
			respuesta = scan.next();
		} while (respuesta.equalsIgnoreCase("si"));

		respuesta = null;
		do {
			System.out.println();
			System.out.println("**NUEVO PROGRAMADOR");
			Programador prog = new Programador();
			prog.rellenarProg();
			programadores.add(prog);

			System.out.println("Deseas continuar?(si/no)");
			respuesta = scan.next();
		} while (respuesta.equalsIgnoreCase("si"));

	}

	public void visualizarEmpresa() {

		System.out.println("Empresa: " + this.nombreEmpresa);
		System.out.println();
		System.out.println("EMPLEADOS:");
		for (Empleado empleado : empleados) {
			System.out.println();
			empleado.visualizarEmpleado();
		}
		System.out.println();
		System.out.println("PROGRAMADORES:");
		for (Programador prog : programadores) {
			System.out.println();
			prog.visualizarProg();
		}

	}

	public void aumentarPorcentaje(int porcentaje) {
		
		for (Empleado empleado : empleados) {
			empleado.setSalario(empleado.getSalario()+(empleado.getSalario()*porcentaje/100));
		}
		for (Programador programador : programadores) {
			programador.setSalario(programador.getSalario()+(programador.getSalario()*porcentaje/100));
		}
		
		
	}

}
