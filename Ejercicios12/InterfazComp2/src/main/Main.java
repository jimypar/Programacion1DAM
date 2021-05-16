package main;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Jaime", (byte) 20, "73004081B");
		Persona persona2 = new Persona("Sara", (byte) 23, "73004081C");
		Persona persona3 = new Persona("Maria", (byte) 21, "73004081C");
		Persona persona4 = new Persona("Luis", (byte) 22, "73004081B");

		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(persona1);
		personas.add(persona2);
		personas.add(persona3);
		personas.add(persona4);

		for (Persona persona : personas) {
			System.out.println(persona.toString());
		}

		Collections.sort(personas);

		System.out.println("Ordenado:");
		
		for (Persona persona : personas) {
			System.out.println(persona.toString());
		}

		int valor = persona1.compareTo(persona2);

		if (valor > 0) {
			System.out.println(persona1.getNombre() + " es mayor");
		} else if (valor < 0) {
			System.out.println(persona2.getNombre() + " es mayor");
		} else if (valor == 0) {
			System.out.println("Tienen la misma edad");
		}

	} 

}
