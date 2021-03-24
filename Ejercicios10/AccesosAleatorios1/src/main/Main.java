package main;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			// ABRIR ARCHIVO
			RandomAccessFile f;

			f = new RandomAccessFile("datos", "rw");

			// LEER
			Scanner scan = new Scanner(System.in);
			for (int i = 0; i < args.length; i++) {
				System.out.print("Codigo:");
				int codigo = scan.nextInt();
				System.out.print("Nota:");
				byte nota = scan.nextByte();
				f.writeInt(codigo);
				f.writeByte(nota);
			}
			System.out.println("***CONTENIDO DEL ARCHIVO***");
			f.seek(0);
			boolean fin = false;
			do {
				try {
					int codigo = f.readInt();
					byte nota = f.readByte();
					System.out.println("Codigo = " + codigo);
					System.out.println("Nota = " + nota);
				} catch (EOFException e) {
					fin = true;
				}
			} while (!fin);
			f.close();
			scan.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
