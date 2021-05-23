package alimentacion;

import java.util.Scanner;

public class Comida extends Articulo {

	private TiposComidas tipoComida;

	public Comida(String descripcion, double precio, TiposComidas tipoComida) {
		super(descripcion, precio);
		this.tipoComida = tipoComida;
	}

	public Comida() {
		super();
		this.tipoComida = TiposComidas.CARNE;
	}

	public TiposComidas getTipoComida() {
		return tipoComida;
	}

	public void rellenar() {
		Scanner scan = new Scanner(System.in);

		super.rellenar();
		boolean error = false;
		do {
			try {
				System.out.println("Introduce el tipo de bebida:");
				for (TiposComidas tipo : TiposComidas.values()) {
					System.out.println(tipo.toString());
				}
				String respuesta = scan.next();
				this.tipoComida = TiposComidas.valueOf(respuesta.toUpperCase());
				error = false;
			} catch (Exception e) {
				System.out.println("Dato incorreto");
				error = true;
			}
		} while (error);

	}

	public void visualizar() {
		super.visualizar();

		System.out.println("Tipo: " + this.tipoComida.toString());
		System.out.println("Precio Venta: " + CalularPrecioVenta());

	}

	@Override
	public double CalularPrecioVenta() {

		double precio = super.getPrecio();

		if (this.tipoComida == TiposComidas.CARNE) {
			precio += precio * 0.15;
		}
		if (this.tipoComida == TiposComidas.PESCADO) {
			precio += precio * 0.25;
		}

		return precio;
	}

}
