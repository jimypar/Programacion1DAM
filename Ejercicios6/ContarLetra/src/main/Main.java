package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Texto:");
		String text = scan.nextLine();
		System.out.println("letra");
		String l = scan.nextLine();
		int count = 0;

		for (int i = 0; i < text.length(); i++) {

			String letra = text.charAt(i) + "";

			if (letra.equals(l)) {
				count++;
			}

		}

		System.out.println("Hay "+count+" "+l);
		scan.close();

	}

}
