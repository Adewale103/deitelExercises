package chapterFive;

import java.util.Scanner;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any day from 1 to 12, enter 13 to stop:");
        int day = input.nextInt();

        while(day>0 && day<=12) {
            switch (day) {
                case 1 -> System.out.println("On the first day of Christmas my true love sent to me ");
                case 2 -> System.out.println("On the second day of Christmas my true love sent to me ");
                case 3 -> System.out.println("On the third day of Christmas my true love sent to me ");
                case 4 -> System.out.println("On the fourth day of Christmas my true love sent to me ");
                case 5 -> System.out.println("On the fifth day of Christmas my true love sent to me ");
                case 6 -> System.out.println("On the sixth day of Christmas my true love sent to me ");
                case 7 -> System.out.println("On the seventh day of Christmas my true love sent to me ");
                case 8 -> System.out.println("On the eight day of Christmas my true love sent to me ");
                case 9 -> System.out.println("On the ninth day of Christmas my true love sent to me ");
                case 10 -> System.out.println("On the tenth day of Christmas my true love sent to me ");
                case 11 -> System.out.println("On the eleventh day of Christmas my true love sent to me ");
                case 12 -> System.out.println("On the twelfth day of Christmas my true love sent to me ");
            }
            switch (day) {
                case 12:
                    System.out.println("Twelve drummers drumming");
                case 11:
                    System.out.println("Eleven pipers piping");
                case 10:
                    System.out.println("Ten lords a-leaping");
                case 9:
                    System.out.println("Nine ladies dancing");
                case 8:
                    System.out.println("Eight maids a-milking ");
                case 7:
                    System.out.println("Seven swans a-swimming ");
                case 6:
                    System.out.println("Six geese a-laying ");
                case 5:
                    System.out.println("Five gold rings ");
                case 4:
                    System.out.println("Four calling birds ");
                case 3:
                    System.out.println("Three french hens ");
                case 2:
                    System.out.println("Two turtle doves ");
                case 1:
                    System.out.println("A partridge in a pear tree ");
                    break;
            }

            System.out.print("Enter any day from 1 to 12, enter 13 to stop:");
            day = input.nextInt();
        }
    }
}
