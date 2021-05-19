package objetos;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import platos.Bebida;
import platos.Carne;
import platos.Pescado;
import platos.Postre;

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
	 * @param c
	 * 
	 * @param Archivo carta es el archivo txt que se lee para sacar los platos y sus
	 *                precios
	 */
	public void añadirPlato(Connection c) {
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

				if (numPlato > 0 && numPlato < 6) {
					Bebida bebida = new Bebida(numPlato);
					bebida.rellenar();
					Database.addData(c, this.numeroMesa, numPlato, bebida.getSize().toString());
					this.precioMesa += bebida.calcularPrecio();
					platos.add(bebida);
				}
				if (numPlato > 5 && numPlato < 15) {
					Carne carne = new Carne(numPlato);
					carne.rellenar();
					Database.addData(c, this.numeroMesa, numPlato, carne.getCoccion().toString());
					this.precioMesa += carne.calcularPrecio();
					platos.add(carne);
				}
				if (numPlato > 14 && numPlato < 25) {
					Pescado pescado = new Pescado(numPlato);
					pescado.rellenar();
					Database.addData(c, this.numeroMesa, numPlato, pescado.getAcompanamiento().toString());
					this.precioMesa += pescado.calcularPrecio();
					platos.add(pescado);
				}
				if (numPlato > 24 && numPlato < 31) {
					Postre postre = new Postre(numPlato);
					postre.rellenar();
					Database.addData(c, this.numeroMesa, numPlato, postre.tieneAzucar());
					this.precioMesa += postre.calcularPrecio();
					platos.add(postre);
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
	 * Metodo que permite eliminar un plato y sus datos del ArrayList
	 * 
	 */
	public void eliminarPlato(Connection c) {
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
			this.precioMesa -= platos.get(numPlato - 1).calcularPrecio();
			platos.remove(numPlato - 1);
			Database.deleteData(c, this.numeroMesa, numPlato);
		}

	}

	public void remplazarPlato(Connection c) {

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
				Database.deleteData(c, this.numeroMesa,this.platos.get(numPlato - 1).getNumeroPlato());
				this.precioMesa -= platos.get(numPlato - 1).calcularPrecio();
				platos.remove(numPlato - 1);

				int numPlatoNuevo = 0;
				error = false;
				do {
					try {
						do {
							do {
								try {
									System.out.println();
									System.out.print("Numero del plato nuevo:");
									numPlatoNuevo = scan.nextInt();
									error = false;
								} catch (InputMismatchException e) {
									error = true;
									scan.nextLine();
								}
							} while (error);

							if (numPlatoNuevo > 0 && numPlatoNuevo < 6) {
								Bebida bebida = new Bebida(numPlatoNuevo);
								bebida.rellenar();
								Database.addData(c, this.numeroMesa, numPlato, bebida.getSize().toString());
								this.precioMesa += bebida.calcularPrecio();
								platos.add(bebida);
							}
							if (numPlatoNuevo > 5 && numPlatoNuevo < 15) {
								Carne carne = new Carne(numPlatoNuevo);
								carne.rellenar();
								Database.addData(c, this.numeroMesa, numPlato, carne.getCoccion().toString());
								this.precioMesa += carne.calcularPrecio();
								platos.add(carne);
							}
							if (numPlatoNuevo > 14 && numPlatoNuevo < 25) {
								Pescado pescado = new Pescado(numPlatoNuevo);
								pescado.rellenar();
								Database.addData(c, this.numeroMesa, numPlato, pescado.getAcompanamiento().toString());
								this.precioMesa += pescado.calcularPrecio();
								platos.add(pescado);
							}
							if (numPlatoNuevo > 24 && numPlatoNuevo < 31) {
								Postre postre = new Postre(numPlatoNuevo);
								postre.rellenar();
								Database.addData(c, this.numeroMesa, numPlato, postre.getNombrePlato().toString());
								this.precioMesa += postre.calcularPrecio();
								platos.add(postre);
							}
						} while (numPlato < 1 && numPlato > 30);

						error = false;
					} catch (InputMismatchException e) {
						error = true;
						scan.nextLine();
					}
				} while (error);

				if (numPlato > 0 && numPlato < 31) {

					System.out.println("Se ha remplazado el plato.");
				}
			} while (numPlato <= 0 || numPlato >= 31);

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
	 * @param c
	 * 
	 */
	public void vaciar(Connection c) {

		platos = new ArrayList<Plato>();
		this.precioMesa = 0;
		Database.deleteMesa(c, this.numeroMesa);

	}

	/**
	 * Ordenar el ArrayList de platos segun el numero que ocupan en la carta
	 * 
	 */
	public void ordenarPlatos() {

		Collections.sort(platos);

	}

}
