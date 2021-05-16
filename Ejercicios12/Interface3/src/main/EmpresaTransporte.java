package main;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpresaTransporte {

	private String nombreEmpresa;
	private ArrayList<Autobus_class> autobuses = new ArrayList<Autobus_class>();
	private Scanner scan = new Scanner(System.in);

	public void rellenar() {

		System.out.println("Introduce el nombre de la empresa: ");
		this.nombreEmpresa = scan.next();

		String respuesta = null;
		do {
			System.out.println("Que deseas crear:");
			System.out.println("1. Urbano");
			System.out.println("2. Interurbano");
			int menu = scan.nextInt();
			if (menu == 1) {
				Urbano urbano = new Urbano();
				urbano.rellenar();
				autobuses.add(urbano);
			}
			if (menu == 2) {
				Interurbanos interurbanos = new Interurbanos();
				interurbanos.rellenar();
				autobuses.add(interurbanos);
			}

			System.out.println("Deseas continuar?(si/no)");
			respuesta = scan.next();
		} while (respuesta.equalsIgnoreCase("si"));

	}

	public void visualiar() {

		System.out.println("Empresa: " + this.nombreEmpresa);

		for (Autobus_class autobus : autobuses) {
			if (autobus.getClass().getSimpleName().equals("Urbano")) {
				System.out.println("AUTOBUS URBANO: ");
			}
			if (autobus.getClass().getSimpleName().equals("Interurbano")) {
				System.out.println("AUTOBUS INTERURBANO: ");
			}
			autobus.visualizar();

		}

	}

}
