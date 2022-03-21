package chapterFive;

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number;");
        int num1 = input.nextInt();

        System.out.println("Enter the second number;");
        int num2 = input.nextInt();

        System.out.println("Enter the third number;");
        int num3 = input.nextInt();

        System.out.println("Enter the fourth number;");
        int num4 = input.nextInt();

        System.out.println("Enter the fifth number;");
        int num5 = input.nextInt();

        getNumber(num1);
        getNumber(num2);
        getNumber(num3);
        getNumber(num4);
        getNumber(num5);


    }
    private static void getNumber(int number){
        for (int i = 1; i <= number; i++) {
            if (number <= 30) {
                System.out.print("* ");
            }
            else System.out.println();
        }
        System.out.println();
    }
}





