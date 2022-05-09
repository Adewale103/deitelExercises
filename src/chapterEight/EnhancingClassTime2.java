package chapterEight;

public class EnhancingClassTime2 {
    private int seconds;
    private int minute;
    private int hour;

    public EnhancingClassTime2(int hour,  int minute, int seconds) {
        if(seconds < 0 || seconds > 59){
            throw new IllegalArgumentException("seconds should be btw 0-59");
        }
        if(minute < 0 || minute > 59){
            throw new IllegalArgumentException("minute should be btw 0-59");
        }
        if(hour < 0 || hour > 23){
            throw new IllegalArgumentException("hour should be btw 0-23");
        }
        this.seconds = seconds;
        this.minute = minute;
        this.hour = hour;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }
    public void tick() {
        if (seconds >= 59 && minute >= 59 && hour == 11) {
            hour = 0;
            minute = 0;
            seconds = 0;
        }
        else if (seconds >= 59 && minute >= 59 && hour >= 11) {
            hour = hour + 1;
            minute = 0;
            seconds = 0;
        }
        else if (seconds >= 59) {
            minute = minute + 1;
            seconds = 0;
        }
        else if (minute >= 59) {
            hour = hour + 1;
            minute = 0;}
        else {
            seconds = seconds + 1;
        }
    }


    public void incrementMinute(){
        if(seconds >= 59 && minute >= 59 && hour <= 23){
            hour = hour + 1;
            minute = 0;
            seconds = 0;
        }
        else if(minute == 59){
            hour = hour + 1;
            minute = 0;
        }
        else{
        minute = minute +1;}
    }

    public void incrementHour(){
        if(hour == 23 && minute >= 59 && seconds >= 59){
            hour = 0;
            minute = 0;
            seconds = 0;
        }
        else hour = hour + 1;
    }
    public String toString(){
        return String.format("%02d:%02d:%02d %s",
                (getHour() == 0 || getHour() == 12) ? 12 : getHour()%12,
                getMinute(),getSeconds(),(getHour() < 12) ? "AM" : "PM");
    }

}
