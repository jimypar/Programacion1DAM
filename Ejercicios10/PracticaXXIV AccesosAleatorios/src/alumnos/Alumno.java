package alumnos;

import java.util.ArrayList;
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
		return "Alumno: " + nombre + "\n Ciclo: " + ciclo + "\n Curso: " + curso + "\n CantidadModulos: "
				+ cantidadModulos ;
	}
	
	public void toStringModulos() {
		for (Modulo modulo : modulos) {
			System.out.println(modulo.toString());
		}
	}


	public void rellenar() {

		for (int i = 1; i <= cantidadModulos; i++) {

			System.out.println("Modulo "+i);
			System.out.println("Nombre:");
			String nombre = scan.next();
			System.out.println("Nota");
			int nota = scan.nextInt();
			
			Modulo modulo = new Modulo(nombre, nota);
			modulos.add(modulo);
		}

	}
	
	public String getNombreModulo(int num) {
		return modulos.get(num).getNombre();
	}
	public Float getNotaModulo(int num) {
		return modulos.get(num).getNota();
	}


	

}
