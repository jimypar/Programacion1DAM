package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {

			System.out.println("Introduce las horas diurnas trabajadas:");
			int h_dia = scan.nextInt();
			System.out.println("Introduce las horas nocturnas trabajadas:");
			int h_n = scan.nextInt();
			System.out.println("Es domingo? introduce si o no?");
			String answer;
			boolean h_dom;

			while (true) {
				answer = scan.nextLine().trim().toLowerCase();
				if (answer.equals("si")) {
					h_dom = true;
					break;
				} else if (answer.equals("no")) {
					h_dom = false;
					break;		
				}
			}
			
			if (h_dia > 0 && h_dom == false) {

				int euros = 6;
				int salario = euros * h_dia;
				System.out.println("Cobras " + euros + "€/hora y un total de: " + salario + "€. por la jornada diurna");

			}

			if (h_n > 0 && h_dom == false) {

				int euros = 9;
				int salario = euros * h_dia;
				System.out
						.println("Cobras " + euros + "€/hora y un total de: " + salario + "€. por la jornada nocturna");

			}
			if (h_dia > 0 && h_dom == true) {

				int euros = 6 + 3;
				int salario = euros * h_dia;
				System.out.println("Cobras " + euros + "€/hora y un total de: " + salario + "€. por la jornada diurna");

			}

			if (h_n > 0 && h_dom == true) {

				int euros = 9 + 7;
				int salario = euros * h_dia;
				System.out
						.println("Cobras " + euros + "€/hora y un total de: " + salario + "€. por la jornada nocturna");

			}

			scan.close();

		}

		catch (Exception e) {

			System.out.println("Caracter no valido");

		}
	}

}
