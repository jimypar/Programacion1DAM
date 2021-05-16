package clases;

public class ComparaNumeros {
	public int numeroMayor(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (c > b) {
			return c;
		} else {
			return b;
		}
	}
}
