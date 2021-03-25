package objetos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase Mesa
 * 
 * @author Jaime
 * @version
 * @since 1.8
 */

public class Mesa {

	private int numeroMesa;
	private double precioMesa;
	private ArrayList<Plato> platos = null;
	private Scanner scan = new Scanner(System.in);

	/**
	 * Inicializa los atributos de la clase
	 * 
	 * @param numeroMesa Numero identificativo de la mesa
	 * @param precioMesa Precio total de los platos de la mesa
	 * @param platos     ArrayList de los platos de la mesa
	 */
	public Mesa() {
		this.numeroMesa = 0;
		this.precioMesa = 0;
		this.platos = new ArrayList<Plato>();
	}

	/**
	 * Inicializa los atributos de la clase
	 * 
	 * @param numeroMesa Numero identificativo de la mesa
	 * @param precioMesa Precio total de los platos de la mesa
	 * @param platos     ArrayList de los platos de la mesa
	 */
	public Mesa(int numero) {
		this.numeroMesa = numero;
		this.precioMesa = 0;
		this.platos = new ArrayList<Plato>();
	}

	public int getNumero() {
		return numeroMesa;
	}

	public void setNumero(int numero) {
		this.numeroMesa = numero;
	}

	public double getPrecioMesa() {
		return precioMesa;
	}

	public void setPrecioMesa(int precioMesa) {
		this.precioMesa = precioMesa;
	}

	/**
	 * El metodo permite añadir un elemento al array buscando un numero en el
	 * archivo carta y introduciendo esos parametros al plato nuevo
	 * 
	 * @param Archivo carta es el archivo txt que se lee para sacar los platos y sus
	 *                precios
	 */
	public void añadirPlato(Archivo carta) {
		int numPlato = -1;
		do {
			do {
				boolean error = false;
				do {
					try {
						System.out.println();
						System.out.println("(0 para terminar)");
						System.out.print("Numero de plato:");
						numPlato = scan.nextInt();
						error = false;
					} catch (InputMismatchException e) {
						error = true;
						scan.nextLine();
					}
				} while (error);

				if (numPlato > 0 && numPlato < 31) {
					Plato plato = new Plato(numPlato, carta.nombrePlato(numPlato + ""),
							carta.precioPlato(numPlato + ""));
					platos.add(plato);
					this.precioMesa += carta.precioPlato(numPlato + "");
				} else {
					System.out.println("No existe ese plato");
				}
			} while (numPlato > 0 && numPlato < 31);

		} while (numPlato != 0);

	}

	/**
	 * Visualiza datos del ArrayList de platos y previamente los ordena cone el
	 * metodo ordenarPlatos()
	 * 
	 * @return strMesa String que contiene el toString de cada Plato de la mesa
	 * 
	 */
	public String visualizarMesa() {
		ordenarPlatos();

		String strMesa = "";
		for (int i = 0; i < platos.size(); i++) {
			strMesa += "  Plato " + (i + 1) + ": " + platos.get(i).toString() + "\n";
		}
		return strMesa;

	}

	/**
	 * Comprueba si el plato esta entregado y si no lo esta lo entrega
	 * 
	 * 
	 */
	public void entregarPlato() {
		int numPlato = -1;
		do {
			do {
				boolean error = false;
				do {
					try {
						System.out.println();
						System.out.println("(0 para terminar)");
						System.out.print("Plato a entregar:");
						numPlato = scan.nextInt();
						error = false;
					} catch (InputMismatchException e) {
						error = true;
						scan.nextLine();
					}
				} while (error);

				if (numPlato > 0 && numPlato <= platos.size()) {
					if (platos.get(numPlato - 1).isEntregado()) {
						System.out.println("Ese plato ya esta entregado");
					} else {
						platos.get(numPlato - 1).setEntregado(true);
						System.out.println("Plato entregado");
					}

				}
			} while (numPlato > 0 && numPlato <= platos.size());

		} while (numPlato != 0);
	}

