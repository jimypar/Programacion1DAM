package clases;

import java.util.ArrayList;

public class GestorContabilidad {
	private ArrayList<Factura> listaFacturas;
	private ArrayList<Cliente> listaClientes;
	
	public GestorContabilidad() {
		listaFacturas = new ArrayList<>();
		listaClientes = new ArrayList<>();
	}

	public ArrayList<Factura> getListaFacturas() {
		return listaFacturas;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}
	
	public void altaCliente(Cliente cliente){
		String dni = cliente.getDni();
		for(Cliente client : listaClientes){
			if(client.getDni().equals(dni)){
				return;
			}
		}
		listaClientes.add(cliente);
	}
}

