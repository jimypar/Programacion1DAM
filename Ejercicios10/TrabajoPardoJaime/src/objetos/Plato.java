package objetos;

/**
 * Clase Plato
 * 
 * @author Jaime
 * @version
 * @since 1.8
 */

public class Plato {

	private int numeroPlato;
	private String nombrePlato;
	private double precio;
	private boolean entregado;
	/**
	 * Inicializa los atributos de la clase Plato
	 * 
	 * @param numeroPlato Numero identificativo del plato en el menu
	 * @param nombrePlato Nombre completo del plato
	 * @param precio precio del plato
	 * @param entregado Indica si esta entregado o no
	 */
	public Plato() {
		this.numeroPlato = 0;
		this.nombrePlato = "";
		this.precio = 0;
		this.entregado = false;
	}
	/**
	 * Inicializa los atributos de la clase Plato
	 * 
	 * @param numeroPlato Numero identificativo del plato en el menu
	 * @param nombrePlato Nombre completo del plato
	 * @param precio int del precio del plato
	 * @param entregado booleano que indica si esta entregado o no
	 */
	public Plato(int numeroPlato, String nombrePlato, int precio) {
		this.numeroPlato = numeroPlato;
		this.nombrePlato = nombrePlato;
		this.precio = precio;
		this.entregado = false;
	}

	public void setNumeroPlato(int numeroPlato) {
		this.numeroPlato = numeroPlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public int getNumeroPlato() {
		return numeroPlato;
	}

	public String getNombrePlato() {
		return nombrePlato;
	}

	public double getPrecio() {
		return precio;
	}

	public String toString() {
		return "\n   -" + nombrePlato + "\n   -" + precio + "€\n   -" + estadoPlato();
	}

	public String estadoPlato() {
		if (entregado) {
			return "Entregado";
		} else {
			return "No entregado";
		}

	}

}
