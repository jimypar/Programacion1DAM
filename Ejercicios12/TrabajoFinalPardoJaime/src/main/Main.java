package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import objetos.Mesa;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		ArrayList<Mesa> mesas = null;
		Menu menu = new Menu();
		
		int numMesas = 0;
		boolean error = false;
		do {
			try {
				System.out.println("RESTAURANTE JAIME PARDO");
				System.out.println("Introduce el numero de mesas:");
				numMesas = scan.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				error = true;
				scan.nextLine();
			} 
		} while (error);
				
		mesas = new ArrayList<Mesa>();
		
		for (int i = 1; i <= numMesas; i++) {
			Mesa mesa = new Mesa(i);
			mesas.add(mesa);
		}
		
		menu.crearDatabase();
		menu.menuPrincipal(mesas);

		scan.close();
	}

}
