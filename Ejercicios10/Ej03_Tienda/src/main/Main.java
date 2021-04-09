package main;

import tienda.Tienda;

public class Main {

	public static void main(String[] args) {
		Tienda unaTienda= new Tienda();
		unaTienda.rellenarTienda();
		unaTienda.visualizar();
		System.out.println("*** CREANDO ARCHIVO DE PRODUCTOS");
		unaTienda.crearRAF();
		System.out.println("*** archivo creado ***");
		System.out.println("*** VISUALIZAR ARCHIVO DE PRODUCTOS");
		unaTienda.visualizarRAF();
		
	}

}
