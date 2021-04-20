package tienda;

import main.Main;

public class Aparato {

	private int codigo;
	private float pvp;
	private int stock;

	Aparato() {
		this.codigo = 0;
		this.pvp = 0;
		this.stock = 0;
	}

	Aparato(int codigo, float pvp, int stock) {
		this.codigo = codigo;
		this.pvp = pvp;
		this.stock = stock;
	}

	public int getCodigo() {
		return codigo;
	}

	public float getPvp() {
		return pvp;
	}

	public int getStock() {
		return stock;
	}

	public void rellenarAparato() {

		boolean error = true;
		do {
			try {
				System.out.println("Codigo de aparato:");
				this.codigo = Main.scan.nextInt();
				error = false;
			} catch (Exception e) {
				System.out.println("Introduce un numero");
				Main.scan.next();
				error = true;
			}
		} while (error);
		error = true;
		do {
			try {
				System.out.println("PVP:");
				this.pvp = Main.scan.nextFloat();
				error = false;
			} catch (Exception e) {
				System.out.println("Introduce un numero");
				Main.scan.next();
				error = true;
			}
		} while (error);

		error = true;
		do {
			try {
				System.out.println("Stock:");
				this.stock = Main.scan.nextInt();
				error = false;
			} catch (Exception e) {
				System.out.println("Introduce un numero");
				Main.scan.next();
				error = true;
			}
		} while (error);

	}

	public void visualizarAparato() {

		System.out.println("Codigo:" + this.codigo);
		System.out.println("PVP:" + this.pvp);
		System.out.println("Stock:" + this.stock);

	}

}
