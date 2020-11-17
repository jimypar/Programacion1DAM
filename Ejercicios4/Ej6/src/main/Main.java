package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = 0;

		int n = 1;
		int tot = 0;
		float media = 0;

		do {

			num = 0;
			System.out.print("Introduce un numero:");
			num = scan.nextInt();
			tot+= num;	
			System.out.println(n);
			System.out.println("tot= " +tot);
			n++;
		}

		while (num != 0);

		media = tot/(n-1);
		System.out.println("Media=" + media);
		
		scan.close();
	}
	
	
}
