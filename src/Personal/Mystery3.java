package Personal;

import java.util.Scanner;

public class Mystery3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a digit");
            int digit = input.nextInt();
            System.out.println(digit%10);
//            int row = 5;
//            while (row >= 1) {
//                int column = 1;
//                while (column <= 5) {
//                    System.out.print(row % 2 == 0 ? "X" : "O");
//                    ++column;
//                } // end while
//                --row;
//                System.out.println();
//            } // end while
        } // end main
    } // end class Mystery3

