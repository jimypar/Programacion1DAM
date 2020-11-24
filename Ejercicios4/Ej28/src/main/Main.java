package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int aux1 = scan.nextInt();
		int aux2 = scan.nextInt();
		int num = scan.nextInt();

		while (num < (aux1 + aux2)) {

			aux2 = aux1;
			aux1 = num;

			System.out.println("no");

			num = scan.nextInt();

		}

		System.out.println("si");

		scan.close();

	}

}
