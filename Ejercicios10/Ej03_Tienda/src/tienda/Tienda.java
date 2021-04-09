package tienda;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
	String nombre;
	ArrayList<Producto> productos;

	public Tienda() {
		this.nombre = "";
		this.productos = new ArrayList<Producto>();
	}

	public void rellenarTienda() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nombre = ");
		this.nombre = scan.nextLine();
		// rellenar el vector de productos
		System.out.print("Codigo (0 para salir)");
		int cod = scan.nextInt();
		while (cod != 0) {
			System.out.println("Precio");
			double pre = scan.nextDouble();
			Producto unProducto = new Producto(cod, pre);
			productos.add(unProducto);
			System.out.print("Codigo (0=salir)");
			cod = scan.nextInt();
		}
		scan.close();
	}

	public void visualizar() {
		System.out.println("Nombre= " + this.nombre);
		System.out.println("Productos de la tienda");
		for (Producto producto : productos) {
			System.out.println(producto.toString());
		}
	}

	public void crearRAF() {
		// el nombre del archivo será el nobmre de la tienda
		// FORMATO DEL ARCHIVO -> cod(int)+precio(double)
		// 1. Abrir el archivo
		try {
			RandomAccessFile f = new RandomAccessFile(this.nombre, "rw");
			for (Producto producto : productos) {
				f.writeInt(producto.getCodigo());
				f.writeDouble(producto.getPrecio());
			}
			f.close();
		} catch (IOException e) {
			System.out.println("Error de acceso al archivo");
		}

	}

	public void visualizarRAF() {
		// FORMATO DEL ARCHIVO -> cod(int, 4 bytes)+precio(double, 8 bytes)
		// 1. abrir el archivo
		try {
			RandomAccessFile f = new RandomAccessFile(this.nombre, "rw");
			// 2. leer el archivo hasta fin de fichero
			int cod;
			double precio;
			boolean findefichero = false;

			do {
				try {
					cod = f.readInt();
					precio = f.readDouble();
					System.out.println("Codigo = " + cod + ", precio = " + precio);
				} catch (EOFException e) {
					System.out.println("Fin de fichero");
					findefichero = true;
				}

			} while (findefichero == false);

			// 3. cerrar el archivo
			f.close();

		} catch (IOException error) {
			System.out.println("Error de acceso al archivo");

		}

	}

}
