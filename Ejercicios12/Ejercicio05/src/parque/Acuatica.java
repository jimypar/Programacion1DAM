package parque;

public class Acuatica extends AreaProtegida {

	private int numeroLagos;

	public Acuatica() {
		super();
		this.numeroLagos = 0;
	}

	public Acuatica(String nombre, int km, int numespecie, int subvencion, String ong, int numeroLagos) {
		super(nombre, km, numespecie, subvencion, ong);
		this.numeroLagos = numeroLagos;
	}
	
	void rellenar() {
		
		System.out.println("Numero de lagos: ");
		
	}

	public void setNumeroLagos(int numeroLagos) {
		this.numeroLagos = numeroLagos;
	}

	void visualizar() {
		super.visualizar();
		System.out.println("Numero de lagos: " + this.numeroLagos);
	}

}
