package empresa;

public enum Departamentos {

	INFORMATICO((byte) 1, "Tecnico Informatico"), 
	QUIMICO((byte) 2, "Ingeniería Quimica"),
	FISICO((byte) 3, "Ciencias Fisicas");

	private byte codigo;
	private String descripcion;

	private Departamentos(byte codigo, String descripcion) {
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
