package ClassWork;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first digit: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second digit: ");
        int num2 = input.nextInt();

        System.out.println("Enter the third digit: ");
        int num3 = input.nextInt();

        if (num1 == num3 && num2 == num2 && num3 == num1) {
            System.out.printf("%d %d %d  = %d %d %d ", num1, num2, num3, num3, num2, num1);
        } else {
            System.out.print("The value is not a palindrome");
        }
    }
}







