package main;

import java.util.ArrayList;
import java.util.Scanner;

import objetos.Archivo;
import objetos.Mesa;

public class Menu {

	private Scanner scan = new Scanner(System.in);

	public void menuPrincipal(ArrayList<Mesa> mesas, Archivo carta, Archivo log) {
		
		do {				
			System.out.println();
			System.out.println("Que deseas hacer?");
			System.out.println("1-Añadir mesa");
			System.out.println("2-Ver mesas");
			System.out.println("3-Modificar mesa");
			System.out.println("4-Salir");
			int menu = scan.nextInt();
			switch (menu) {
			case 1:
				añadirMesa(mesas, log);
				break;
			case 2:
				visualizar(mesas, log);
				break;
			case 3:
				menuMesa(mesas, carta, log);
				break;
			case 4:
				System.exit(0);

			}
		} while (true);

	}

	private void añadirMesa(ArrayList<Mesa> mesas, Archivo log) {

		mesas.add(new Mesa(mesas.size() + 1));
		System.out.println("Se ha añadido la mesa " + mesas.size());

	}

	private void visualizar(ArrayList<Mesa> mesas, Archivo log) {
		log.hacerLog(mesas);
		log.verLog(mesas);
	}

	public void menuMesa(ArrayList<Mesa> mesas, Archivo carta, Archivo log) {

		int numMesa = -1;
		do {
			System.out.println();
			System.out.println("RESTAURANTE JAIME PARDO:");
			System.out.println("Elige una mesa:");
			for (int i = 0; i < mesas.size(); i++) {
				System.out.println("- " + mesas.get(i).getNumero());
			}
			System.out.print(" :");
			int busqueda = scan.nextInt();
			for (int i = 0; i < mesas.size(); i++) {
				if (mesas.get(i).getNumero() == busqueda) {
					numMesa = i;
				}
			}
		} while (numMesa == -1);

		int menu = 0;
		do {
			System.out.println();
			System.out.println("Que deseas hacer?");
			System.out.println("1-Añadir platos");
			System.out.println("2-Ver pedido");
			System.out.println("3-Remplazar plato");
			System.out.println("4-Eliminar plato");
			System.out.println("5-Pagar la cuenta");
			System.out.println("6-Salir");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				mesas.get(numMesa).añadirPlato(carta);
				break;
			case 2:
				System.out.println(mesas.get(numMesa).visualizarMesa());
				break;
			case 3:
				mesas.get(numMesa).remplazarPlato(carta);
				break;
			case 4:
				mesas.get(numMesa).eliminarPlato();
				break;
			case 5:
				System.out.println(mesas.get(numMesa).visualizarMesa());
				System.out.println("Total: "+mesas.get(numMesa).cuenta()+"€");
				mesas.get(numMesa).vaciar();
				break;
			case 6:
				menuPrincipal(mesas, carta, log);
			default:
				break;
			}

		} while (true);

	}

}
