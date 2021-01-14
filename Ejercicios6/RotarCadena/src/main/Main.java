package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Numero: ");
            numeros[i] = scan.nextInt();
        }

        String n1 = numeros[0] + "";
        String n2 = numeros[1] + "";
        String n3 = numeros[2] + "";

        long[] posibilidad = new long[6];

        posibilidad[0] = Long.parseLong(n1 + n2 + n3);
        posibilidad[1] = Long.parseLong(n1 + n3 + n2);
        posibilidad[2] = Long.parseLong(n2 + n3 + n1);
        posibilidad[3] = Long.parseLong(n2 + n1 + n3);
        posibilidad[4] = Long.parseLong(n3 + n2 + n1);
        posibilidad[5] = Long.parseLong(n3 + n1 + n2);

        Arrays.sort(posibilidad);

        System.out.println("Orden: " + posibilidad[5]);

    }

}
