package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import empresa.Empresa;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Empresa empresa = new Empresa();

		empresa.rellenarEmpresa();
		empresa.visualizarEmpresa();
		
		int porcentaje = 0;
		boolean fin = false;
		do {
			try {
				System.out.println("Cuanto porcentaje quieres aumentar?");
				porcentaje = scan.nextInt();
				fin = true;
			} catch (InputMismatchException e) {
				fin = false;
				scan.next();
			}
		} while (!fin || porcentaje<=0 || porcentaje>100);
		empresa.aumentarPorcentaje(porcentaje);
		
		empresa.visualizarEmpresa();

	}

}
