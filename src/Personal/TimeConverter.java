package Personal;

public class TimeConverter {
    public static void main(String[] args) {
        String time = getTime(105,34);
        System.out.println(time);
        String newTime = getTime(108);
        System.out.println(newTime);
    }
    private static String getTime(int minutes,int seconds){
        if((minutes < 0) || (seconds < 0) || (seconds > 59)){
            System.out.println("Invalid input");
        }
        int hour = minutes/60;
        int remainingMinute = minutes%60;
        return hour + "h "+remainingMinute+"m "+seconds+"s ";
    }
    private static String getTime(int seconds){
        if(seconds<0){
            System.out.println("Invalid input");
        }
        int newMinutes = seconds/60;
        int newSeconds = seconds%60;
        return getTime(newMinutes,newSeconds);
    }
}