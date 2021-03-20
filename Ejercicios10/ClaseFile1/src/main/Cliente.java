package main;

public class Cliente {

	private String datos;

	public Cliente(String datos) {
		this.datos = datos;
	}

	public Cliente() {
		this.datos = "";
	}
	
	public String getDatos() {
		return datos;
	}

	public void setDatos(String datos) {
		this.datos = datos;
	}

	void visualizar() {
		String v[] = datos.split(":");
		for (int i = 0; i < v.length; i++) {
			if (i%2==0) {
				System.out.println("Nombre : "+v[i]);
			}
			if (i%2!=0) {
				System.out.println("Sueldo : "+v[i]);
			}
		}
	}
	
	
	
}
