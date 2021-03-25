package com.elenajif.refactorizando;

import java.util.Scanner;

public class Refactorizar5 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);

		System.out.println("Introduce una cantidad de gramos");
		int gr = a.nextInt();

		if (gr >= 0) {

			System.out.println("1: Kilogramos");
			System.out.println("2: Hectogramos");
			System.out.println("3: Decagramos");
			System.out.println("4: decigramos");
			System.out.println("5: centigramos");
			System.out.println("6: miligramos");
			System.out.println("¿A qué unidad quieres convertirlos?");
			int o = a.nextInt();

			switch (o) {
			case 1:
				double kg = gr / 1000.0;
				System.out.println(kg + " kg");
				break;

			case 2:
				double hc = gr / 100.0;
				System.out.println(hc + " hectogramos");
				break;
			case 3:
				double dac = gr / 10.0;
				System.out.println(dac + " decagramos");
				break;
			case 4:
				double dc = gr * 10;
				System.out.println(dc + " decigramos");
				break;
			case 5:
				double cn = gr * 100;
				System.out.println(cn + " centigramos");
				break;
			case 6:
				double ml = gr * 1000;
				System.out.println(ml + " miligramos");
				break;
			default:
				System.out.println("Opcion no contemplada");
				break;
			}

		} else {
			System.out.println("Los gramos no pueden ser negativos");
		}

		a.close();
	}

}
