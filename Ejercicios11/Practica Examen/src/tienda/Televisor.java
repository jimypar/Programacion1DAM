package tienda;

import java.util.Scanner;

public class Televisor extends Aparato {

	private Tipos tipo;

	public Televisor() {
		super();
		this.tipo = null;
	}

	public Televisor(int codigo, float pvp, int stock, Tipos tipo) {
		super(codigo, pvp, stock);
		this.tipo = tipo;
	}

	public Tipos getTipo() {
		return tipo;
	}

	public int getCodigo() {
		return super.getCodigo();
	}

	public float getPvp() {
		return super.getPvp();
	}

	public int getStock() {
		return super.getStock();
	}

	public void rellenar() {
		Scanner scan = new Scanner(System.in);

		super.rellenarAparato();

		boolean fin = false;
		do {
			try {
				System.out.println("Introduce tipo:");

				for (Tipos t : Tipos.values()) {
					System.out.println("TIPO: " + t.toString());
					System.out.println("    Descripcion: " + t.getDescripcion());
					System.out.println("    Porcentaje: " + t.getPorcentaje());
					System.out.println("    Codigo: " + t.getCodigo());
				}

				String unTipo = scan.next();
				this.tipo = Tipos.valueOf(unTipo.toUpperCase());
				fin = true;
			} catch (IllegalArgumentException e) {
				fin = false;
			}
		} while (!fin);

	}

	public void visualizar() {

		super.visualizarAparato();
		System.out.println("Tipo:" + this.tipo.toString());
		System.out.println("    Descripcion: " + this.tipo.getCodigo());
		System.out.println("    Porcentaje: " + this.tipo.getDescripcion());
		System.out.println("    Codigo: " + this.tipo.getPorcentaje());
	}

}
