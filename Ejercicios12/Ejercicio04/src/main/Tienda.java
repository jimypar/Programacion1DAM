package main;

import java.util.ArrayList;
import java.util.Scanner;

import instrumentos.Instrumento;

public class Tienda {

	private String nombre;
	private ArrayList<Instrumento> instrumentos;

	public Tienda() {
		this.instrumentos = new ArrayList<Instrumento>();
	}

	public Tienda(ArrayList<Instrumento> instrumentos) {
		this.instrumentos = new ArrayList<Instrumento>();
	}

	void rellenar() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Elige que instrumento quieres hacer?");
		System.out.println("1.Guitarra");
		System.out.println("2.Bateria");
		int menu = scan.nextInt();
		if (menu == 1) {
			
		}

	}

}
