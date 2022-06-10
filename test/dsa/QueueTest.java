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
        queue.enqueue("Rice");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void pushX_popX_elementShouldBeXTest() {
        queue.enqueue("Beans");
        assertEquals("Beans" , queue.dequeue());

    }

    @Test
    public void pushXandY_popXTest() {
        queue.enqueue("Beans");
        queue.enqueue("Yam");
        assertEquals("Beans" , queue.dequeue());

    }

    @Test
    public void pushXandY_popXandY_elementIsXThenYTest() {
        queue.enqueue("Beans");
        queue.enqueue("Yam");
        assertEquals("Beans" , queue.dequeue());
        assertEquals("Yam" , queue.dequeue());
    }

    @Test
    public void pushXandY_peekY_elementReturnYTest() {
        queue.enqueue("Beans");
        queue.enqueue("Yam");
        assertEquals("Yam" , queue.peek());
    }

    @Test
    public void testThatElementsPushedCanNotBeBeyondArrayLength() {
        queue.enqueue("Beans");
        queue.enqueue("Yam");
        queue.enqueue("milk");
        queue.enqueue("eggs");
        queue.enqueue("jug");
        queue.enqueue("plates");
        queue.enqueue("car");
        queue.enqueue("ink");
        queue.enqueue("board");
        queue.enqueue("learn");
        assertEquals("Beans" , queue.peek());
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> queue.enqueue("plkhjg"));
    }

    @Test
    public void testThatElementsCanShiftIfArrayIsFullAndNullElementsExist(){
        queue.enqueue("Beans");
        queue.enqueue("Yam");
        queue.enqueue("milk");
        queue.enqueue("eggs");
        queue.enqueue("jug");
        queue.enqueue("plates");
        queue.enqueue("car");
        queue.enqueue("ink");
        assertEquals("Beans" , queue.peek());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        assertEquals("eggs" , queue.peek());
        queue.enqueue("biro");
        queue.enqueue("pencil");
        queue.enqueue("eraser");
        queue.display();
        queue.enqueue("crayon");
        queue.enqueue("love");
        assertEquals("eggs" , queue.peek());
        queue.display();

    }
}
