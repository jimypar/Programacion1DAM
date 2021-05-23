package platos;

import java.util.Scanner;

import objetos.Plato;

/**
 * Clase Bebida
 * 
 * @author Jaime
 * @version
 * @since 1.8
 */
public class Bebida extends Plato {

	private Sizes size;
	private Scanner scan = new Scanner(System.in);

	/**
	 * Inicializa los atributos de la clase
	 * 
	 * @param numPlato Numero del plato
	 */
	public Bebida(int numPlato) {
		super(numPlato);
		this.size = Sizes.MEDIANO;
	}

	/**
	 * Inicializa los atributos de la clase vacios
	 */
	public Bebida() {
		super();
		this.size = Sizes.MEDIANO;
	}

	public Sizes getSize() {
		return size;
	}

	/**
	 * Rellenar los atributos de la clase.
	 */
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

	/**
	 * Visualiza los atributos de la clase.
	 */
	public void visualizar() {

		super.visualizar();
		System.out.println("Tamaño: " + this.size.toString());

	}

	@Override
	public String toString() {
		return super.toString() + "\n   -" + this.size;
	}

	/**
	 * Calcular el precio segun el tamaño de la bebida
	 * 
	 * @return precio Precio calculado
	 */
	@Override
	public double calcularPrecio() {

		double precio = super.getPrecio() + this.size.getAdd();

		return precio;
	}

}
