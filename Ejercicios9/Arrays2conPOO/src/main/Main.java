package main;

public class Main {

	public static void main(String[] args) {

		Lista dam = new Lista();
		Lista daw = new Lista();

		System.out.println("DAM:");
		dam.Rellenar();
		System.out.println("DAW");
		daw.Rellenar();
		
		System.out.println("DAM");
		dam.Visualizar();
		System.out.println("DAW");
		daw.Visualizar();
		
		System.out.println("DAM");
		dam.Borrar();
		System.out.println("DAW");
		daw.Borrar();
		
		System.out.println("DAM");
		dam.Visualizar();
		System.out.println("DAW");
		daw.Visualizar();
		
	}
} 

