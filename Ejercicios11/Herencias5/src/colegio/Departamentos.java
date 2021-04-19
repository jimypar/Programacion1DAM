package colegio;

public enum Departamentos {

	ASIR(1, "Administracion Sistemas Informaticos", 17), 
	DAM(2, "Desarrollo de aplicaciones multiplataforma", 18),
	DAW(3, "Desarrollo de aplicaciones web", 19);

	private int codigo;
	private String descripcion;
	private int numModulos;

	private Departamentos(int codigo, String descripcion, int numModulos) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.numModulos = numModulos;
	}

	public int getCodigoDep() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getNumPlazas() {
		return numModulos;
	}

}
