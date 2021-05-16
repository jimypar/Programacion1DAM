package tienda;

public enum TipoTelevisores {

	PLASMA ("televisores de gran formato", 10, 1),
	LCD( "la evolución de los monitores CRT", 20,2),
	LED("la tecnología más extendida",25,3);

	
	private String descripcion;
	private int porcentaje; 
	private int codigo;
	
	private TipoTelevisores(String descripcion, int porcentaje, int codigo) {
		this.descripcion = descripcion;
		this.porcentaje = porcentaje;
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public int getCodigo() {
		return codigo;
	}
	
}
