package main;

import java.util.Scanner;

public class Main {

	public Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

//		Realizar un programa para guardar la información de 2 concesionarios de coches. El concesionario
//		tiene un nombre, dirección y un listado de coches.
//		De cada coche se guardará la información siguiente:
//		Marca: tipo String, almacena el nombre de la marca (Ej: Seat, Mercedes,etc.)
//		Modelos: por cada modelo de coche se guardará en nombre del modelo y el stock disponible
//		en el concesionario.
//		Ej: Para la marca Seat : león, 3 | Ibiza, 4 …
//		El método MáximoStock() devolverá la marca del coche con más stock en el almacén
//		Con esta información se realizarán las siguientes operaciones: rellenar, visualizar y consultar coche
//		con máximo stock

		Concesionario concesionario1 = new Concesionario();
		Concesionario concesionario2 = new Concesionario();

		System.out.println("Rellenar concesionario 1");
		concesionario1.rellenar();
		System.out.println("Rellenar concesionario 2");
		concesionario2.rellenar();
		
		concesionario1.visualizar();
		concesionario2.visualizar();

		
	}

}
