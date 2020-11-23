package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char respuesta;
		float precio, max = 0, min = 0;
		String art;
		String artCaro, artBarato;

		System.out.println("Introduce articulo");
		art = scan.next();
		System.out.println("Introduce el precio");
		precio = scan.nextFloat();
		max = precio;
		min = precio;
		artCaro = art;
		artBarato = art;
		scan.nextLine();
		System.out.println("Deseas continuar?:(s/n)");
		respuesta = scan.nextLine().toLowerCase().charAt(0);

		while (respuesta == 's') {

			System.out.println("Introduce articulo");
			art = scan.next();
			System.out.println("Introduce el precio");
			precio = scan.nextFloat();

			if (precio > max) {
				max = precio;
				artCaro = art;
			}
			if (precio < min) {
				min = precio;
				artBarato = art;
			}
			scan.nextLine();
			System.out.println("Deseas continuar?:(s/n)");
			respuesta = scan.nextLine().toLowerCase().charAt(0);
		}
		
		System.out.println("El articulo mas caro es: "+artCaro+" por "+max+" €");
		System.out.println("El articulo mas barato es: "+artBarato+" por "+min+" €");

	}

}
