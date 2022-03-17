package ClassWork;

import java.util.Scanner;

public class ZippFlipper {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter either 1 or 0 ");
        int num1 = input.nextInt();
        if (num1 == 1) {
            System.out.print(0);
        }
        if (num1 == 0) {
            System.out.print(1);
        } if (num1 != 0 && num1 != 1){
            System.out.print("invalid digit; ");
        }

    }
}
