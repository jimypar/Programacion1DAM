package main;

import java.util.Scanner;

public class Main {
	
	public Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
				
		Hospital hospital1 = new Hospital();
		Hospital hospital2 = new Hospital();
		
		hospital1.rellenar();
		hospital2.rellenar();
		
		hospital1.visualizar();
		hospital2.visualizar();
		
		hospital1.ordenarEspecialidad();
		hospital1.ordenarEspecialidad();
		

	}

}
