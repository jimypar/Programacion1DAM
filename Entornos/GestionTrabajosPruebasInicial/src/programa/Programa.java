package programa;

import clases.GestorVentas;

public class Programa {

	public static void main(String[] args) {
		//1
		GestorVentas gestor = new GestorVentas();
		//2
		gestor.altaCliente("54321", "cliente1");
		gestor.altaCliente("12345", "cliente2");
		gestor.altaCliente("12345", "cliente3");
		//3
		gestor.listarCliente();
		//4
		System.out.println(gestor.buscarCliente("12345"));
		System.out.println(gestor.buscarCliente("123456"));
		//5
		gestor.altaVenta("venta 1", "cliente1", 10.0, "2019-04-02", "Nevera");
		gestor.altaVenta("venta 2", "cliente2", 16.0, "2019-05-02", "Horno");
		gestor.altaVenta("venta 3", "cliente3", 20.0, "2018-04-02", "Microondas");
		//6
		gestor.asignarCliente("12345", "venta 1");
		gestor.asignarCliente("12345", "venta 2");
		//7
		gestor.listarVentasDeCliente("12345");
		//8
		System.out.println();
		gestor.listarVentasAnno(2019);
		//9
		gestor.eliminarVenta("venta 2");
		//10
		gestor.listarVentasDeCliente("12345");
		//11
		gestor.ere();
		gestor.listarCliente();
		
	}

}
