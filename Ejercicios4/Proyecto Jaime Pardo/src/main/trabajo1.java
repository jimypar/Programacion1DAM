package main;

import java.util.Scanner;

public class trabajo1 {

	public static void Trabajo1(Scanner scan) {

		int matr = -1;
		int araN = 0;
		int catN = 0;
		int madN = 0;
		int andN = 0;
		int galN = 0;

		while (matr != 0) {

			System.out.println("Introduce matricula (0000-9999) (0 para terminar)");
			matr = scan.nextInt();

			if (matr == 0) {

				System.out.println("El programa ha finalizado:");
				break;

			}

			while (matr < 1000 || matr > 9999) {

				System.out.println("Dato incorrecto");
				System.out.println();
				System.out.println("Introduce matricula (0000-9999) (0 para terminar)");
				matr = scan.nextInt();
			}

			String mat = matr + "";
			int num = Integer.parseInt(String.valueOf(mat.charAt(3)));

			switch (num) {
			case 1:
			case 2:
				araN++;
				break;
			case 3:
			case 4:
				catN++;
				break;
			case 5:
			case 6:
				madN++;
				break;
			case 7:
			case 8:
				andN++;
				break;
			case 9:
			case 0:
				galN++;
				break;

			default:

				System.exit(0);

				break;
			}

		}

		int tot = araN + catN + madN + andN + galN;

		System.out.println("Provincia    | Porcentaje");
		System.out.println("Aragon       | " + ((float) araN / tot) * 100 + "%");
		System.out.println("Cataluña     | " + ((float) catN / tot) * 100 + "%");
		System.out.println("Madrid       | " + ((float) madN / tot) * 100 + "%");
		System.out.println("Andalucia    | " + ((float) andN / tot) * 100 + "%");
		System.out.println("Galicia      | " + ((float) galN / tot) * 100 + "%");

	}

	
}
