package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import alimentacion.Articulo;
import alimentacion.Bebida;
import alimentacion.Comida;

public class Main {

	static ArrayList<Articulo> articulos = new ArrayList<Articulo>();

	public static void main(String[] args) {
		
		insertarDatos();
		Collections.sort(articulos);
		visualizarDatos();
		baseDatos();

		
		
	}

	private static void baseDatos() {
		
		Database base = new Database();
		base.crearConexion();
		base.crearTablas();
		
		for (Articulo articulo : articulos) {
			if (articulo.getClass().getSimpleName().equals("Bebida")) {
				Bebida bebida = new Bebida();
				bebida = (Bebida)articulo;
				base.insertarDato(articulo.getDescripcion(),articulo.getPrecio(),bebida.getTipoBebida().toString());
			}
			if (articulo.getClass().getSimpleName().equals("Comida")) {
				Comida comida = new Comida();
				comida = (Comida)articulo;
				base.insertarDato(articulo.getDescripcion(),articulo.getPrecio(),comida.getTipoComida().toString());
			}
		}
		
		base.actualizarPrecio();
		
		base.visualizarComida(2);
		
		
		
		
		
	}

	private static void visualizarDatos() {
		
		for (Articulo articulo : articulos) {
			if (articulo.getClass().getSimpleName().equals("Bebida")) {
				System.out.println("BEBIDA: ");
			}
			else {
				System.out.println("COMIDA");
			}
			articulo.visualizar();
		}
		
	}

	private static void insertarDatos() {
		
		Scanner scan = new Scanner(System.in);

		String respuesta = "";
		do {
			boolean salir = false;

			do {
				int menu;
				try {
					System.out.println("Que articulo quieres crear?");
					System.out.println("1.Bebida");
					System.out.println("2.Comida");
					menu = scan.nextInt();
				} catch (InputMismatchException e) {
					menu=-1;
					scan.next();
				}
				switch (menu) {
				case 1:
					Bebida bebida = new Bebida();
					bebida.rellenar();
					articulos.add(bebida);
					salir = true;
					break;
				case 2:
					Comida comida = new Comida();
					comida.rellenar();
					articulos.add(comida);
					salir = true;
					break;
				default:
					salir = false;
					break;
				}
			} while (!salir);

			System.out.println("Deseas insertar otro dato?");
			respuesta = scan.next();
		} while (!respuesta.toLowerCase().equalsIgnoreCase("no"));
		
	}

}
