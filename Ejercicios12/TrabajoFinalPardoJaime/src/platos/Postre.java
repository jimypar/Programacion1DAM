package platos;

import java.util.Scanner;

import objetos.Plato;

/**
 * Clase Postre
 * 
 * @author Jaime
 * @version
 * @since 1.8
 */
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

	/**
	 * Rellenar los atributos de la clase.
	 */
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

	/**
	 * Visualiza los atributos de la clase.
	 */
	public void visualizar() {

		super.visualizar();
		System.out.println(tieneAzucar());

	}
	
	@Override
	public String toString() {
		
		return super.toString()+"\n   -" + tieneAzucar();
	}

	/**
	 * Devuelve un string segun el booleano azucar del plato.
	 * 
	 * @return String con azucar o sin azucar.
	 */
	public String tieneAzucar() {
		if (this.azucar) {
			return "Con Azucar";
		} else {
			return "Sin Azucar";
		}

	}

	/**
	 * Añade al precio 10 centimos si elige azucar.
	 * 
	 * @return precio Precio final.
	 */
	@Override
	public double calcularPrecio() {

		double precio = super.getPrecio();

		if (this.azucar) {
			precio += 0.1;
		}
		return precio;
	}

}
