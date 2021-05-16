package tienda;

import java.util.Scanner;

import org.omg.CORBA.TIMEOUT;

public class Televisor extends Electrodomestico{
	private TipoTelevisores tipoTelevisor;
	
	
	public Televisor() {
		super();
		this.tipoTelevisor =TipoTelevisores.LCD;
	}
	
	public Televisor(int codigo, 
			float pvp, int stock, 
			TipoTelevisores unTipo) {
		super(codigo, pvp, stock);
		this.tipoTelevisor=unTipo;
		
	}

	void rellenar() {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Rellenar los datos del televisor");
		super.rellenar();
		boolean error=false;
		do {
			try {
				//rellenar el campo propio de la clase
				System.out.println("Listado de tv");
				for (TipoTelevisores unTelevisor : TipoTelevisores.values()) {
					System.out.println(unTelevisor.toString());
				}
				System.out.print("Elegir un valor = ");
				this.tipoTelevisor=TipoTelevisores.valueOf(in.nextLine().toUpperCase());
				error=false;
			}catch(IllegalArgumentException e) {
				System.out.println("Error, valor incorrecto");
				error=true;
			}
		}while(error==true);
		
	}
	void visualizar() {
		super.visualizar();
		System.out.println("Tipo televisor = " + this.tipoTelevisor.toString()) ;
		System.out.println("\tDescipcion =" + this.tipoTelevisor.getDescripcion() );
		System.out.println("\tPorcentaje ="+ this.tipoTelevisor.getPorcentaje());
		System.out.println("\tCodigo ="+this.tipoTelevisor.getCodigo());
		
	}

	public TipoTelevisores getTipoTelevisor() {
		return tipoTelevisor;
	}
	
}
