package main;

public class Fecha {

	private int dia;
	private int mes;
	private int año;

	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.año = 1;
	}

	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAño() {
		return año;
	}

	public boolean fechaEsCorrecta() {
		boolean dia = false;
		boolean mes = false;
		boolean año = false;
		if (this.año > 0) {
			año = true;
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
		return año && mes && dia;

	}

	public void diaSiguiente() {
		dia++;
		if (!fechaEsCorrecta()) {
			dia = 1;
			mes++;
			if (!fechaEsCorrecta()) {
				mes = 1;
				año++;
			}

		}
	}

	@Override
	public String toString() {
		return "Fecha: " + dia + " - " + mes + " - " + año;
	}

}