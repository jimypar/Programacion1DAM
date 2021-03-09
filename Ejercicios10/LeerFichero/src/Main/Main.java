package Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		BufferedReader fuente;
		try {
			fuente = new BufferedReader(new FileReader("fichero.txt"));
			
			
			String linea = fuente.readLine();
			while(linea!=null) {
				System.out.println(linea);
				linea = fuente.readLine();
			}
			
			fuente.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo fichero.");
		} catch (IOException e ) {
			System.out.println("No se ha podido acceder al archivo");
		}

	}

}
