package main;

//importe
import java.util.Scanner;

public class Generador {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//Cambiamo nombre de scanner
		
		//Pregunta longitud antes del menu
		System.out.println("Introduce la longitud de la cadena: ");		
		int longitud = scan.nextInt();
		
		System.out.println("Programa que genera passwords de la longitud indicada, y del rango de caracteres");
		System.out.println("1 - Caracteres desde A - Z");
		System.out.println("2 - Numeros del 0 al 9");
		System.out.println("3 - Letras y caracteres especiales");
		System.out.println("4 - Letras, numeros y caracteres especiales");
		System.out.println("Elige tipo de password: ");
		int opcion = scan.nextInt();
		String password = "";
		char letra;
		int numero;
		switch (opcion) {
		case 1:
			for (int i = 0; i < longitud; i++) {
				letra = (char) ((Math.random() * 26) + 65);
				password += letra;
			}
			break;
		case 2:
			for (int i = 0; i < longitud; i++) {
				numero = (int) (Math.random() * 10);
				password += numero;
			}
			break;
		case 3:
			for (int i = 0; i < longitud; i++) {
				int n = (int) (Math.random() * 2);
				if (n == 1) {
					letra = (char) ((Math.random() * 26) + 65);
					password += letra;
				} else {
					letra = (char) ((Math.random() * 15) + 33);
					password += letra;
				}
			}
			break;
		case 4:
			for (int i = 0; i < longitud; i++) {
				int n;
				n = (int) (Math.random() * 3);
				if (n == 1) {
					letra = (char) ((Math.random() * 26) + 65);
					password += letra;
				} else if (n == 2) {
					letra = (char) ((Math.random() * 15) + 33);
					password += letra;
				} else {
					numero = (int) (Math.random() * 10);
					password += numero;
				}
			}
			break;
		}

		System.out.println(password);
		scan.close();
	}
	
	public static void menu() {
				
		System.out.println("Programa que genera passwords de la longitud indicada, y del rango de caracteres");
		System.out.println("1 - Caracteres desde A - Z");
		System.out.println("2 - Numeros del 0 al 9");
		System.out.println("3 - Letras y caracteres especiales");
		System.out.println("4 - Letras, numeros y caracteres especiales");
		System.out.println("Elige tipo de password: ");
		int opcion = scan.nextInt();
		
	}

}
