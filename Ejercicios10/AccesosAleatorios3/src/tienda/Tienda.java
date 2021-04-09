package tienda;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

	private String nombre;
	private ArrayList<Producto> productos;

	public Tienda() {
		this.nombre = "";
		this.productos = new ArrayList<Producto>();
	}

	public void rellenarTienda() {

		Scanner scan = new Scanner(System.in);
		System.out.print("Nombre = ");
		this.nombre = scan.nextLine();
		// Rellenar productos
		System.out.print("Codigo (0 para salir):");
		int cod = scan.nextInt();
		while (cod != 0) {
			System.out.println("Precio:");
			double precio = scan.nextDouble();
			Producto producto = new Producto(cod, precio);
			productos.add(producto);
			System.out.print("Codigo (0 para salir):");
			cod = scan.nextInt();
		}
		scan.close();

	}

	public void visualizar() {

		System.out.println("Nombre = " + this.nombre);
		System.out.println("Productos de la tienda");
		for (Producto producto : productos) {
			System.out.println(producto.toString());
		}

	}

	public void crearRAF() {

		try {
			// ABRIR ARCHIVO
			RandomAccessFile f;
			f = new RandomAccessFile(this.nombre, "rw");

			// LEER
			Scanner scan = new Scanner(System.in);
			for (Producto producto : productos) {
				f.writeInt(producto.getCodigo());
				f.writeDouble(producto.getPrecio());
			}
			f.close();
			scan.close();
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}

	}

	public void visualizarRAF() {

		try {
			RandomAccessFile f = new RandomAccessFile(this.nombre, "rw");

			System.out.println("***CONTENIDO DEL ARCHIVO***");
			boolean fin = false;
			do {
				try {
					int codigo = f.readInt();
					double precio = f.readDouble();
					System.out.println("- Codigo = " + codigo);
					System.out.println("- Precio = " + precio);
				} catch (EOFException e) {
					fin = true;
				}
			} while (!fin);
			f.close();
		} catch (IOException e1) {
			System.out.println("Algo ha fallado");
		}
	}

	public void remplazarRAF() {

		try {
			RandomAccessFile f = new RandomAccessFile(this.nombre, "rw");

			int codigo;
			double precio;
			boolean fin = false;
			do {
				try {
					codigo = f.readInt();
					precio = f.readDouble();
					if (precio>100) {
						f.seek(f.getFilePointer()-8);
						f.writeDouble(precio/2);
					}
					else {
						f.seek(f.getFilePointer()-8);
						f.writeDouble(precio*1.5);
					}
					
				} catch (EOFException e) {
					fin = true;
				}
			} while (!fin);
			f.close();
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}

	}
}
