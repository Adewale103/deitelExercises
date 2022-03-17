package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FameTest {
    @Test
    public void addTest() {
        Fame calculator = new Fame();
        int result = calculator.add(5, 7);
        assertEquals(12, result);

    }

    @Test
    public void subtractTest() {
        Fame calculator = new Fame();
        int result = calculator.subtract(5, 7);
        assertEquals(-2, result);
    }

    @Test
    public void alternateSubtractTest() {
        Fame calculator = new Fame();
        int result = calculator.alternateSubtract(5, 7);
        assertEquals(2, result);
    }
    @Test
    public void areaCircleTest(){
        Fame circle = new Fame();
       double result = circle.area(7);
        assertEquals(154.0,result);
    }
    @Test
    public void flipTest(){
        Fame test = new Fame();
        int result = test.flip(1);
        assertEquals(0,result);

    }
}