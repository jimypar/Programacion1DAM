package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {

		try {
			BufferedReader fuente = new BufferedReader(new FileReader("datos.txt"));

			PrintWriter destino = new PrintWriter(new FileWriter("datosMayusculas.txt", false));

			String linea = "";
			linea = fuente.readLine();
			while (linea != null) {
				destino.println(linea.toUpperCase());
				linea = fuente.readLine();
			}

			fuente.close();
			destino.close();

		} catch (FileNotFoundException e) {
			System.out.println("Algo ha fallado");
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}

		System.out.println("ARCHIVO datos.txt:");
		visualizarArchivo("datos.txt");
		System.out.println();
		System.out.println("ARCHIVO datosMayusculas.txt:");
		visualizarArchivo("datosMayusculas.txt");

	}

	private static void visualizarArchivo(String archivo) {

		try {
			BufferedReader f = new BufferedReader(new FileReader(archivo));

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
