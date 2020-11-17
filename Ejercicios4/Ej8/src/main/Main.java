package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce el primer num:");
		int n1 = scan.nextInt();
		System.out.print("Introduce el segundo num:");
		int n2 = scan.nextInt();

		int i;
		int suma = 0;

		if (n1%2==0) {
			
			for (i=(n1+1);i<n2 ;i+=2) {
				
				System.out.println(i);
				suma += i;
				System.out.println("La suma es:"+suma);
			}
			
		}
		
		else if (n1%2==1) {
			
			for (i=n1;i<n2 ;i+=2) {
				
				System.out.println(i);
				suma += i;
				System.out.println("La suma es:"+suma);
			}
			
		}
		
		
		
	}

}
