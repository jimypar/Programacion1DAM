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
		System.out.println("byte= "+unByte);
		short unShort=30000;
		System.out.println("Short= "+unShort);
		int unInt= 300000;
		System.out.println("Int= " +unInt);
		long unLong= 3000000;
		System.out.println("Long= " + unLong);
	
		
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
		System.out.println("Float= " +unFloat);
		double unDecimal=5.3666699;
		System.out.println("Decimal= "+unDecimal);
		
		
		//Tipo booleano : solo almacena true/false
		boolean esRepetidor=true; 
		System.out.println("Es repetidor ? " + esRepetidor);
		esRepetidor=false;
		System.out.println("y ahora Es repetidor ? " + esRepetidor);
		

	}

}
