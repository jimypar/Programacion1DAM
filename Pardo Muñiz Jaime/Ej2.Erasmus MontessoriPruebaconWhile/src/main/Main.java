package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {

			Scanner scan = new Scanner(System.in);

			System.out.println("Elige (L)ondres, (P)raga o (B)rujas:");
			String ciudad = scan.next().toLowerCase();
			char city = ciudad.charAt(0);

			System.out.println("Eres alumno del montessori? (Si/No)");
			String pregunta;
			boolean mont;

			while (true) {
				pregunta = scan.nextLine().trim().toLowerCase();
				if (pregunta.equals("si")) {
					mont = true;
					break;
				}
				if (pregunta.equals("no")) {
					mont = false;
					break;
				}

			}

			System.out.println("Introduce la nota:");
			int nota = scan.nextInt();

			if (city == 'l') {

				if (nota >= 5 && mont == true) {

					System.out.println("Puedes realizar el erasmus de Londres y te regalamos el curso.");

				}

				else if (nota >= 5 && mont == false) {

					System.out.println("Puedes realizar el erasmus de Londres y no tienes regalo.");

				}

				else {

					System.out.println("No puedes realizar el erasmus a londres");

				}
			}

			if (city == 'p') {

				if (nota >= 8 && mont == true) {

					System.out.println("Puedes realizar el erasmus de Praga y te regalamos el viaje.");

				}

				else if ((nota < 8 && nota >= 5) && mont == true) {

					System.out.println("Puedes realizar el erasmus de Praga y tienes descuento en el viaje");

				}

				else if ((nota < 8 && nota >= 5) && mont == false) {

					System.out.println("Puedes realizar el erasmus de Praga");

				}

				else {

					System.out.println("No puedes realizar el erasmus a Praga");

				}
			}

			if (city == 'b') {

				if (mont == true) {

					System.out.println("Puedes realizar el erasmus de Bujas independientemente de la nota.");

				}

				else if (nota >= 5 && mont == false) {

					System.out.println("Puedes realizar el erasmus de Brujas aunque no seas del colegio");

				}

				else {

					System.out.println("No puedes realizar el erasmus a Brujas");

				}
			}

			scan.close();

		}

		catch (Exception e) {

			System.out.println("Algo ha fallado");
		}
	}

}
