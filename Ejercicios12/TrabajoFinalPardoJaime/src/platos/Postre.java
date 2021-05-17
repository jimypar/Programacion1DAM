package platos;

import java.util.Scanner;

import objetos.Plato;

public class Postre extends Plato {

	private boolean azucar;
	private Scanner scan = new Scanner(System.in);

	public Postre(int numPlato) {
		super(numPlato);
		this.azucar = true;
	}
	
	public Postre() {
		super();
		this.azucar = true;
	}
	
	

	public void rellenar() {

		super.rellenar();

		String respuesta = "";
		do {
			System.out.println("Con azucar? (Si o No)");
			respuesta = scan.next();
			if (respuesta.trim().toLowerCase().equalsIgnoreCase("si")) {
				this.azucar = true;
			}
			if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
				this.azucar = false;
			}
		} while (!respuesta.toLowerCase().equalsIgnoreCase("si") && !respuesta.toLowerCase().equalsIgnoreCase("no"));

	}

	public void visualizar() {

		super.visualizar();
		System.out.println(tieneAzucar());

	}

	public String tieneAzucar() {
		if (this.azucar) {
			return "Con Azucar";
		} else {
			return "Sin Azucar";
		}

	}

	@Override
	public double calcularPrecio() {

		double precio = super.getPrecio();

		if (this.azucar) {
			precio += 0.1;
		}
		return precio;
	}

}
