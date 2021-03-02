package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Aeropuerto {

	private Scanner scan = new Scanner(System.in);
	private String nombre;
	private String direccion;
	private ArrayList<Compania> companias;

	public Aeropuerto() {
		this.nombre = "";
		this.direccion = "";
		this.companias = new ArrayList<Compania>();
		;
	}

	public Aeropuerto(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.companias = new ArrayList<Compania>();
		;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void rellenar() {

		System.out.println("Introduce el nombre aeropuerto:");
		this.nombre = scan.nextLine();
		System.out.println("Introduce direccion:");
		this.nombre = scan.nextLine();

		String respuesta = "";
		do {
			Compania compania = new Compania();
			compania.rellenar();
			this.companias.add(compania);

			System.out.println("Deseas continuar");
			respuesta = scan.nextLine();

		} while (respuesta.toLowerCase().trim().equalsIgnoreCase("si"));

	}

	public void visualizar() {

		System.out.println("Aeropuerto: " + this.nombre);
		System.out.println("Direccion: " + this.direccion);

		for (Compania compania : companias) {
			compania.visualizar();
		}

	}

	public void ordenar() {

		for (int i = 0; i < companias.size() - 1; i++) {
			for (int j = i + 1; j < companias.size(); j++) {
				if (companias.get(i).getNombre().compareTo(companias.get(j).getNombre()) > 0) {
					Compania temp = companias.get(i);
					companias.set(i, companias.get(j));
					companias.set(j, temp);
				}
			}
		}
		for (Compania compania : companias) {
			compania.ordenar();
		}

	}

	public void buscar() {

		boolean encontrada = false;
		do {
			System.out.println("Que compañia quieres buscar:");
			String busca = scan.nextLine();
			for (Compania compania : companias) {
				if (compania.getNombre().equalsIgnoreCase(busca)) {
					System.out.println("La compañia :" + compania.getNombre());
					compania.visualizar();
					encontrada = true;
				}
			}
		} while (!encontrada);

	}

	void maximo() {

		int max = 0;
		String compMax = "";
		for (Compania compania : companias) {			
			compania.total();
			if (compania.getTotalPasj() > max) {
				max = compania.getTotalPasj();
				compMax = compania.getNombre();
			}
		}
		System.out.println("La compañia con mas es " + compMax + " con " + max);
	}

	void modificar() {

		System.out.println("Que destino quieres buscar:");
		String busca = scan.nextLine();
		for (Compania compania : companias) {
			compania.modificar(busca);
		}

	}

}
