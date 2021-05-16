package Alimentacion;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tienda {

	private String nombreTienda;
	private ArrayList<Articulo> articulos;
	private Scanner scan = new Scanner(System.in);

	public Tienda() {
		this.nombreTienda = "";
		this.articulos = new ArrayList<Articulo>();
	}

	public Tienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
		this.articulos = new ArrayList<Articulo>();
	}

	public void rellenar() {

		System.out.println("Introduce el nombre de la tienda:");
		this.nombreTienda = scan.next();

		String respuesta = null;
		do {

			boolean fin = false;
			int opcion = 0;
			do {
				try {
					System.out.println("Que articulo quieres rellenar");
					System.out.println("1. Bebida");
					System.out.println("2. Comida");
					opcion = scan.nextInt();
					fin = true;
				} catch (InputMismatchException e) {
					System.out.println("Introduce una opcion");
					scan.next();
					fin = false;
				}
			} while (!fin);

			if (opcion == 1) {
				Bebida bebida = new Bebida();
				bebida.rellenar();
				articulos.add(bebida);
			}
			if (opcion == 2) {
				Comida comida = new Comida();
				comida.rellenar();
				articulos.add(comida);
			}

			System.out.println("Deseas continuar?(si/no)");
			respuesta = scan.next();
		} while (respuesta.equalsIgnoreCase("si"));

	}

	public void visualizar() {

		System.out.println("TIENDA " + this.nombreTienda);
		for (Articulo articulo : articulos) {
			System.out.println();
			if (articulo.getClass().getSimpleName().equals("Bebida")) {
				System.out.println("BEBIDA:");
			} else {
				System.out.println("COMIDA");
			}
			articulo.visualizar();
		}

	}

	public void crearRaf() {

		try {
			RandomAccessFile f = new RandomAccessFile("tienda", "rw");

			int opcion = 0;
			String palabra = "";

			do {
				System.out.println("Que comida quieres mostrar?");
				System.out.println("1. Carne");
				System.out.println("2. Pescado");
				opcion = scan.nextInt();
				if (opcion == 1) {
					palabra = "CARNE";
				}
				if (opcion == 2) {
					palabra = "PESCADO";
				}
			} while (opcion != 1 && opcion != 2);

			for (Articulo articulo : articulos) {
				if (articulo.getClass().getSimpleName().equals("Comida")) {
					Comida comida = new Comida();
					comida = (Comida) articulo;
					if (comida.getTipocomida().toString().equals(palabra)) {
						f.writeUTF(formatear(comida.getDescripcion(), 50));
						f.writeFloat(comida.getPrecioCompra());
						f.writeUTF(comida.getTipocomida().toString());
					}

				}
			}

			f.close();
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}

	}

	public void visualizarRaf() {

		try {
			RandomAccessFile f = new RandomAccessFile("tienda", "rw");
			System.out.println();
			System.out.println("***CONTENIDO DEL ARCHIVO***");
			boolean fin = false;
			do {
				try {
					System.out.println("Descripcion :" + f.readUTF());
					System.out.println("Precio compra :" + f.readFloat());
					System.out.println("Tipo comida: " + f.readUTF());
				} catch (EOFException e) {
					fin = true;
				}
			} while (!fin);
			f.close();
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}

	}

	public void modificarRaf() {

		try {
			RandomAccessFile f = new RandomAccessFile("tienda", "rw");
			System.out.println();

			System.out.println("Introduce descripcion");
			String desc = scan.next();

			boolean fin = false;
			do {
				try {

					String descripcion = f.readUTF();
					if (descripcion.trim().equalsIgnoreCase(desc)) {
						System.out.println("Introduce nueva descripcion:");
						desc = scan.next();
						f.seek(f.getFilePointer() - 52);
						f.writeUTF(formatear(desc, 50));
					}
					f.readFloat();
					f.readUTF();
					
				} catch (EOFException e) {
					fin = true;
				}
			} while (!fin);
			f.close();
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}

	}

	private String formatear(String nombre, int longitud) {

		if (nombre.length() > longitud) {
			return nombre.substring(0, longitud);
		} else {
			for (int i = nombre.length(); i < longitud; i++) {
				nombre += " ";
			}
			return nombre;
		}

	}

}
