package main;

import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Cantidad Nombres");
		int CantidadNombres = scan.nextInt();

		String[] names = new String[CantidadNombres];

		System.out.println("Nombres: ");
		Class.rellenarNombres(names);

		System.out.println("Nombres: ");
		Class.VisualizarNombres(names);

		System.out.println();
		Class.Buscar(names);
		
//		System.out.println("Introduce el nombre a buscar");
//		String name = scan.next();
//		Class.BuscarOtro(names, name);
//		if (Class.BuscarOtro(names, name) == -1) {
//			System.out.println("No se ha encontrado el nombre");
//		} else {
//			System.out.println("Si "+ names[(Class.BuscarOtro(names, name))] +" esta en la posicion " + (+Class.BuscarOtro(names, name) + 1));
//		}

		System.out.print("Nombres: ");
		Class.VisualizarNombres(names);

	}
}