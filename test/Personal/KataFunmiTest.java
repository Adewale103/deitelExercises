package Personal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataFunmiTest {
    @Test
    public void testToCheckEvenNumbers() {
        KataFunmi even = new KataFunmi();
        boolean funmi = even.isEven(10067788);

        assertEquals(true, funmi);

    }

    @Test
    public void testToCompareIntegers(){
        KataFunmi compareIntegers = new KataFunmi();
        int biggestNumber = compareIntegers.getBiggestNumber(9,6,6, 7, 56);
        assertEquals(56, biggestNumber);
    }
}