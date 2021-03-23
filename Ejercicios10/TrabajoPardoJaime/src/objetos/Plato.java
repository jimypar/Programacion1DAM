package objetos;

public class Plato {

	private int numeroPlato;
	private String nombrePlato;
	private int precio;
	private boolean entregado;

	public Plato() {
		this.numeroPlato = 0;
		this.nombrePlato = "";
		this.precio = 0;
		this.entregado = false;
	}

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

	public int getPrecio() {
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
