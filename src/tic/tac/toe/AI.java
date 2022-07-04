package tic.tac.toe;

import java.util.ArrayList;
import java.util.Arrays;


public class AI
{
 



public static Move Minimax(int[] State,int Player){

    ArrayList<Integer> EmptyIndexes = new ArrayList<>();
    Move move = new Move();

    for(int i = 0; i < State.length ; i++){
        if(State[i] != 11 && State[i] !=10 ) {
            EmptyIndexes.add(State[i]);
        }
    }


    if(Game.Winner(State,10)){

        move.setScore(-10);
        return move;

    }else if(Game.Winner(State,11)){

        move.setScore(10);
        return move;

    }else if(EmptyIndexes.size()==0){

        move.setScore(0);
        return move;

    }


    ArrayList<Move> Moves = new ArrayList<>();

    for(int j = 0 ; j < EmptyIndexes.size();j++){

        move = new Move();

        move.setIndex(State[EmptyIndexes.get(j)]);
        State[EmptyIndexes.get(j)]=Player;

        if(Player == 11){

            int result =Minimax(State,10).getScore();
            move.setScore(result);

        }else{
             int result = Minimax(State,11).getScore();
            move.setScore(result);

        }

        State[EmptyIndexes.get(j)]= move.getIndex();
        Moves.add(move);

    }

    int BestMove = 0;
    if(Player == 11){
        int BestScore = -10000;
        for(int i = 0; i < Moves.size();i++){
            if(Moves.get(i).getScore() > BestScore){
                BestScore = Moves.get(i).getScore();
                BestMove = i;

            }
        }

    }else{

        int BestScore = 10000;
        for(int i = 0; i < Moves.size();i++) {

            if (Moves.get(i).getScore() < BestScore) {
                BestScore = Moves.get(i).getScore();
                BestMove = i;

            }
        }


    }

return Moves.get(BestMove);

}



}
