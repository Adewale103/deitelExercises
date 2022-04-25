package chapterThree;

import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Clock clockTest1 = new Clock(23,11,55);
        Clock clockTest2 = new Clock(16,44,34);

        System.out.println("Enter the hour: ");
        int hour = input.nextInt();
        clockTest1.setHour(hour);

        System.out.println("Enter the minute: ");
        int minute = input.nextInt();
        clockTest1.setMinute(minute);

        System.out.println("Enter the seconds: ");
        int seconds = input.nextInt();
        clockTest1.setSecond(seconds);

        System.out.println(clockTest1.displayTime());
    }
}
