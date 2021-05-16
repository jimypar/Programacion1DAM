package tienda;

import main.Main;

public class Nevera extends Aparato {

	private String descripcion;
	private int numPuertas;

	public Nevera() {
		super();
		this.descripcion = "";
		this.numPuertas = 0;
	}

	public Nevera(int codigo, float pvp, int stock, String descripcion, int numPuertas) {
		super(codigo, pvp, stock);
		this.descripcion = descripcion;
		this.numPuertas = numPuertas;
	}

	public void rellenar() {

		super.rellenarAparato();
		System.out.println("Descripcion");
		this.descripcion = Main.scan.next();

		boolean error = true;
		do {
			try {
				System.out.println("Numero Puertas: ");
				int numPuertas = Main.scan.nextInt();
				if (numPuertas==1 || numPuertas==2) {
					this.numPuertas = numPuertas;
					error = false;
				}
				else {
					System.out.println("Introduce 1 o 2");
					error = true;
				}
			
				
			} catch (Exception e) {
				System.out.println("Introduce un numero");
				Main.scan.next();
				error = true;
			}
		} while (error);

	}

	void visualizar() {

		super.visualizarAparato();
		System.out.println("Descripcion: " + this.descripcion);
		System.out.println("Numero puertas: " + this.numPuertas);

		if (this.numPuertas == 1 && super.getStock() < 10) {
			System.out.println("PrecioModificado = " + super.getPvp() * 1.10);
		} else if (this.numPuertas == 1 && super.getStock() > 10) {
			System.out.println("PrecioModificado = " + super.getPvp() * 1.20);
		} else if (this.numPuertas == 2 && super.getStock() > 10) {
			System.out.println("PrecioModificado = " + super.getPvp() * 1.15);
		} else {
			System.out.println("PrecioModificado = " + super.getPvp() * 1.05);
		}

	}

}
