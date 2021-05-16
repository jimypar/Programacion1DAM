package main;

import java.util.Scanner;

public abstract class Articulo implements operacionesArticulo, Comparable<Articulo> {

	private String titulo;
	private int isbn;
	private int precio;
	private Scanner scan = new Scanner(System.in);

	public Articulo() {
		this.titulo = "";
		this.isbn = 0;
		this.precio = 0;
	}

	public Articulo(String titulo, int isbn, int precio) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getIsbn() {
		return isbn;
	}

	public int getPrecio() {
		return precio;
	}

	public void rellenar() {

		System.out.println("Introduce el titulo: ");
		this.titulo = scan.next();
		System.out.println("Introduce el ISBN: ");
		this.isbn = scan.nextInt();
		System.out.println("Introduce el precio: ");
		this.precio = scan.nextInt();
	}

	public void visualizar() {

		System.out.println("Titulo: " + this.titulo);
		System.out.println("ISBN: " + this.isbn);
		System.out.println("Precio: " + this.precio);

	}

}
