package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class HashMapTest {
    private HashMap map;
    @BeforeEach
    public void setUp(){
        map = new HashMap();
    }
    @Test
    public void mapExistsTest(){
        assertNotNull(map);
    }
    @Test
    public void mapIsEmptyByDefaultTest(){
        assertEquals(0,map.size());
    }

    @Test
    public void DataKeyAndValueCanBeAddedTest(){
        map.put("name","wale");
        assertEquals(1,map.size());
    }
    @Test
    public void MultipleDataCanBeAddedTest(){
        map.put("name","wale");
        map.put("age","30");
        map.put("school","semicolon");
        assertEquals(3,map.size());
    }
    @Test
    public void KeyCanFindValueTest(){
        map.put("name","wale");
        map.put("age","30");
        map.put("school","semicolon");
        String value = map.getValue("age");
        assertEquals("30",value);
    }

    @Test
    public void AddingExistingKeyCanUpdateOnlyValueTest(){
        map.put("name","wale");
        map.put("age","30");
        map.put("age","25");
        String value = map.getValue("age");
        assertEquals("25",value);
    }
}
