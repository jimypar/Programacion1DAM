package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre:");
		String name = scan.nextLine();
		
		System.out.println("Introduce las horas semanales:");
		int horas = scan.nextInt();
		
		
			if (horas <= 35){
				
				System.out.println("Introduce la tarifa por horas:");
				int tarifa = scan.nextInt();
				int salario = horas*tarifa;
				System.out.println(name+" su salario semanal es: "+salario+"€");
				
			}
		
			else {
				
				
				
			}
			
			
		
		scan.close();
		
		
		
		
		

	}

}
