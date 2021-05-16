package main;

import java.util.Scanner;

public class Videojuego extends Articulo {

	private boolean online;
	private Plataformas plataforma;
	private Scanner scan = new Scanner(System.in);

	public Videojuego() {
		super();
		this.online = false;
		this.plataforma = Plataformas.PS;
	}

	public Videojuego(String titulo, int isbn, int precio, boolean online) {
		super(titulo, isbn, precio);
		this.online = online;
		this.plataforma = Plataformas.PS;
	}

	public void rellenar() {

		super.rellenar();

		boolean fin = false;
		do {
			try {
				System.out.println("Introduce una plataforma: (PS o XBOX) ");
				String plat = scan.next();
				this.plataforma = Plataformas.valueOf(plat.toUpperCase());
				fin = true;
			} catch (IllegalArgumentException e) {
				fin = false;
			}
		} while (!fin);

		String respuesta = null;
		do {
			System.out.println("Tiene online? (si/no): ");

			respuesta = scan.next();
			if (respuesta.equalsIgnoreCase("si")) {
				this.online = true;
			}
			if (respuesta.equalsIgnoreCase("no")) {
				this.online = false;
			}
		} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));

	}

	public void visualizar() {

		super.visualizar();

		System.out.println("Plataforma: " + this.plataforma.toString());
		System.out.println("   -Descripcion: " + this.plataforma.getDescripcion());
		System.out.println("   -Fabricante: " + this.plataforma.getFabricante());
		System.out.println("Online: " + esOnline(this.online));
		System.out.println("Precio final: " + calcularPrecioAlquiler());

	}

	private String esOnline(boolean online) {

		if (online == true) {
			return "si";
		}
		if (online == false) {
			return "no";
		}
		return "no";
	}

	@Override
	public float calcularPrecioAlquiler() {
		if (this.online == true) {
			return (float) (super.getPrecio() * 1.05);
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

		return "'"+super.getTitulo() + "'," + super.getIsbn() + "," + super.getPrecio() + ",'" + this.plataforma + "','"
				+ this.plataforma.getDescripcion() + "','" + this.plataforma.getFabricante() + "'," + this.online + ","
				+ calcularPrecioAlquiler();
	}

}
