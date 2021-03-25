package clases;

//import java.*;
//no se importa con el *

/*
 * Clase para refactorizar
 * Se deben comentar todas las refactorizaciones realizadas,
 * mediante comentarios de una linea o de bloque.
 */

public class refac {

	// final es una constante
	// las constantes se declaran con mayuscula,cambio a CAD.
	final static String CAD = "Bienvenido al programa";

	public static void main(String[] args) {

		operacionesNumeros();
		rellenar();
		recorrerDias(rellenarDias());

	}

	private static String[] rellenarDias() {

		// cambio nombre de array por dias
		String[] dias = new String[7];
		dias[0] = "Lunes";
		dias[1] = "Martes";
		dias[2] = "Miercoles";
		dias[3] = "Jueves";
		dias[4] = "Viernes";
		dias[5] = "Sabado";
		dias[6] = "Domingo";
		return dias;

	}

	private static void operacionesNumeros() {

		// separar declaraciones
		// cambiamos nombre variable a -> num1
		int num1;
		// cambiamos nombre variable b -> num2
		int num2;
		int num3;

		// separamos inicializacion
		num1 = 7;
		num2 = 16;
		// cambiamos las declaraciones de los String
		// subimos declaracion
		num3 = 25;
		if (num1 > num2 || num3 % 5 != 0 && (num3 * 3 - 1) > num2 / num3) {
			System.out.println("Se cumple la condición");
		}

		num3 = num1 + num2 * num3 + num2 / num1;

	}

	private static void rellenar() {
		// metodo comentado porque es codigo muerto

//		// separamos las declaraciones
//		String cadena1;
//		String cadena2;
//		// cambiar nombre del objeto scanner
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println(CAD);
//		System.out.println("Introduce tu dni");
//		cadena1 = scan.nextLine();
//		System.out.println("Introduce tu nombre");
//		cadena2 = scan.nextLine();
//
//		scan.close();

	}

	// cambiamos nombre de paramtero
	// cambiar la variable del for
	// cambiar el numero 7 por length
	static void recorrerDias(String[] dias) {
		for (int i = 0; i < dias.length; i++) {
			System.out.println("El dia de la semana en el que te encuentras [" + (i + 1) + "-7] es el dia: " + dias[i]);
		}
	}

}