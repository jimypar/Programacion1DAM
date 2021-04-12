package alumnos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Colegio {

	private String nombre;
	private ArrayList<Alumno> alumnos;
	private Scanner scan = new Scanner(System.in);
	private RAF raf = new RAF();

	public Colegio() {
		this.nombre = "";
		this.alumnos = new ArrayList<Alumno>();
	}

	public void rellenarColegio() {

		System.out.print("Nombre colegio = ");
		this.nombre = scan.nextLine();
		String respuesta;
		// Rellenar alumnos
		do {

			// NOMBRE

			String nombre;
			do {
				System.out.println("Nombre de alumno:");
				nombre = scan.next();
				if (nombre.length()>20) {
					System.out.println("El nombre es demasiado largo"); 
				}
			} while (nombre.length() > 20);
			nombre = formatear(nombre, 20);

			// CICLO

			String ciclo;
			do {
				System.out.println("Nombre del ciclo:");
				ciclo = scan.next();
				if (ciclo.length()>15) {
					System.out.println("El nombre de ciclo es demasiado largo"); 
				}
			} while (ciclo.length() > 15);
			ciclo = formatear(ciclo, 15);

			// CURSO

			byte curso = 1;
			boolean fin = false;
			do {
				try {
					System.out.println("Introduce el curso(1 o 2)");
					curso = scan.nextByte();
					if (curso == 1 || curso == 2) {
						fin = true;
					}
				} catch (InputMismatchException e) {
					System.out.println("Introduce 1 o 2");
					fin = false;
					scan.next();
				}
			} while (!fin);

			// CANTIDAD MODULOS

			int cantidadModulo = 0;
			fin = false;
			do {
				try {
					System.out.println("Introduce la cantidad de modulos:");
					cantidadModulo = scan.nextInt();
					fin = true;
				} catch (InputMismatchException e) {
					System.out.println("Introduce un numero");
					fin = false;
					scan.next();
				}
			} while (!fin);

			Alumno alumno = new Alumno(nombre, ciclo, curso, cantidadModulo);
			alumnos.add(alumno);
			alumno.rellenarModulos();

			System.out.println("Deseas poner otro alumno?");
			respuesta = scan.next();

		} while (!respuesta.trim().equals("no"));

		raf.comprobarRAF(alumnos,this.nombre);
		raf.visualizarRAF(this.nombre);

	}

	private String formatear(String nombre, int longitud) {
		for (int j = nombre.length(); j < longitud; j++) {
			nombre += " ";
		}
		return nombre;
	}

	public void visualizar() {

		System.out.println("Colegio: " + this.nombre);
		System.out.println("---Alumnos---");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.toString());
			alumno.toStringModulos();
		}

	}

	public void menu() {

		do {
			int menu = 0;
			boolean error = false;
			do {
				try {
					System.out.println();
					System.out.println("Que deseas hacer?");
					System.out.println("1-Buscar un nombre");
					System.out.println("2-Remplazar nombre modulo");
					System.out.println("3-Remplazar nota de un modulo");
					System.out.println("4-Visualizar colegio");
					System.out.println("5-Calcular alumno con mas nota");
					System.out.println("6-Salir");
					menu = scan.nextInt();
					error = false;
				} catch (InputMismatchException e) {
					error = true;
					scan.nextLine();
				}
			} while (error);

			switch (menu) {
			case 1:
				raf.buscarRAF(this.nombre);
				break;
			case 2:
				raf.remplazarModuloRAF(this.nombre);
				break;
			case 3:
				raf.remplazarNotaRAF(this.nombre);
				break;
			case 4:
				raf.visualizarRAF(this.nombre);
				break;
			case 5:
				raf.alumnoConMasNota(this.nombre);
				break;
			case 6:
				raf.borrarRAF(this.nombre);
				System.exit(0);

			}
		} while (true);

	}

}
