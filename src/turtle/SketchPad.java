package turtle;

public class SketchPad {
    private int[][] floor;

    public SketchPad(int row, int column) {
       floor = new int[row][column];
    }
    @Override
    public String toString(){
        StringBuilder toBeReturned = new StringBuilder();
        for (var row : floor) {
            for (var column : row) {
                if (column == 0) toBeReturned.append("  ");
                if (column == 1) toBeReturned.append("* ");
            }
            toBeReturned.append("\n");
        }
        return toBeReturned.toString();
    }

    public int[][] getFloor() {
        return floor;
    }
}
