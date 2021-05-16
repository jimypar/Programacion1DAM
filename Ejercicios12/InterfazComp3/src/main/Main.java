package main;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Coche persona1 = new Coche("BMW", "M5", 200000);
		Coche persona2 = new Coche("Mercedes", "Clase ", 500000);
		Coche persona3 = new Coche("Audi", "A5", 10000);
		Coche persona4 = new Coche("Saab", "95", 50000);

		ArrayList<Coche> coches = new ArrayList<Coche>();
		coches.add(persona1);
		coches.add(persona2);
		coches.add(persona3);
		coches.add(persona4);

		for (Coche coche : coches) {
			System.out.println(coche.toString());
		}

		Collections.sort(coches);

		System.out.println("Ordenado:");

		for (Coche coche : coches) {
			System.out.println(coche.toString());
		}

//		int valor = persona1.compareTo(persona2);
//
//		if (valor > 0) {
//			System.out.println(persona1.getNombre() + " es mayor");
//		} else if (valor < 0) {
//			System.out.println(persona2.getNombre() + " es mayor");
//		} else if (valor == 0) {
//			System.out.println("Tienen la misma edad");
//		}

	}

}
