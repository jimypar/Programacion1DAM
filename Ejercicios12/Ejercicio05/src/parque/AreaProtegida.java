package parque;

import java.util.Scanner;

public class AreaProtegida extends Parquenacional {

	private Scanner scan = new Scanner(System.in);
	private int subvencion;
	private String ong;

	public AreaProtegida() {
		super();
		this.subvencion = 0;
		this.ong = "";
	}

	public AreaProtegida(String nombre, int km, int numespecie, int subvencion, String ong) {
		super(nombre, km, numespecie);
		this.subvencion = subvencion;
		this.ong = ong;
	}

	@Override
	boolean calcularSubvencion() {

		System.out.println("Introduce ingresos: ");
		int precio = scan.nextInt();
		if (this.subvencion > precio) {
			return true;
		}
		return false;
	}

	void rellenar() {

		super.rellenar();

		System.out.println("Introduce subvencion:");
		this.subvencion = scan.nextInt();
		System.out.println("Introduce ONG: ");
		this.ong = scan.next();

	}


	

	void visualizar() {
		super.visualizar();
		System.out.println("Subvencion del Area Potegida " + this.subvencion);
		System.out.println("ONG = " + this.ong);
		if (calcularSubvencion()) {
			System.out.println("Hay subvencion.");
		} else {
			System.out.println("No hay subvencion");
		}
	}

}
