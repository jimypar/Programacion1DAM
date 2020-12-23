package main;

public class Main {

	public static void main(String[] args) {
		int num = 1;
	
		for (num = 1; num <=50 ; num++) {
		
		System.out.println(num+"^3 = "+cubo(num));		
		
		}
	}
	
	private static int cubo(int num) {
		int potencia = 1;
		for (int i = 0 ; i < 3; i++) {
			potencia = potencia*num;
		}
		return potencia;
	}

}
