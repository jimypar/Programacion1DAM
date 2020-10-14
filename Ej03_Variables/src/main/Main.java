package main;
/*
 * Tipos de datos:
 * 	- datos cadena: delimitados entre comillas dobles.
 *                  Ejemplo: "Manuel", "pepe"
 *  - datos numéricos : sin delimitar. Ej: 3, 13, 3.5
 *  - datos de tipo caracter : delimitados entre comillas simples
 *                             Ejemplo : 's', '?', 'n'           
 */
public class Main {

	public static void main(String[] args) {
		//1. declarar variable
		String nombreAlumno;
		//2. asignar un valor a la variable
		nombreAlumno="José";
		//3. pintar el valor de la variable
		System.out.println("El nombre del alumno es " + nombreAlumno);
		
		//4. modificar el valor de la variable
		nombreAlumno="Manuel";
		System.out.println("Ahora te llamas " + nombreAlumno);
		
		// Crear variables de tipo numerica
		// - para guardad una edad : byte
		// - para guardad sueldo menual(1000) : short
		// - sueldo de anual : int
		// - para guardar nuemro de personas del pais: long
		
		byte edad;
		edad=21;
		System.out.print("Hola "+ nombreAlumno +
				", tu edad es " + edad);
		//inicializar la variable (darle valor en la creacion)
		short sueldo=1500;
		System.out.println(" y tu sueldo es  " + sueldo);
		
		// Crear una variable de tipo caracter
		//  char nombreVariable . Ejemplo : 's'
		
		char estadoCivil='s';
		System.out.println(nombreAlumno +
				", tu estado civil es " + estadoCivil);
		estadoCivil='c';
		System.out.println(" pero en unos años puede "
				+ "que estes en estado civil "+ estadoCivil);
		
	}

}
