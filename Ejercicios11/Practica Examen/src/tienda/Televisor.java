package tienda;

import main.Main;

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

	public void rellenar() {

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

				String unTipo = Main.scan.next();
				this.tipo = Tipos.valueOf(unTipo.toUpperCase());
				fin = true;
			} catch (IllegalArgumentException e) {
				fin = false;
			}
		} while (!fin);

	}

	void visualizar() {

		super.visualizarAparato();
		System.out.println("Tipo:" + this.tipo.toString());
		System.out.println("    Descripcion: " + this.tipo.getCodigo());
		System.out.println("    Porcentaje: " + this.tipo.getDescripcion());
		System.out.println("    Codigo: " + this.tipo.getPorcentaje());
		System.out.println("    Precio total: "
				+ (super.getPvp() + (super.getPvp() * (this.tipo.getPorcentaje() / 100))));
	}

}
