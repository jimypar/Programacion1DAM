package tienda;

import java.util.Scanner;

public class Nevera extends Electrodomestico{
	private String descripcion;
	private byte numeroPuertas; 

	public Nevera() {
		super();
		this.descripcion = "";
		this.numeroPuertas = 0;
	}
	


	public Nevera(int codigo, float pvp, int stock,
			String descripcion, int nuemroPuertas) {
		super(codigo, pvp, stock);
		this.descripcion=descripcion;
		this.numeroPuertas=numeroPuertas;
		
	}

	public void rellenar() {
		Scanner in = new Scanner(System.in);
		System.out.print("Descripcion = "  );
		this.descripcion=in.nextLine();
		System.out.println("Numero de puertas = ");
		this.numeroPuertas=in.nextByte();
	}
	public void visualizar() {
		System.out.println("Descripcion = " +this.descripcion );
		System.out.println("NUemro de puertas = " +this.numeroPuertas );
	}
	@Override
	public String toString() {
		return "Nevera [descripcion=" + descripcion + ", numeroPuertas=" + numeroPuertas + "]";
	}
	
	
	
}
