package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i;
		int mult = 0;
		int acierto = 0;
		int fallo = 0;
		int aciertoT = 0;
		int falloT = 0;
		int num = 1;
		int tmax = 0;
		int tmin = 0;
		int maxE = 0;
		int minE = 11;

		while (num != 0) {

			acierto = 0;
			fallo = 0;

			System.out.println(" ");
			System.out.println("---------------------");
			System.out.println("(Introduce 0 para terminar) ");
			System.out.print("Introduce un numero: ");
			num = scan.nextInt();

			if (num == 0) {

				System.out.println("Has acertado: " + aciertoT + " en total");
				System.out.println("Has fallado: " + falloT + " en total");
				System.out.println("La tabla con mas fallos ha sido: " + tmax + " con " + maxE + " errores");
				System.out.println("La tabla con menos fallos ha sido: " + tmin + " con " + minE + " errores");
				System.exit(0);
			}

			else {

				for (i = 1; i <= 10; i++) {

					int res = 0;
					System.out.print(num + " x " + i + " es: ");
					res = scan.nextInt();
					mult = num * i;

					if (res == mult) {

						System.out.println("Correcto");
						acierto++;
						aciertoT++;
					}

					else {

						System.out.println("Error");
						System.out.println("El resultado era: " + num + "x" + i + "=" + mult);
						fallo++;
						falloT++;
					}

				}

				System.out.println("Has acertado: " + acierto);
				System.out.println("Has fallado: " + fallo);

				if (fallo > maxE) {

					maxE = fallo;
					tmax = num;

				}

				else if (fallo < minE) {

					minE = fallo;
					tmin = num;

				}

			}
		}
	}
}