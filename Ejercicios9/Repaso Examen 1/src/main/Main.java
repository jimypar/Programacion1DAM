package main;

public class Main {

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
		
		concesionario1.rellenar();
		concesionario2.visualizar();

		concesionario1.rellenar();
		concesionario2.visualizar();

	}

}
