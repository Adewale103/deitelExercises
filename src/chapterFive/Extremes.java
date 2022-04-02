package chapterFive;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number2 = 0;
        int secondMaximum = 0;
        int maximum = 0;
        System.out.println("Welcome, Enter 10 numbers");
        while (counter <= 10) {
            System.out.println("input number : ");
            int number = input.nextInt();
            if (number > maximum) {
                maximum = number;
            }
            if (number > secondMaximum && number < maximum) {
                secondMaximum = number;
            }
            System.out.printf("The sum of the maximum and second largest number is %d and %d", maximum, secondMaximum);
        }
    }
}