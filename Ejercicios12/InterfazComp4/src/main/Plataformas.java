package main;

public enum Plataformas {

	PS("PlayStation 4", "Sony"), XBOX("Xbox Clásica", "Microsoft");

	private String descripcion;
	private String fabricante;

	public String getDescripcion() {
		return descripcion;
	}

	public String getFabricante() {
		return fabricante;
	}

	private Plataformas(String descripcion, String fabricante) {
		this.descripcion = descripcion;
		this.fabricante = fabricante;
	}

}
