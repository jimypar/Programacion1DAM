package main;

public class Main {

	public static void main(String[] args) {
		int nota1=3;
		int nota2=5;
		int nota3=4;
		int maxTotal;
		
		maxTotal=Math.max(Math.max(nota1, nota2), nota3 );
		//maxTotal= Math.max(maxEntre1y2, nota3);
		
		System.out.println("Nota 1 = " + nota1);
		System.out.println("Nota 2 = " + nota2);
		System.out.println("Nota 3 = " + nota3);
		System.out.println("Nota máxima = "+ maxTotal);
	}

}
