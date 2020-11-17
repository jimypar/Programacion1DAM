package main;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		int n = 1;
		int tot = 0;
		int media =0;
		
		

		while (true) {
		
			
			num =0;
			media = 0;
			System.out.println("Introduce un numero:");
			num = scan.nextInt();
			String ult = Integer.toString(num);
			int car = ult.length();
			
			
			System.out.println(ult);
			if (ult == "0") {
			tot = tot+num;
			media = tot/n;
			System.out.println("Media=" +media);
			n++;
			}
			
			else {
				
				System.exit(0);
			}
			
		}
	}
}
