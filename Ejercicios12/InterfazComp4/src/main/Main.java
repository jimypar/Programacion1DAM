package main;

public class Main {

	public static void main(String[] args) {

		Tienda tienda = new Tienda();
		
		tienda.rellenar();
		tienda.ordenar();
		tienda.visualizar();
		tienda.crearBase();
		tienda.visualizarBase();
	}
}
