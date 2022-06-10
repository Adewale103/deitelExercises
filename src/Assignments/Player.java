package Assignments;

public class Player {
    private int id;
    private State tag;

    public Player(int id, State tag) {
        this.id = id;
        this.tag = tag;
    }
    public void makeMove(int row, int column, State[][] board){
        board[row][column] = getTag();
    }

    public State getTag() {
        return tag;
    }

    public int getId() {
        return id;
    }
}
