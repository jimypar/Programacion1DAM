package Alimentacion;

import java.util.Scanner;

public class Comida extends Articulo {

	private TipoComidas tipocomida;
	private Scanner scan = new Scanner(System.in);

	public TipoComidas getTipocomida() {
		return tipocomida;
	}

	public void rellenar() {

		super.rellenar();

		boolean fin = false;
		do {
			try {
				System.out.println("Introduce: ");
				for (TipoComidas comida : TipoComidas.values()) {
					System.out.println(comida.toString());
				}
				String tipo = scan.next();
				this.tipocomida = TipoComidas.valueOf(tipo.toUpperCase());
				fin = true;
			} catch (IllegalArgumentException e) {
				fin = false;
			}
		} while (!fin);

	}

	public void visualizar() {

		super.visualizar();

		System.out.println("Comida: " + this.tipocomida.toString());
		System.out.println("Precio venta: "
				+ (super.getPrecioCompra() + (super.getPrecioCompra() * this.tipocomida.getPorcentaje() / 100)));

	}

}
