package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		
		float mediaGrupo = 0;

		System.out.print("Cuantos grupos hay este a�o?:");
		int Ngrupos = scan.nextInt();

		for (int i = 1; i <= Ngrupos; i++) {

			float mediaAlumno = 0;
			
			System.out.println("Grupo " + i);
			System.out.println("--------");

			System.out.print("Cuantos alumnos hay en el grupo " + i + " :");
			int alumno = scan.nextInt();

			for (int a = 1; a <= alumno; a++) {

				float mediaMaterias = 0;
				float nota1, nota2, nota3;
				float media;
				System.out.println();
				System.out.println("----------" + a + "� Alumno-----------");
				System.out.println();
				System.out.print("Introduce el numero de materias:");
				int Nmaterias = scan.nextInt();

				for (int m = 1; m <= Nmaterias; m++) {

					System.out.println();
					System.out.println(m + "� Materia");
					System.out.println("-------------");
					System.out.print("1� Nota: ");
					nota1 = scan.nextInt();
					System.out.print("2� Nota: ");
					nota2 = scan.nextInt();
					System.out.print("3� Nota: ");
					nota3 = scan.nextInt();

					media = (nota1 + nota2 + nota3) / 3;
					mediaMaterias = (mediaMaterias + media) / m;
					System.out.println("media = " + media);

				}

				System.out.println("Media materias: " + mediaMaterias);
				mediaAlumno = (mediaAlumno + mediaMaterias) / a;

			}

			mediaGrupo = (mediaGrupo + mediaAlumno) / i;

		}

		System.out.println("MEDIA DE GRUPOS = " + mediaGrupo);
		System.exit(0);
		scan.close();
	}

}
