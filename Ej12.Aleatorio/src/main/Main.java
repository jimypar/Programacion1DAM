package main;

public class Main {

	public static void main(String[] args) {

		double numRandom= (Math.random() );
		System.out.println("Numero aleatorio entre 0 y 1: " +numRandom);
		
		int numRandom100= (int)(Math.random() * 100);
		System.out.println("Numero aleatorio entre 0 y 100: " +numRandom100);
		
		int numRandom2050= (int)(Math.random()*(20-50) + 50);
		System.out.println("Numero aleatorio entre 20 y 50: " +numRandom2050);
		
		int numRandom100500= (int)(Math.random()*(100-500) + 500);
		System.out.println("Numero aleatorio entre 20 y 50: " +numRandom100500);
	}
}
