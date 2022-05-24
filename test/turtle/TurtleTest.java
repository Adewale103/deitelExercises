package turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static turtle.Direction.*;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    private Turtle turtle;
    @BeforeEach
    public void setUp(){
        turtle = new Turtle();
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
        turtle.move(3);
        assertEquals(new Position(0,2),turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveDownwardTowardsSouthTest(){
        turtle.move(3);
        assertEquals(new Position(0,2),turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3);
        assertEquals(new Position(2,2),turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveBackwardTowardsWestTest(){
        turtle.move(3);
        assertEquals(new Position(0,2),turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3);
        assertEquals(new Position(2,2),turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3);
        assertEquals(new Position(2,0),turtle.getCurrentPosition());
    }


    @Test
    public void turtleCanMoveUpwardTowardsNorthTest(){
        turtle.move(3);
        assertEquals(new Position(0,2),turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3);
        assertEquals(new Position(2,2),turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3);
        assertEquals(new Position(2,0),turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3);
        assertEquals(new Position(0,0),turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanWriteWhileMovingTowardsEastTest(){
        turtle.penDown();
        turtle.move(3);
        assertEquals(1,turtle.getSketchPad(0,0));
        assertEquals(1,turtle.getSketchPad(0,1));
        assertEquals(1,turtle.getSketchPad(0,2));

    }


}
