package main;

public class Main {

	public static void main(String[] args) {
		
		DiasDeLaSemana nombre=DiasDeLaSemana.MARTES;
				
		System.out.println("dias de la semana");
		for (DiasDeLaSemana dia : DiasDeLaSemana.values()) {
			System.out.println(dia);
		}
		System.out.println();

	}

}
