package Personal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataFunmiTest {
    private KataFunmi calculator;
    @BeforeEach
    public void startWithThis(){
        calculator = new KataFunmi();
    }
    @Test
    public void testToCheckEvenNumbers() {
        boolean result = calculator.isEven(10067788);

        assertEquals(true, result);

    }

    @Test
    public void maximumNumberTest(){
        int biggestNumber = calculator.getBiggestNumber(9,6,6, 7, 56);
        assertEquals(56, biggestNumber);
    }

    @Test
    public void maximumNumberTest2(){
        int biggestNumber = calculator.BiggestNumber(9,6,96, 7, 34);
        assertEquals(96, biggestNumber);
    }

    @Test
    public void MinimumNumberTest(){
        int smallestNumber = calculator.smallestNumber(9,6,96, 7, 34);
        assertEquals(6, smallestNumber);
    }

    @Test
    public void factorOfaNumberCountTest(){
        int factorCount = calculator.factorOf(100);
        assertEquals(9, factorCount);

    }
    @Test
    public void primeNumberTest(){
        boolean result = calculator.isPrimeNumber(191);
        assertEquals(true, result);
    }
}