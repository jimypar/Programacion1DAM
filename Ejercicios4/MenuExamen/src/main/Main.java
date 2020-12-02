package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println();
			System.out.println("MENU:");
			System.out.println("A- Tabla");
			System.out.println("B- Factorial");
			System.out.println("C- Salir");

			String menu = scan.next().trim().toLowerCase();

			while (!menu.equals("c") && !menu.equals("a") && !menu.equals("b")) {

				System.out.println("Valor incorrecto:");
				System.out.println();
				System.out.println("MENU:");
				System.out.println("A- Tabla");
				System.out.println("B- Factorial");
				System.out.println("C- Salir");

				menu = scan.next().trim().toLowerCase();

			}

			if (menu.equals("c")) {
				System.exit(0);
			}
			if (menu.equals("a")) {
				System.out.println();

				System.out.println("Introduce dos numeros:");
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();

				while (num1 < 0 || num1 > 10 || num2 < 0 || num2 > 10) {
					System.out.println();
					System.out.println("Error introduce numeros entre 1 y 10");
					System.out.println("Introduce dos numeros:");
					num1 = scan.nextInt();
					num2 = scan.nextInt();
				}

				if (num1 > num2) {
					int aux = num1;
					num1 = num2;
					num2 = aux;
				}

				for (int i = num2; i >= num1; i--) {

					if (i % 2 == 0) {
						int restot = 0;
						System.out.println();
						System.out.println("Tabla del " + i);

						for (int b = 1; b <= 10; b++) {

							int res = b * i;
							restot += res;
							System.out.println(i + "x" + b + "=" + res);

						}
						System.out.println("El total de los productos es: " + restot);
					}
				}
			}
			if (menu.equals("b")) {
				System.out.println();

				System.out.println("Introduce dos numeros:");
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();

				while (num1 < 0 || num1 > 10 || num2 < 0 || num2 > 10) {
					System.out.println();
					System.out.println("Error introduce numeros entre 1 y 10");
					System.out.println("Introduce dos numeros:");
					num1 = scan.nextInt();
					num2 = scan.nextInt();
				}

				if (num1 > num2) {
					int aux = num1;
					num1 = num2;
					num2 = aux;
				}

				for (int i = num2; i >= num1; i--) {

					if (i % 2 != 0) {
						int fact = 1;
						System.out.println();
						System.out.print("Factorial del " + i + " = ");

						for (int b = 1; b <= i; b++) {

							fact = fact * b;

						}

						System.out.print(fact);
					}
				}

			}

		}
	}

}
