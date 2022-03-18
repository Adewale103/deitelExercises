package Personal;

public class KataFunmi {
    public boolean isEven(int digit) {
        if(digit%2 == 0)
            return true;
        else
            return false;
    }


    public int getBiggestNumber(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
        if(firstNumber > secondNumber && firstNumber > thirdNumber
                && firstNumber > fourthNumber && firstNumber > fifthNumber )
            return firstNumber;
        else if(secondNumber > firstNumber && secondNumber > thirdNumber
                && secondNumber > fourthNumber && secondNumber > fifthNumber )
            return secondNumber;
        else if(thirdNumber > firstNumber && thirdNumber > secondNumber
                && thirdNumber > fourthNumber && thirdNumber > fifthNumber )
            return thirdNumber;
        else if(fourthNumber > firstNumber && fourthNumber > secondNumber
                && fourthNumber > thirdNumber && fourthNumber > fifthNumber )
            return fourthNumber;
        else
            return fifthNumber;
    }
}
