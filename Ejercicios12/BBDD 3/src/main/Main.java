package main;

import java.sql.Connection;
import java.util.Properties;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Database database = new Database();

		Properties p = database.usarBase();
		Connection c = database.crearConexion(p);
		
		do {	
			int opcion = menu();
			switch (opcion) {
			case 1:
				database.createTable(c);
				break;
			case 2:
				database.addData(c);
				break;
			case 3:
				database.visualizar(c);
				break;
			case 4:
				database.modificar(c);
				break;
			case 5:
				database.delete(c);
				break;
			default:
				System.exit(0);
				break;
			}
		} while (true);
		
		
		

	}

	private static int menu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.out.println("MENU");
		System.out.println("1. Crear tabla");
		System.out.println("2. Insertar valores");
		System.out.println("3. Visualizar");
		System.out.println("4. Modificar");
		System.out.println("5. Eliminar");
		System.out.println("6. Salir");
		System.out.println("");
		int opcion = scan.nextInt();
		
		return opcion;
	}
}
