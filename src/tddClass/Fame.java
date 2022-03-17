package tddClass;

public class Fame {
    public int add(int num1, int num2) {return num1 + num2;
    }

    public int subtract(int num1, int num2) {return num1 - num2;
    }

    public int alternateSubtract(int num1, int num2) {int input = 0;if (num1 > num2) return num1-num2; if (num2 > num1) return num2-num1;
    return input;}

    public double area(int value){return (22*value*value)/7.0;
    }

    public int flip(int value) {int n =value; if (value == 0) return 1; if (value == 1) return 0; return value;
    }
}
