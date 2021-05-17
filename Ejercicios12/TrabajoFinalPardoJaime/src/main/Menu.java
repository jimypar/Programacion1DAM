package main;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;
import objetos.Database;
import objetos.Mesa;

public class Menu {

	private Scanner scan = new Scanner(System.in);

	public void menuPrincipal(ArrayList<Mesa> mesas) {
		
		Database.crearBase();
		Properties p = Database.usarBase();
		Connection c = Database.crearConexion(p);
		Database.createTable(c);

		do {
			int menu = 0;
			boolean error = false;
			do {
				try {
					System.out.println();
					System.out.println("Que deseas hacer?");
					System.out.println("1-Añadir mesa");
					System.out.println("2-Ver mesas");
					System.out.println("3-Modificar mesa");
					System.out.println("5-Salir");
					menu = scan.nextInt();
					error = false;
				} catch (InputMismatchException e) {
					error = true;
					scan.nextLine();
				}
			} while (error);

			switch (menu) {
			case 1:
				añadirMesa(mesas);
				break;
			case 2:
				visualizar(mesas);
				break;
			case 3:
				menuMesa(mesas,c);
				break;
			case 4:
				Database.cerrar_conexion(c);
				System.exit(0);
			}
		} while (true);

	}

	private void añadirMesa(ArrayList<Mesa> mesas) {

		mesas.add(new Mesa(mesas.size() + 1));
		System.out.println("Se ha añadido la mesa " + mesas.size());
	}

	private void visualizar(ArrayList<Mesa> mesas) {
		
		for (Mesa mesa : mesas) {
			System.out.println("Mesa " +mesa.getNumero());
			System.out.println(mesa.visualizarMesa());
		}
		
	}

	public void menuMesa(ArrayList<Mesa> mesas, Connection c) {

		int numMesa = -1;
		do {
			int busqueda = 0;
			boolean error = false;
			do {
				try {
					System.out.println();
					System.out.println("RESTAURANTE JAIME PARDO:");
					System.out.println("Elige una mesa:");
					visualizar(mesas);
					System.out.print("\nMesa :");
					busqueda = scan.nextInt();
					error = false;
				} catch (InputMismatchException e) {
					error = true;
					scan.nextLine();
				}
			} while (error);

			for (int i = 0; i < mesas.size(); i++) {
				if (mesas.get(i).getNumero() == busqueda) {
					numMesa = i;
				}
			}
		} while (numMesa == -1);

		do {
			int menu = 0;
			boolean error = false;
			do {
				try {
					System.out.println();
					System.out.println("Que deseas hacer?");
					System.out.println("1-Añadir platos");
					System.out.println("2-Ver pedido");
					System.out.println("3-Entregar plato");
					System.out.println("4-Modificar plato");
					System.out.println("5-Eliminar plato");
					System.out.println("6-Pagar la cuenta");
					System.out.println("7-Limpiar mesa");
					System.out.println("8-Salir");
					menu = scan.nextInt();
					error = false;
				} catch (InputMismatchException e) {
					error = true;
					scan.nextLine();
				}
			} while (error);

			switch (menu) {
			case 1:
				mesas.get(numMesa).añadirPlato(c);
				break;
			case 2:
				System.out.println(mesas.get(numMesa).visualizarMesa());
				break;
			case 3:
				System.out.println(mesas.get(numMesa).visualizarMesa());
				mesas.get(numMesa).entregarPlato();
				break;
			case 4:
				System.out.println(mesas.get(numMesa).visualizarMesa());
				mesas.get(numMesa).remplazarPlato();
				break;
			case 5:
				System.out.println(mesas.get(numMesa).visualizarMesa());
				mesas.get(numMesa).eliminarPlato();
				break;
			case 6:
				System.out.println(mesas.get(numMesa).visualizarMesa());
				System.out.println("Total: " + mesas.get(numMesa).cuenta() + "€");
				break;
			case 7:
				mesas.get(numMesa).vaciar();
				break;
			case 8:
				menuPrincipal(mesas);
				break;
			default:
				break;
			}

		} while (true);

	}

}
