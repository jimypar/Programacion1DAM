package main;

import java.util.Scanner;

public class Main {

	public Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

//		Realizar un programa para guardar la informaci�n de 2 concesionarios de coches. El concesionario
//		tiene un nombre, direcci�n y un listado de coches.
//		De cada coche se guardar� la informaci�n siguiente:
//		Marca: tipo String, almacena el nombre de la marca (Ej: Seat, Mercedes,etc.)
//		Modelos: por cada modelo de coche se guardar� en nombre del modelo y el stock disponible
//		en el concesionario.
//		Ej: Para la marca Seat : le�n, 3 | Ibiza, 4 �
//		El m�todo M�ximoStock() devolver� la marca del coche con m�s stock en el almac�n
//		Con esta informaci�n se realizar�n las siguientes operaciones: rellenar, visualizar y consultar coche
//		con m�ximo stock

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
