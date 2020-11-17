package main;

import java.util.Scanner;

public class Main {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		boolean restart = programa();

		do {

			restart = programa();

		}

		while (restart == true);
		scan.close();
	}

	private static boolean programa() {

		try {
			System.out.println("");
			System.out.println("--------------");
			System.out.println("doble o simple");

			String hab = scan.next();

			System.out.println("Quieres desayuno?");

			String answer1;

			boolean des = true;
			boolean valido = false;

			while (!valido){
				answer1 = scan.nextLine();
				if (answer1.equals("si")) {
					des = true;
					valido=true;
				} else if (answer1.equals("no")) {
					des = false;
					valido=true;
				}	
			}	

			System.out.println("Quieres jacuzzi?");

			String answer2;
			boolean jac = true;
			valido = false;

			while (!valido) {
				answer2 = scan.nextLine().trim().toLowerCase();
				if (answer2.equals("si")) {
					jac = true;
					valido=true;

				} else if (answer2.equals("no")) {
					jac = false;
					valido=true;

				}
			}

			System.out.println("Quieres climatizador?");

			String answer3;
			boolean cli = true;
			valido = false;

			while (!valido) {
				answer3 = scan.nextLine().trim().toLowerCase();
				if (answer3.equals("si")) {
					cli = true;
					valido=true;

				} else if (answer3.equals("no")) {
					cli = false;
					valido=true;
				}
			}

			switch (hab) {
				case "doble":

					if (des == false && jac == false && cli == false) {

						System.out.println("El precio es de 90");

						return true;
					}

					if (des == true && jac == false && cli == false) {

						System.out.println("El precio es de 100");

						return true;
					}

					if (des == false && jac == true && cli == false) {

						System.out.println("El precio es de 120");

						return true;
					}

					if (des == false && jac == false && cli == true) {

						System.out.println("El precio es de 110");

						return true;
					}

					else {

						System.out.println("El precio es de 155");
						return true;
					}

				case "simple":

					if (des == false && jac == false && cli == false) {

						System.out.println("El precio es de 80");
						return true;
					}

					if (des == true && jac == true && cli == true) {

						System.out.println("El precio es de 140");
						return true;
					}

					else {

						System.out.println("El precio es de 155");

						return true;
					}

				default:
					break;
			}
			System.out.println("Algo ha fallado");
			return true;
		} catch (Exception e) {

			System.out.println("Error");
			return true;
		}

	}
}
