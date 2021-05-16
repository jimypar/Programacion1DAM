package main;

public enum Ciclos {

	ASIR("INF", "Administración de sistemas informáticos"), 
	DAM("INF", "Desarrollo de aplicaciones multiplataforma"),
	MKT("ADM", "Marketing");

	private String codigo;
	private String descripcion;

	private Ciclos(String codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

}
