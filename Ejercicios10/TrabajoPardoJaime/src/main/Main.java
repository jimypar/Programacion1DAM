package main;

import java.util.ArrayList;
import java.util.Scanner;
import objetos.Archivo;
import objetos.Mesa;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Archivo carta = new Archivo("carta.txt");
		carta.crearArchivo();
		Archivo log = new Archivo("log.txt");
		log.crearArchivo();
		ArrayList<Mesa> mesas = null;
		Menu menu = new Menu();

		System.out.println("RESTAURANTE JAIME PARDO");
		System.out.println("Introduce el numero de mesas:");
		int numMesas = scan.nextInt();
		mesas = new ArrayList<Mesa>();

		for (int i = 1; i <= numMesas; i++) {
			Mesa mesa = new Mesa(i);
			mesas.add(mesa);
		}

		menu.menuPrincipal(mesas, carta, log);

		scan.close();
	}

}
