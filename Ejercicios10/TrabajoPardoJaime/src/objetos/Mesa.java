package objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Mesa {

	private int numeroMesa;
	private int precioMesa;
	private ArrayList<Plato> platos = null;
	private Scanner scan = new Scanner(System.in);
	
	/**
	 * Inicializa los atributos de la clase
	 * 
	 * @param numeroMesa Numero identificativo de la mesa
	 * @param precioMesa Precio total de los platos de la mesa
	 * @param platos ArrayList de los platos de la mesa
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
	 * @param platos ArrayList de los platos de la mesa
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

	public int getPrecioMesa() {
		return precioMesa;
	}

	public void setPrecioMesa(int precioMesa) {
		this.precioMesa = precioMesa;
	}

	// AÑADIR PLATO
	public void añadirPlato(Archivo carta) {
		int numPlato = -1;
		do {
			do {
				System.out.println();
				System.out.println("(0 para terminar)");
				System.out.print("Numero de plato:");
				numPlato = scan.nextInt();
				if (numPlato > 0 && numPlato < 31) {
					Plato plato = new Plato(numPlato, carta.nombrePlato(numPlato + ""),
							carta.precioPlato(numPlato + ""));
					platos.add(plato);
				}
			} while (numPlato > 0 && numPlato < 31);

		} while (numPlato != 0);

	}

	/**
	 * Visualiza datos del ArrayList de platos.
	 * 
	 * @see <a href="https://docs.oracle.com/javase/7/docs/api/"> Documentacion de Java </a>
	 * @return strMesa
	 */
	public String visualizarMesa() {
		ordenarPlatos();
		
		String strMesa = "";
		for (int i = 0; i < platos.size(); i++) {
			strMesa += "  Plato " + (i + 1) + ": " + platos.get(i).toString() + "\n";
		}
		return strMesa;

	}

	// ENTREGAR PLATOS
	public void entregarPlato() {
		int numPlato = -1;
		do {
			do {
				System.out.println();
				System.out.println("(0 para terminar)");
				System.out.print("Plato a entregar:");
				numPlato = scan.nextInt();
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

	// CAMBIAR PLATO
	public void remplazarPlato(ArrayList<Mesa> mesas, Archivo carta) {

		System.out.println();
		System.out.print("Que plato quieres remplazar:");
		int numPlato = scan.nextInt();
		if (numPlato > 0 && numPlato <= platos.size()) {
			do {
				System.out.print("Numero del plato nuevo:");
				int numPlatoNuevo = scan.nextInt();
				if (numPlato > 0 && numPlato < 26) {
					platos.get(numPlato - 1).setNumeroPlato(numPlatoNuevo);
					platos.get(numPlato - 1).setNombrePlato(carta.nombrePlato(numPlatoNuevo + ""));
					platos.get(numPlato - 1).setNumeroPlato(carta.precioPlato(numPlatoNuevo + ""));
					System.out.println("Se ha remplazado el plato.");
				}
			} while (numPlato <= 0 || numPlato >= 26);

		}

	}

	// ELIMINAR UN PLATO
	public void eliminarPlato() {

		System.out.println();
		System.out.print("Que plato quieres eliminar:");
		int numPlato = scan.nextInt();
		if (numPlato > 0 && numPlato <= platos.size()) {
			platos.remove(numPlato - 1);
		}

	}

	// DINERO TOTAL
	public int cuenta() {
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
					int totalMesa = 0;
					for (Plato plato : platos) {
						totalMesa += plato.getPrecio();
					}
					vaciar();
					return totalMesa;
				}
				if (respuesta.trim().toLowerCase().equalsIgnoreCase("no")) {
					return 0;
				}
			} while (!respuesta.trim().toLowerCase().equalsIgnoreCase("si")
					|| !respuesta.trim().toLowerCase().equalsIgnoreCase("no"));
		} else {
			int totalMesa = 0;
			for (Plato plato : platos) {
				totalMesa += plato.getPrecio();
			}
			return totalMesa;
		}
		return 0;

	}

	// VACIAR MESA
	public void vaciar() {

		for (int i = 0; i < platos.size(); i++) {
			platos.remove(i);
		}

	}

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
