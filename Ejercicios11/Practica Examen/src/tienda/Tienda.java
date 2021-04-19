package tienda;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

	private String nombreTienda;
	private ArrayList<Aparato> aparatos;
	private ArrayList<Televisor> televisores;
	private ArrayList<Nevera> neveras;

	public Tienda() {
		this.nombreTienda = "";
		this.aparatos = new ArrayList<Aparato>();
		this.televisores = new ArrayList<Televisor>();
		this.neveras = new ArrayList<Nevera>();
	}

	public Tienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
		this.aparatos = new ArrayList<Aparato>();
		this.televisores = new ArrayList<Televisor>();
		this.neveras = new ArrayList<Nevera>();
	}

	public void rellenarTienda() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Elige un aparato");
		System.out.println("1. Televisor");
		System.out.println("2. Nevera");
		int opcion = scan.nextInt();
		if (opcion == 1) {
			Televisor televisor = new Televisor();
			televisor.rellenar();
			televisores.add(televisor);

		}
		if (opcion == 2) {
			Nevera nevera = new Nevera();
			nevera.rellenar();
			neveras.add(nevera);
		}

	}

	public void visualizarTienda() {

		System.out.println("TIENDA: " + this.nombreTienda);

		for (Televisor televisor : televisores) {
			System.out.println("Televisor:");
			televisor.visualizar();
		}
		for (Nevera nevera : neveras) {
			System.out.println("Nevera:");
			nevera.visualizar();
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
//		System.out.println("**TIENDA " + this.nombreTienda + "**");
//		for (Aparato aparato : aparatos) {
//			if (aparato.getClass().getName().equalsIgnoreCase("Televisor")) {
//				System.out.println("Televisor:");
//				((Televisor)aparato).visualizar();
//			}
//			if (aparato.getClass().getName().equalsIgnoreCase("Nevera")) {
//				System.out.println("Nevera");
//				((Nevera)aparato).visualizar();
//			}
//		}
//
//	}

}
