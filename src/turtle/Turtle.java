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

    public void move(int sides, SketchPad sketchPad) {
        if(isDown()){
        if(currentDirection.equals(EAST)){writeOnColumnBy(sides, sketchPad);}
        if(currentDirection.equals(SOUTH)){writeOnRowBy(sides, sketchPad);}
        if(currentDirection.equals(WEST)){backWriteOnColumnBy(sides, sketchPad);}
        if(currentDirection.equals(NORTH)){backWriteOnRowBy(sides,sketchPad);}
        }

        if(currentDirection.equals(EAST)){increaseColumnBy(sides);}
        if(currentDirection.equals(SOUTH)){increaseRowBy(sides);}
        if(currentDirection.equals(WEST)){decreaseColumnBy(sides);}
        if(currentDirection.equals(NORTH)){decreaseRowBy(sides);}
        }

    private void backWriteOnRowBy(int steps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        steps = steps - row;
        for (int i = steps-1; i <= row; i++) {
            floor[i][column] = 1;
        }
    }

    private void backWriteOnColumnBy(int steps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        steps = steps - column;
        for (int i = steps-1; i <= column; i++) {
            floor[row][i] = 1;
        }
    }

    private void writeOnRowBy(int steps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        steps = steps + row;
        for (int i = row; i < steps; i++) {
            floor[i][column] = 1;
        }
    }
    private void writeOnColumnBy(int steps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        steps = steps + column;
        for (int i = column; i < steps; i++) {
            floor[row][i] = 1;
        }

    }

    private void decreaseRowBy(int sides) {
        currentPosition.setRow(currentPosition.getRow() - (sides-1));
    }

    private void decreaseColumnBy(int steps) {
        currentPosition.setColumn(currentPosition.getColumn() - (steps-1));
    }

    private void increaseRowBy(int steps) {
        currentPosition.setRow(currentPosition.getRow() + (steps-1));
    }

    private void increaseColumnBy(int steps) {
        currentPosition.setColumn(currentPosition.getColumn() + (steps-1));
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

}
