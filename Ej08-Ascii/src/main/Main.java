package main;

import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;

public class Main {

	public static void main(String[] args) {
		byte unByte;
		char caracterAscii;
		
		System.out.println("***CONVERTIR UN NUMERO A LETRA***");
		unByte=65;
		System.out.println("Código Ascii = " + unByte);
		// El numero lo convierto a letra
		caracterAscii = (char) unByte;
		System.out.println("Caracter ascii del numero "+
		unByte +" = "+ caracterAscii);
		
		System.out.println("***CONVERTIR UNA LETRA A UN NUMERO ***");
		caracterAscii='J';
		
		// La letra la convierto a numero
		unByte=(byte) caracterAscii;
		System.out.println("Letra Ascii = " + caracterAscii);
		System.out.println("El código asciii de la letra " + caracterAscii + " es " +unByte);
		
	}

}
