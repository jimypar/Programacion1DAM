package main;

import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		System.out.println("Alumnos ASIR");
		int CantidadNombresASIR = scan.nextInt();
		System.out.println("Alumnos DAM");
		int CantidadNombresDAM = scan.nextInt();
		
		String[] asir = new String[CantidadNombresASIR];
		String[] dam = new String[CantidadNombresDAM];
			
		
		System.out.println("Alumnos ASIR");
		OperacionesConCadenas.rellenarNombres(asir);
		System.out.println("Alumnos DAM");
		OperacionesConCadenas.rellenarNombres(dam);

		
		System.out.println("ASIR:");
		OperacionesConCadenas.VisualizarNombres(asir);
		System.out.println();
		System.out.println("DAM:");
		OperacionesConCadenas.VisualizarNombres(dam);
		
		modificar(dam,asir);
		
		System.out.println("ASIR:");
		OperacionesConCadenas.VisualizarNombres(asir);
		System.out.println();
		System.out.println("DAM:");
		OperacionesConCadenas.VisualizarNombres(dam);
	}

	private static void modificar(String[] dam, String[] asir) {
		
		System.out.println();
		System.out.println("Quieres modificar?");
		scan.nextLine();
		String respuesta="";
		while(true){
			respuesta = scan.nextLine().trim().toLowerCase();
			if (respuesta.equals("si"))			
			OperacionesConCadenas.ModificarNombres(asir);	
			if (respuesta.equals("no")) {
			break;
			}
		}
		
	}
	
	

}
