package objetos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Clase Archivo
 * 
 * @author Jaime
 * @version
 * @since 1.8
 */

public class Archivo {

	private String nombreArchivo;

	/**
	 * Inicializa los atributos de la clase Archivo
	 * 
	 * @param nombreArchivo Ruta completa de archivo
	 */
	public Archivo() {
		this.nombreArchivo = "";
	}

	/**
	 * Inicializa los atributos de la clase Archivo
	 * 
	 * @param nombreArchivo Ruta completa del archivo
	 */
	public Archivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public void crearArchivo() {
		File f = new File(this.nombreArchivo);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println("No se ha podido crear el archivo");
			}
		}
	}

	public String nombrePlato(String busqueda) {

		File f = new File(this.nombreArchivo);
		if (!f.exists()) {
			System.out.println("No se ha encontrado el archivo");
		} else {

			try {

				BufferedReader fuente = new BufferedReader(new FileReader(this.nombreArchivo));

				String linea = "";
				linea = fuente.readLine();
				while (linea != null) {
					String v[] = linea.split(":");
					if (v[0].equalsIgnoreCase(busqueda)) {
						fuente.close();
						return v[1];
					}
					linea = fuente.readLine();
				}

				fuente.close();

			} catch (IOException e) {
				System.out.println("Algo ha fallado");
			}

		}
		return "No existe";

	}

	public int precioPlato(String busqueda) {

		File f = new File(this.nombreArchivo);
		if (!f.exists()) {
			System.out.println("No se ha encontrado el archivo");
		} else {

			try {

				BufferedReader fuente = new BufferedReader(new FileReader(this.nombreArchivo));

				String linea = "";
				linea = fuente.readLine();
				while (linea != null) {
					String v[] = linea.split(":");
					if (v[0].equalsIgnoreCase(busqueda)) {
						fuente.close();
						return Integer.parseInt(v[2]);
					}
					linea = fuente.readLine();
				}

				fuente.close();

			} catch (IOException e) {
				System.out.println("Algo ha fallado");
			}

		}
		return 0;

	}

	public void hacerLog(ArrayList<Mesa> mesas) {

		PrintWriter destino;

		try {
			destino = new PrintWriter(new FileWriter(this.nombreArchivo, false));

			for (Mesa mesa : mesas) {
				destino.println("Mesa " + mesa.getNumero() + ":");
				if (mesa.visualizarMesa().equals("")) {
					destino.println("Sin pedir");
				} else {
					destino.println(mesa.visualizarMesa());
				}
			}

			destino.close();

		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}

	}

	public void verLog(ArrayList<Mesa> mesas) {

		try {
			BufferedReader file = new BufferedReader(new FileReader(this.nombreArchivo));

			String linea = file.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = file.readLine();
			}

			file.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo");
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}
	}

	public void vaciarLog() {

		try {
			BufferedWriter file = new BufferedWriter(new FileWriter(this.nombreArchivo));
			file.write("");
			file.close();

		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo");
		} catch (IOException e) {
			System.out.println("Algo ha fallado");
		}
	}

}
