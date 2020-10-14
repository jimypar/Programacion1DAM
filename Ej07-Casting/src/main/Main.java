package main;

public class Main {

	public static void main(String[] args) {
		
		//1. creamos tres variable numericas
		byte unByte=2;
		short unShort=4000;
		int unInt= 100000;
		long unLong= 1000;
		
		//2. conversion implicita (automática)
		System.out.println("** conversion Implicita **");
		// byte->short->int ->long
		/*
		 * unByte |9999999|
		 * unShort|9999999____________________|
		 * 
		 */
		unShort=unByte;  // ser realiza la conversion correctamente
		System.out.println("Nuevo valor del short = " + unShort);
		
		//3. Conversion EXPLICITA : CASTING (CASTEO...)
		 /*  unLong|12_____________________|
		 *   unInt |12__| -> 
		 */
		System.out.println("** conversion Explicita **");
		unInt=(int) unLong;
		System.out.println("Nuevo valor de int =" + unInt);
		
		//4. conversion EXPLICITA cuando el valor no se 
		//   puede almacenar porque no cabe
		unInt=123456;
		// 123456-> 010101010101010101010101010101010 -> byte
		/*  unInt |1234567893214|
		 *  unByte|01010101| -> 64
		 */
		//  189785632
		// |010101| -> 98
		unByte=(byte) unInt;//<- trunca el numero
		System.out.println("Valor int = " + unInt);
		System.out.println("Guardo el int en la variable byte");
		System.out.println("Valor byte = " + unByte);
		
		
		unLong=unInt;
	}

}
