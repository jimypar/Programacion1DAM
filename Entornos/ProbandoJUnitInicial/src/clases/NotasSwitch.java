package clases;

import java.util.Scanner;

public class NotasSwitch {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		NotasSwitch miNota = new NotasSwitch();
		System.out.println("Introduce una nota entre 0 y 10");
		int numero = input.nextInt();
		miNota.notas(numero);
		input.close();
	}

	public String notas(int numero) {
		String miNota="";
		switch(numero) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			miNota="insuficiente";
			break;
		case 5:
			miNota="suficiente";
			break;
		case 6:
			miNota="bien";
			break;
		case 7:
		case 8:
			miNota="notable";
			break;
		case 9:
		case 10:
			miNota="sobresaliente";
			break;
		default:
			System.out.println("La opcion introducida no es valida");
		}
		return miNota;
	}
}
