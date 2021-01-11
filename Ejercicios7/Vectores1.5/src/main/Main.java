package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Cuanto numeros deseas introducir:");
		int nums = scan.nextInt();
		int array[] = new int[nums];

		for (int i = 0; i < nums; i++) {

			System.out.print("Introduce un numero:");
			array[i] = scan.nextInt();

		}
		
		System.out.print("Lista= ");
		
		for (int a = 0; a < nums; a++) {
			System.out.print(array[a]+" ");
		}
		
		scan.close();
	}

}
