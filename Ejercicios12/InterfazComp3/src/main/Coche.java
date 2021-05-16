package main;

import java.util.Scanner;

public class Coche implements Comparable<Coche> {

	private String marca;
	private String modelo;
	private int km;

	private Scanner scan = new Scanner(System.in);

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getKm() {
		return km;
	}

	public Coche() {
		this.marca = "";
		this.km = 0;
		this.modelo = "";
	}

	public Coche(String marca, String modelo, int km) {
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
	}

	void rellenar() {

	}

	void visualizar() {

	}

	@Override
	public String toString() {
		return "Nombre: " + marca + ", Edad: " + km + ", DNI: " + modelo;
	}

	public int compareTo(Coche coche) {
		if (this.km > coche.getKm()) {
			return 1;
		} else if (this.km < coche.getKm()) {
			return -1;
		} else {
			if (this.modelo.compareTo(coche.getModelo()) < 0) {
				return 1;
			} else if (this.modelo.compareTo(coche.getModelo()) > 0) {
				return -1;
			}
		}
		return 0;
	}

}
