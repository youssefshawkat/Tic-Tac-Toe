package tic.tac.toe;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
public class SinglePlayer {
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
    static public int[] Moves = {0,1,2,3,4,5,6,7,8};
    static private int drawCounter = 0;
    Clicklistener click = new Clicklistener();


    static JFrame f;
    SinglePlayer(){
        Buttons.add(b1);
        Buttons.add(b2);
        Buttons.add(b3);
        Buttons.add(b4);
        Buttons.add(b5);
        Buttons.add(b6);
        Buttons.add(b7);
        Buttons.add(b8);
        Buttons.add(b9);

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

        f.add(b1); f.add(b2); f.add(b3);
        f.add(b4); f.add(b5); f.add(b6);
        f.add(b7); f.add(b8); f.add(b9);



        f.setTitle("Tic Tac Toe");

        f.setLayout(new GridLayout(3,3));
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
       
    }
    public static void Play(int Move) {

        drawCounter += 1;
        Game.Player1 = true;
        cIcon = o;
        Buttons.get(Move).setIcon(cIcon);
        Moves[Move] = 11;

        if (Game.Winner(Moves, 11)) {
            JOptionPane.showMessageDialog(null, "Player O Has Won!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            Clear();
        } else if (drawCounter >= 9) {
            JOptionPane.showMessageDialog(null, "DRAW", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            Clear();
        }
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



            cIcon =x;

            if (e.getSource() == b1 && b1.getIcon() == null)
            {
                drawCounter += 1;
                    b1.setIcon(cIcon);

                    Moves[0] = 10;
                    Game.Player1 = false;
                    Game.Player2 = true;
                if(Game.Winner(Moves,10)){
                    JOptionPane.showMessageDialog(null, "Player X Has Won!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                }else if(drawCounter >= 9){
                    JOptionPane.showMessageDialog(null, "DRAW","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                }else {
                    Play(AI.Minimax(Moves, 11).getIndex());
                }

            }


            if (e.getSource() == b2 && b2.getIcon() == null)
            {
                drawCounter += 1;
                    b2.setIcon(cIcon);
                    Moves[1] = 10;
                    Game.Player1 = false;
                    Game.Player2 = true;
                if(Game.Winner(Moves,10)){
                    JOptionPane.showMessageDialog(null, "Player X Has Won!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                }else if(drawCounter >= 9){
                    JOptionPane.showMessageDialog(null, "DRAW","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                }else {
                    Play(AI.Minimax(Moves, 11).getIndex());
                }
            }



            if (e.getSource() == b3   && b3.getIcon() == null) {
                drawCounter += 1;
                    b3.setIcon(cIcon);
                    Moves[2] = 10;
                    Game.Player1 = false;
                    Game.Player2 = true;
                if(Game.Winner(Moves,10)){
                    JOptionPane.showMessageDialog(null, "Player X Has Won!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                }else if(drawCounter >= 9){
                    JOptionPane.showMessageDialog(null, "DRAW","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                }else {
                    Play(AI.Minimax(Moves, 11).getIndex());
                }
            }
            if (e.getSource() == b4  && b4.getIcon() == null) {
                drawCounter += 1;
                    b4.setIcon(cIcon);
                    Moves[3] = 10;
                    Game.Player1 = false;
                    Game.Player2 = true;
                if(Game.Winner(Moves,10)){
                    JOptionPane.showMessageDialog(null, "Player X Has Won!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                }else if(drawCounter >= 9){
                    JOptionPane.showMessageDialog(null, "DRAW","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                }else{
                    Play(AI.Minimax(Moves,11).getIndex());}

            }

            if (e.getSource() == b5   && b5.getIcon() == null) {
                drawCounter += 1;
                    b5.setIcon(cIcon);
                    Moves[4] = 10;
                    Game.Player1 = false;
                    Game.Player2 = true;
                if(Game.Winner(Moves,10)){
                    JOptionPane.showMessageDialog(null, "Player X Has Won!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                }else if(drawCounter >= 9){
                    JOptionPane.showMessageDialog(null, "DRAW","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                }else {
                    Play(AI.Minimax(Moves, 11).getIndex());
                }
            }
            if (e.getSource() == b6   && b6.getIcon() == null) {
                drawCounter += 1;
                    b6.setIcon(cIcon);
                    Moves[5] = 10;
                    Game.Player1 = false;
                    Game.Player2 = true;
                if(Game.Winner(Moves,10)){
                    JOptionPane.showMessageDialog(null, "Player X Has Won!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                }else if(drawCounter >= 9){
                    JOptionPane.showMessageDialog(null, "DRAW","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                }else {
                    Play(AI.Minimax(Moves, 11).getIndex());
                }

            }
            if (e.getSource() == b7   && b7.getIcon() == null) {
                drawCounter += 1;
                    b7.setIcon(cIcon);
                    Moves[6] = 10;
                    Game.Player1 = false;
                    Game.Player2 = true;
                if(Game.Winner(Moves,10)){
                    JOptionPane.showMessageDialog(null, "Player X Has Won!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                }else if(drawCounter >= 9){
                    JOptionPane.showMessageDialog(null, "DRAW","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                }else {
                    Play(AI.Minimax(Moves, 11).getIndex());
                }
            }
            if (e.getSource() == b8   && b8.getIcon() == null) {
                drawCounter += 1;
                    b8.setIcon(cIcon);
                    Moves[7] = 10;
                    Game.Player1 = false;
                    Game.Player2 = true;
                if(Game.Winner(Moves,10)){
                    JOptionPane.showMessageDialog(null, "Player X Has Won!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                }else if(drawCounter >= 9){
                    JOptionPane.showMessageDialog(null, "DRAW","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                }else {
                    Play(AI.Minimax(Moves, 11).getIndex());
                }

            }
            if (e.getSource() == b9  && b9.getIcon() == null) {
                drawCounter += 1;
                    b9.setIcon(cIcon);
                    Moves[8] = 10;
                    Game.Player1 = false;
                    Game.Player2 = true;
                if(Game.Winner(Moves,10)){
                    JOptionPane.showMessageDialog(null, "Player X Has Won!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                }else if(drawCounter >= 9){
                    JOptionPane.showMessageDialog(null, "DRAW","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                }else {
                    Play(AI.Minimax(Moves, 11).getIndex());
                }
            }












        }
    }
}    