package Alimentacion;

public enum TipoBebidas {

	SINALCOHOL(20), CONALCOHOL(30);

	private int porcentaje;

	private TipoBebidas(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

}
