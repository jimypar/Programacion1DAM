package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ordenar("datos.txt");
		visualizarArchivo("datosOrdenados.txt");
		
	}


	
	

	private static void ordenar(String datos) {		
		
		try {
			BufferedReader fuente = new BufferedReader(new FileReader(datos));
			ArrayList<String> array = new ArrayList<String>();
			PrintWriter destino = new PrintWriter(new FileWriter("datosOrdenados.txt", false));

			String linea = "";
			linea = fuente.readLine();
			while (linea != null) {
				array.add(linea);
				linea = fuente.readLine();
			}
			
			Collections.sort(array);
			
			for (int i = 0; i < array.size(); i++) {
				destino.println(array.get(i));
			}
						
			fuente.close();
			destino.close();

		} catch (FileNotFoundException e) {
			System.out.println("Algo ha fallado");
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}
	}

	private static void visualizarArchivo(String datos) {

		try {
			BufferedReader f = new BufferedReader(new FileReader(datos));

			String linea = f.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = f.readLine();
			}

			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo");
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}

	}
	
	
	
}
