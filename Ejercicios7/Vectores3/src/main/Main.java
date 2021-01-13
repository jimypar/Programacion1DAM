package main;

import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Cuanto numeros deseas introducir:");
		int nums;
		nums = scan.nextInt();

		int[] lista = RellenarArray(nums);

		VisualizarArray(nums, lista);
		VisualizarRepeat(nums, lista);
		scan.close();
	}

	private static int[] RellenarArray(int nums) {

		int[] lista = new int[nums];

		for (int i = 0; i < nums; i++) {

			System.out.print("Introduce un numero:");
			lista[i] = scan.nextInt();

		}

		return lista;

	}

	private static void VisualizarArray(int nums, int[] lista) {

		System.out.print("Lista= ");

		for (int a = 0; a < nums; a++) {
			System.out.print(lista[a] + " ");
		}

		System.out.println();

	}

	private static void VisualizarRepeat(int nums, int[] lista) {

		System.out.print("Repetidos= ");
		
		int[] Repetidos = new int[nums];


		for (int x = 0; x < (lista.length+1); x++) {

			for (int y = 1; y < (lista.length+1); y++) {

				if (lista[x] == lista[y]) {
					
					System.out.print(lista[x]);

				}

			}

		}

	}

}
