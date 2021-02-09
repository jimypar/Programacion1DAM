package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int rango = 0;
		boolean error = false;
		do {

			try {
				System.out.print("Introduce el rango: ");
				rango = Integer.parseInt(in.readLine());
				error = false;
			} catch (NumberFormatException e) {
				System.out.println("Numero incorrecto");
				error = true;
			} catch (IOException e) {
				System.out.println("ERROR");
				error = true;
			}
		} while (error);

		String matriz[][] = new String[rango][rango];

		try {
			OperacionesMatriz.rellenar(matriz);
		} catch (NumberFormatException | IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("Sin ordenar");
		OperacionesMatriz.visualizar(matriz);
		System.out.println();
		OperacionesMatriz.ordenar(matriz);
		System.out.println();
		System.out.println("Ordenado");
		OperacionesMatriz.visualizar(matriz);
		
		
	}

}
