package parque;

public class Terrestre extends AreaProtegida {

	private String tipoTerreno;

	public Terrestre() {
		super();
		this.tipoTerreno = "";
	}

	public Terrestre(String nombre, int km, int numespecie, int subvencion, String ong, String tipoTerreno) {
		super(nombre, km, numespecie, subvencion, ong);
		this.tipoTerreno = tipoTerreno;
	}
	
	void rellenar() {
		
		
		
	}

	public void setTipoTerreno(String tipoTerreno) {
		this.tipoTerreno = tipoTerreno;
	}

	void visualizar() {
		super.visualizar();
		System.out.println("Tipo de terreno: " + this.tipoTerreno);
	}

}
