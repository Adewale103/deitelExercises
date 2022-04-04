package tddClass;

public class Kata {


    public static int findMaximumFrom(int[] scores) {
        int maximum = 0;
        int count = 0;
        while (count < scores.length){
            if
        (scores[count] > maximum){maximum = scores[count];} count++;}
        return maximum;
    }

    public static int findMinimumFrom(int[] scores) {
        int minimum = scores[0];
        int count = 1;
        while (count < scores.length){
            if
            (scores[count] < minimum){minimum = scores[count];} count++;}
        return minimum;
    }

    public static double findAverageFrom(int[] scores) {
        int sum = 0;
        double average = 0;
        int count = 0;
        while (count < scores.length){
           sum = sum + scores[count]; count++;
        average = sum/ scores.length;}
        return average;
    }

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
        else if (copies >= 5 && copies <= 9)
            return copies * 1800;
        else if (copies >= 10 && copies <= 29)
            return copies * 1600;
        else if (copies >= 30 && copies <= 49)
            return copies * 1500;
        else if (copies >= 50 && copies <= 99)
            return copies * 1300;
        else if (copies >= 100 && copies <= 199)
            return copies * 1200;
        else if (copies >= 200 && copies <= 499)
            return copies * 1100;
        else if (copies >= 500)
            return copies * 1000;
        else return 0;
    }

    public double quotient(int num1, int num2) {
        return num1 / num2;
    }

    public boolean isEven(int digit) {
        if (digit % 2 == 0) {
            return true;
        }
        return false;
    }

    public int isLargest(int num1, int num2, int num3, int num4, int num5) {
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            return num1;
        } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            return num2;
        } else if (num3 > num2 && num3 > num1 && num3 > num4 && num3 > num5) {
            return num3;
        } else if (num4 > num2 && num4 > num3 && num4 > num1 && num4 > num5) {
            return num4;
        }
        return num5;
    }

    public int isLargestNumber(int num1, int num2, int num3, int num4, int num5) {
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        if (num4 > largest) {
            largest = num4;
        }
        if (num5 > largest) {
            largest = num5;
        }
        return largest;

    }

    public int isNumberOfFactor(int number) {
        int num = 1;
        int count = 0;
        for (num = 1; num <= number; num++) {
            if (number % num == 0) count++;
        }
        return count;
//        int num = 1;
//        int count = 1;
//        while(num <= number){num++; if(number % num == 0){count++;}}return count;


    }

    public boolean primeNumber(int number) {
        int num = 1;
        int count = 0;
        for (num = 1; num <= number; num++) {
            if (number % num == 0) count++;
        }
        if (count == 2)
            return true;

        return false;
    }
}
