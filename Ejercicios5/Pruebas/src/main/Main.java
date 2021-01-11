package main;

public class Main {

	public static void main(String[] args) {

	 String cadena = "Dabale arroz a la zorra abad";
	 
	 String SinEsp = cadena.trim();
	 
	 String SinEspacios = cadena.replaceAll(" ", "");
	 
	 System.out.println(SinEspacios);
			 
	if(SinEsp.equals(cadena.trim())) {
		
		System.out.println("Eureka");
		
	}
	 
	}

}
