package main;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;
import objetos.Database;
import objetos.Mesa;

/**
 * Clase Menu
 * 
 * @author Jaime
 * @version
 * @since 1.8
 */
public class Menu {

	private Scanner scan = new Scanner(System.in);
	private Properties p = Database.usarBase();
	private Connection c = Database.crearConexion(p);

	
	/**
	 * Borra la base si existiese y crea las tablas necesarias.
	 */
	public void crearDatabase() {

		Database.deleteTable(c);
		Database.createTable(c);

	}

	/**
	 * Menu principal del programa
	 */
	public void menuPrincipal(ArrayList<Mesa> mesas) {

		do {
			int menu = 0;
			boolean error = false;
			do {
				try {
					System.out.println();
					System.out.println("Que deseas hacer?");
					System.out.println("1-A�adir mesa");
					System.out.println("2-Ver mesas");
					System.out.println("3-Modificar mesa");
					System.out.println("4-Consultar Base Datos");
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
				a�adirMesa(mesas);
				break;
			case 2:
				visualizar(mesas);
				break;
			case 3:
				menuMesa(mesas);
				break;
			case 4:
				menuBase(mesas);
				break;
			case 5:
				Database.cerrar_conexion(c);
				System.exit(0);
			}
		} while (true);

	}

	/**
	 * A�ade una mesa al ArrayList.
	 * 
	 * @param mesas ArrayList de mesas del restaurante
	 */
	private void a�adirMesa(ArrayList<Mesa> mesas) {

		mesas.add(new Mesa(mesas.size() + 1));
		System.out.println("Se ha a�adido la mesa " + mesas.size());
	}

	/**
	 * Visualiza cada mesa con sus platos.
	 * 
	 * @param mesas ArrayList de mesas del restaurante
	 */
	private void visualizar(ArrayList<Mesa> mesas) {

		for (Mesa mesa : mesas) {
			System.out.println("Mesa " + mesa.getNumero());
			System.out.println(mesa.visualizarMesa());
		}

	}

	/**
	 * 
	 * Menu para operar con una mesa.
	 * 
	 * @param mesas ArrayList de mesas del restaurante
	 */
	public void menuMesa(ArrayList<Mesa> mesas) {

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
					System.out.println("1-A�adir platos");
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
				mesas.get(numMesa).a�adirPlato(this.c);
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
				mesas.get(numMesa).remplazarPlato(c);
				break;
			case 5:
				System.out.println(mesas.get(numMesa).visualizarMesa());
				mesas.get(numMesa).eliminarPlato(c);
				break;
			case 6:
				System.out.println(mesas.get(numMesa).visualizarMesa());
				System.out.println("Total: " + mesas.get(numMesa).cuenta() + "�");
				break;
			case 7:
				mesas.get(numMesa).vaciar(c);
				break;
			case 8:
				menuPrincipal(mesas);
				break;
			default:
				break;
			}

		} while (true);

	}

	/**
	 * 
	 * Menu para realizar consultas en la base de datos.
	 * 
	 * @param mesas ArrayList de mesas del restaurante.
	 */
	private void menuBase(ArrayList<Mesa> mesas) {

		do {
			int menu = 0;
			boolean error = false;
			do {
				try {
					System.out.println();
					System.out.println("Que deseas hacer?");
					System.out.println("1-Consultar menu");
					System.out.println("2-Consultar bebidas");
					System.out.println("3-Consultar carne");
					System.out.println("4-Consultar pescado");
					System.out.println("5-Consultar postres");
					System.out.println("6-Salir");
					menu = scan.nextInt();
					error = false;
				} catch (InputMismatchException e) {
					error = true;
					scan.nextLine();
				}
			} while (error);

			switch (menu) {
			case 1:
				Database.visualizarMenu(this.c);
				break;
			case 2:
				Database.consultaPlato(this.c, 5, 0);
				break;
			case 3:
				Database.consultaPlato(this.c, 15, 5);
				break;
			case 4:
				Database.consultaPlato(this.c, 25, 14);
				break;
			case 5:
				Database.consultaPlato(this.c, 31, 24);
				break;
			case 6:
				menuPrincipal(mesas);
				break;
			default:
				break;
			}

		} while (true);

	}

}
