package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
		
	    System.out.println("TEST DE FIDELIDAD");
	    System.out.println("Este programa te dir� si hay probabilidad de que tu pareja est� siendo infiel.\n");

		String respuesta;
	    int puntos = 0;
	    
	    
	    System.out.print("1. Tu pareja parece estar m�s inquieta de lo normal sin ning�n motivo aparente.\n(v)erdadero o (f)also: ");
	    respuesta = scan.nextLine();
	    if ( respuesta.equals("v") ) {
	      puntos += 3;
	    }

	    System.out.print("2. Ha aumentado sus gastos de vestuario.\n(v)erdadero o (f)also: ");
	    respuesta = scan.nextLine();
	    if ( respuesta.equals("v") ) {
	      puntos += 3;
	    }
	    
	    System.out.print("3. Ha perdido el inter�s que mostraba anteriormente por ti.\n(v)erdadero o (f)also: ");
	    respuesta = scan.nextLine();
	    if ( respuesta.equals("v") ) {
	      puntos += 3;
	    }

	    System.out.print("4. Ahora se afeita y se asea con m�s frecuencia (si es hombre) o ahora se arregla el pelo y se asea con m�s frecuencia (si es mujer).\n(v)erdadero o (f)also: ");
	    respuesta = scan.nextLine();
	    if ( respuesta.equals("v") ) {
	      puntos += 3;
	    }
	    
	    System.out.print("5. No te deja que mires la agenda de su tel�fono m�vil.\n(v)erdadero o (f)also: ");
	    respuesta = scan.nextLine();
	    if ( respuesta.equals("v") ) {
	      puntos += 3;
	    }
	    
	    System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando est�s t� delante.\n(v)erdadero o (f)also: ");
	    respuesta = scan.nextLine();
	    if ( respuesta.equals("v") ) {
	      puntos += 3;
	    }
	        
	    System.out.print("7. �ltimamente se preocupa m�s en cuidar la l�nea y/o estar bronceado/a.\n(v)erdadero o (f)also: ");
	    respuesta = scan.nextLine();
	    if ( respuesta.equals("v") ) {
	      puntos += 3;
	    }
	    
	    System.out.print("8. Muchos d�as viene tarde despu�s de trabajar porque dice tener mucho m�s trabajo.\n(v)erdadero o (f)also: ");
	    respuesta = scan.nextLine();
	    if ( respuesta.equals("v") ) {
	      puntos += 3;
	    }
	    
	    System.out.print("9. Has notado que �ltimamente se perfuma m�s.\n(v)erdadero o (f)also: ");
	    respuesta = scan.nextLine();
	    if ( respuesta.equals("v") ) {
	      puntos += 3;
	    }
	    
	    System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.\n(v)erdadero o (f)also: ");
	    respuesta = scan.nextLine();
	    if ( respuesta.equals("v") ) {
	      puntos += 3;
	    }
	    
	  
	    // Muestra el resultado del test
	    
	    if ( puntos <= 10 ) {
	      System.out.print("�Enhorabuena! tu pareja parece ser totalmente fiel.");
	    }
	    
	    if ( (puntos > 11 ) && (puntos <= 22) ) {
	      System.out.print("Quiz�s exista el peligro de otra persona en su vida o en su mente, aunque seguramente ser� algo sin importancia. No bajes la guardia.");    
	    }
	    
	    if ( puntos >= 22 ) {
	      System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco m�s y averig�es qu� es lo que est� pasando por su cabeza.");
	    }
	    
	    scan.close();
	  }

}
