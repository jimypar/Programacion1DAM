package main;

import java.util.Scanner;

public class Class {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

	}

	public static void rellenarNombres(String[] v) {

		for (int i = 0; i < v.length; i++) {
			System.out.print("Nombre nº" + (i + 1) + " = ");
			v[i] = scan.nextLine();

		}

	}

	public static void VisualizarNombres(String[] v) {

		for (int i = 0; i < v.length; i++) {
			if (i == v.length - 1) {
				System.out.print(v[i]);
			} else {
				System.out.print(v[i] + ",");
			}

		}

	}

	public static int BuscarOtro(String[] v, String name) {

		boolean encontrar = false;
		for (int i = 0; i < v.length; i++) {
			if (name.equalsIgnoreCase(v[i])) {
				encontrar = true;
				return i;
			}
		}
		if (!encontrar) {
			return -1;
		}
		return -1;
	}

	public static void Buscar(String[] v) {

		System.out.println();
		System.out.println("Cuantos nombres quieres buscar?");
		String[] busqueda = new String[scan.nextInt()];
		
		for (int j = 0; j < busqueda.length; j++) {
			System.out.print("Que nombre deseas buscar:");
			String name = scan.next();

			boolean encontrar = false;
			for (int i = 0; i < v.length; i++) {
				if (name.equals(v[i])) {
					String newname = "";
					for (int k=name.length()-1;k>=0;k--) {
						newname += name.charAt(k);				
					}
					v[i]=newname;
					System.out.println(newname);
					encontrar = true;
					break;
				}
			}
			if (!encontrar) {
				System.out.println("Ese nombre no existe");
			}
		}

	}
}
