package dsa;

import dsa.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArrayListTest {
    private ArrayList arrayList;
    @BeforeEach
    public void setUp(){
        arrayList = new ArrayList();
    }
    @Test
    public void arrayListTestExist(){
        assertNotNull(arrayList);
    }
    @Test
    public void addByItemTest(){
        arrayList.add("Rice");
        assertEquals(1,arrayList.size());
    }
    @Test
    public void addAndGetItemByIndexTest(){
        arrayList.add("Beans");
        arrayList.add("Bread");
        assertEquals("Bread",arrayList.get(1));
    }
    @Test
    public void removeByItemTest(){
        arrayList.add("Amala");
        arrayList.add("Beans");
        arrayList.add("Bread");
        arrayList.add("Yam");
        arrayList.remove("Bread");
        assertEquals(3,arrayList.size());
    }
    @Test
    public void addItemByIndexTest(){
        arrayList.add("Amala");
        arrayList.add("Beans");
        arrayList.add(1,"Yam");
        assertEquals("Yam",arrayList.get(1));
        assertEquals("Beans",arrayList.get(2));
    }
    @Test
    public void addItemBeyondArraySizeTest(){
        arrayList.add("Amala");
        arrayList.add("Beans");
        arrayList.add("Bread");
        arrayList.add("Yam");
        arrayList.add("Pap");
        arrayList.add("Custard");
        arrayList.add("Garri");
        arrayList.add("Porriage");
        assertEquals(8, arrayList.size());
    }

    @Test
    public void addItemBeyondArraySizeByIndexTest(){
        arrayList.add("Amala");
        arrayList.add("Beans");
        arrayList.add("Bread");
        arrayList.add("Yam");
        arrayList.add("Pap");
        arrayList.add("Custard");
        arrayList.add(2,"Spagetti");
        assertEquals("Spagetti",arrayList.get(2));
        assertEquals("Bread",arrayList.get(3));
    }
    @Test
    public void removeItemByIndexTest(){
        arrayList.add("Amala");
        arrayList.add("Beans");
        arrayList.add("Bread");
        arrayList.add("Yam");
        arrayList.remove(2);
        assertEquals("Yam",arrayList.get(2));
        assertEquals(3,arrayList.size());
    }
    @Test
    public void otherItemsMoveUpWhenItemIsRemovedByItemTest(){
        arrayList.add("Amala");
        arrayList.add("Beans");
        arrayList.add("Bread");
        arrayList.add("Yam");
        arrayList.add("Pap");
        arrayList.add("Custard");
        arrayList.add("Fufu");
        arrayList.remove("Yam");
        assertEquals("Pap",arrayList.get(3));
    }


}
