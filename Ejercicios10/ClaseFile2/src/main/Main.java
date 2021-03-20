package main;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("introduce el nombre del archivo: ");
		String nombre = scan.next();
		File f = new File(nombre);
		if (!f.exists()) {
			System.out.println("No se ha encontrado "+nombre);
		} else {
			Archivo archivo = new Archivo();
			archivo.setArchivo(nombre);
			archivo.leer();
			archivo.visualizarArchivo();
			archivo.remplazar();			
			archivo.sobresribir();
			archivo.visualizarArchivo();
		}
		
		scan.close();
	}

}
