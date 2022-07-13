package turtle;

import static turtle.Direction.*;

public class Turtle {
    Pen pen = new Pen();
    Position currentPosition = new Position(0,0);
    private Direction currentDirection = EAST;


    public boolean isDown() {
        return pen.isDown();
    }

    public void penDown(){
        pen.penDown();
    }

    public void penUp(){
        pen.penUp();
    }

    public Direction getDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if(currentDirection.equals(WEST)){turn(NORTH);}
        else if(currentDirection.equals(SOUTH)){turn(WEST);}
        else if(currentDirection.equals(EAST)){turn(SOUTH);}
        else if(currentDirection.equals(NORTH)){turn(EAST);}

    }
    public void turn(Direction direction){
        currentDirection = direction;
    }

    public void turnLeft() {
        if(currentDirection.equals(EAST)){turn(NORTH);}
        else if(currentDirection.equals(SOUTH)){turn(EAST);}
        else if(currentDirection.equals(WEST)){turn(SOUTH);}
        else if(currentDirection.equals(NORTH)){turn(WEST);}
    }

    public void move(int steps, SketchPad sketchPad) {
        if(isDown()){
        if(currentDirection.equals(EAST)){writeOnColumnBy(steps, sketchPad);}
        if(currentDirection.equals(SOUTH)){writeOnRowBy(steps, sketchPad);}
        if(currentDirection.equals(WEST)){backWriteOnColumnBy(steps, sketchPad);}
        if(currentDirection.equals(NORTH)){backWriteOnRowBy(steps,sketchPad);}
        }

        if(currentDirection.equals(EAST)){increaseColumnBy(steps, sketchPad);}
        if(currentDirection.equals(SOUTH)){increaseRowBy(steps, sketchPad);}
        if(currentDirection.equals(WEST)){decreaseColumnBy(steps);}
        if(currentDirection.equals(NORTH)){decreaseRowBy(steps);}
        }

    private void backWriteOnRowBy(int steps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        steps = steps - row;
        if(steps < 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
        for (int i = steps-1; i <= row; i++) {
            floor[i][column] = 1;}
        }
    }

    private void backWriteOnColumnBy(int steps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        steps = steps - column;
        if(steps < 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
        for (int i = steps-1; i <= column; i++) {
            floor[row][i] = 1;}
        }
    }

    private void writeOnRowBy(int steps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        steps = steps + row;
        if(steps > sketchPad.getRowSize()){
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
        for (int i = row; i < steps; i++) {
            floor[i][column] = 1;}
        }
    }
    private void writeOnColumnBy(int steps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        steps = steps + column;
        if(steps > sketchPad.getColumnSize()){
            throw new ArrayIndexOutOfBoundsException();
        }
        else
        {for (int i = column; i < steps; i++) {
            floor[row][i] = 1;}
        }

    }

    private void decreaseRowBy(int steps) {
        int row = currentPosition.getRow() - (steps-1);
        if(row < 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
        currentPosition.setRow(row);}
    }

    private void decreaseColumnBy(int steps) {
        int column = currentPosition.getColumn() - (steps-1);
        if(column < 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
        currentPosition.setColumn(column);}
    }

    private void increaseRowBy(int steps, SketchPad sketchPad) {
        int row = currentPosition.getRow() + (steps-1);
        if(row +1 > sketchPad.getRowSize()){
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
        currentPosition.setRow(row);}
    }

    private void increaseColumnBy(int steps, SketchPad sketchPad) {
        int column = currentPosition.getColumn() + (steps-1);
        if(column + 1 > sketchPad.getColumnSize()){
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
        currentPosition.setColumn(column);}
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }
    public void displaySketchPad(SketchPad sketchPad){
        System.out.println(sketchPad.toString());;
    }

}
