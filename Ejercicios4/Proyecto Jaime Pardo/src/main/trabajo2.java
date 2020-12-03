package main;

import java.util.Scanner;

public class trabajo2 {

	public static void Trabajo2(Scanner scan) {

		float mediaGrupo = 0;

		System.out.print("Cuantos grupos hay este año?:");
		int Ngrupos = scan.nextInt();
		while (Ngrupos <= 0) {
			System.out.println("Dato incorrecto");
			System.out.println();
			System.out.print("Cuantos grupos hay este año?:");
			Ngrupos = scan.nextInt();

		}

		for (int i = 1; i <= Ngrupos; i++) {

			float mediaAlumno = 0;

			System.out.println("Grupo " + i);
			System.out.println("--------");

			System.out.print("Cuantos alumnos hay en el grupo " + i + " :");
			int alumno = scan.nextInt();
			while (alumno <= 0) {
				System.out.println("Dato incorrecto");
				System.out.println();
				System.out.print("Cuantos alumnos hay en el grupo " + i + " :");
				alumno = scan.nextInt();
			}

			for (int a = 1; a <= alumno; a++) {

				float mediaMaterias = 0;
				float nota1, nota2, nota3;

				System.out.println();
				System.out.println("----------" + a + "º Alumno-----------");
				System.out.println();
				System.out.print("Introduce el numero de materias:");
				int Nmaterias = scan.nextInt();
				while (Nmaterias <= 0) {
					System.out.println("Dato incorrecto");
					System.out.println();
					System.out.print("Introduce el numero de materias:");
					Nmaterias = scan.nextInt();
				}

				for (int m = 1; m <= Nmaterias; m++) {

					float media;
					System.out.println();
					System.out.println(m + "ª Materia");
					System.out.println("-------------");
					System.out.print("1ª Nota: ");
					nota1 = scan.nextInt();
					while (nota1 < 0 || nota1 > 10) {
						System.out.println("Nota incorrecta");
						System.out.println();
						System.out.print("1ª Nota: ");
						nota1 = scan.nextInt();
					}
					System.out.print("2ª Nota: ");
					nota2 = scan.nextInt();
					while (nota2 < 0 || nota2 > 10) {
						System.out.println("Nota incorrecta");
						System.out.println();
						System.out.print("2ª Nota: ");
						nota2 = scan.nextInt();
					}
					System.out.print("3ª Nota: ");
					nota3 = scan.nextInt();
					while (nota3 < 0 || nota3 > 10) {
						System.out.println("Nota incorrecta");
						System.out.println();
						System.out.print("3ª Nota: ");
						nota3 = scan.nextInt();
					}

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

	}

}
