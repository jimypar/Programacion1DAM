package Personal;

import java.util.Scanner;

public class EComision extends Empleado {

	private Scanner scan = new Scanner(System.in);
	private int salarioMin;
	private int clientes;
	private int precioCliente;

	public EComision() {
		super();
		this.salarioMin = 750;
		this.clientes = 0;
		this.precioCliente = 0;
	}

	public EComision(Scanner scan, String numeroDNI, String nombre, String apellido, int year, int salarioMin,
			int clientes, int precioCliente) {
		super(scan, numeroDNI, nombre, apellido, year);
		this.salarioMin = salarioMin;
		this.clientes = clientes;
		this.precioCliente = precioCliente;
	}

	void rellenar() {
		super.rellenar();

		System.out.println("Introduce el salario minimo: ");
		this.salarioMin = scan.nextInt();
		System.out.println("Introduce cantidad clientes: ");
		this.clientes = scan.nextInt();
		System.out.println("Introduce el precio por cliente: ");
		this.precioCliente = scan.nextInt();

	}

	void visualizar() {
		super.visualizar();
		obtenerSalario();

		System.out.println("Salario minimo: " + this.salarioMin);
		System.out.println("Clientes: " + this.clientes);
		System.out.println("Precio por cliente: " + this.precioCliente);
		System.out.println("Salario: " + obtenerSalario());

	}

	@Override
	void imprimir() {

	}

	@Override
	int obtenerSalario() {

		return (this.clientes*this.precioCliente);
		
	}

}
