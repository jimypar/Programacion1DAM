package Alimentacion;

public enum TipoComidas {

	CARNE(15), PESCADO(25);

	private int porcentaje;

	private TipoComidas(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

}
