package tddClass;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {
    @Test
    public void addTest() {
        Kata calculator = new Kata();
        int result = calculator.add(4, 3);

        assertEquals(7, result);

    }

    @Test
    public void subtractionTest() {
        Kata calculator = new Kata();
        int result = calculator.subtract(7, 2);

        assertEquals(5, result);
    }

    @Test
    public void absoluteSubtractionTest() {
        Kata calculator = new Kata();
        int result = calculator.subtract(2, 7);
        assertEquals(5, result);
    }

    @Test
    public void calculateAreaTest() {
        Kata circle = new Kata();
        double result = circle.findAreaWith(7);
        assertEquals(154.0, result);
    }

    @Test
    public void bitFlipper() {
        Kata flipper = new Kata();
        int result = flipper.flip(0);
        assertEquals(1, result);
    }

    @Test
    public void palindromeTest() {
        Kata user1 = new Kata();
        boolean result = user1.KataIsPalindrome(12121);
        assertTrue(result);
        result = user1.KataIsPalindrome(12431);
        assertFalse(result);
    }

    @Test
    public void testDrillerBelow4Test() {
        Kata user = new Kata();
        int result = user.setPrice(3);
        assertEquals(6000, result);
    }

    @Test
    public void testDrillerBelow10Test() {
        Kata user = new Kata();
        int result = user.setPrice(9);
        assertEquals(16200, result);
    }

    @Test
    public void testDrillerBelow30Test() {
        Kata user = new Kata();
        int result = user.setPrice(28);
        assertEquals(44800, result);
    }

    @Test
    public void testDrillerBelow50Test() {
        Kata user = new Kata();
        int result = user.setPrice(42);
        assertEquals(63000, result);
    }

    @Test
    public void testDrillerBelow100Test() {
        Kata user = new Kata();
        int result = user.setPrice(98);
        assertEquals(127400, result);
    }

    @Test
    public void testDrillerBelow200Test() {
        Kata user = new Kata();
        int result = user.setPrice(173);
        assertEquals(207600, result);
    }

    @Test
    public void testDrillerBelow500Test() {
        Kata user = new Kata();
        int result = user.setPrice(480);
        assertEquals(528000, result);
    }

    @Test
    public void testDrillerAbove500Test() {
        Kata user = new Kata();
        int result = user.setPrice(742);
        assertEquals(742000, result);
    }

    @Test
    public void test() {
        int number = 1;
        while (number <= 100) {
            if (number % 2 == 0) {
                System.out.print(number + " ");}
                number = number + 1;

        }

    }
    @Test
    public void evenOrOddNumber(){
        Kata user = new Kata();
        boolean result = user.isEven(8);
        assertEquals(true, result);
    }
    @Test
    public void largestNumber(){
        Kata user = new Kata();
        int result = user.isLargest(23,97,66,88,45);
        assertEquals(97,result);
    }

    @Test
    public void largestNumber2(){
        Kata user = new Kata();
        int result = user.isLargestNumber(23,97,66,88,45);
        assertEquals(97,result);
    }


}