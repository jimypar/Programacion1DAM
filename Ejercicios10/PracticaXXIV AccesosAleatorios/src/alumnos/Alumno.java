package alumnos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Alumno {

	private String nombre;
	private String ciclo;
	private byte curso;
	private int cantidadModulos;
	private ArrayList<Modulo> modulos;
	private Scanner scan = new Scanner(System.in);

	public Alumno(String nombre, String ciclo, byte curso, int cantidadModulos) {
		this.nombre = nombre;
		this.ciclo = ciclo;
		this.curso = curso;
		this.cantidadModulos = cantidadModulos;
		this.modulos = new ArrayList<Modulo>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getCiclo() {
		return ciclo;
	}

	public byte getCurso() {
		return curso;
	}

	public int getCantidadModulos() {
		return cantidadModulos;
	}

	@Override
	public String toString() {
		return "Alumno: " + this.nombre + "\n Ciclo: " + this.ciclo + "\n Curso: " + this.curso + "\n CantidadModulos: "
				+ cantidadModulos;
	}

	public void toStringModulos() {
		for (Modulo modulo : modulos) {
			System.out.println(modulo.toString());
		}
	}

	public void rellenar() {

		for (int i = 1; i <= this.cantidadModulos; i++) {

			System.out.println("Modulo " + i);
						
			String nombre = "";
			do {
				System.out.println("Nombre del modulo:");
				nombre = scan.next();
			} while (nombre.length() > 10);
			nombre = formatear(nombre, 10);

			float nota = 0;
			boolean fin = false;
			do {
				try {
					System.out.println("Nota");
					nota = scan.nextFloat();
					if (nota > 0 && nota < 11) {
						fin = true;
					}
				} catch (InputMismatchException e) {
					System.out.println("Introduce del 1 al 10");
					fin = false;
					scan.next();
				}
			} while (!fin);

			Modulo modulo = new Modulo(nombre, nota);
			modulos.add(modulo);
		}

	}

	private String formatear(String nombre, int longitud) {
		for (int j = nombre.length(); j < longitud; j++) {
			nombre += " ";
		}
		return nombre;
	}

	public String getNombreModulo(int num) {
		return modulos.get(num).getNombre();
	}

	public Float getNotaModulo(int num) {
		return modulos.get(num).getNota();
	}

}
