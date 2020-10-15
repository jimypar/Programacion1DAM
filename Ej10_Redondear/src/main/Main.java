package main;

/*
 *  REDONDEAR UN NUMERO
 *  EJEMPLO:
 *    float nota=4.5;
 *    int notaFinalSinDecimales;
 *  
 */
public class Main {

	public static void main(String[] args) {
		float nota=(float)4.5;
		int notaFinalSinDecimales;
		System.out.println("*** TRUNCAR EL VALOR ***");
		notaFinalSinDecimales=(int)nota;
		System.out.println("Nota con decimales = "+ nota);
		System.out.println("Nota sin decimales = "+ notaFinalSinDecimales);
		
		System.out.println("*** REDONDEAR EL VALOR ***");
		notaFinalSinDecimales=Math.round(nota);
		System.out.println("Nota con decimales = "+ nota);
		System.out.println("Nota sin decimales = "+ notaFinalSinDecimales);
	}

}
