package tddClass;

public class Kata {


    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        int result = 0;
        if (secondNumber > firstNumber) {
            result = secondNumber - firstNumber;
        }
        if (firstNumber > secondNumber) {
            result = firstNumber - secondNumber;
        }
        return result;
    }

    public double findAreaWith(int radius) {
        return (22 * radius * radius) / 7.0;
    }

    public int flip(int bit) {
        int result = 0;
        if (bit == 0)
            return 1;
        if (bit == 1)
            return 0;
        return result;
    }

    public boolean KataIsPalindrome(int theNumber) {
        int new1 = (theNumber % 10) / 1;
        int new2 = (theNumber % 100) / 10;
        int new3 = (theNumber % 1000) / 100;
        int new4 = (theNumber % 10000) / 1000;
        int new5 = (theNumber % 100000) / 10000;
        if (new1 == new5) if (new2 == new4) return true;
        return false;
    }

    public int setPrice(int copies) {
        if (copies >= 1 && copies <= 4)
            return copies * 2000;
        else
            if (copies >= 5 && copies <= 9)
            return copies * 1800;
        else
            if (copies >= 10 && copies <= 29)
            return copies * 1600;
        else
            if (copies >= 30 && copies <= 49)
            return  copies * 1500;
        else
            if (copies >= 50 && copies <= 99)
            return copies * 1300;
        else
            if (copies >= 100 && copies <= 199)
            return copies * 1200;
        else
            if (copies >= 200 && copies <= 499)
            return copies * 1100;
        else
            if (copies >= 500)
            return copies * 1000;
        else return 0;
    }

    public double quotient(int num1, int num2) {return num1/num2;
    }
}