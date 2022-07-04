package tic.tac.toe;

public class Move {
    private int Index;
    private int Score;

    public void setIndex(int index) {
        Index = index;
    }

    public void setScore(int score) {
        Score = score;
    }

    public int getScore() {
        return Score;
    }

    public int getIndex() {
        return Index;
    }
}
