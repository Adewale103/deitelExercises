package Personal;

import java.security.SecureRandom;
import java.util.Random;

public class
Chapter6 {
    public final static int Constant = 67;


    public int findMax(int x, int y, double z){
//        return Math.max(Math.max(x, y), z);
        return  0;
    }

    public int findMax(int x, double y, int f){
//        return Math.max(x, y);
        return 0;
    }





//    private boolean isEven(int digit) {
//        return digit % 2 == 0;
//    }
//
//    public String printTypeOfNumber(int num){
//        if(isEven(num)) return "Number is even";
//        return "Number is odd";
//    }


    public static void main(String[] args) {
//       Chapter6 c = new Chapter6();
        Random random = new Random();
//        random.setSeed(2);
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.setSeed(78);
        System.out.println(secureRandom.nextInt(100));
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);
//        System.out.println(c.printTypeOfNumber(5));

        Days monday = Days.MONDAY;



    }
}

enum Days{
    MONDAY,
    TUESDAY
}