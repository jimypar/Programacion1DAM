package clases;

import java.util.Scanner;

public class UsandoVectores {
	public static void main(String[] args) {
		Double miVector[] = new Double[5];
		UsandoVectores usoVectores = new UsandoVectores();
		Scanner lectura = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Dame la componente " + i + " del vector");
			miVector[i] = lectura.nextDouble();
		}
		double suma = usoVectores.sumaVector(miVector);
		System.out.println("La suma es " + suma);
		double minimo = usoVectores.minimoVector(miVector);
		System.out.println("El mínimo es " + minimo);		
		lectura.close();
	}

	public double sumaVector(Double[] miVector) {
		double suma = 0;
		for (int i = 0; i < 5; i++) {
			suma += miVector[i];
		}
		return suma;
	}

	public double minimoVector(Double[] miVector) {
		double minimo = miVector[0];
		for (int i = 0; i < miVector.length; i++) {
			if (miVector[i] < minimo) {
				minimo = miVector[i];
			}
		}
		return minimo;
	}
}
