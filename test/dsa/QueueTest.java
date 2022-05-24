package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queue queue;
    @BeforeEach
    public void setUp(){
        queue = new Queue();
    }
    @Test
    public void queueExistTest(){
        assertNotNull(queue);
    }
    @Test
    public void emptyQueueTest(){
        assertTrue(queue.isEmpty());
    }
    @Test
    public void pushOneElementQueueIsNotEmptyTest(){
        queue.push(3);
        assertFalse(queue.isEmpty());
    }
    @Test
    public void pushX_popXTest(){
        queue.push(3);
        queue.push(5);
        assertEquals(3,queue.pop());

    }
}
