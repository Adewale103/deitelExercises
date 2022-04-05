package Personal;

import java.util.Scanner;

public class DaysPrediction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day_num = 0;
        String new_day;
        System.out.println("Which day of the week is today?");
        String day = input.nextLine().toUpperCase();
        System.out.println("Enter the number of days to know which day of the week it will fall ");
        int num = input.nextInt();
        switch (day) {
            case "SUNDAY" -> day_num = 1;
            case "MONDAY" -> day_num = 2;
            case "TUESDAY" -> day_num = 3;
            case "WEDNESDAY" -> day_num = 4;
            case "THURSDAY" -> day_num = 5;
            case "FRIDAY" -> day_num = 6;
            case "SATURDAY" -> day_num = 7;
        }
        int new_num = (day_num + num)%7;
        new_day = switch (new_num) {
            case 1 -> "SUNDAY";
            case 2 -> "MONDAY";
            case 3 -> "TUESDAY";
            case 4 -> "WEDNESDAY";
            case 5 -> "THURSDAY";
            case 6 -> "FRIDAY";
            default -> "SATURDAY";
        };
        System.out.printf("The next %d days will fall on a %s ",num,new_day);
        }
    }

