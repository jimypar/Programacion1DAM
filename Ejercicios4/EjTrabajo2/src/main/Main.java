package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String nombre;
		int horas;
		int cat;
		int HorasExtras;
		float salNeto;
		float salBruto;
		int hmax = 0;
		String nombreF = null;
		int catF = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("¿Cuanto empleados deseas introducir?:");
		int empleados = scan.nextInt();

		for (int i = 1;i <=empleados; i++) {

			
			System.out.println();
			System.out.println("----- "+i+" Empleado -----");
			System.out.println();
			System.out.print("Nombre	: ");
			nombre = scan.next();
			char car = nombre.charAt(0);
			
			if (car == '*') {
				
				break;
			}

			System.out.print("Horas trabajadas: ");
			horas = scan.nextInt();

			System.out.print("Categoría Profesional: ");
			cat = scan.nextInt();

			System.out.print("Horas extras: ");
			HorasExtras = scan.nextInt();

			switch (cat) {
			case 1:

				salNeto = (horas * 30) + (HorasExtras * 35);
				salBruto = (float) (salNeto - (salNeto * 0.16));

				break;

			case 2:

				salNeto = (horas * 20) + (HorasExtras * 25);
				salBruto =(float) (salNeto - (salNeto * 0.14));

				break;

			case 3:

				salNeto = (horas * 10) + (HorasExtras * 15);
				salBruto = (float) (salNeto - (salNeto * 0.12));

				break;

			default:

				System.out.println("Datos incorrectos");
				scan.close();
				return;
			}

			
			if (horas+HorasExtras > hmax ) {
				
				hmax = horas+HorasExtras;
				nombreF = nombre;
				catF = cat;
				
			}
			
			System.out.println();
			System.out.println("Salario neto: " + salNeto);
			System.out.println("Salario bruto: " + salBruto);
			
		}

		System.out.println();
		System.out.println("Empleado con mas horas es "+nombreF);
		System.out.println("Con "+hmax+" horas en la categoria "+catF);
		
		
		scan.close();
		System.exit(0);
	}

}
