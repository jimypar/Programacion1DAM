package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Aula {

	private Scanner scan = new Scanner(System.in);
	private String nombre;
	private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	
	Aula() {
		this.nombre = "";
		}
	
	Aula(String nombre){
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	void rellenar() {

		boolean continuar=true;
		do {
			System.out.println("Introduce el nombre del alumno ");
			this.alumnos.add(new Alumno(scan.next()));

			System.out.println("Deseas crear otro? (si/no)");
			String respuesta = scan.next();
			if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
				continuar = false;
			}

		}while(continuar);

	}
	
	void visualizar() {
		System.out.println(this.nombre);
		for (int i = 0; i < this.alumnos.size(); i++) {
			System.out.println();
			System.out.print("- Alumno " + (i + 1) + " = ");
			this.alumnos.get(i).visualizar();
		}
		
	}

	void menu() {
		boolean salir = false;
		do {
			int numAlumno = -1;
			do {
				System.out.println("Elige un alumno");
				String busqueda = scan.next();
				for (Alumno alumno : alumnos) { 
					if(alumno.getNombre().equalsIgnoreCase(busqueda)) { 
						numAlumno = alumnos.indexOf(alumno); 
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
				this.alumnos.get(numAlumno).rellenar();
				break;
			case 2:
				this.alumnos.get(numAlumno).visualizar();
				break;
			case 3:
				this.alumnos.get(numAlumno).eliminarNota();
				break;
			case 4:
				salir=true;
			}
		} while (!salir);
	}

}
