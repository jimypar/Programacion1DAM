package platos;

import java.util.Scanner;

import objetos.Plato;

/**
 * Clase Carne
 * 
 * @author Jaime
 * @version
 * @since 1.8
 */
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

	/**
	 * Rellenar los atributos de la clase.
	 */
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

	/**
	 * Visualiza los atributos de la clase.
	 */
	public void visualizar() {

		super.visualizar();
		System.out.println("Punto de coccion: " + this.coccion.toString());

	}

	@Override
	public String toString() {

		return super.toString() + "\n   -" + this.coccion;
	}

	/**
	 * Calula los precios añadiendo el 10% de IVA.
	 * 
	 * @return precio Precio con el IVA añadido
	 */
	@Override
	public double calcularPrecio() {

		double precio = super.getPrecio() * 1.1;

		return precio;
	}

}
