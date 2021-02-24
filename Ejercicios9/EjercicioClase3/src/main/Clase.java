package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Clase {

	private String nombre;
	private Scanner scan = new Scanner(System.in);
	private ArrayList<Alumno> alumno = new ArrayList<Alumno>();
	
	Clase() {
		this.nombre = "";
		}
	
	Clase(String nombre){
		this.nombre = nombre;
	}

	

	public String getNombre() {
		return nombre;
	}

	void rellenar() {

		for (int i = 1; i > 0; i++) {
			System.out.println("Introduce el nombre del alumno " + i);
			alumno.add(new Alumno(scan.next()));

			System.out.println("Deseas crear otro? (si/no)");
			String respuesta = scan.next();
			if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
				i = -1;
			}

		}

	}
	
	public void visualizar() {
		System.out.println(this.nombre);
		for (int i = 0; i < this.alumno.size(); i++) {
			System.out.println();
			System.out.print("- Alumno " + (i + 1) + " = ");
			this.alumno.get(i).visualizar();
		}
		
	}

	void menu() {
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
			System.out.println("4-Cambiar clase");
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
				Main.menu();
			}
		} while (true);
	}

}
