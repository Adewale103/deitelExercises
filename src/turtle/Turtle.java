package turtle;

import static turtle.Direction.*;

public class Turtle {
    Pen pen = new Pen();
    Position currentPosition = new Position(0,0);
    SketchPad sketchPad = new SketchPad(20,20);
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

    private void write(){

    }

    public void turnLeft() {
        if(currentDirection.equals(EAST)){turn(NORTH);}
        else if(currentDirection.equals(SOUTH)){turn(EAST);}
        else if(currentDirection.equals(WEST)){turn(SOUTH);}
        else if(currentDirection.equals(NORTH)){turn(WEST);}
    }

    public void move(int sides) {
        if(currentDirection.equals(EAST)){increaseColumnBy(sides);}
        if(currentDirection.equals(SOUTH)){increaseRowBy(sides);}
        if(currentDirection.equals(WEST)){decreaseColumnBy(sides);}
        if(currentDirection.equals(NORTH)){decreaseRowBy(sides);}
    }

    private void decreaseRowBy(int sides) {
        currentPosition.setRow(currentPosition.getRow() - (sides-1));
    }

    private void decreaseColumnBy(int sides) {
        currentPosition.setColumn(currentPosition.getColumn() - (sides-1));
    }

    private void increaseRowBy(int sides) {
        currentPosition.setRow(currentPosition.getRow() + (sides-1));
    }

    private void increaseColumnBy(int sides) {
        currentPosition.setColumn(currentPosition.getColumn() + (sides-1));
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public int getSketchPad(int row, int column) {
        return sketchPad.getSketchPad(row,column);
    }
}
