package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String cadenaNum = "";
		for (int i = 1; i > 0; i++) {

			System.out.print("Introduce un numero:");
			int num = scan.nextInt();

			if (num == 0) {
				break;
			}

			else if (i == 1) {
				cadenaNum = num + "";
			}
			else {
			cadenaNum = cadenaNum + "," + num;
			}
		}
		
		System.out.println("Numeros: "+cadenaNum);
		scan.close();
	}

}
