package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Texto:");
        String text = scan.nextLine();

        for (int i = 0; i < text.length() - 1; i++) {

            boolean b1 = false, b2 = false;

            if (text.charAt(i) == '!' || text.charAt(i) == '?') {

                int cont = i + 1;

                while (cont < text.length() - 1 && (text.charAt(cont) == '!' || text.charAt(cont) == '?')) {

                    if (text.charAt(cont + 1) == '!') {
                        b1 = true;
                    }
                    if (text.charAt(cont + 1) == '?') {
                        b2 = true;
                    }
                    cont++;

                }
                i = cont - 1;
            }

            if (b1 && !b2) {

                System.out.print("!");

            }

            if (b2 && !b1) {

                System.out.print("?");

            }

            if (b1 && b2) {

                System.out.print("?");

            }
            
            if (!b1 && !b2){
                
                System.out.print(text.charAt(i));
                        
            }

        }

    }

}
