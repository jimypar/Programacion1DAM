package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

//	7. BUSCAR PALABRAS. Se debe hacer un programa que abra el fichero mentor.txt, extraiga ciertas estad�sticas del
//	mismo, y realice unas operaciones sobre su contenido.
//	Concretamente es necesario:
//	 Comprobar que el fichero existe. Se puede usar la clase java.io.File (buscarla en el API de Java) y el
//	m�todo exists() .
//	 Leer el contenido del fichero a un Vector. Cada elemento del Vector debe contener un String con cada
//	l�nea del texto del fichero.
//	 Mostrar estad�sticas de cada l�nea por la salida est�ndar (consola).
//	 El n�mero letras de cada l�nea.
//	 El n�mero de vocales de cada l�nea.
//	 El n�mero de espacios en blanco de cada l�nea.
//	 Cuantas veces aparece la palabra "Mentor", tanto en may�sculas como en min�sculas.
//	 Convertir la segunda l�nea a may�sculas y la tercera a min�sculas.
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
