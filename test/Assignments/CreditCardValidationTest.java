package Assignments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidationTest {
    private CreditCardValidation creditCardValidation;
    @BeforeEach
    public void startWithThis(){
        creditCardValidation = new CreditCardValidation();
    }
    @Test
    public void creditCardValidationCanBeCreatedTest(){
        assertNotNull(creditCardValidation);
    }
    @Test
    public void numberOfDigitsCanBeGottenTest(){
        Long result = creditCardValidation.getPrefix(4388576018410707L,5);
        assertEquals(43885,result);
    }
    @Test
    public void sizeOfNumberCanBeGottenTest(){
        long result = creditCardValidation.getSize(4388576018410707L);
        assertEquals(16,result);
    }

    @Test
    public void prefixOfNumberMatchedTest(){
        boolean result = creditCardValidation.prefixMatched(4388576018410707L,4);
        assertTrue(result);
    }

    @Test
    public void sumOfOddPlaceCanBeCalculatedTest(){
        int result = creditCardValidation.sumOfOddPlace(4388576018402626L);
        assertEquals(38,result);
    }
    @Test
    public void singleDigitCanBeGottenTest(){
        int result = creditCardValidation.getDigit(4);
        assertEquals(4,result);
    }
    @Test
    public void sumOfDoubleDigitsCanBeGottenTest(){
        int result = creditCardValidation.getDigit(18);
        assertEquals(9,result);
    }

    @Test
    public void sumOfDoubleEvenPlaceCanBeCalculatedTest(){
        int result = creditCardValidation.sumOfDoubleEvenPlace(4388576018402626L);
        assertEquals(37,result);
    }

    @Test
    public void cardNumberIsValidTest(){
        boolean result = creditCardValidation.isValid(4388576018402626L);
        assertFalse(result);

        result = creditCardValidation.isValid(4388576018410707L);
        assertTrue(result);
    }

}
