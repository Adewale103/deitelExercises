package ChapterFour;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any five digit number: ");
        int number = input.nextInt();
        if (number > 10000){
            int new5 = (number % 10);
            int new4 = (number % 100) / 10;
            int new3 = (number % 1000) / 100;
            int new2 = (number % 10000) / 1000;
            int new1 = (number % 100000) / 10000;
            if ((new1 == new5) && (new2 == new4)){
                System.out.printf("%d is a palindrome%n", number);
            } else System.out.printf("%d is not a palindrome %n", number);}
         else{
            System.out.println("incorrect entry, enter any five digit number: ");
            number = input.nextInt();
            int new5 = (number % 10);
            int new4 = (number % 100) / 10;
            int new3 = (number % 1000) / 100;
            int new2 = (number % 10000) / 1000;
            int new1 = (number % 100000) / 10000;
            if ((new1 == new5) && (new2 == new4)) {
                System.out.printf("%d is a palindrome%n", number);
            } else System.out.printf("%d is not a palindrome %n", number);
        }
    }
}





