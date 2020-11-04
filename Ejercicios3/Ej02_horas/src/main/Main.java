package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {

			Scanner scan1 = new Scanner(System.in);

			System.out.println("Introduce la hora");
			System.out.println("hh:mm:ss");

			String entrada = scan1.nextLine();

			Scanner scan2 = new Scanner(entrada);

			scan2.useDelimiter(":");

			int h = Integer.parseInt(scan2.next());
			int m = Integer.parseInt(scan2.next());
			int s = Integer.parseInt(scan2.next());

			if ((h < 24 && h >= 0) && (m < 60 && m >= 0) && (s < 60 && s >= 0)) {

				s++;

				if (s == 60) {

					s = 0;
					m++;

				}

				if (m == 60) {

					m = 0;
					h++;
				}

				if (h == 24) {

					h = 0;
				}

			}

			else {

				System.out.println("Error");

			}
			System.out.println("Son las: " + h + ":" + m + ":" + s);
			scan1.close();
			scan2.close();
		} catch (Exception e) {
			System.out.println("Error");
		}

	}
}

