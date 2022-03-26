package ChapterFour;

import java.util.Scanner;

public class DecimalEquivalentOfBinaryNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Enter
                1.-> two digit binary number
                2.-> three digit binary number
                3.-> four digit binary number
                4.-> five digit binary number""");
        int option = input.nextInt();
        switch (option){
            case 1:
                System.out.println("Enter any two binary number: ");
                int number1 = input.nextInt();
                int num1 = (number1 % 10);
                int num2 = (number1 % 100) / 10;
                if(num2 >= 0 && num2 <= 1 && num1 >= 0 && num1 <= 1){
                double decimalEquivalent1 = (num2)+(num1 *2);
                System.out.printf("The decimal equivalent of %d is %.2f",number1,decimalEquivalent1);}
                else System.out.println("The number is not a binary number");
            break;
            case 2:
                System.out.println("Enter any three binary number: ");
                int number2 = input.nextInt();
                int n1 = (number2 % 10);
                int n2 = (number2 % 100) / 10;
                int n3 = (number2 % 1000)/100;
                if(n1 >= 0 && n1 <= 1 && n2 >= 0 && n2 <= 1 && n3 >= 0 && n3 <= 1){
                double decimalEquivalent2 = (n3)+(n2 *2)+(n1 * 4);
                System.out.printf("The decimal equivalent of %d is %.2f",number2,decimalEquivalent2);}
                else System.out.println("The number is not a binary number");
                break;
            case 3:
                System.out.println("Enter any four binary number: ");
                int number3 = input.nextInt();
                int c1 = (number3 % 10);
                int c2 = (number3 % 100) / 10;
                int c3 = (number3 % 1000) / 100;
                int c4 = (number3 % 10000) / 1000;
                if(c1 >= 0 && c1 <= 1 && c2 >= 0 && c2 <= 1 && c3 >= 0 && c3 <= 1 && c4 >= 0 && c4 <= 1){
                double decimalEquivalent3 = (c4)+(c3 *2)+(c2 * 4)+(c1 * 8);
                System.out.printf("The decimal equivalent of %d is %.2f",number3,decimalEquivalent3);}
                else System.out.println("The number is not a binary number");
                break;
            case 4:
            System.out.println("Enter any five binary number: ");
                int number = input.nextInt();
                int new1 = (number % 10);
                int new2 = (number % 100) / 10;
                int new3 = (number % 1000) / 100;
                int new4 = (number % 10000) / 1000;
                int new5 = (number % 100000) / 10000;
                if(new1 >= 0 && new1 <= 1 && new2 >= 0 && new2 <= 1 && new3 >= 0 && new3 <= 1
                        && new4 >= 0 && new4 <= 1 && new5 >= 0 && new5 <= 1){
                double decimalEquivalent = (new5)+(new4 *2)+(new3 *4)+(new2*8)+(new1*16);
                System.out.printf("The decimal equivalent of %d is %.2f",number,decimalEquivalent);}
                else System.out.println("The number is not a binary number");
                break;
            default:
                System.out.println("invalid selection");

        }

    }
}
