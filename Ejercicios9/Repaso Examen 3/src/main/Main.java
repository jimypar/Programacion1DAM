package main;

import java.util.Scanner;

public class Main {
	
	public Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		Aeropuerto aeropuerto1 = new Aeropuerto();
		Aeropuerto aeropuerto2 = new Aeropuerto();
		
		aeropuerto1.rellenar();
		aeropuerto2.visualizar();

		aeropuerto1.rellenar();
		aeropuerto2.visualizar();

	}

}
