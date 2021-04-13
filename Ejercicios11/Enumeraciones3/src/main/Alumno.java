package main;

public class Alumno {

	private String nombre;
	private String apellidos;
	private Ciclos ciclo;
	
	public Alumno(String nombre, String apellidos, Ciclos ciclo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ciclo = ciclo;
	}

	
	
	void visualizarAlumno() {
		
		System.out.println("Alumno : "+this.nombre);
		System.out.println("Apellido : "+this.apellidos);
		System.out.println("Ciclo : "+this.ciclo);
		System.out.println("   -alumnos: "+this.ciclo.getNumAlumnos());
		System.out.println("   -asignaturas: "+this.ciclo.getNumAsignaturas());

		
	}
	
}
