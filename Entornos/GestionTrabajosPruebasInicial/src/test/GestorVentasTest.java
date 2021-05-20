package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.GestorVentas;

public class GestorVentasTest {

	static GestorVentas gestor;

	@BeforeAll
	public static void setUpBeforeAll() {
		gestor = new GestorVentas();
	}

	@BeforeEach
	public void setUpBeforeTest() {
		gestor.getListaClientes().clear();
		gestor.getListaVentas().clear();
	}

	@Test
	public void altaClienteDuplicado() {

		gestor.altaCliente("12345", "Jaime");
		gestor.altaCliente("12345", "Pedro");
		assertFalse(gestor.buscarCliente("12345").getNombre().equals("Pedro"));

	}
	
	@Test
	public void eliminarVenta() {
		
		gestor.altaVenta("venta 1", "cliente1", 10.0, "2019-04-02", "Nevera");
		gestor.eliminarVenta("venta 1");
		assertTrue(gestor.buscarVenta("venta 1")==null);
		
	}
	
	@Test
	public void asignarCliente() {
		
		gestor.altaCliente("12345", "Jaime");
		gestor.altaVenta("venta 1", "cliente1", 10.0, "2019-04-02", "Nevera");
		gestor.asignarCliente("12345", "venta 1");
		assertTrue(gestor.buscarVenta("venta 1").getCliente().getNombre().equals("Jaime"));
		
	}
	
	@Test
	public void ventaAnno() {
		
		
		
	}
	

}
