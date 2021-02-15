package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Libro libro1 = new Libro();

		System.out.print("Introduce titulo: ");
		libro1.setTitulo(scan.next());
		System.out.print("Introduce autor: ");
		libro1.setAutor(scan.next());
		System.out.print("Esta prestado? (si/no)");
		String prestado = scan.next();
		if (prestado.equals("si")) {
			libro1.setEstado(false);
		}
		
		System.out.println("LIBRO 1 :");
		System.out.println(libro1.toString());
				
		Libro libro2 = new Libro("Harry Potter", "J.K.Rowling", false);
		
		System.out.println("\nLIBRO 2 :");
		System.out.println(libro2.toString());
		
		scan.close();
	}
}