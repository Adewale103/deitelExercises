package Personal;

import java.util.Scanner;

public class Factorial {
    public static void main(String... args){
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter any number; ");
        //int num = input.nextInt();
        for(int k = 1; k<=10;k++) {
            for (int n = 11; n <= 19; n++) {
                int multiply = k * n;
                System.out.printf("%d * %d = %d%n",k, n, multiply);
            }
            System.out.println();
        }
//        int num 2= input.nextInt();
////        System.out.println(num);
//        int fact = 1;
//        for(int i = 1; i>0 && i <= num; i++){
//            fact = fact * i;
//
//        }
//        System.out.printf("The factorial of %d is %d",num,fact);

//        while(num>0 && num<= 20){
//            fact = fact * num;
//            num = num - 1;
//        }
//        System.out.printf("The factorial of %d is %d",num,fact);

    }

}
