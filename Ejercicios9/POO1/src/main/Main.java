package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Cuenta cuenta1 = new Cuenta();
		
		System.out.println("Titular de cuenta:");
		cuenta1.setTitular(scan.next());
		System.out.println("Numero de cuenta:");
		cuenta1.setNumeroCuenta(scan.next());
		System.out.println("Cuanto deseas ingresar");
		cuenta1.setSaldo(scan.nextFloat());
		
		Cuenta cuenta2 = new Cuenta();
		System.out.println("Titular de cuenta:");
		cuenta2.setTitular(scan.next());
		System.out.println("Numero de cuenta:");
		cuenta2.setNumeroCuenta(scan.next());
		System.out.println("Cuanto deseas ingresar");
		cuenta2.setSaldo(scan.nextFloat());
		
		System.out.println("CUENTA 1:");
		System.out.println(cuenta1.toString());
		System.out.println("CUENTA 2:");
		System.out.println(cuenta2.toString());
		
		scan.close();
		
	}

}
