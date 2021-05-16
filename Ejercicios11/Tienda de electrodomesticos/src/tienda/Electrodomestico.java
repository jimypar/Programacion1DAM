package tienda;

import java.util.Scanner;

public class Electrodomestico {
	private int codigo; 
	private float pvp; 
	private int stock; 
	
	public Electrodomestico() {
		this.codigo=0;
		this.pvp=0;
		this.stock=0;
		
	}
	public Electrodomestico(int codigo, float pvp, int stock) {
		
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
	void rellenar() {
		Scanner in = new Scanner (System.in);
		System.out.print("Codigo= ");
		this.codigo=in.nextInt();
		System.out.print("PVP = ");
		this.pvp=in.nextFloat();
		System.out.print("Stock = ");
		this.stock=in.nextInt();
	}
	void visualizar() {
		System.out.println("Codigo = " + this.codigo);
		System.out.println("PVP = " + this.pvp);
		System.out.println("Stock = " + this.stock);
	}

	public String toString() {
		return "Electrodomestico [codigo=" + codigo + ", pvp=" + pvp + ", stock=" + stock + "]";
	}
	
}
