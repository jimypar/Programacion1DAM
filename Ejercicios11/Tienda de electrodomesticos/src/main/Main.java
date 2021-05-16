package main;

import java.util.Scanner;

import tienda.Tienda;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Tienda unaTienda= new Tienda();
		int opcion;
		do {
			opcion= menu();
			switch(opcion){
				case 1: 
					System.out.println("**RELLENAR DATOS DE LA TIENDA **");
					unaTienda.rellenar();
					break;
				case 2: 
					System.out.println("**VISUALIZAR DATOS DE LA TIENDA **");
					unaTienda.visualizar();
					break;
				case 3:
					unaTienda.crearRAF();
					System.out.println("**DATOS DEL ARCHIVO **");
					unaTienda.visualizarRAF();
					unaTienda.modificarRAF();
					System.out.println("**DATOS DEL ARCHIVO MODIFICADO **");
					unaTienda.visualizarRAF();
					
					break;
				default:
					System.out.println("Error en opcion");
			}
			System.out.println("Pulse una tecla para continuar...");
			in.nextLine();
		}while(opcion!=5);
	}

	private static int menu() {
		int opcion=0;
		Scanner in = new Scanner(System.in);
		System.out.println(" MENÚ " +
		"\n1. Rellenar aparatos electrónicos en una lista" + 
		"\n2. Visualizar la lista" +
		"\n3. Manipular archivo RAF " +
		"\n5. Salir "+
		"Elegir opción:");
		opcion=in.nextInt();
		return opcion;
	}
}
