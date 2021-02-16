package main;

public class Main {

	public static void main(String[] args) {

		Tablero jugador1 = new Tablero();
		Tablero jugador2 = new Tablero();

		// JUGADOR 1
		System.out.println("JUGADOR 1:");
		jugador1.visualizar(jugador1.getTablero1());
		do {
			jugador1.vaciarTableros();
			jugador1.introducirBarco(jugador1.getTablero1());
			jugador1.visualizar(jugador1.getTablero1());
		} while (jugador1.repetirBarco());

		// JUGADOR 2
		System.out.println("JUGADOR 2:");
		jugador2.visualizar(jugador2.getTablero1());
		do {
			jugador2.vaciarTableros();
			jugador2.introducirBarco(jugador2.getTablero1());
			jugador2.visualizar(jugador2.getTablero1());
		} while (jugador2.repetirBarco());

		do {
			// turno jugador1
			do {
				System.out.println("JUGADOR 1:");
				jugador1.visualizar(jugador1.getTablero2());
				jugador1.ataque(jugador2.getTablero1(), jugador1.getTablero2());
			} while (jugador1.getAcierto() && !jugador1.ganado());
			// turno jugador2
			do {
				System.out.println("JUGADOR 2:");
				jugador2.visualizar(jugador2.getTablero2());
				jugador2.ataque(jugador1.getTablero1(), jugador2.getTablero2());
			} while (jugador2.getAcierto() && !jugador2.ganado());
		} while (!jugador1.ganado() && !jugador2.ganado());

		// FIN
		if (jugador1.ganado() && jugador2.ganado()) {
			System.out.println("SE HA EMPATADO");
		} else {
			if (jugador1.ganado()) {
				System.out.println("JUGADOR 1:");
				jugador1.visualizar(jugador1.getTablero2());
				System.out.println("EL JUGADOR 1 HA GANADO");
			}
			if (jugador2.ganado()) {
				System.out.println("JUGADOR 2:");
				jugador2.visualizar(jugador2.getTablero2());
				System.out.println("EL JUGADOR 2 HA GANADO");
			}
		}

	}

}
