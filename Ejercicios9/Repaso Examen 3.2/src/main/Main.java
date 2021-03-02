package main;


public class Main {
	
	public static void main(String[] args) {
		
		Aeropuerto aeropuerto1 = new Aeropuerto();
		Aeropuerto aeropuerto2 = new Aeropuerto();

		aeropuerto1.rellenar();
		aeropuerto2.rellenar();
		aeropuerto1.visualizar();
		aeropuerto2.visualizar();
		
		System.out.println("ORDENANDO COMPAÑIAS:" );
		aeropuerto1.ordenarCompanias();
		System.out.println("aeropuerto ordenado**");
		System.out.println("ORDENANDO COMPAÑIAS:" );
		aeropuerto2.ordenarCompanias();
		System.out.println("aeropuerto ordenado**");
		aeropuerto1.visualizar();
		aeropuerto2.visualizar();
	}

}
