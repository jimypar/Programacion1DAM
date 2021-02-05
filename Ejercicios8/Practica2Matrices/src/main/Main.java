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

		int matriz[][] = new int[rango][rango];

		try {
			OperacionesMatriz.rellenar(matriz);
		} catch (NumberFormatException | IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		OperacionesMatriz.visualizar(matriz);
		if (OperacionesMatriz.simetrica(matriz)) {
			System.out.println();
			System.out.println("Es simetrica");
		} else {
			System.out.println();
			System.out.println("No es simetrica");
		}

		System.out.println();
		System.out.println("MAXIMO VALOR FILA:");
		System.out.println("------------------");
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("El valor maximo de la fila "+(i+1)+" es "+ OperacionesMatriz.MaxFila(matriz, i)+" en la columna: "+(OperacionesMatriz.posy+1));
		}
	
		System.out.println();
		System.out.println("MAXIMO VALOR COLUMNA:");
		System.out.println("------------------");
		for (int i = 0; i < matriz[0].length; i++) {
			System.out.println("El valor maximo de la columna "+(i+1)+" es "+ OperacionesMatriz.MaxColumna(matriz, i)+" en la fila: "+(OperacionesMatriz.posy+1));
		}
		
		System.out.println();
		System.out.println("MAXIMO VALOR MATRIZ:");
		System.out.println("------------------");
		
		OperacionesMatriz.MaxMatriz(matriz);
		System.out.println("El valor maximo es " +matriz[OperacionesMatriz.posx][OperacionesMatriz.posy]+" en m["+(OperacionesMatriz.posx+1)+"]["+(OperacionesMatriz.posy+1)+"]");
		
		System.out.println();
		System.out.println("SUMA FILA:");
		System.out.println("------------------");
		
		OperacionesMatriz.SumaFilas(matriz);
		
		System.out.println();
		System.out.println("SUMA COLUMNA");
		System.out.println("------------------");
		
		OperacionesMatriz.SumaColumnas(matriz);

	}

}
