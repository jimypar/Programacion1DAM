package main;

public class Fecha {

	private int dia;
	private int mes;
	private int a�o;

	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.a�o = 1;
	}

	public Fecha(int dia, int mes, int a�o) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getA�o() {
		return a�o;
	}

	public boolean fechaEsCorrecta() {
		boolean dia = false;
		boolean mes = false;
		boolean a�o = false;
		if (this.a�o > 0) {
			a�o = true;
		}
		if (this.mes >= 1 && this.mes <= 12) {
			mes = true;
		}
		if (this.mes == 2) {
			if (this.dia >= 1 && this.dia <= 29) {
				dia = true;
			}
		}
		else if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
			if (this.dia >= 1 && this.dia <= 30) {
				dia = true;
			}
		} else {
			if (this.dia >= 1 && this.dia <= 31) {
				dia = true;
			}
		}
		return a�o && mes && dia;

	}

	public void diaSiguiente() {
		dia++;
		if (!fechaEsCorrecta()) {
			dia = 1;
			mes++;
			if (!fechaEsCorrecta()) {
				mes = 1;
				a�o++;
			}

		}
	}

	@Override
	public String toString() {
		return "Fecha: " + dia + " - " + mes + " - " + a�o;
	}

}