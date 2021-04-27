package parque;

public abstract class Parquenacional {
	int km;
	int numeroEspecies;
	String nombre;
	Parquenacional(){
		this.nombre="";
		this.km=0;
		this.numeroEspecies=0;
	}
	Parquenacional(String nombre , int km, int numeroEspecies){
		this.nombre=nombre;
		this.km=km;
		this.numeroEspecies=numeroEspecies;
	}
	
	public void rellenarParqueNcional() {
		
	}
	public void visualizarParqueNacional() {
		
	}
	abstract boolean calcularSubvencion();
}
