package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tienda {

	private ArrayList<Articulo> articulos;
	private Scanner scan = new Scanner(System.in);

	public Tienda() {
		this.articulos = new ArrayList<>();
	}

	public Tienda(ArrayList<Articulo> articulos) {
		this.articulos = new ArrayList<>();
	}

	public void rellenar() {

		String respuesta = null;
		do {
			System.out.println("Que deseas crear:");
			System.out.println("1. Pelicula");
			System.out.println("2. Videojuego");
			int menu = scan.nextInt();
			if (menu == 1) {
				Pelicula pelicula = new Pelicula();
				pelicula.rellenar();
				articulos.add(pelicula);
			}
			if (menu == 2) {
				Videojuego videojuego = new Videojuego();
				videojuego.rellenar();
				articulos.add(videojuego);
			}

			System.out.println("Deseas continuar?(si/no)");
			respuesta = scan.next();
		} while (respuesta.equalsIgnoreCase("si"));

	}

	public void visualizar() {

		System.out.println();
		System.out.println("PELICULAS: ");
		System.out.println();
		for (Articulo articulo : articulos) {
			if (articulo.getClass().getSimpleName().equals("Pelicula")) {
				System.out.println();
				System.out.println("Pelicula: ");
				System.out.println();
				articulo.visualizar();
			}
		}
		System.out.println();
		System.out.println("VIDEOJUEGOS: ");
		System.out.println();
		for (Articulo articulo : articulos) {
			if (articulo.getClass().getSimpleName().equals("Videojuego")) {

				articulo.visualizar();
			}
		}

	}

	public void ordenar() {

		Collections.sort(articulos);

	}

}
