package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {
	
	private String archivo;
	private ArrayList<String> lineas = new ArrayList<String>();
	private ArrayList<String> lineasInv = new ArrayList<String>();
	
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
	
	void invertir() {
		int totPalabras = 0;
		for (String linea : lineas) {
			int contPalabras = 0;
			String lineaInv = "";
			String[] v = linea.split(" ");			
			for (int i = (v.length-1); i >=0; i--) {
				lineaInv += v[i]+" ";
				contPalabras++;
				totPalabras++;
			}
			lineasInv.add(lineaInv + "-- palabras: "+contPalabras);
		}
		System.out.println("Total palabras = "+totPalabras);
		
	}
	
	void visualizar() {
		
		for (String string : lineasInv) {
			System.out.println(string);
		}
		
	}
	
	void printArchivo() {

		Scanner scan = new Scanner(System.in);
		PrintWriter destino;
		System.out.println("Introduce nombre del archivo de salida: ");
		String salida = scan.next();
		
		try {
			
			destino = new PrintWriter (new FileWriter(salida+".txt",true));

			for (String string : lineasInv) {
				destino.println(string);
			}

			destino.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo");
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}
		
		scan.close();

	}

}
