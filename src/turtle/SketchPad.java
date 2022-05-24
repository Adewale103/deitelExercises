package turtle;

public class SketchPad {
    private int[][] sketchBoard = new int[20][20];
    private int row;
    private int column;

    public SketchPad(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void fillSketchPad(int row, int column){
        sketchBoard[row][column] = 1;
    }

    public int getSketchPad(int row, int column){
        return sketchBoard[row][column];
    }
}
