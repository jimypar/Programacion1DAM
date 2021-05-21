package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.GestorVentas;

public class GestorVentasTest {

	static GestorVentas gestor;

	@BeforeAll
	public static void setUpBeforeAll() {
		gestor = new GestorVentas();
		gestor.altaCliente("12345", "Jaime");
	}

	@BeforeEach
	public void setUpBeforeTest() {
		System.out.println();
		System.out.print("Nuevo Test:");
		gestor.altaVenta("venta 1", "cliente1", 10.0, "2019-04-02", "Nevera");
	}
	
	@AfterEach
	public void setUpAfterTest() { 
				
		System.out.println("Clientes:");
		gestor.listarCliente();
		
	}

	@Test
	public void altaClienteDuplicado() {
		
		System.out.println("Comprobar cliente duplicado no creado");
		gestor.altaCliente("12345", "Pedro");
		assertFalse(gestor.buscarCliente("12345").getNombre().equals("Pedro"));

	}
	
	@Test
	public void eliminarVenta() {
		
		System.out.println("Comprobar que la venta se elimina");
		gestor.eliminarVenta("venta 1");
		assertTrue(gestor.buscarVenta("venta 1")==null);
		
	}
	
	@Test
	public void eliminarVentaNoExiste() {
		
		System.out.println("Comprobar que la venta no se elimina");
		gestor.eliminarVenta("venta 2");
		assertFalse(gestor.buscarVenta("venta 1")==null);
		
	}
	
	@Test
	public void asignarCliente() {
		
		System.out.println("Comprobar que la venta se asigna un cliente");
		gestor.asignarCliente("12345", "venta 1");
		assertTrue(gestor.buscarVenta("venta 1").getCliente().getNombre().equals("Jaime"));
		
	}
	
	@Test
	public void asignarClienteNoExiste() {
		
		gestor.asignarCliente("12346", "venta 1");
		assertEquals(gestor.buscarVenta("venta 1"),null);
		
	}
	

}
