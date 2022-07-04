package tic.tac.toe;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightIJTheme;

import javax.swing.*;

public class  Game {


    static public boolean Player1 = true;
    static public boolean Player2 = false;

    static boolean Winner(int[] board,int player){

        return (board[0] == player && board[1] == player && board[2] == player) ||
                (board[3] == player && board[4] == player && board[5] == player) ||
                (board[6] == player && board[7] == player && board[8] == player) ||
                (board[0] == player && board[3] == player && board[6] == player) ||
                (board[1] == player && board[4] == player && board[7] == player) ||
                (board[2] == player && board[5] == player && board[8] == player) ||
                (board[0] == player && board[4] == player && board[8] == player) ||
                (board[2] == player && board[4] == player && board[6] == player);



}

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        javax.swing.UIManager.setLookAndFeel(new FlatAtomOneLightIJTheme());
        String[] options = {"MultiPlayer", "SinglePlayer"};
        int mode = JOptionPane.showOptionDialog(null, "Please Select Your Favorite Mode:",
                "Mode",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,-1);
        if(mode == -1){

            System.exit(0);
        }

        if(mode == 0){

            new Multiplayer();


        } else {

            new SinglePlayer();

        }





    }




}
