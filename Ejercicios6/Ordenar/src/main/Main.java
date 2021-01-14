package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Texto:");
		String text = scan.nextLine();
		System.out.println("Numero de rotaciones:");
		int r = scan.nextInt();
		String newtext = "";

		for (int i = 1; i <= r; i++) {
			
			newtext = ""+text.charAt(text.length()-1);

			for (int x = 0; x < text.length()-1; x++) {
				
				newtext += text.charAt(x);
				
			}

			text = newtext;
			
		}

		System.out.println(newtext);
		scan.close();
		
	}

}