package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int maxprim = 0;
		int minprim = Integer.MAX_VALUE;
		boolean si;
		String pregunta;

		while (si = true) {

			System.out.print("Number:");
			int num = scan.nextInt();
			int primo = 0;
			boolean prim = true;

			while (num <= 0) {
				System.out.println("Numero positivo:");
				System.out.print("Number:");
				num = scan.nextInt();
			}

			for (int i = 2; i < num; i++) {

				primo = num % i;
				if (primo == 0) {
					prim = false;
					break;
				}
			}

			if (prim) {

				System.out.println("Es primo");

				if (num < minprim) {
					minprim = num;
				}
				if (num > maxprim) {
					maxprim = num;
				}

			} else {
				System.out.println("No es primo");

			}

			// FACTORIAL:

			long fact = 1;

			for (int a = 1; a <= num; a++) {

				fact = fact * a;

			}
			System.out.println("Factorial de " + num + " = " + fact);

			System.out.println();
			System.out.println("Deseas continuar");
			pregunta = scan.next();
			if (pregunta.equals("si")) {
				si = true;
			} else if (pregunta.equals("no")) {
				si = false;
				break;
			}

		}

		System.out.println("El primo mas grande es " + maxprim);
		System.out.println("El primo mas pequeño es " + minprim);
	}

}

/*
 * Scanner scan = new Scanner(System.in);
 * 
 * System.out.print("Number:"); int num3 = scan.nextInt();
 * System.out.print("Number:"); int num2 = scan.nextInt();
 * System.out.print("Number:"); int num1 = scan.nextInt(); int pre1 = num2; int
 * pre2 = num3; int prev = pre1+pre2; int cant = 3; while (prev >= num1) {
 * 
 * pre2 = pre1; pre1 = num1; prev = pre1+pre2;
 * 
 * System.out.print("Number:"); num1 = scan.nextInt();
 * 
 * cant++;
 * 
 * }
 * 
 * System.out.println(num1+">"+pre1+"+"+pre2);
 * System.out.println("Numbers: "+cant);
 */

//------------------------------------------------------------------
/*
 * Scanner scan = new Scanner(System.in);
 * 
 * System.out.print("Number:"); int num = scan.nextInt(); String caract = num +
 * ""; int longmax = caract.length() -1 ; int longmin = longmax;
 * 
 * for (int b = -1; b < longmax; b++) {
 * 
 * for (int i = longmin; i <= longmax; i++) {
 * 
 * char dot = caract.charAt(i); System.out.print(dot);
 * 
 * } longmin--; System.out.println();
 */
