package main;

import java.util.Scanner;

public class Main {   
  
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un numero:");
		int num = scan.nextInt();
		int i;
		int suma = 0;

		for (i = 1; i <= num; i += 2) {

			suma += i;
			System.out.println(i);

		}

		System.out.println("La suma es " + suma);
	}

}