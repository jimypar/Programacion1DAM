package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Nombre (‘*’ para salir):");
		scan.next();
		System.out.print("Horas trabajadas:");
		int h = scan.nextInt();
		System.out.print("Categoría Profesional:");
		int cat = scan.nextInt();
		System.out.print("Número de horas extras:");
		int hext = scan.nextInt();

		switch (cat) {
		case 1:
			System.out.println("Sueldo bruto = "+cat1bruto(h, hext));
			System.out.println("Sueldo neto = "+cat1neto(h, hext));
			break;

		case 2:
			System.out.println("Sueldo bruto = "+cat2bruto(h, hext));
			System.out.println("Sueldo neto = "+cat2neto(h, hext)); 
			break;

		case 3:
			System.out.println("Sueldo bruto = "+cat3bruto(h, hext));
			System.out.println("Sueldo neto = "+cat3neto(h, hext));
			break;

		default:
			main(args);
			break;
		}

	}

	private static int cat1bruto(int h, int hext) {	
		int bruto = (40*h)+(50*hext);		
		return bruto;
	}
	private static int cat1neto(int h, int hext) {	
		int bruto = (40*h)+(50*hext);
		double neto = bruto-(bruto*0.16);
		return (int) neto;
	}
	
	
	private static int cat2bruto(int h, int hext) {	
		int bruto = (40*h)+(50*hext);		
		return bruto;
	}
	private static int cat2neto(int h, int hext) {	
		int bruto = (40*h)+(50*hext);
		double neto = bruto-(bruto*0.14);
		return (int) neto;
	}
	
	
	private static int cat3bruto(int h, int hext) {	
		int bruto = (30*h)+(40*hext);		
		return bruto;
	}
	private static int cat3neto(int h, int hext) {	
		int bruto = (20*h)+(30*hext);
		double neto = bruto-(bruto*0.12);
		return (int) neto;
	}
	
}
