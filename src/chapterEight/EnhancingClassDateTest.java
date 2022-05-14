package chapterEight;

public class EnhancingClassDateTest {
    public static void main(String[] args) {
        EnhancingClassDate enhancingClassDate = new EnhancingClassDate(30,12,2019);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Day "+i);
            enhancingClassDate.nextDay();
            System.out.println(enhancingClassDate);
            System.out.println();

        }


    }
}
