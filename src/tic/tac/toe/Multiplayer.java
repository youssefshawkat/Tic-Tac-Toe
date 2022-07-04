package tic.tac.toe;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
public class Multiplayer {
    static private JButton b1=new JButton(" ");
    static private JButton b2=new JButton(" ");
    static private JButton b3=new JButton(" ");
    static private JButton b4=new JButton(" ");
    static private JButton b5=new JButton(" ");
    static private  JButton b6=new JButton(" ");
    static private JButton b7=new JButton(" ");
    static private JButton b8=new JButton(" ");
    static private JButton b9=new JButton(" ");
    static private Icon o = new ImageIcon("o.png");
    static private Icon x = new ImageIcon("x.png");
    static private Icon cIcon;
    static public ArrayList<JButton> Buttons = new ArrayList<>();
    static public boolean Player1 = true;
    static public boolean Player2 = false;
    static public int[] Moves = {0,1,2,3,4,5,6,7,8};
    static private int drawCounter = 0;
    Clicklistener click = new Clicklistener();


    JFrame f;
    Multiplayer(){

        b1.addActionListener(click);
        b2.addActionListener(click);
        b3.addActionListener(click);
        b4.addActionListener(click);
        b5.addActionListener(click);
        b6.addActionListener(click);
        b7.addActionListener(click);
        b8.addActionListener(click);
        b9.addActionListener(click);

        f=new JFrame();

        f.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // adding buttons to the frame
        f.add(b1); f.add(b2); f.add(b3);
        f.add(b4); f.add(b5); f.add(b6);
        f.add(b7); f.add(b8); f.add(b9);

        // setting grid layout of 3 rows and 3 columns




        f.setLayout(new GridLayout(3,3));
        f.setSize(600,600);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public static void Clear(){
        Game.Player1 = true;
        cIcon = x;
        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
        Moves = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};;
        drawCounter = 0;



    }






    private class Clicklistener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {

            drawCounter++;

            if(Player1){

                cIcon = x;

            }else{
                cIcon = o;

            }

            if (e.getSource() == b1 && b1.getIcon() == null)
            {

                b1.setIcon(cIcon);
                if(Player1){
                    f.setTitle("Player O Turn");
                    Moves[0] = 10;
                    Player1 = false;
                    Player2 = true;
                }else{
                    f.setTitle("Player X Turn");
                    Moves[0] = 11;
                    Player1 = true;
                    Player2 = false;

                }

            }


            if (e.getSource() == b2 && b2.getIcon() == null)
            {

                b2.setIcon(cIcon);
                if(Player1){
                    f.setTitle("Player O Turn");
                    Moves[1] = 10;
                    Player1 = false;
                    Player2 = true;
                }else{
                    f.setTitle("Player X Turn");
                    Moves[1] = 11;
                    Player1 = true;
                    Player2 = false;

                }

            }



            if (e.getSource() == b3   && b3.getIcon() == null) {
                b3.setIcon(cIcon);
                if(Player1){
                    f.setTitle("Player O Turn");
                    Moves[2] = 10;
                    Player1 = false;
                    Player2 = true;
                }else{
                    f.setTitle("Player X Turn");
                    Moves[2] = 11;
                    Player1 = true;
                    Player2 = false;

                }
            }
            if (e.getSource() == b4  && b4.getIcon() == null) {
                b4.setIcon(cIcon);
                if(Player1){
                    f.setTitle("Player O Turn");
                    Moves[3] = 10;
                    Player1 = false;
                    Player2 = true;
                }else{
                    f.setTitle("Player X Turn");
                    Moves[3] = 11;
                    Player1 = true;
                    Player2 = false;

                }

            }

            if (e.getSource() == b5   && b5.getIcon() == null) {
                b5.setIcon(cIcon);
                if(Player1){
                    f.setTitle("Player O Turn");
                    Moves[4] = 10;
                    Player1 = false;
                    Player2 = true;
                }else{
                    f.setTitle("Player X Turn");
                    Moves[4] = 11;
                    Player1 = true;
                    Player2 = false;

                }
            }
            if (e.getSource() == b6   && b6.getIcon() == null) {
                b6.setIcon(cIcon);
                if(Player1){
                    f.setTitle("Player O Turn");
                    Moves[5] = 10;
                    Player1 = false;
                    Player2 = true;
                }else{
                    f.setTitle("Player X Turn");
                    Moves[5] = 11;
                    Player1 = true;
                    Player2 = false;

                }

            }
            if (e.getSource() == b7   && b7.getIcon() == null) {
                b7.setIcon(cIcon);
                if(Player1){
                    f.setTitle("Player O Turn");
                    Moves[6] = 10;
                    Player1 = false;
                    Player2 = true;
                }else{
                    f.setTitle("Player X Turn");
                    Moves[6] = 11;
                    Player1 = true;
                    Player2 = false;

                }

            }
            if (e.getSource() == b8   && b8.getIcon() == null) {
                b8.setIcon(cIcon);
                if(Player1){
                    f.setTitle("Player O Turn");
                    Moves[7] = 10;
                    Player1 = false;
                    Player2 = true;
                }else{
                    f.setTitle("Player X Turn");
                    Moves[7] = 11;
                    Player1 = true;
                    Player2 = false;

                }

            }
            if (e.getSource() == b9  && b9.getIcon() == null) {
                b9.setIcon(cIcon);
                if(Player1){
                    f.setTitle("Player O Turn");
                    Moves[8] = 10;
                    Player1 = false;
                    Player2 = true;
                }else{
                    f.setTitle("Player X Turn");
                    Moves[8] = 11;
                    Player1 = true;
                    Player2 = false;

                }
            }
            if(Game.Winner(Moves,10)){
                JOptionPane.showMessageDialog(null, "Player X Has Won!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                Clear();
            }else if(Game.Winner(Moves,11)){
                JOptionPane.showMessageDialog(null, "Player O Has Won!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                Clear();
            }else if(drawCounter >= 9){
                JOptionPane.showMessageDialog(null, "DRAW","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                Clear();
            }



        }
    }
}    