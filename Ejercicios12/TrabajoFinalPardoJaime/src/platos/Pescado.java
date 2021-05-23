package platos;

import java.util.Scanner;

import objetos.Plato;

/**
 * Clase Pescado
 * 
 * @author Jaime
 * @version
 * @since 1.8
 */
public class Pescado extends Plato {

	private Acompanamientos acompanamiento;
	private Scanner scan = new Scanner(System.in);

	public Pescado(int numPlato) {
		super(numPlato);
		this.acompanamiento = Acompanamientos.NADA;
	}

	public Pescado() {
		super();
		this.acompanamiento = Acompanamientos.NADA;
	}

	public Acompanamientos getAcompanamiento() {
		return acompanamiento;
	}

	/**
	 * Rellenar los atributos de la clase.
	 */
	public void rellenar() {

		super.rellenar();

		boolean fin = false;
		do {
			try {
				System.out.println("Introduce el acompañamiento: (Ensalada,Patatas o Nada) ");
				String acom = scan.next();
				this.acompanamiento = Acompanamientos.valueOf(acom.toUpperCase());
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
		System.out.println("Acompañamiento : " + this.acompanamiento.toString());

	}

	@Override
	public String toString() {

		return super.toString() + "\n   -" + this.acompanamiento;
	}

	/**
	 * Calcula el precio segun el acompañamiento que se elige
	 * 
	 * @return precio Precio del plato calculado
	 */
	@Override
	public double calcularPrecio() {

		double precio = super.getPrecio();

		if (this.acompanamiento.equals(Acompanamientos.ENSALADA)) {
			precio += 1;
		}
		if (this.acompanamiento.equals(Acompanamientos.PATATAS)) {
			precio += 1.5;
		}
		return precio;
	}

}
