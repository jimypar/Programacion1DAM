package platos;

import java.util.Scanner;

import objetos.Plato;

public class Bebida extends Plato {

	private Sizes size;
	private Scanner scan = new Scanner(System.in);

	public Bebida(int numPlato) {
		super(numPlato);
		this.size = Sizes.MEDIANO;
	}

	public Bebida() {
		super();
		this.size = Sizes.MEDIANO;
	}
	
	public Sizes getSize() {
		return size;
	}

	public void rellenar() {

		super.rellenar();

		boolean fin = false;
		do {
			try {
				System.out.println("Introduce el tamaño: (Grande,Mediano o Pequeño) ");
				String tam = scan.next();
				this.size = Sizes.valueOf(tam.toUpperCase());
				fin = true;
			} catch (IllegalArgumentException e) {
				fin = false;
			}
		} while (!fin);

	}

	public void visualizar() {

		super.visualizar();
		System.out.println("Tamaño: " + this.size.toString());

	}

	@Override
	public double calcularPrecio() {

		double precio = super.getPrecio();

		if (this.size.equals(Sizes.GRANDE)) {
			precio += 0.5;
		}
		if (this.size.equals(Sizes.PEQUEÑO)) {
			precio -= 0.5;
		}
		return precio;
	}

}
