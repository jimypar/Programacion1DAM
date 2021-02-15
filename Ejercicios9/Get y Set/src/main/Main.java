package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno();

		System.out.print("Nombre alumno 1: ");
		alumno1.setNombre(scan.next());
		System.out.print("Nota alumno 1: ");
		alumno1.setNota(scan.nextInt());
		System.out.print("Nombre alumno 2: ");
		alumno2.setNombre(scan.next());
		System.out.print("Nota alumno 2: ");
		alumno2.setNota(scan.nextInt());
		
		
		System.out.println("Nombre alumno 1:"+alumno1.getNombre());
		System.out.println("Nota alumno 1"+alumno1.getNota());
		System.out.println("Nombre alumno 2:"+alumno2.getNombre());
		System.out.println("Nota alumno 2"+alumno2.getNota());
		
		scan.close();
	}

}
