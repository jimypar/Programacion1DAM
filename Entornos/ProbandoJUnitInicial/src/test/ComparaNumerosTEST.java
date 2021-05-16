package test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import clases.ComparaNumeros;

public class ComparaNumerosTEST {
	
	@Test
	public void numeroMayorTest1(){
		System.out.println("Test 1 Numero Mayor");
		ComparaNumeros compara = new ComparaNumeros();
		int esperado = 0;
		int resultado = compara.numeroMayor(0, 0, 0);
		assertEquals(esperado, resultado);		
	}

	@Test
	public void numeroMayorTest2(){
		System.out.println("Test 2 Numero Mayor");
		ComparaNumeros compara = new ComparaNumeros();
		int esperado = -2;
		int resultado = compara.numeroMayor(-2, -3, -5);
		assertEquals(esperado, resultado);		
	}
	
	@Test
	public void numeroMayorTest3(){
		System.out.println("Test 3 Numero Mayor");
		ComparaNumeros compara = new ComparaNumeros();
		int esperado = 5;
		int resultado = compara.numeroMayor(5, 8, 7);
		assertNotEquals(esperado, resultado);		
	}
	
	
	
}
