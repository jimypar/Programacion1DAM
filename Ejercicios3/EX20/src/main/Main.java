package main;

import java.util.Scanner;

public class Main {

	static Scanner scan1 = new Scanner(System.in);

	public static void main(String[] args) {

		boolean restart = false;

		do {

			restart = programa();

		}

		while (restart == true);
		scan1.close();
	}

	private static boolean programa() {

		try {

			System.out.println("---------------------------");
			System.out.println("Introduce numero (5 cifras)");
			System.out.println("-----");

			String entrada = scan1.nextLine();

			Scanner scan2 = new Scanner(entrada);

			int numChar = entrada.length();

			boolean fin = false;

			switch (numChar) {
				case 1:

					System.out.println("No vale el numero");
					fin = true;
					break;

				case 2:

					int num0 = entrada.charAt(0);
					int num1 = entrada.charAt(1);

					if (num0 == num1) {

						System.out.println("Es capicua");
						fin = false;
					}

					else {

						System.out.println("No es capicua");
						fin = true;
					}

					break;

				case 3:

					num0 = entrada.charAt(0);
					int num2 = entrada.charAt(2);

					if (num0 == num2) {

						System.out.println("Es capicua");
						fin = false;
					}

					else {

						System.out.println("No es capicua");
						fin = true;
					}

					break;

				case 4:

					num0 = entrada.charAt(0);
					num1 = entrada.charAt(1);
					num2 = entrada.charAt(2);
					int num3 = entrada.charAt(3);

					if (num0 == num3 && num1 == num2) {

						System.out.println("Es capicua");
						fin = false;
					}

					else {

						System.out.println("No es capicua");
						fin = true;
					}

					break;

				case 5:

					num0 = entrada.charAt(0);
					num1 = entrada.charAt(1);
					num3 = entrada.charAt(2);
					int num4 = entrada.charAt(3);

					if (num0 == num4 && num1 == num3) {

						System.out.println("Es capicua");
						fin = false;
					}

					else {

						System.out.println("No es capicua");
						fin = true;
					}

					break;

				default:
				
					break;
			}
			scan2.close();
			return fin;

			
		}

		catch (Exception e) {

			System.out.println("Error");
			return true;
		}

	}

}
