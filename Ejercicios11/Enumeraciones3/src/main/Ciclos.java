package main;

public enum Ciclos {

	ASI(20, 5), DAM(25, 4), MARKETING(30, 7);

	private int numAlumnos;
	private int numAsignaturas;

	private Ciclos(int numAlumnos, int numAsignaturas) {
		this.numAlumnos = numAlumnos;
		this.numAsignaturas = numAsignaturas;
	}

	public int getNumAlumnos() {
		return numAlumnos;
	}

	public int getNumAsignaturas() {
		return numAsignaturas;
	}

}
