package parque;

public class AreaProtegida extends Parquenacional{
	int subvencion;
	String ong;
	public AreaProtegida() {
		super();
		this.subvencion = 0;
		this.ong = "";
	}
	public AreaProtegida(String nombre,int km,int numespecie,int subvencion,String ong) {
		super(nombre,km,numespecie);
		this.subvencion = subvencion;
		this.ong = ong;
	}
	@Override
	boolean calcularSubvencion() {
		// TODO Auto-generated method stub
		return false;
	}
	void rellenarAreaProtegida() {
		super.rellenarParqueNcional();
		
	}
	void visualizarAreaProtegida() {
		super.visualizarParqueNacional();
		System.out.println("Subvencion del Area Potegida " + this.subvencion);
		System.out.println("ONG = " + this.ong);
	}
	
	
}
