package main;

import java.util.Scanner;

public class OperacionesConCadenas {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

	
	}

	public static void rellenarNombres(String[] v) {
		
		for (int i = 0; i<v.length;i++) {
			System.out.print("Nombre nº"+(i+1)+" = ");
			v[i]=scan.nextLine(); 
			
		}
		
	}

	public static void VisualizarNombres(String[] v) {

		for (int i = 0; i<v.length;i++) {
			if (i==v.length-1) {
				System.out.print(v[i]);				
			}
			else {
				System.out.print(v[i]+",");
			}
			
		}
		
	}

	public static void ModificarNombres(String[] v) {
		
		System.out.println("Que nombre deseas modificar");
		String oldname = scan.nextLine();
		boolean encontrar=false;
		for (int i = 0; i<v.length;i++) {
			if (oldname.equals(v[i])){
				System.out.println("Introduce el nuevo nombre");
				String newname = scan.nextLine();
				v[i]=newname;
				encontrar=true;
				break;
			}
			
		}
		if (!encontrar) {
			System.out.println("Ese nombre no existe");			
		}
		
		
	}

}
