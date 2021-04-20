package tienda;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

import main.Main;

public class Tienda {

	private String nombreTienda;
	private ArrayList<Aparato> aparatos;
	private ArrayList<Televisor> televisores;

	public Tienda() {
		this.nombreTienda = "";
		this.aparatos = new ArrayList<Aparato>();
		this.televisores = new ArrayList<Televisor>();
	}

	public Tienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
		this.aparatos = new ArrayList<Aparato>();
		this.televisores = new ArrayList<Televisor>();
	}

	public void rellenarTienda() {

		System.out.println("Elige un aparato");
		System.out.println("1. Televisor");
		System.out.println("2. Nevera");
		int opcion = Main.scan.nextInt();
		if (opcion == 1) {
			Televisor televisor = new Televisor();
			televisor.rellenar();
			aparatos.add(televisor);

		}
		if (opcion == 2) {
			Nevera nevera = new Nevera();
			nevera.rellenar();
			aparatos.add(nevera);
		}

	}
	
	public void visualizarTienda() {

		System.out.println("**TIENDA " + this.nombreTienda + "**");
		for (Aparato aparato : aparatos) {
			if (aparato.getClass().getSimpleName().equalsIgnoreCase("Televisor")) {
				System.out.println("Televisor:");
				((Televisor) aparato).visualizar();
			}
			if (aparato.getClass().getSimpleName().equalsIgnoreCase("Nevera")) {
				System.out.println("Nevera: ");
				((Nevera) aparato).visualizar();
			}
		}

	}

	public void crearRAF() {

		try {
			RandomAccessFile f = new RandomAccessFile("tvplasma", "rw");

			for (Televisor televisor : televisores) {
				if (televisor.getTipo().toString().equalsIgnoreCase("PLASMA")) {
					f.writeInt(televisor.getCodigo());
					f.writeFloat(televisor.getPvp());
					f.writeUTF(formatear(televisor.getTipo().getDescripcion(), 50));
				}
			}

			f.close();
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}

	}

	public void visualizarRAF() {

		try {
			RandomAccessFile f = new RandomAccessFile("tvplasma", "rw");

			System.out.println("***CONTENIDO DEL ARCHIVO***");
			boolean fin = false;
			do {
				try {
					int codigo = f.readInt();
					float pvp = f.readFloat();
					String desc = f.readUTF();
					System.out.println("Codigo: " + codigo);
					System.out.println("PVP: " + pvp);
					System.out.println("Descripcion: " + desc);
				} catch (EOFException e) {
					fin = true;
				}
			} while (!fin);
			f.close();
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}

	}

	public void modificarRAF() {
		System.out.println("Que codigo quieres buscar?");
		int codigoBusqueda = Main.scan.nextInt();

		try {
			RandomAccessFile f = new RandomAccessFile("tvplasma", "rw");

			boolean fin = false;
			do {
				try {
					int codigo = f.readInt();
					if (codigo == codigoBusqueda) {
						f.readFloat();
						System.out.println("Nueva descripcion:");
						String newDesc = Main.scan.next();
						f.writeUTF(formatear(newDesc, 50));
					} else {
						f.readFloat();
						f.readUTF();
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

	

//	public void visualizarTienda() {
//
//		System.out.println("TIENDA: " + this.nombreTienda);
//
//		for (Televisor televisor : televisores) {
//			System.out.println("Televisor:");
//			televisor.visualizar();
//		}
//		for (Nevera nevera : neveras) {
//			System.out.println("Nevera:");
//			nevera.visualizar();
//		}
//
//	}

}
