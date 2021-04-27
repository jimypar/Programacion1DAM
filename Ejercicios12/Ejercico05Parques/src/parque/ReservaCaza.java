package parque;

public class ReservaCaza extends Parquenacional{
	
	int costeLicencia;
	String tipoArma;
	ReservaCaza(){
		super();
		this.costeLicencia=0;
		this.tipoArma="";
	}
	ReservaCaza(String nombre,int km,int numespecie,int coste,String tipo){
		super(nombre,km,numespecie);
		this.costeLicencia=coste;
		this.tipoArma=tipo;
	}
	@Override
	boolean calcularSubvencion() {
		// TODO Auto-generated method stub
		return false;
	}
	void rellenarReservvaCaza() {
		super.rellenarParqueNcional();
	}
	void visualizarReservaCaza() {
		super.visualizarParqueNacional();
		System.out.println("El coste de la licencia es " +this.costeLicencia);
		System.out.println("El tipo de arma es " + this.tipoArma);
	}
}
