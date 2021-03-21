package objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Mesa {

	private int numeroMesa;
	private int precioMesa;
	private ArrayList<Plato> platos = null;
	private Scanner scan = new Scanner(System.in);

	public Mesa() {
		this.numeroMesa = 0;
		this.precioMesa = 0;
		this.platos = new ArrayList<Plato>();
	}

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
				if (numPlato > 0 && numPlato < 26) {
					Plato plato = new Plato(numPlato, carta.nombrePlato(numPlato + ""),
							carta.precioPlato(numPlato + ""));
					platos.add(plato);
				}
			} while (numPlato > 0 && numPlato < 26);

		} while (numPlato != 0);

	}

	// VER PLATOS
	public String visualizarMesa() {
		String strMesa = "";
		for (int i = 0; i < platos.size(); i++) {
			strMesa += "  Plato " + (i + 1) + ": " + platos.get(i).toString() + "\n";
		}
		return strMesa;

	}

	// CAMBIAR PLATO
	public void remplazarPlato(Archivo carta) {

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
		int totalMesa = 0;
		for (Plato plato : platos) {
			totalMesa += plato.getPrecio();
		}
		return totalMesa;
		

	}

	// VACIAR MESA
	public void vaciar() {

	}

}
