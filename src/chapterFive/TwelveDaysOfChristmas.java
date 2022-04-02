package chapterFive;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {

         for(int day = 1; day<=12; day++){System.out.print("On the ");
            switch (day) {
                case 1 -> System.out.print("first day ");
                case 2 -> System.out.print("second day ");
                case 3 -> System.out.print("third day ");
                case 4 -> System.out.print("fourth day ");
                case 5 -> System.out.print("fifth day  ");
                case 6 -> System.out.print("sixth day ");
                case 7 -> System.out.print("seventh day ");
                case 8 -> System.out.print("eight day  ");
                case 9 -> System.out.print("ninth day ");
                case 10 -> System.out.print("tenth day ");
                case 11 -> System.out.print("eleventh day ");
                case 12 -> System.out.print("the twelfth day ");
            }
            System.out.println("of Christmas my true love sent to me ");
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
                    System.out.print("Two turtle doves ");
                    System.out.println("and");
                case 1:
                    System.out.println("a partridge in a pear tree ");
                    break;
            }
             System.out.println("*******************************************************************************************");
         }
        }
}
