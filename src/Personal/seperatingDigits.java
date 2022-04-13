package Personal;

import java.util.Arrays;
import java.util.Scanner;

public class seperatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int newNumber;
        int lastNumber;
        System.out.println("Enter any integer: ");
        int number = input.nextInt();

        int count = (int)Math.ceil(Math.log10(number));
        System.out.println(count);
        int[] num = new int[count];
        int[] num1 = new int[count];

        for (int i = 0; i < count; i++) {
           lastNumber = number%10;
           number = number/10;
           num[i] = lastNumber;
       }
        if (num[0] == num[4] && num[1] == num[3]){
            System.out.println("The number is a palindrome");
        }
        else System.out.println("The number is not a palindrome");

        for (int i = 0; i < num1.length; i++) {
            num1[i] = num[num1.length-1 - i];
        }
        //Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        }

    }

