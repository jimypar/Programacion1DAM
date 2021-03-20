package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

//	7. BUSCAR PALABRAS. Se debe hacer un programa que abra el fichero mentor.txt, extraiga ciertas estadísticas del
//	mismo, y realice unas operaciones sobre su contenido.
//	Concretamente es necesario:
//	 Comprobar que el fichero existe. Se puede usar la clase java.io.File (buscarla en el API de Java) y el
//	método exists() .
//	 Leer el contenido del fichero a un Vector. Cada elemento del Vector debe contener un String con cada
//	línea del texto del fichero.
//	 Mostrar estadísticas de cada línea por la salida estándar (consola).
//	 El número letras de cada línea.
//	 El número de vocales de cada línea.
//	 El número de espacios en blanco de cada línea.
//	 Cuantas veces aparece la palabra "Mentor", tanto en mayúsculas como en minúsculas.
//	 Convertir la segunda línea a mayúsculas y la tercera a minúsculas.
//	 Guardar un fichero mentor2.txt con el texto tras sufrir estas transformaciones.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		Archivo archivo = new Archivo();
		ArrayList<String> lineas = new ArrayList<String>();

		System.out.println("Elige el nombre del archivo: ");
		archivo.setFile(scan.next());
		
		archivo.leer(lineas);
		archivo.mostrar(lineas);
		archivo.stats(lineas);
		archivo.escribir(lineas);

	}

}
