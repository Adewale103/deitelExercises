package turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static turtle.Direction.*;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    private Turtle turtle;
    private SketchPad sketchPad;
    @BeforeEach
    public void setUp(){
        turtle = new Turtle();
        sketchPad = new SketchPad(5,5);
    }
    @Test
    public void turtleExistTest(){
        assertNotNull(turtle);
    }

    @Test
    public void penIsUpByDefaultTest(){
        boolean isDown = turtle.isDown();
        assertFalse(isDown);
    }

    @Test
    public void penCanMoveDownTest(){
        turtle.penDown();
        assertTrue(turtle.isDown());
    }

    @Test
    public void penCanMoveUpTest(){
        turtle.penDown();
        turtle.penUp();
        assertFalse(turtle.isDown());
    }
    @Test
    public void turtleTurnEastByDefaultTest(){
        assertEquals(EAST, turtle.getDirection());
    }
    @Test
    public void turtleCanTurnRightFromEastToSouthTest(){
        turtle.turnRight();
        assertEquals(SOUTH,turtle.getDirection());
    }

    @Test
    public void turtleCanTurnRightFromSouthToWestTest(){
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(WEST,turtle.getDirection());
    }

    @Test
    public void turtleCanTurnRightFromWestToNorthTest(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(NORTH,turtle.getDirection());
    }

    @Test
    public void turtleCanTurnRightFromNorthToEastTest(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(EAST,turtle.getDirection());
    }
    @Test
    public void turtleCanTurnLeftFromEastToNorthTest(){
        turtle.turnLeft();
        assertEquals(NORTH,turtle.getDirection());
    }
    @Test
    public void turtleCanTurnLeftFromNorthToWestTest(){
        turtle.turnLeft();
        turtle.turnLeft();
        assertEquals(WEST,turtle.getDirection());
    }

    @Test
    public void turtleCanTurnLeftFromWestToSouthTest(){
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertEquals(SOUTH,turtle.getDirection());
    }

    @Test
    public void turtleCanTurnLeftFromSouthToEastTest(){
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertEquals(EAST,turtle.getDirection());
    }

    @Test
    public void turtleCanMoveForwardTowardsEastTest(){
        turtle.move(3,sketchPad);
        assertEquals(new Position(0,2),turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveDownwardTowardsSouthTest(){
        turtle.move(3,sketchPad);
        assertEquals(new Position(0,2),turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3,sketchPad);
        assertEquals(new Position(2,2),turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveBackwardTowardsWestTest(){
        turtle.move(3,sketchPad);
        assertEquals(new Position(0,2),turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3,sketchPad);
        assertEquals(new Position(2,2),turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3,sketchPad);
        assertEquals(new Position(2,0),turtle.getCurrentPosition());
    }


    @Test
    public void turtleCanMoveUpwardTowardsNorthTest(){
        turtle.move(3,sketchPad);
        assertEquals(new Position(0,2),turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3,sketchPad);
        assertEquals(new Position(2,2),turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3,sketchPad);
        assertEquals(new Position(2,0),turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3,sketchPad);
        assertEquals(new Position(0,0),turtle.getCurrentPosition());
    }

    @Test
    public void whenPenIsDown_TurtleWritesFacingEastTest(){
        turtle.penDown();
        turtle.move(5,sketchPad);
        String expected = """
                * * * * *\s
                         \s
                         \s
                         \s
                         \s
                          """;
        assertEquals(expected,sketchPad.toString());
        assertEquals(new Position(0,4), turtle.getCurrentPosition());


    }

    @Test
    public void whenPenIsDown_TurtleWritesFacingSouthTest(){
        turtle.penDown();
        turtle.move(5,sketchPad);
        turtle.turnRight();
        turtle.move(5,sketchPad);
        String expected = """
                * * * * *\s
                        *\s
                        *\s
                        *\s
                        *\s
                          """;
        assertEquals(expected,sketchPad.toString());
        assertEquals(new Position(4,4), turtle.getCurrentPosition());


    }

    @Test
    public void whenPenIsDown_TurtleWritesFacingWestTest(){
        turtle.penDown();
        turtle.move(5,sketchPad);
        turtle.turnRight();
        turtle.move(5,sketchPad);
        turtle.turnRight();
        turtle.move(5,sketchPad);
        String expected = """
                * * * * *\s
                        *\s
                        *\s
                        *\s
                * * * * *\s
                          """;
        assertEquals(expected,sketchPad.toString());
        assertEquals(new Position(4,0), turtle.getCurrentPosition());

    }

    @Test
    public void whenPenIsDown_TurtleWritesFacingNorthTest(){
        turtle.penDown();
        turtle.move(5,sketchPad);
        turtle.turnRight();
        turtle.move(5,sketchPad);
        turtle.turnRight();
        turtle.move(5,sketchPad);
        turtle.turnRight();
        turtle.move(5,sketchPad);
        String expected = """
                * * * * *\s
                *       *\s
                *       *\s
                *       *\s
                * * * * *\s
                          """;
        assertEquals(expected,sketchPad.toString());
        assertEquals(new Position(0,0), turtle.getCurrentPosition());

    }
    @Test
    public void turtleCanNotMoveBeyondTheSketchPadWallFacingEast(){
        turtle.move(5,sketchPad);
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> turtle.move(2,sketchPad));

    }



}
