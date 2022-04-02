package Personal;

import java.util.Scanner;

public class Factorial {
    public static void main(String... args){
         Scanner input = new Scanner(System.in);
         System.out.println("Enter any number; ");
         int num = input.nextInt();
         int count = 0;
         int integer = 1;
         int result = 1;
         int fact = 1;
         double factdob = 1;
         double exp = 1;
         for(int counter = 1; counter <= num; counter++){
             while(integer <= counter){
                 fact = integer - count;
                 result = result * fact;
                integer++;
             }
             factdob = (double)1/result;
             exp = exp + factdob;
         }
        System.out.println(exp);
         }

//

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


