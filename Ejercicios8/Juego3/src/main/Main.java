package main;

public class Main {

	public static void main(String[] args) {
		int jugador = 1;

		Tablero tablero = new Tablero();

		do {
			System.out.println("  Jugador 1");
			jugador = 1;
			tablero.visualizar();
			tablero.rellenar(jugador);
			if (tablero.ganado() || tablero.empate()) {
				break;
			}
			System.out.println("  Jugador 2");
			jugador = 2;
			tablero.visualizar();
			tablero.rellenar(jugador);
			if (tablero.ganado() || tablero.empate()) {
				break;
			}
		} while (!tablero.ganado() || !tablero.empate());

		if (tablero.empate()) {
			System.out.println("Se ha empatado");
		} else {
			if (jugador == 1) {
				tablero.visualizar();
				System.out.println("EL JUGADOR 1 (x) HA GANADO");
			}
			if (jugador == 2) {
				tablero.visualizar();
				System.out.println("EL JUGADOR 2 (o) HA GANADO");
			}
		}
	}
}
