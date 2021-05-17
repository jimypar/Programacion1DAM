package platos;

import java.util.Scanner;

import objetos.Plato;

public class Carne extends Plato {

	private Cocciones coccion;
	private Scanner scan = new Scanner(System.in);

	public Carne(int numPlato) {
		super(numPlato);
		this.coccion = Cocciones.PUNTO;
	}
	
	public Carne() {
		super();
		this.coccion = Cocciones.PUNTO;
	}

	public Cocciones getCoccion() {
		return coccion;
	}

	public void rellenar() {

		super.rellenar();

		boolean fin = false;
		do {
			try {
				System.out.println("Introduce el punto de cocción: (Poco,Mucho,Punto) ");
				String coc = scan.next();
				this.coccion = Cocciones.valueOf(coc.toUpperCase());
				fin = true;
			} catch (IllegalArgumentException e) {
				fin = false;
			}
		} while (!fin);

	}

	public void visualizar() {

		super.visualizar();
		System.out.println("Punto de coccion: " + this.coccion.toString());

	}

	@Override
	public double calcularPrecio() {

		double precio = super.getPrecio() * 1.1;

		return precio;
	}

}
