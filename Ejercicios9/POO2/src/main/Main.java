package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Contador contador1 = new Contador();

		int num;
		System.out.println("Introduce valor del contador: ");
		num = scan.nextInt();

		contador1.setCont(num);
		
		contador1.sumar();
		System.out.println("+1 = "+contador1.getCont());
		contador1.sumar();
		contador1.sumar();
		contador1.sumar();

		System.out.println("+3 = "+contador1.getCont());		
		contador1.restar();
		System.out.println("-1 = "+contador1.getCont());


		System.out.println("Nuevo valor del contador = "+contador1.getCont());
		Contador contador2 = new Contador(contador1.getCont());

		contador2.sumar();
		System.out.println("+1 = "+contador2.getCont());
		contador2.restar();
		contador2.restar();
		System.out.println("-2 = "+contador2.getCont());

		System.out.println(contador2.toString());
		
		scan.close();
	}
}