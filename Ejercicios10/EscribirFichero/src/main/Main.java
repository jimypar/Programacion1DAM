package main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PrintWriter destino;
			try {
				destino = new PrintWriter (new FileWriter("destino.txt",true));
								
				Scanner scan = new Scanner (System.in);
				System.out.println("Texto a escribir al archivo");
				String texto = scan.nextLine();
				destino.println(texto);
				destino.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}

}
