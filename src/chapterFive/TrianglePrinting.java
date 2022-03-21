package chapterFive;

public class TrianglePrinting {
    public static void main(String[] args) {

        for (int row = 1; row <= 11; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 11; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 11; row >= 1; row--) {
            for (int column = 1; column <= 11 - row; column++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= row; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 1; row <= 11; row++) {
            for (int column = 1; column <= 11 - row; column++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= row; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

    }
}

