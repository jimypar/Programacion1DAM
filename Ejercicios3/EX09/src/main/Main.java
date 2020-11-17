package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce numeros:");

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int dis = (int) Math.pow(b,2)-4*a*c;
		
		if (dis >= 0) {
			
			double res = ((-b-Math.sqrt(dis))/(2*a));
			
			System.out.println("Resultado: "+res);
			
			
			double res2 = ((-b+Math.sqrt(dis))/(2*a));
			
			System.out.println("Resultado: "+res2);			
		}
		
		else if (dis < 0) {
			
			System.out.println("Resultado no existe");			
		}
		
		else {
			
			System.out.println("ERROR");
			
		}
		
		scan.close();
	}

}