	/**
	 * El metodo busca un plato en la mesa y te permite remplazar por otro que lo
	 * busca en la carta y sustituye el precio.
	 * 
	 *	@param Archivo carta es el archivo txt que se lee para sacar los platos y sus precios
	 */
	public void remplazarPlato(Archivo carta) {

		int numPlato = 0;
		boolean error = false;
		do {
			try {
				System.out.println();
				System.out.print("Que plato quieres remplazar:");
				numPlato = scan.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				error = true;
				scan.nextLine();
			}
		} while (error);

		if (numPlato > 0 && numPlato <= platos.size()) {
			do {
				int numPlatoNuevo = 0;
				error = false;
				do {
					try {
						System.out.print("Numero del plato nuevo:");
						numPlatoNuevo = scan.nextInt();
						error = false;
					} catch (InputMismatchException e) {
						error = true;
						scan.nextLine();
					}
				} while (error);

				if (numPlato > 0 && numPlato < 31) {
					this.precioMesa -= platos.get(numPlato - 1).getPrecio();
					this.precioMesa += carta.precioPlato(numPlatoNuevo + "");
					platos.get(numPlato - 1).setNumeroPlato(numPlatoNuevo);
					platos.get(numPlato - 1).setNombrePlato(carta.nombrePlato(numPlatoNuevo + ""));
					platos.get(numPlato - 1).setPrecio(carta.precioPlato(numPlatoNuevo + ""));
					platos.get(numPlato - 1).setEntregado(false);
					System.out.println("Se ha remplazado el plato.");
				}
			} while (numPlato <= 0 || numPlato >= 31);

		}

	}

	/**
	 * Metodo que permite eliminar un plato y sus datos del ArrayList
	 * 
	 */
	public void eliminarPlato() {
		int numPlato = 0;
		boolean error = false;
		do {
			try {
				System.out.println();
				System.out.print("Que plato quieres eliminar:");
				numPlato = scan.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				error = true;
				scan.nextLine();
			}
		} while (error);

		if (numPlato > 0 && numPlato <= platos.size()) {
			this.precioMesa -= platos.get(numPlato - 1).getPrecio();
			platos.remove(numPlato - 1);
		}

	}

	/**
	 * Compreba si todos los platos estan entregados y si es asi hace la suma de sus
	 * precios
	 * 
	 * @param numeroMesa Numero identificativo de la mesa
	 * @param precioMesa Precio total de los platos de la mesa
	 * @param platos     ArrayList de los platos de la mesa
	 * 
	 * @return int precio de todos los platos de la mesa
	 */
	public double cuenta() {
		boolean continuar = true;
		for (Plato plato : platos) {
			if (!plato.isEntregado()) {
				continuar = false;
			}
		}
		String respuesta = "";
		if (!continuar) {
			do {
				System.out.println("HAY UN PLATO SIN ENTREGAR");
				System.out.println("¿Deseas continuar?");
				respuesta = scan.next();
				if (respuesta.trim().toLowerCase().equalsIgnoreCase("si")) {
					return this.precioMesa;
				}
				if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
					return 0;
				}
			} while (!respuesta.trim().toLowerCase().equalsIgnoreCase("si")
					|| !respuesta.trim().toLowerCase().equalsIgnoreCase("no"));
		} else {
			return this.precioMesa;
		}
		return 0;

	}

	/**
	 * Metodo que vacia el ArrayList de platos entero
	 * 
	 */
	public void vaciar() {

		platos = new ArrayList<Plato>();
		this.precioMesa = 0;

	}

	/**
	 * Ordenar el ArrayList de platos segun el numero que ocupan en
	 * la carta
	 * 
	 */
	public void ordenarPlatos() {

		for (int i = 0; i < platos.size() - 1; i++) {
			for (int j = i + 1; j < platos.size(); j++) {
				if (platos.get(i).getNumeroPlato() > platos.get(j).getNumeroPlato()) {
					Plato temp = platos.get(i);
					platos.set(i, platos.get(j));
					platos.set(j, temp);
				}
			}
		}

	}

}
