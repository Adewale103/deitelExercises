package ClassWork;

import java.util.Scanner;

public class DividingWithoutDivisionOrModulusSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        int dividend = input.nextInt();

        System.out.println("Enter the divisor: ");
        int divisor = input.nextInt();

        int divider = divisor;
        boolean status = true;
        int count = 0;

        while(status){
            divider = divider + divisor;
            count++;
            if(divider > dividend){
                status = false;}
        }
        System.out.println(count);

    }
}
