package Personal;

import java.util.Scanner;

public class MultiplicationLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int multiplier1 = input.nextInt();
        int multiplier11 = multiplier1;

        System.out.println("Enter the second number: ");
        int multiplier2 = input.nextInt();

        for (int i = 1; i <= multiplier2-1; i++) {
            multiplier1 = multiplier1 + multiplier11;
        }
        System.out.print(multiplier1);
    }
}
