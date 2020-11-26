package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String nombre, nombremax = null, nombremin = null;
		int horas;
		int categoria;
		int extras;
		int res1 = 0;
		int ren1 = 0;
		int max = 0;
		int min = 0;
		int total = 0;
		char c = 0;

		for (int i = 1; i >= 1; i++) {
			System.out.println("Nombre ");
			nombre = in.next();
			nombre.charAt(0);
			c = nombre.charAt(0);
			if (c == '*') {
				break;
			}

			System.out.println("Horas trabajadas");
			horas = in.nextInt();
			while (horas < 0) {
				System.out.println("Error");
				System.out.println("Introduce las horas trabajadas");
				horas = in.nextInt();
			}

			System.out.println("Categoria profesional ");
			categoria = in.nextInt();
			while (categoria < 1 || categoria > 3) {
				System.out.println("Error");
				System.out.println("Introduce la categoria profesional");
				categoria = in.nextInt();
			}

			System.out.println("numero horas extras");
			extras = in.nextInt();

			while (extras < 0) {
				System.out.println("Error");
				System.out.println("Introduce las horas extras");
				extras = in.nextInt();
			}

			total = horas + extras;

			if (i == 1) {

				max = total;
				min = total;
				nombremin = nombre;
				nombremax = nombre;

			}

			if (total > max) {
				max = total;
				nombremax = nombre;
			}
			if (total < min) {
				min = total;
				nombremin = nombre;
			}

			if (categoria == 1) {
				res1 = horas * 30 + extras * 35;
				ren1 = (res1 * 16) / 100;
			} else if (categoria == 2) {
				res1 = horas * 20 + extras * 25;
				ren1 = (res1 * 14) / 100;
			} else if (categoria == 3) {
				res1 = horas * 10 + extras * 15;
				ren1 = (res1 * 12) / 100;
			}

			System.out.println("Nombre " + nombre);
			System.out.println("Horas trabajadas " + horas);
			System.out.println("Categoria profesional " + categoria);
			System.out.println("Horas extras " + extras);
			System.out.println("");
			System.out.println("sueldo bruto " + res1);
			System.out.println("sueldo neto " + (res1 - ren1));
		}
		System.out.println("max " + nombremax + " " + max);
		System.out.println("min " + nombremin + " " + min);
	}

}
