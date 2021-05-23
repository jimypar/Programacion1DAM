package alimentacion;

import java.util.Scanner;

public class Bebida extends Articulo {

	private TiposBebidas tipoBebida;

	public Bebida(String descripcion, double precio, TiposBebidas tipoBebida) {
		super(descripcion, precio);
		this.tipoBebida = tipoBebida;
	}

	public Bebida() {
		super();
		this.tipoBebida = TiposBebidas.SINALCOHOL;
	}

	public TiposBebidas getTipoBebida() {
		return tipoBebida;
	}

	public void rellenar() {
		Scanner scan = new Scanner(System.in);

		super.rellenar();
		boolean error = false;
		do {
			try {
				System.out.println("Introduce el tipo de bebida:");
				for (TiposBebidas tipo : TiposBebidas.values()) {
					System.out.println(tipo.toString());
				}
				String respuesta = scan.next();
				this.tipoBebida = TiposBebidas.valueOf(respuesta.toUpperCase());
				error = false;
			} catch (Exception e) {
				System.out.println("Dato incorreto");
				error = true;
			}
		} while (error);

	}

	public void visualizar() {
		super.visualizar();

		System.out.println("Tipo: " + this.tipoBebida.toString());
		System.out.println("Precio Venta: " + CalularPrecioVenta());

	}

	@Override
	public double CalularPrecioVenta() {

		double precio = super.getPrecio();

		if (this.tipoBebida == TiposBebidas.SINALCOHOL) {
			precio += precio * 0.2;
		}
		if (this.tipoBebida == TiposBebidas.CONALCOHOL) {
			precio += precio * 0.3;
		}

		return precio;
	}

}
