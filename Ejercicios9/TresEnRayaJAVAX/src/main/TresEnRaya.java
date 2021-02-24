package main;

import javax.swing.*;

public class TresEnRaya {
    public static int count = 0;
    public static String[][] board = new String[3][3];
    public boolean continuar = true;

    public void boton(JButton button) {
        if(continuar) {
            if(button.getText().equals("")) {
                count++;
                if(count % 2 == 1) {
                    button.setText("X");
                }
                if(count % 2 == 0) {
                    button.setText("O");
                }
            }
        }

    }

    public void juego(JButton button) {
        if(continuar) {

            //"X" or "O"?
            String string = button.getText();

            //Gives coordinates of the button
            int x = Character.getNumericValue(button.getName().charAt(0));
            int y = Character.getNumericValue(button.getName().charAt(1));
            board[x][y] = string;

            if(board[0][0] != null && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
                JOptionPane.showMessageDialog(null,"Ha ganado "+string);
                continuar = false;
            }

            else if(board[0][2] != null && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
                JOptionPane.showMessageDialog(null,"Ha ganado "+string);
                continuar = false;
            }
            else if(count == 9) {
                JOptionPane.showMessageDialog(null, "EMPATE.");
                continuar = false;
            }
            else {
                for (int i = 0; i < 3; i++) {
                    if (board[i][0] != null && board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2])) {
                        JOptionPane.showMessageDialog(null, "Ha ganado "+string);
                        continuar = false;
                        break;
                    }
                    if (board[0][i] != null && board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i])) {
                        JOptionPane.showMessageDialog(null, "Ha ganado "+string);
                        continuar = false;
                        break;
                    }
                }
            }
        }
    }
}