package ListUsingInterfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListTest {
    @Test
    public void addTest(){
        List list = new ArrayList();
        list.add("Boxer for boyfriend");
        assertEquals(1,list.size());
    }

    @Test
    public void addAndGetTest(){
        List list = new ArrayList();
        list.add("Boxer for boyfriend");
        assertEquals("Boxer for boyfriend",list.get(0));
    }

    @Test
    public void removeTest(){
        List list = new ArrayList();
        list.add("Boxer for boyfriend");
        list.remove(0);
        assertEquals(0,list.size());
    }
}
