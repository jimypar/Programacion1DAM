package test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.NotasSwitch;

public class NotasSwitchTEST {
	private NotasSwitch miNota;
	
	@BeforeEach
	public void setUpBeforeTest() {
		miNota = new NotasSwitch();
	}
	
	@Test
	public void NotasSwitchTest1() {
		System.out.println("Test 1 Usar Nota");
		int nota = 3;
		String esperado ="insuficiente";
		String resultado = miNota.notas(nota);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void NotasSwitchTest2() {
		System.out.println("Test 2 Usar Nota");
		int nota = 15;
		String esperado ="suficiente";
		String resultado = miNota.notas(nota);
		assertEquals(esperado, resultado);
		// El test no valida porque el resultado del default es un syso
		// no se guarda en una variable 
	}
	
	@Test
	public void NotasSwitchTest3() {
		System.out.println("Test 2 Usar Nota");
		int nota = 9;
		String esperado ="sobresaliente";
		String resultado = miNota.notas(nota);
		assertEquals(esperado, resultado);
	}

}
