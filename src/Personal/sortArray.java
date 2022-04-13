package Personal;

import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
    private static final Scanner input = new Scanner(System.in);
    static int[] array = new int[5];


    public static void main(String[] args) {
        loadArray();
        int[] sortedArray = isSortedArray(array);
        System.out.println(Arrays.toString(sortedArray));


//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i] ;
//        }

    }

    public static void loadArray() {
        System.out.println("Enter five numbers. Press enter after each entry: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
    }

    public static int[] isSortedArray(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int temp;
        boolean status = true;
        while(status){
            status = false;
        for (int i = 0; i < sortedArray.length-1; i++) {
            if(sortedArray[i] < sortedArray[i+1]){
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[i+1];
                sortedArray[i+1] = temp;
            status = true;}
            }
        }
        return sortedArray;
    }
}

