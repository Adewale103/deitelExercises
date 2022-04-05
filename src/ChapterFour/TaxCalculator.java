package ChapterFour;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;

        while (count <=3){
            System.out.println("Enter your name: ");
            String name = input.nextLine();
            System.out.println("Enter your yearly earning: ");
            double earning = input.nextDouble();
            input.nextLine();


            if(earning <= 30000){
                System.out.printf("%s, your total tax is $%.2f%n",name,(earning*0.15));
            }
            else {
                System.out.printf("%s, your total tax is $%.2f%n",name,(earning*0.20));
            }
            count++;

        }
    }
}