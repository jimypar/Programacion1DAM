package main;

public class Main {

	public static void main(String[] args) {
		
		String ciclos= "dam:daw:asir";
		String v[] = ciclos.split(":");
		for (String ciclo : v) {
			System.out.println("Ciclo: "+ciclo);
		}

	}

}
