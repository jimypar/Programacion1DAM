package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Archivo {

	private String file;

	public Archivo() {
		this.file = "";
	}
	
	public Archivo(String archivo) {
		this.file = archivo;
	}
	
	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	void leer(ArrayList<String> lineas) {
		
		File f = new File(this.file+".txt");
		if (!f.exists()) {
			System.out.println("No se ha encontrado el archivo");
		} else {

			try {

				BufferedReader fuente = new BufferedReader(new FileReader(this.file+".txt"));

				String linea = "";
				linea = fuente.readLine();
				while (linea != null) {
					lineas.add(linea);
					linea = fuente.readLine();
				}

				fuente.close();

			}catch (IOException e) {
				System.out.println("Algo ha fallado");
			}

		}
		
	}

	void mostrar(ArrayList<String> lineas) {
		
		System.out.println();
		for (int i = 0; i < lineas.size(); i++) {
			System.out.println(lineas.get(i));
		}
		
	}

	void stats(ArrayList<String> lineas) {
		
		System.out.println();
		int mentor = 0;
		for (int i = 0; i < lineas.size(); i++) {

			int letras = 0;
			int vocales = 0;
			int espacios = 0;
			

			for (int j = 0; j < (lineas.get(i).length()); j++) {
				if (Character.isLetter(lineas.get(i).toLowerCase().charAt(j))) {
					letras++;
				}
				if (lineas.get(i).toLowerCase().charAt(j) == 'a' || lineas.get(i).toLowerCase().charAt(j) == 'e'
						|| lineas.get(i).toLowerCase().charAt(j) == 'i' || lineas.get(i).toLowerCase().charAt(j) == 'o'
						|| lineas.get(i).toLowerCase().charAt(j) == 'u') {
					vocales++;
				}
				if (lineas.get(i).toLowerCase().charAt(j) == ' ') {
					espacios++;
				}
				if (lineas.get(i).substring(j).toLowerCase().startsWith("mentor")) {
					mentor++;
				}

			}

			System.out.println("LINEA: " + (i + 1) + " = " + lineas.get(i));
			System.out.println(letras + " letras");
			System.out.println(vocales + " vocales");
			System.out.println(espacios + " espacios");
			

		}

		System.out.println("La palabra mentor aparece "+mentor);
	}

	void escribir(ArrayList<String> lineas) {
		
		try {
			PrintWriter destino = new PrintWriter(new FileWriter(this.file+"2.txt", false));

			for (int i = 0; i < lineas.size(); i++) {

				if (i == 1) {
					destino.println(lineas.get(i).toUpperCase());
				}
				if (i == 2) {
					destino.println(lineas.get(i).toLowerCase());
					;
				}
				if (i != 1 && i != 2) {
					destino.println(lineas.get(i));
				}

			}

			destino.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
}
