package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	for (int i = 0; i < aa.size() - 1; i++) {
		for (int j = i + 1; j < aa.size(); j++) {
			if (aa.get(i).getNombre().compareTo(aa.get(j).getNombre()) > 0) {
				a temp = aa.get(i);
				aa.set(i, aa.get(j));
				aa.set(j, temp);
			}
		}
	}
	
	private Scanner scan = new Scanner(System.in);
	
	
	
	System.out.println("Introduce el nombre");
	this.nombre = scan.nextLine();
	
	String respuesta="";
	do {
		a aaaa = new a();
		aaaa.rellenar();
		this.as.add(aaaa);
		
		System.out.println("Deseas continuar");
		respuesta = scan.nextLine();
		
	} while (respuesta.toLowerCase().trim().equalsIgnoreCase("si"));
	
	private ArrayList<a> as;
	
}
