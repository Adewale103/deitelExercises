package Personal;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles driven");
        int miles = input.nextInt();
        int  milesPerLitres = 0;

        System.out.println("Enter litres");
        int litres = input.nextInt();
        while(miles != -1){
            milesPerLitres = milesPerLitres + (miles/litres);
            System.out.println("Enter miles driven");
            miles = input.nextInt();
            if(miles != -1){
            System.out.println("Enter litres");
            litres = input.nextInt();}
        }
        System.out.println(milesPerLitres);

    }
}
