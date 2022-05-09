package chapterEight;

public class EnhancingClassTime2Test {
    public static void main(String[] args) {
        EnhancingClassTime2 time1 = new EnhancingClassTime2(21,58,59);
        EnhancingClassTime2 time2 = new EnhancingClassTime2(19,59,59);
        EnhancingClassTime2 time3 = new EnhancingClassTime2(6,44,59);
        time1.tick();
        System.out.println(time1);

        time2.incrementMinute();
        System.out.println(time2);

        time3.incrementHour();
        System.out.println(time3);
    }
}
