package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class GestorVentas {

	private ArrayList<Venta> listaVentas;
	private ArrayList<Cliente> listaClientes;

	public GestorVentas() {
		listaVentas = new ArrayList<Venta>();
		listaClientes = new ArrayList<Cliente>();
	}

	public ArrayList<Venta> getListaVentas() {
		return listaVentas;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void altaCliente(String dni, String nombre) {
		if (!existeCliente(dni)) {
			Cliente nuevoCliente = new Cliente(dni, nombre);
			nuevoCliente.setFechaCompra(LocalDate.now());
			listaClientes.add(nuevoCliente);
		} else {
			System.out.println("El cliente ya existe");
		}
	}

	public void listarCliente() {
		for (Cliente cliente : listaClientes) {
			if (cliente != null) {
				System.out.println(cliente);
			}
		}
	}

	public Cliente buscarCliente(String dni) {
		for (Cliente cliente : listaClientes) {
			if (cliente != null && cliente.getDni().equals(dni)) {
				return cliente;
			}
		}
		return null;
	}

	public boolean existeCliente(String dni) {
		for (Cliente cliente : listaClientes) {
			if (cliente != null && cliente.getDni().equals(dni)) {
				return true;
			}
		}
		return false;
	}

	public boolean existeVenta(String nombreVenta) {
		for (Venta venta : listaVentas) {
			if (venta != null && venta.getNombre().equals(nombreVenta)) {
				return true;
			}
		}
		return false;
	}

	public void altaVenta(String nombre, String cliente, Double presupuesto, String fechaventa,
			String electrodomestico) {

		if (!existeVenta(nombre)) {
			Venta nuevaVenta = new Venta(nombre, cliente, presupuesto, electrodomestico);
			nuevaVenta.setFechaVenta(LocalDate.parse(fechaventa));
			listaVentas.add(nuevaVenta);
		} else {
			System.out.println("La venta ya existe");
		}

	}

	public void eliminarVenta(String nombre) {

		Iterator<Venta> iteradorVentas = listaVentas.iterator();

		while (iteradorVentas.hasNext()) {
			Venta venta = iteradorVentas.next();
			if (venta.getNombre().equals(nombre)) {
				iteradorVentas.remove();
			}

		}

	}

	public void asignarCliente(String dni, String nombreVenta) {

		if (buscarCliente(dni) != null && buscarVenta(nombreVenta) != null) {
			Cliente cliente = buscarCliente(dni);
			Venta venta = buscarVenta(nombreVenta);
			venta.setCliente(cliente);
		}
	}

	public Venta buscarVenta(String nombreVenta) {
		for (Venta venta : listaVentas) {
			if (venta != null && venta.getNombre().equals(nombreVenta)) {
				return venta;
			}
		}
		return null;
	}

	public void listarVentasAnno(int anno) {
		for (Venta venta : listaVentas) {
			if (venta.getFechaVenta().getYear() == anno) {
				System.out.println(venta);
			}
		}
	}

	public void listarVentasDeCliente(String dni) {
		for (Venta venta : listaVentas) {
			if (venta.getCliente() != null && venta.getCliente().getDni().equals(dni)) {
				System.out.println(venta);
			}
		}
	}

}
