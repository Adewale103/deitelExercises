package Personal;

import java.security.SecureRandom;
import java.util.Scanner;

public class InfiniteLoopFor {
    public static void main(String[] args) {
//        int count = 1;
//
//        for (; ; count++) {
//            System.out.println("Wale");
//
//            if (count>=5){break;}
//        }

//        int count = 1;
//        SecureRandom random = new SecureRandom();
//        for(;count<=4;){
//            System.out.println("Asherflo");
//            count = random.nextInt(7);
        int count = 0;
        Scanner input = new Scanner(System.in);
        for(;count<=100;){
            System.out.println("Enter a score and enter any number above 100 to end");
            count = input.nextInt();
            if(count>100){break;}
            else System.out.println("collected");
        }

        }
    }

