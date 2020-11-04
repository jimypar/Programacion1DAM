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
			
			boolean des;

			while (true) {
				answer1 = scan.nextLine().trim().toLowerCase();
				if (answer1.equals("si")) {
					des = true;
					break;
				} else if (answer1.equals("no")) {
					des = false;
					break;
				}
			}
			
			System.out.println("Quieres jacuzzi?");

			String answer2;
			boolean jac;

			while (true) {
				answer2 = scan.nextLine().trim().toLowerCase();
				if (answer2.equals("si")) {
					jac = true;
					break;
				} else if (answer2.equals("no")) {
					jac = false;
					break;
				}
			}

			System.out.println("Quieres climatizador?");

			String answer3;
			boolean cli;

			while (true) {
				answer3 = scan.nextLine().trim().toLowerCase();
				if (answer3.equals("si")) {
					cli = true;
					break;
				} else if (answer3.equals("no")) {
					cli = false;
					break;
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
