package main;

public class Main {

	public static void main(String[] args) {
		
		Tablero tablero1 = new Tablero();
		Tablero posicion1 = new Tablero();
		
		tablero1.visualizar(tablero1.getTablero1());
		do {
		tablero1.vaciarTablero();
		tablero1.introducirBarco(tablero1.getTablero1());
		tablero1.visualizar(tablero1.getTablero1());
		}while(tablero1.repetirBarco());
		
		do {
		tablero1.ataque();	
		}while();
		
	}

}
