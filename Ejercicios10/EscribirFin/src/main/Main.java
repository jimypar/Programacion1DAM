package main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
			PrintWriter destino = new PrintWriter
					(new FileWriter("destino.txt",true));
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Escribe el archivo (fin)");
			String linea = scan.nextLine();
			
			while (!linea.equals("fin")) {
				destino.println(linea);
				linea = scan.nextLine();
			}
			
			destino.close();
			
		} catch (IOException e) {
			System.out.println("Error de acceso al archivo");
		}


	}

}
