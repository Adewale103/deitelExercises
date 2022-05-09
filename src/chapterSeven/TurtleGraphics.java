package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class TurtleGraphics {
    static int position = 1;
    static int determinant = 1;
    static int rightCount = 1;
    static Scanner input = new Scanner(System.in);
    private static int[][] floor;
    private static String[][] floor_;
    public static void main(String[] args) {


    }

    public static void fillFloorWithEmptySpace(){
        for (String[] strings : floor_) {
            Arrays.fill(strings, " ");
        }
    }

    public static void Command(){
        boolean status = true;
        while(status){
            System.out.println("Enter command: ");
            int command = input.nextInt();
            switch (command){
                case 1:
                    position = 0;
                    break;
                case 2:
                    position = 1;
                    break;
                case 3:
                    turnRight();
                    break;
                case 4:
                    turnLeft();
                    break;
                case 5:
                    move();
                    System.out.println("Enter number of spaces: ");
                    int spaces = input.nextInt();
                    moveBy(spaces);
                case 6:
                    displayArray();
                    break;
                case 9:
                    status = false;
                    break;
            }
        }
    }

    private static void turnLeft() {
    }

    private static void moveBy(int spaces) {
        for (int i = position; i < (position + spaces); i++) {

        }
    }

    private static void move() {
    }

    private static void turnRight() {
        if (rightCount % 2 != 0) {
            //move by column
        }
        else {
            //move by row
        }
    }


    private static void displayArray() {
        for (int i = 0; i < floor.length; i++) {
            for (int j = 0; j < floor[i].length; j++) {
                if (floor[i][j] == 1){
                    floor_[i][j] = "*";
                }
            }
        }

        for (int i = 0; i < floor_.length; i++) {
            for (int j = 0; j < floor_[i].length ; j++) {
                System.out.print(floor_[i][j]+" ");
            }
            System.out.println();
        }
    }


}
