package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Archivo {
	
	private String archivo;
	private ArrayList<String> lineas = new ArrayList<String>();
	private ArrayList<String> lineasSinEsp = new ArrayList<String>();
	
	Archivo(){
		this.archivo = "";
	}
		
	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	void leer() {
				
		try {
			BufferedReader fuente = new BufferedReader(new FileReader(this.archivo));

			String linea = "";
			linea = fuente.readLine();
			while (linea != null) {
				this.lineas.add(linea);
				linea = fuente.readLine();
			}

			fuente.close();

		} catch (FileNotFoundException e) {
			System.out.println("Algo ha fallado");
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}

		
	}
	
	void remplazar() {
		
		for (int i = 0; i < this.lineas.size(); i++) {
			this.lineasSinEsp.add(i, this.lineas.get(i).replaceAll("  ", " "));;
		}
		
	}
	
	void visualizarArchivo() {

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
	
	void sobresribir() {
		
		try {
			PrintWriter destino = new PrintWriter(new FileWriter(this.archivo, false));
			
			for (String linea : this.lineasSinEsp) {
				destino.println(linea);
			}
			
			destino.close();
			
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}
		
	}
}
