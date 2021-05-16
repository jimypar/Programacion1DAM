package main;

public class Main {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Jaime", (byte) 20, "73004081B");
		Persona persona2 = new Persona("Maria", (byte) 20, "73004081C");

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
