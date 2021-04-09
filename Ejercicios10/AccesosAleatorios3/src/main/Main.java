package main;

import tienda.Tienda;

public class Main {

	public static void main(String[] args) {		
		
		Tienda tienda = new Tienda();
		
				
		tienda.rellenarTienda();
		tienda.visualizar();
		tienda.crearRAF();
		tienda.visualizarRAF();
		tienda.remplazarRAF();
		tienda.visualizarRAF();

	}

}
