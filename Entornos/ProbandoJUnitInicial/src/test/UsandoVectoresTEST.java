package test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import clases.UsandoVectores;

public class UsandoVectoresTEST {

	@Test
	public void testSumaVector() {
		System.out.println("Usando vectores suma: ");
		UsandoVectores miSuma = new UsandoVectores();
		Double miVector[] = {4.0,5.0,6.0,3.3,5.2};
		double esperado = 23.5;
		double resultado = miSuma.sumaVector(miVector);
		assertEquals(esperado, resultado,0.001);
	}
	
	@Test
	public void testMinimoVector() {
		System.out.println("Usando vectores minimo: ");
		UsandoVectores minimo = new UsandoVectores();
		Double miVector[] = {4.0,5.0,6.0,3.3,5.2};
		double esperado = 3;
		double resultado = minimo.sumaVector(miVector);
		assertNotEquals(esperado, resultado,0.001);
	}
	
}
