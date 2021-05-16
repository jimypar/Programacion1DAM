package Alimentacion;

import java.util.Scanner;

public class Bebida extends Articulo {

	private TipoBebidas tipobebida;
	private Scanner scan = new Scanner(System.in);

	public void rellenar() {

		super.rellenar();

		boolean fin = false;
		do {
			try {
				System.out.println("Introduce el tipo: ");
				for (TipoBebidas bebida : TipoBebidas.values()) {
					System.out.println(bebida.toString());
				}
				String tipo = scan.next();
				this.tipobebida = TipoBebidas.valueOf(tipo.toUpperCase());
				fin = true;
			} catch (IllegalArgumentException e) {
				fin = false;
			}
		} while (!fin);

	}

	public void visualizar() {
		
		super.visualizar();
		
		System.out.println("Comida: "+this.tipobebida.toString());
		System.out.println("Precio venta: "+(super.getPrecioCompra()+(super.getPrecioCompra()*this.tipobebida.getPorcentaje()/100)));

	}

}
