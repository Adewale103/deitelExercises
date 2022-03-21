package ChapterFour;

import java.util.Scanner;

public class GasMilelage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the miles driven (end the program with -1) : ");
        int milesDriven = input.nextInt();
        System.out.println("Enter the number of gallons used: ");
        int gallonUsed = input.nextInt();
        int total = 0;
        int milesPerGallon;

        while( milesDriven != -1){
            milesPerGallon = milesDriven * gallonUsed;
            total += milesPerGallon;

            System.out.println("Enter the miles driven (end the program with -1: ");
            milesDriven = input.nextInt();

            if(milesDriven != -1){
            System.out.println("Enter the number of gallons used: ");
            gallonUsed = input.nextInt();}
        }
        double totalMilesPerGallon = total * 1.0;
        System.out.printf("The total miles per gallon for all trips is %.2f",totalMilesPerGallon);

    }
}
