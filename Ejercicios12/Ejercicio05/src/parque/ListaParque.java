package parque;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaParque {

	private Scanner scan = new Scanner(System.in);
	private ArrayList<Parquenacional> parques;

	public ListaParque() {
		parques = new ArrayList<Parquenacional>();
	}

	public void rellenarLista() {

		String respuesta = "";
		do {
			System.out.println("1.Area Protegida");
			System.out.println("2.Reservar Caza");
			System.out.print("Elige: ");
			int opcion = scan.nextInt();
			if (opcion == 1) {

				System.out.println("1.Acuatica");
				System.out.println("2.Terrestre");
				System.out.print("Elige: ");
				int opcion2 = scan.nextInt();
				if (opcion2 == 1) {
					System.out.println("Introduce la longitud");
					Acuatica acuatica = new Acuatica();
					acuatica.rellenar();
					parques.add(acuatica);
				}
				if (opcion2 == 2) {
					System.out.println("Introduce el tipo de terreno");
					Terrestre terrestre = new Terrestre();
					terrestre.rellenar();
					parques.add(terrestre);
				}

			}
			if (opcion == 2) {
				ReservaCaza reservacaza = new ReservaCaza();
				reservacaza.rellenar();
				parques.add(reservacaza);
			}
			System.out.println("Deseas continuar?");
			respuesta = scan.next();

		} while (respuesta.equalsIgnoreCase("si"));

	}

	public void visualizarLista() {

		for (Parquenacional parquenacional : parques) {
			if (parquenacional.getClass().getSimpleName().equals("AreaProtegida")) {
				System.out.println();
				System.out.println("Area Protegida: ");
				System.out.println();
			} else {
				System.out.println();
				System.out.println("Reserva caza: ");
				System.out.println();
			}
			parquenacional.visualizar();
		}

	}
}
