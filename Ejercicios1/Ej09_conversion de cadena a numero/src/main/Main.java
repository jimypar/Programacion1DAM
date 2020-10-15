package main;
/*
 * Convertir una cadena un numero 
 * Ejemplo:
 *   String cadena= "123";
 *   int numero;
 *   numero=cadena; <-¡¡¡ERROR!!!-> Conversion explicita
 *   
 *   IMPORTANTE: pasar de un tipo  String      ----a ----->  int, double, short, byte, long... 
 *                                (tipo de Java)             ( tipos de datos primitivos)
 *   se usan el parseo (parsear la cadena)

 *   CONVERSIONES:
 *       De String ----a---> int    Integer.parseInt(<String>)
 *       De String ----a---> byte   Byte.parteByte(<String>)
 *       De String ----a---> short  Short.parseShort(<String>)
 *       De String ----a---> double  Double.parseDouble(<String>)
 */


public class Main {

	public static void main(String[] args) {
		/*1. CONVERTIR UNA CADENA A LOS TIPOS PRIMITIVOS ENTEROS
		 *                              (byte, short, int, long, float, double)
		 */
		
		String cadena= "123";
		int numero;
		numero=Integer.parseInt(cadena);
		System.out.println("numero: "+numero);
				
		int numeroByte;
		numeroByte=Byte.parseByte(cadena);
		System.out.println("numero: "+numeroByte);
	
				
		short numeroShort;
		numeroShort=Short.parseShort(cadena);
		System.out.println("numero: "+numeroShort);
		

		double numeroDouble;
		numeroDouble=Double.parseDouble(cadena);
		System.out.println("numero: "+numeroDouble);
		
		
		float numeroFloat;
		numeroFloat=Float.parseFloat(cadena);
		System.out.println("numero: "+numeroFloat);
		
		
		
		/*
		 * CONVERTIR UN VALOR PRIMITIVO(int, byte, short,..) A String 
		 */
		byte unByte=12;
		String unString; 
		// para convertir el byte a cadena basta con concatenarla conla cadena
		// usando el operador +
		System.out.println("Valor del byte " + unByte);
		unString=unByte + "";
		System.out.println("String: "+unString );
		
	}

}
