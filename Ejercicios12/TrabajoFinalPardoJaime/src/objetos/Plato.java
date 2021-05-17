package objetos;

/**
 * Clase Plato
 * 
 * @author Jaime
 * @version
 * @since 1.8
 */

public abstract class Plato implements Plato_interface, Comparable<Plato> {

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
	
	public Plato(int numPlato) {
		this.numeroPlato = numPlato;
		this.nombrePlato = Database.getNombrePlato(numPlato);
		this.precio = Database.getPrecioPlato(numPlato);
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
	
	public void rellenar() {		
	}
	
	public void visualizar() {
		
		System.out.println("Plato: "+this.nombrePlato);
		System.out.println("Precio: "+this.precio);
		System.out.println("Estado: "+estadoPlato());
		
	}
	

	public String toString() {
		return "\n   -" + nombrePlato + "\n   -" + precio + "€\n   -" + estadoPlato();
	}
	
	/**
	 * Devuelve un String segun sea el metodo isEntregado()
	 * 
	 * @return String si esta entregado o no esta entregado
	 */
	public String estadoPlato() {
		if (entregado) {
			return "Entregado";
		} else {
			return "No entregado";
		}

	}
	@Override
	public int compareTo(Plato plato) {
		
		 if (this.numeroPlato > plato.numeroPlato) {
	            return 1;
	        } else if (this.numeroPlato < plato.numeroPlato) {
	            return -1;
	        } else {
	            return 0;
	        }
	}
	

}
