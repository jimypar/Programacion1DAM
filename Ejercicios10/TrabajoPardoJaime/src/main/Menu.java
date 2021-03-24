package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import objetos.Archivo;
import objetos.Mesa;

public class Menu {

	private Scanner scan = new Scanner(System.in);

	public void menuPrincipal(ArrayList<Mesa> mesas, Archivo carta, Archivo log) {

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
					System.out.println("4-Salir");
					menu = scan.nextInt();
					error = false;
				} catch (InputMismatchException e) {
					error = true;
					scan.nextLine();
				}
			} while (error);

			switch (menu) {
			case 1:
				añadirMesa(mesas, log);
				break;
			case 2:
				visualizar(mesas, log);
				break;
			case 3:
				menuMesa(mesas, carta, log);
				log.vaciarLog();
				break;
			case 4:
				log.vaciarLog();
				System.exit(0);

			}
		} while (true);

	}

	private void añadirMesa(ArrayList<Mesa> mesas, Archivo log) {

		mesas.add(new Mesa(mesas.size() + 1));
		System.out.println("Se ha añadido la mesa " + mesas.size());
		log.hacerLog(mesas);
	}

	private void visualizar(ArrayList<Mesa> mesas, Archivo log) {
		log.hacerLog(mesas);
		log.verLog(mesas);
	}

	public void menuMesa(ArrayList<Mesa> mesas, Archivo carta, Archivo log) {

		int numMesa = -1;
		do {
			int busqueda = 0;
			boolean error = false;
			do {
				try {
					System.out.println();
					System.out.println("RESTAURANTE JAIME PARDO:");
					System.out.println("Elige una mesa:");
					visualizar(mesas, log);
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
					System.out.println("4-Remplazar plato");
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
				mesas.get(numMesa).añadirPlato(carta);
				log.hacerLog(mesas);
				break;
			case 2:
				System.out.println(mesas.get(numMesa).visualizarMesa());
				log.hacerLog(mesas);
				break;
			case 3:
				System.out.println(mesas.get(numMesa).visualizarMesa());
				mesas.get(numMesa).entregarPlato();
				log.hacerLog(mesas);
				break;
			case 4:
				System.out.println(mesas.get(numMesa).visualizarMesa());
				mesas.get(numMesa).remplazarPlato(mesas, carta);
				log.hacerLog(mesas);
				break;
			case 5:
				System.out.println(mesas.get(numMesa).visualizarMesa());
				mesas.get(numMesa).eliminarPlato();
				log.hacerLog(mesas);
				break;
			case 6:
				System.out.println(mesas.get(numMesa).visualizarMesa());
				System.out.println("Total: " + mesas.get(numMesa).cuenta() + "€");
				log.hacerLog(mesas);
				break;
			case 7:
				mesas.get(numMesa).vaciar();
				break;
			case 8:
				menuPrincipal(mesas, carta, log);
				break;
			default:
				break;
			}

		} while (true);

	}

}
