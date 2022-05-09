package chapterEight;

import java.util.Scanner;

public class CylinderTest {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        cylinder.setRadius(4);

        System.out.println("Enter the height of the cylinder: ");
        double height = input.nextDouble();
        cylinder.setHeight(7);

        cylinder.calculateVolume();


    }
}
