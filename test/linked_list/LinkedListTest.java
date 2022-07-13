package linked_list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LinkedListTest {
    private LinkedList<String> linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedList<>();
    }

    @Test
    public void linkedListCanBeCreatedTest() {
        assertNotNull(linkedList);
    }

    @Test
    public void initialListIsEmptyTest() {
        assertEquals(0, linkedList.size());
    }

    @Test
    public void linkedListIsEmptyTest() {
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void sizeIsOneAfterAddingTest() {
        linkedList.add("Fish");
        assertEquals(1, linkedList.size());
    }
    @Test
    public void canGetElementFromLinkedListTest(){
        linkedList.add("Fish");
        assertEquals("Fish",linkedList.get(0));
    }
    @Test
    public void canRemoveElementFromList(){

    }
}
