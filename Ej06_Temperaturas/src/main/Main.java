package main;

public class Main {
	public static void main(String[] args) {
		//1. creo las variables
		double cen=15.0f;
		double far;
		double rea;
		double kel;
		//2. calculo las conversiones
		rea=cen*0.8;
		far=cen*1.8+32;
		kel=cen+273;
		
		//3. Visualizar
		System.out.println("Grados Celsius    =" + cen);
		System.out.println("Grados Reamhur    =" + rea);
		System.out.println("Grados Farheneit  =" + far);
		System.out.println("Grados Kelvin     =" + kel);
	}
}
