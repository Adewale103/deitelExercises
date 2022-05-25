package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queue queue;

    @BeforeEach
    public void setUp() {
        queue = new Queue();
    }

    @Test
    public void queueExistTest() {
        assertNotNull(queue);
    }

    @Test
    public void emptyQueueTest() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void pushOneElementQueueIsNotEmptyTest() {
        queue.push("Rice");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void pushX_popX_elementShouldBeXTest() {
        queue.push("Beans");
        assertEquals("Beans" , queue.pop());

    }

    @Test
    public void pushXandY_popXTest() {
        queue.push("Beans");
        queue.push("Yam");
        assertEquals("Beans" , queue.pop());

    }

    @Test
    public void pushXandY_popXandY_elementIsXThenYTest() {
        queue.push("Beans");
        queue.push("Yam");
        assertEquals("Beans" , queue.pop());
        assertEquals("Yam" , queue.pop());
    }

    @Test
    public void pushXandY_peekY_elementReturnYTest() {
        queue.push("Beans");
        queue.push("Yam");
        assertEquals("Yam" , queue.peek());
    }

    @Test
    public void testThatElementsPushedCanNotBeBeyondArrayLength() {
        queue.push("Beans");
        queue.push("Yam");
        queue.push("milk");
        queue.push("eggs");
        queue.push("jug");
        queue.push("plates");
        queue.push("car");
        queue.push("ink");
        queue.push("board");
        queue.push("learn");
        assertEquals("learn" , queue.peek());
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> queue.push("plkhjg"));
    }
}
