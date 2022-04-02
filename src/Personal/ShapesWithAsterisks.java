package Personal;

import java.util.Scanner;

public class ShapesWithAsterisks {
    public static void main(String[] args) {
        for(int row = 1; row<=11;row++){
            for(int column = row; column<=11; column++){
                System.out.print("  ");
            }
            for(int column = 1; column<=row; column++){
                System.out.print("* ");}
            for(int column = 1; column<=row; column++){
                System.out.print("  ");}
            System.out.println();
        }
        for(int row = 1; row<=11;row++){
            for(int column = 1; column<=row; column++){
                System.out.print("  ");
            }
            for(int column = row; column<11; column++){
                System.out.print("  ");}
            for(int column = row; column<=11; column++){
                System.out.print("* ");}
            System.out.println();
        }
    }
}
