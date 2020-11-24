package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int matr = -1;
		int araN = 0;
		int catN = 0;
		int madN = 0;
		int andN = 0;
		int galN = 0;

		while (matr != 0) {

			System.out.println("Introduce matricula");
			matr = scan.nextInt();

			if (matr == 0 ) {
				
				System.out.println("El programa ha finalizado:");
				break;
				
			}
			
			if (matr < 1000 || matr > 9999) {

				System.out.println("Dato incorrecto");
				System.exit(0);
			}

			String mat = matr + "";
			int num = Integer.parseInt(String.valueOf(mat.charAt(3)));
			
			switch (num) {
			case 1, 2:
				araN++;
				break;
			case 3, 4:
				catN++;
				break;
			case 5, 6:
				madN++;
				break;
			case 7, 8:
				andN++;
				break;
			case 9, 0:
				galN++;
				break;

			default:

				System.exit(0);

				break;
			}

		}

		int tot = araN + catN + madN + andN + galN;
		
		System.out.println("Provincia    | Porcentaje");
		System.out.println("Aragon       | "+((double)araN/tot)*100+"%");
		System.out.println("Cataluña     | "+((double)catN/tot)*100+"%");
		System.out.println("Madrid       | "+((double)madN/tot)*100+"%");
		System.out.println("Andalucia    | "+((double)andN/tot)*100+"%");
		System.out.println("Galicia      | "+((double)galN/tot)*100+"%");

		scan.close();
	}

}
