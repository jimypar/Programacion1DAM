package main;

import java.util.Scanner;

public class Main {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		boolean restart = false;

		do {

			restart = programa();

		} while (restart == true);
		scan.close();
	}

	private static boolean programa() {

		System.out.println("Introduce si o no");

		String pregunta;

		boolean si;

		while (true) {
			pregunta = scan.nextLine();
			if (pregunta.equals("si")) {
				si = true;
				break;
			} else if (pregunta.equals("no")) {
				si = false;
				break;
			}
		}

		if (si == true) {

			System.out.println("Has dicho si");
		}

		if (si == false) {

			System.out.println("Has dicho no");

		}

		return false;
	}

}
