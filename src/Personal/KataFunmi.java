package Personal;

import java.util.Scanner;

public class KataFunmi {
    public boolean isEven(int digit) {
        if (digit % 2 == 0)
            return true;
        else
            return false;
    }


    public int getBiggestNumber(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber
                && firstNumber > fourthNumber && firstNumber > fifthNumber)
            return firstNumber;
        else if (secondNumber > firstNumber && secondNumber > thirdNumber
                && secondNumber > fourthNumber && secondNumber > fifthNumber)
            return secondNumber;
        else if (thirdNumber > firstNumber && thirdNumber > secondNumber
                && thirdNumber > fourthNumber && thirdNumber > fifthNumber)
            return thirdNumber;
        else if (fourthNumber > firstNumber && fourthNumber > secondNumber
                && fourthNumber > thirdNumber && fourthNumber > fifthNumber)
            return fourthNumber;
        else
            return fifthNumber;
    }

    public int BiggestNumber(int i, int i1, int i2, int i3, int i4) {
        return Math.max(i2, Math.max(Math.max(i, i1), Math.max(i3, i4)));
    }

    public int smallestNumber(int i1, int i2, int i3, int i4, int i5) {
        return Math.min(Math.min(Math.min(i1, i2), Math.min(i3, i4)), i5);
    }

    public int factorOf(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    public boolean isPrimeNumber(int num) {
        if (factorOf(num) <= 2) return true;
        return false;
    }
}
