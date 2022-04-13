package Personal;

public class TimesTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            for (int j = 2; j <= 12; j++) {
                System.out.printf("%2d x %2d = %3d   ",j,i,j*i);
            }
            System.out.println();
        }
    }
}
