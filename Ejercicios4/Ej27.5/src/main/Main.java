package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String nombre;
		int edad;
		char sexo;
		int cantAlumnos;
		int hombre = 0;
		int mujer = 0;
		int edadHmax = 0;
		String nombreHmax = null;
		int edadHmin = Integer.MAX_VALUE;
		String nombreHmin = null;
		int edadMmax = 0;
		String nombreMmax = null;
		int edadMmin = Integer.MAX_VALUE;
		String nombreMmin = null;
		int edadHombres = 0;
		int edadMujeres = 0;
		int mediaH = 0;
		int mediaM = 0;

		System.out.println("Cantidad de alumnos: ");
		cantAlumnos = scan.nextInt();

		for (int i = 1; i <= cantAlumnos; i++) {

			System.out.println();
			System.out.println("Alumno" + i);
			System.out.println();
			System.out.print("Nombre: ");
			nombre = scan.next();
			System.out.println();
			System.out.print("Edad: ");
			edad = scan.nextInt();
			while (edad > 100 || edad <= 0) {

				System.out.println("Error");
				System.out.print("Edad: ");
				edad = scan.nextInt();
			}
			System.out.println();
			scan.nextLine();
			System.out.print("Sexo (h) o (m): ");
			sexo = scan.nextLine().toLowerCase().charAt(0);
			while (sexo != 'h' && sexo != 'm') {

				System.out.println("Error");
				System.out.print("Sexo: ");
				sexo = scan.nextLine().toLowerCase().charAt(0);

			}
			// PRIMERO
			

			// SEXO
			if (sexo == 'h') {
				hombre++;
			} else {
				mujer++;
			}
			// EDAD MAX ALUMNO
			if (edad > edadHmax && sexo == 'h') {
				edadHmax = edad;
				nombreHmax = nombre;
			}
			// EDAD MIN ALUMNO
			if (edad < edadHmin && sexo == 'h') {
				edadHmin = edad;
				nombreHmin = nombre;
			}
			// EDAD MAX ALUMNA
			if (edad > edadMmax && sexo == 'm') {
				edadMmax = edad;
				nombreMmax = nombre;
			}
			// EDAD MIN ALUMNA
			if (edad < edadMmin && sexo == 'm') {
				edadMmin = edad;
				nombreMmin = nombre;
			}
			// EDADES HOMBRES
			if (sexo == 'h') {
				edadHombres = edad + edadHombres;
				mediaH = edadHombres / hombre;
			}
			// EDADES MUJERES
			if (sexo == 'm') {
				edadMujeres = edad + edadMujeres;
				mediaM = edadMujeres / mujer;
			}

		}

		System.out.println("Hombres: " + hombre);
		System.out.println("Mujeres: " + mujer);
		System.out.println("El alumno con mas años es " + nombreHmax + " con " + edadHmax + " años");
		System.out.println("El alumno con menos años es " + nombreHmin + " con " + edadHmin + " años");
		System.out.println("La alumna con mas años es " + nombreMmax + " con " + edadMmax + " años");
		System.out.println("La alumna con menos años es " + nombreMmin + " con " + edadMmin + " años");
		System.out.println("La media de edad en hombres es: " + mediaH);
		System.out.println("La media de edad en mujeres es: " + mediaM);

		scan.close();

	}

}
