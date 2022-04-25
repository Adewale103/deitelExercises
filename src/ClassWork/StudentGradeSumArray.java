package ClassWork;

import java.util.Scanner;

public class StudentGradeSumArray {
    private static final Scanner input = new Scanner(System.in);
    private static final int[] array = new int[8];
    private static final int[][] multiArray = new int[3][4];

    public static void main(String[] args) {
        sumLinearArray();
        sumMultidimensionalArray();
    }


    public static void sumLinearArray(){
        int sum = 0;
        System.out.println("Enter 8 numbers (press enter after each input) ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number: ");
            array[i] = input.nextInt();
            sum = sum + array[i];
        }
        System.out.println("The sum is "+sum);
    }

    public static void sumMultidimensionalArray(){
        int sum = 0;
        System.out.println("For multidimensional array: ");
        for (int i = 0; i < multiArray.length; i++) {
            System.out.println("For row "+(i+1));
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.println("Enter number: ");
                multiArray[i][j] = input.nextInt();
                sum = sum + multiArray[i][j];
            }
        }
        System.out.println("The sum is "+sum);
    }
}
