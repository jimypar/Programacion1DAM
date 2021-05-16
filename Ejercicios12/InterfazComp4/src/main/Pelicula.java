package main;

import java.util.Scanner;

public class Pelicula extends Articulo {

	private int duracion;
	private Scanner scan = new Scanner(System.in);

	public Pelicula() {
		super();
		this.duracion = 0;
	}

	public Pelicula(String titulo, int isbn, int precio, int duracion) {
		super(titulo, isbn, precio);
		this.duracion = duracion;
	}

	public void rellenar() {

		super.rellenar();

		System.out.println("Introduce la duracion: ");
		this.duracion = scan.nextInt();
	}

	public void visualizar() {

		super.visualizar();

		System.out.println("Duracion: " + this.duracion);
		System.out.println("Precio final: " + calcularPrecioAlquiler());

	}

	@Override
	public float calcularPrecioAlquiler() {
		if (this.duracion > 100) {
			return (float) (super.getPrecio() * 1.10);
		}
		return super.getPrecio();
	}

	@Override
	public int compareTo(Articulo a) {
		if (super.getIsbn() > a.getIsbn()) {
			return 1;
		} else if (super.getIsbn() < a.getIsbn()) {
			return -1;
		} else {
			if (super.getTitulo().compareTo(a.getTitulo()) > 0) {
				return 1;
			} else if (super.getTitulo().compareTo(a.getTitulo()) < 0) {
				return -1;
			}
		}
		return 0;
	}

	public String valores() {

		return "'"+super.getTitulo() + "'," + super.getIsbn() + "," + super.getPrecio() + "," + this.duracion + ","
				+ calcularPrecioAlquiler() + "";
	}

}
