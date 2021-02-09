package main;

public class Main {

	public static void main(String[] args) {
		
		Coches coche = new Coches();
		
		coche.rellenar();
		coche.visualizar();
		System.out.println("Clase: "+coche.clasecoche());
		
	}

}
