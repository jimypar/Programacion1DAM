package main;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import empresa.Empleado;

public class Main {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

	}

	public void ifexists() {
		File f = new File(nombreArchivo);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println("No se ha podido crear el archivo");
			}
		}
	}

	public static void crearFichero() {

		try {
			PrintWriter destino = new PrintWriter(new FileWriter("nombreArchivo.txt", false));

			String linea = "";
			do {
				System.out.println("Escribir texto:");
				linea = scan.next();
				if (!linea.equalsIgnoreCase("*")) {
					destino.println(linea);
				}
			} while (!linea.equalsIgnoreCase("*"));

			destino.close();

		} catch (FileNotFoundException e) {
			System.out.println("Algo ha fallado");
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}

	}

	public void verFichero() {

		try {
			BufferedReader file = new BufferedReader(new FileReader(nombreArchivo));

			String linea = file.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = file.readLine();
			}

			file.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo");
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}
	}

	private static void ordenarFichero() {

		try {
			BufferedReader fuente = new BufferedReader(new FileReader(nombreArchivo));
			ArrayList<String> array = new ArrayList<String>();
			PrintWriter destino = new PrintWriter(new FileWriter("Ordenado.txt", false));

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

	
	public void crearRAF() {

		try {
			RandomAccessFile f = new RandomAccessFile("datos", "rw");

			for (O o : os) {
				String nombre = o.getNombre();				
				f.writeUTF(formatear(nombre, 20));
			}
			f.close();
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}

	}
	
	
	public void visualizarRAF() {

		try {
			RandomAccessFile f = new RandomAccessFile(nombreArchivo, "rw");

			System.out.println("***CONTENIDO DEL ARCHIVO***");
			boolean fin = false;
			do {
				try {
					String nombre = f.readUTF();
					System.out.println("Nombre = " + nombre);
				} catch (EOFException e) {
					fin = true;
				}
			} while (!fin);
			f.close();
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}
	}

	
	
	
	private String formatear(String nombre, int longitud) {

		if (nombre.length() > longitud) {
			return nombre.substring(0, longitud);
		} else {
			for (int i = nombre.length(); i < longitud; i++) {
				nombre += " ";
			}
			return nombre;
		}

	}
	
	private static void split() {
		String ciclos= "dam:daw:asir";
		String v[] = ciclos.split(":");
		for (String ciclo : v) {
			System.out.println("Ciclo: "+ciclo);
		}
	}

	private static void enumerable() {
				
		boolean fin = false;
		do {
			try {
				System.out.println("Introduce el ciclo: (A,B o C) ");
				String unO = scan.next();
				O o = os.valueOf(unO.toUpperCase());
				Persona persona = new Persona();
				personas.add(persona));
				fin = true;
			} catch (IllegalArgumentException e) {
				fin = false;
			}
		} while (!fin);
		
	}

	private static void continuar() {
		
		String respuesta = null;
		do {
			
			

			System.out.println("Deseas continuar?(si/no)");
			respuesta = scan.next();
		} while (respuesta.equalsIgnoreCase("si"));

		
	}
	

}
