package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Hola, como te llamas?");
		
		String nombre = scan1.nextLine();
		
		System.out.println(+nombre);

	}

}
