package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		System.out.println("Introduce numeros");
		System.out.println("num1,num2,num3");

		String entrada = scan1.nextLine();

		Scanner scan2 = new Scanner(entrada);

		scan2.useDelimiter(",");

		int num1 = Integer.parseInt(scan2.next());
		int num2 = Integer.parseInt(scan2.next());
		int num3 = Integer.parseInt(scan2.next());

		
		if (num3 < num2) {
			int aux = num2;
			num2 = num3;
			num3 = aux;
		}
		if (num3 < num1) {
			int aux = num1;
			num1 = num3;
			num3 = aux;
		}
		if (num2 < num1) {
			int aux = num1;
			num1 = num2;
			num2 = aux;
		}
		
		System.out.println(num2+ " ES MENOR QUE " +num3+ " Y MAYOR QUE "+num1);
		
		scan1.close();
		scan2.close();
	}

}
