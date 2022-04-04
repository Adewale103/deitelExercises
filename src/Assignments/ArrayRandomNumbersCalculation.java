package Assignments;

import java.security.SecureRandom;

public class ArrayRandomNumbersCalculation {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] array = {34,56,89,16,51,22,76,38,90,12};
        int largest = 0;
        int sum = 0;
        double average;
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
        for(int i = 0; i < array.length; i++){
            if (array[i] > largest){
                largest = array[i];
            }
        }
        System.out.println();
        System.out.println("The largest of the numbers is "+largest);
        for(int i = 0; i < array.length; i++ ){
            sum = sum + array[i];
        }
        System.out.println("The sum of the numbers is "+sum);
        average = (double)sum/array.length;
        System.out.printf("The average of the numbers is approximately %.2f ",average);
    }

}
