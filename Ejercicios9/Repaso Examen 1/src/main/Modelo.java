package main;



public class Modelo {
	
	
	private String nombre;
	private int stock;
	
	Modelo(){
		this.nombre = "";
		this.stock = 0;
	}
		
	Modelo(String nombre, int stock) {
		super();
		this.nombre = nombre;
		this.stock = stock;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	void visualizar() {
		
		System.out.println("Modelo: "+this.nombre);
		System.out.println("Stock: "+this.stock);
			
	}
	
	
	
	
}
