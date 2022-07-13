package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    private static final Scanner input = new Scanner(System.in);
    private static int[] theArray = new int[10];
    public static void main(String[] args) {


        Arrays.fill(theArray, -1);

        for (int i = 0; i < theArray.length; i++) {
            System.out.println("Enter number: ");
            int theNumber = input.nextInt();
            theArray[i] = theNumber;
        }
        firstCheck();
        reCheckForDuplicateValues();

        System.out.println(Arrays.toString(theArray));
    }
    public static int replaceNumber(int existingNumber){
        System.out.println(existingNumber+" already exists, enter a new number");
        return input.nextInt();
    }

    public static void reCheckForDuplicateValues(){
        int temp = 0;
        int count;
        for (int i = 0; i < theArray.length; i++) {
            count = 0;
            for (int j = 0; j < theArray.length; j++) {
                if (theArray[i] == theArray[j]) {
                    count++;
                    temp = j;
                }
            }
            if(count > 1){
                int number = replaceNumber(theArray[temp]);
                while(number == theArray[temp]){
                    number = replaceNumber(theArray[temp]);
                }
                theArray[temp] = number;
            }

        }

    }
    public static void firstCheck(){
        for (int i = theArray.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(theArray[i] == theArray[j]){
                    int number = replaceNumber(theArray[i]);
                    while(number == theArray[i]){
                        number = replaceNumber(theArray[i]);
                    }
                    theArray[j] = number;
                }
            }
            }
        }
    }



