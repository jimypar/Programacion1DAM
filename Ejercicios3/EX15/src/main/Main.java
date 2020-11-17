package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un caracter de la piramide ");
		
		char c = scan.next().charAt(0);
		
		System.out.println("Hacia donde quieres que apunte?: \n1.Hacia arriba \n2.Hacia izquierda \n3.Hacia derecha \n4.Hacia abajo");
		
		int orientacion = scan.nextInt();
		
		switch (orientacion) {
		case 1:
			
			System.out.println(" "+" "+ " "+c);
			System.out.println(" "+" "+c+c+c);
			System.out.println(" "+c+c+c+c+c);
			break;
			
		case 2:
			
			System.out.println(" "+" "+" "+" "+c);
			System.out.println(" "+" "+" "+c+c);
			System.out.println(" "+" "+c+c+c);
			System.out.println(" "+c+c+c+c);
			System.out.println(" "+" "+c+c+c);
			System.out.println(" "+" "+" "+c+c);
			System.out.println(" "+" "+" "+" "+c);
			break;
			
		case 3:
			
			System.out.println(" "+c);
			System.out.println(" "+c+c+c);
			System.out.println(" "+c+c+c+c+c);
			System.out.println(" "+c+c+c+c+c+c);
			System.out.println(" "+c+c+c+c+c);
			System.out.println(" "+c+c+c);
			System.out.println(" "+c);
			break;
			
		case 4:
	
			System.out.println(" "+c+c+c+c+c);
			System.out.println(" "+" "+c+c+c);			
			System.out.println(" "+" "+ " "+c);
			break;

		default:
			break;
		}

		scan.close();
	}

}
