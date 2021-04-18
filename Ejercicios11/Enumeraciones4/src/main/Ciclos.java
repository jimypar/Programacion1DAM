package main;

//public enum Ciclos {
//
//	ASIR,DAM,DAW;
//
//}

public enum Ciclos {

	DAM(1, "Desarrollo de aplicaciones Multiplataforma"), 
	ASIR(2, "Administración de sistemas informáticos"),
	DAW(3, "Desarrollo de aplicaciones Web");

	private int codigo;
	private String descripcion;

	private Ciclos(int codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

}
