package chapterFive;


public class TrianglePrinting {
    public static void main(String[] args) {
        for (int r = 1; r <= 11; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            for (int c = r; c <= 11; c++) {
                System.out.print("  ");
            }
            for (int c = r; c <= 11; c++) {
                System.out.print("* ");
            }
            for (int c = 1; c <= r; c++) {
                System.out.print("  ");
            }
            for (int c = 1; c <= r; c++) {
                System.out.print("  ");
            }
            for (int c = r; c <= 11; c++) {
                System.out.print("* ");
            }
            for (int c = r; c <= 11; c++) {
                System.out.print("  ");
            }
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int r = 1; r <= 11; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int r = 1; r <= 11; r++) {
            for (int c = r; c <= 11; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int r = 1; r <= 11; r++) {
            for (int c = r; c <= 11; c++) {
                System.out.print("  ");
            }
            for (int c = 1; c<=r; c++){
            System.out.print("* ");}
            System.out.println();
        }
        System.out.println();
        for (int r = 1; r <= 11; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("  ");
            }
            for (int c = r; c<=11; c++){
                System.out.print("* ");}
            System.out.println();
        }


    }
}