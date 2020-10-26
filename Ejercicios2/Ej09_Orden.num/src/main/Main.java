package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		
		try {
			
			System.out.println("Introduce el primer numero:");
			int num1 = scan1.nextInt();
			System.out.println("Introduce el segundo numero:");
			int num2 = scan1.nextInt();
			System.out.println("Introduce el tercer numero:");
			int num3 = scan1.nextInt();

			
			
			if(num3 < num2) 
			{
				int aux = num2;
				num2 = num3;
				num3 = aux;							
			}
			else
			{
				if(num3 < num1)
				{
					int aux = num1;
					num1 = num3;
					num3 = aux;	
				}
				else
				{
					if(num2 < num1) 
					{
						int aux = num1;
						num1 = num2;
						num2 = aux;							
					}
					
				}
				
			}
			
			if(num3 < num2) 
			{
				int aux = num2;
				num2 = num3;
				num3 = aux;							
			}
			
			System.out.println("El orden es " +num1+ ", " +num2+ ", " +num3);
			
			
			//1  2  3
			//[3, 5, 4]
			/*
			/*Menor de todos
			
				if (num1<num2 && num1<num3) {
					
					System.out.println("El numero: " + num1 +" es el menor");
					
				}
				
				if(num2<num1 && num2<num3) {
					
					System.out.println("El numero: " + num2 +" es el menor");
					
				}
		
				if (num3<num1 && num3<num1) {
					
					System.out.println("El numero: " + num3 +" es el menor");
					
				}
		
			/*El de en medio
				
				if ((num1<num2 && num1>num3) || (num1<num3 && num1>num2))  {
					
					System.out.println("El numero: " + num1 +" esta en medio");
					
				}
				
				if ((num2<num3 && num2>num2) || (num2<num3 && num2>num1))  {
					
					System.out.println("El numero: " + num2 +" esta en medio");
					
				}
				
				if ((num3<num2 && num3>num1) || (num3<num1 && num3>num2))  {
	
					System.out.println("El numero: " + num3 +" esta en medio");
					
				}
	
			/*El mayor

				if (num1>num2 && num1>num3) {
					
					System.out.println("El numero: " + num1 +" es el mayor");
					
				}
				
				if (num2>num1 && num2>num3) {
					
					System.out.println("El numero: " + num2 +" es el mayor");
					
				}
		
				if (num3>num1 && num3>num1) {
					
					System.out.println("El numero: " + num3 +" es el mayor");
				}
				
				else {
					
					System.out.println("Introduce numeros validos.");
			
				}
				
			*/
			
			scan1.close();
		}
		
		catch (Exception e) {
			
			System.out.println("Algo ha fallado");
			
		}
		
	}

}
