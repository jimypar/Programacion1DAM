package main;

import coche.Coches;

public class Main {

	public static void main(String[] args) {
						
		Coches cocheParticular = new Coches();
		Coches cocheTrabajo = new Coches();

		
		System.out.println("COCHE PARTICULAR");
		cocheParticular.rellenar();
		cocheParticular.visualizar();
		System.out.println("Clase: "+cocheParticular.clasecoche());
		
		
		System.out.println();
		System.out.println("COCHE PARTICULAR");
		cocheTrabajo.rellenar();
		cocheTrabajo.visualizar();
		System.out.println("Clase: "+cocheTrabajo.clasecoche());
		
	}

}
