package main;
/*
 * Declarar variables
 * de dos tipos de datos
 */
public class Main {

	public static void main(String[] args) {
		// Tipo Cadena
		String unString="Ana";
		System.out.println("Tipo String = " + unString);
		
		// Tipo Caracter (8bits= 1Byte)
		char unChar='s';
		System.out.println("Tipo caracter = " + unChar);
		
		// Tipos enteros
		byte unByte=70;
		short unShort=30000;
		int unInt= 300000;
		long unLong= 3000000;
	
		System.out.println("Tipo byte = " + unByte);
		
		//Tipos decimales
		/*
		 * 5.3 -> ¿que tipo es esto? es un double
		 *        5.30000f
		 *        
		 * |5.300000|  <- float
		 * |5.30000000000000000000000000000_|  <- double
		 * 
		 * unFloat=5.30000F  ??? NO 
		 */
		
		float unFloat;
		unFloat=5.3f;
		double unDecimal=5.3666699;
		
		
		//Tipo booleano : solo almacena true/false
		boolean esRepetidor=true; 
		System.out.println("Es repetidor ? " + esRepetidor);
		esRepetidor=false;
		System.out.println("y ahora Es repetidor ? " + esRepetidor);
		

	}

}
