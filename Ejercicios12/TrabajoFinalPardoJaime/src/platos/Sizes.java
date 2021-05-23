package platos;

public enum Sizes {

	GRANDE(1), MEDIANO(0.5), PEQUE�O(0);

	private double add;

	private Sizes(double add) {
		this.add = add;
	}

	public double getAdd() {
		return add;
	}

}
