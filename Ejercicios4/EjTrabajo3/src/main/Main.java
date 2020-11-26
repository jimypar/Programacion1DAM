package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String name = null;
		String nombremax = null;
		String nombremin = null;
		int h;
		int cat;
		int hext;
		double bruto = 0;
		double neto = 0;
		int max = 0;
		int min = Integer.MAX_VALUE;
	
		

		while (name != "*") {

			System.out.println();
			System.out.print("Nombre: (*fin) ");
			name = scan.next();
			char car = name.charAt(0);
			if (car == '*') {

				System.out.println();
				break;

			}

			System.out.print("Horas trabajadas: ");
			h = scan.nextInt();
			while (h < 0) {
				System.out.println("Error");
				System.out.print("Introduce las horas trabajadas");
				h = scan.nextInt();
			}

			System.out.print("Categoría Profesional: ");
			cat = scan.nextInt();
			while (cat < 1 || cat > 3) {
				System.out.println("Error");
				System.out.print("Introduce la categoria profesional");
				cat = scan.nextInt();
			}

			System.out.print("Número de horas extras: ");
			hext = scan.nextInt();
			while (hext < 0) {
				System.out.println("Error");
				System.out.print("Introduce las horas trabajadas");
				hext = scan.nextInt();
			}

			switch (cat) {
			case 1:

				bruto = h * 30 + hext * 35;
				neto = bruto - (bruto * 0.16);
				break;
			case 2:

				bruto = h * 20 + hext * 25;
				neto = bruto - (bruto * 0.16);
				break;
			case 3:

				bruto = h * 10 + hext * 15;
				neto = bruto - (bruto * 0.16);
				break;

			default:
				System.exit(0);
				break;
			}
			
			System.out.println("Salario bruto= "+bruto);
			System.out.println("Salario neto= "+neto);

			if ((h+hext)>max) {				
				max=(h+hext);
				nombremax = name;				
			}
			
			if ((h+hext)<min ) {
				min=(h+hext);
				nombremin = name;					
			}
			
			
		}
		
		System.out.println("El trabajador con mas horas es: "+nombremax+ " con " +max+ " horas ");
		System.out.println("El trabajador con menos horas es: "+nombremin+ " con " +min+ " horas ");
		
		scan.close();
	}

}
