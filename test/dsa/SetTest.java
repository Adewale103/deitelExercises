package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    private Set set;
    @BeforeEach
    public void startWithThis(){
        set = new Set();
    }
    @Test
    public void setExistTest(){
        assertNotNull(set);
    }
    @Test
    public void setIsEmptyAtCreationTest(){
        assertEquals(0,set.size());
    }

    @Test
    public void addByItemTest(){
        set.add("Feather");
        assertEquals(1,set.size());
    }
    @Test
    public void addMultipleItemsByItemTest(){
        set.add("Feather");
        set.add("Deno");
        set.add("Plant");
        assertEquals(3,set.size());
    }

    @Test
    public void cannotAddSameItemTest(){
        set.add("Feather");
        set.add("Crop");
        set.add("Fish");
        set.add("Feather");
        assertEquals(3,set.size());
    }
    @Test
    public void ItemCanBeRemovedByItem(){
        set.add("Feather");
        set.add("Crop");
        set.add("Fish");
        set.add("Yam");
        set.remove("Yam");
        assertEquals(3,set.size());
        assertFalse(set.contains("Yam"));
    }

    @Test
    public void MultipleItemsCanBeRemovedByItem(){
        set.add("Feather");
        set.add("Crop");
        set.add("Fish");
        set.add("Yam");
        set.remove("Crop");
        set.remove("Yam");
        assertEquals(2,set.size());
        assertFalse(set.contains("Yam"));
        assertFalse(set.contains("Crop"));

    }




}
