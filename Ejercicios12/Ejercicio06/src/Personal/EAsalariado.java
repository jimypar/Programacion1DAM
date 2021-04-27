package Personal;

import java.util.Scanner;

public class EAsalariado extends Empleado {
	private Scanner scan = new Scanner(System.in);
	private int sueldoBasico;
	private int porcentajeAd;

	public EAsalariado() {
		super();
		this.sueldoBasico = 0;
		this.porcentajeAd = 0;
	}

	public EAsalariado(Scanner scan, String numeroDNI, String nombre, String apellido, int year, int sueldoBasico,
			int porcentajeAd) {
		super(scan, numeroDNI, nombre, apellido, year);
		this.sueldoBasico = sueldoBasico;
		this.porcentajeAd = porcentajeAd;
	}

	void rellenar() {

		super.rellenar();

		System.out.println("Introduce el sueldo: ");
		this.sueldoBasico = scan.nextInt();
		System.out.println("Introduce porcentaje: ");
		this.porcentajeAd = scan.nextInt();

	}

	void visualizar() {
		super.visualizar();
		obtenerSalario();

		System.out.println("Sueldo: " + this.sueldoBasico);
		System.out.println("Porcentaje: " + this.porcentajeAd);
		System.out.println("Salario: " + obtenerSalario());

	}

	@Override
	void imprimir() {
		// TODO Auto-generated method stub

	}

	@Override
	int obtenerSalario() {

		if ((2021 - super.getYear()) > 1 || (2021 - super.getYear()) < 4) {
			return this.porcentajeAd + 5;
		}
		if ((2021 - super.getYear()) > 3 || (2021 - super.getYear()) < 8) {
			return this.porcentajeAd + 10;
		}
		if ((2021 - super.getYear()) > 7 || (2021 - super.getYear()) < 16) {
			return this.porcentajeAd + 15;
		}
		if ((2021 - super.getYear()) > 15) {
			return this.porcentajeAd + 20;
		}

		return this.porcentajeAd;
	}

}
