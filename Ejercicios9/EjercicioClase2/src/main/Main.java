package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Alumno> alumno = new ArrayList<Alumno>();

		for (int i = 1; i > 0; i++) {
			System.out.println("Introduce el nombre del alumno " + i);
			alumno.add(new Alumno(scan.next()));

			System.out.println("Deseas crear otro? (si/no)");
			String respuesta = scan.next();
			if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
				i = -1;
			}

		}
		
		do {
		int numAlumno = -1;
		do {
			System.out.println("Elige un alumno");
			String busqueda = scan.next();
			for (int i = 0; i < alumno.size(); i++) {
				if (alumno.get(i).getNombre().equals(busqueda)) {
					numAlumno = i;
				}
			}
		} while (numAlumno == -1);
		
		System.out.println("Que deseas hacer?");
		System.out.println("1-Rellenar alumno");
		System.out.println("2-Ver notas (media)");
		System.out.println("3-Eliminar nota");
		System.out.println("4-Salir");
		int menu = scan.nextInt();
		switch (menu) {
		case 1:
			alumno.get(numAlumno).rellenar();
			break;
		case 2:
			alumno.get(numAlumno).visualizar();
			break;
		case 3:
			alumno.get(numAlumno).eliminarNota();
			break;
		case 4:
			System.exit(0);
			scan.close();
		}
		}while(true);
		
	
	}
	

}
