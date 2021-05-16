package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {

	private ArrayList<Persona_class> personas = new ArrayList<Persona_class>();
	private String nombreEmpresa;
	private Scanner scan = new Scanner(System.in);

	void rellenar() {

		System.out.println("Nombre de empresa");
		this.nombreEmpresa = scan.next();
		
		Persona_class persona = new Persona_class();
		persona.rellenar();
		personas.add(persona);

		Empleado empleado = new Empleado();
		empleado.rellenar();
		personas.add(empleado);

		Cliente cliente = new Cliente();
		cliente.rellenar();
		personas.add(cliente);

	}

	void visualizar() {
		
		System.out.println("EMPRESA: "+this.nombreEmpresa);
		
		for (Persona_class persona : personas) {
			if (persona.getClass().getSimpleName().equals("Cliente")) {
				System.out.println();
				System.out.println("CLIENTE: ");
				System.out.println();
			}
			if (persona.getClass().getSimpleName().equals("Empleado")) {
				System.out.println();
				System.out.println("EMPLEADO: ");
				System.out.println();
			}
			persona.visualizar();
		}

	}

}
