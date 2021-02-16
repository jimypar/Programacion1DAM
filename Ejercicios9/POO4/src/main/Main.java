package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dia,mes,año;
		
		System.out.println("Introduce fecha: ");
        System.out.print("dia: ");
        dia = scan.nextInt();
        System.out.print("mes: ");
        mes = scan.nextInt();
        System.out.print("año: ");
        año = scan.nextInt();

        Fecha fecha = new Fecha(dia,mes,año);

        if (fecha.fechaEsCorrecta()) {
        	
            System.out.println(fecha);
                           
            System.out.println("El dia siguiente es:");           
            fecha.diaSiguiente();
            System.out.println(fecha);
            

        } else { 
            System.out.println("Fecha no valida");
        }
        
        scan.close();
    }
	
}