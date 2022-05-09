package chapterEight;

public class Time2 {
    private int seconds;
    private int minute;
    private int hour;

    public Time2(int hour, int minute, int seconds){
        if(seconds < 0 || seconds > 59){
            throw new IllegalArgumentException("seconds must be 0-59");
        }
        if(minute < 0 || minute > 59){
            throw new IllegalArgumentException("minute must be 0-59");
        }
        if(hour < 0 || hour > 23){
            throw new IllegalArgumentException("hour must be 0-23");
        }
        this.seconds = seconds;
        this.minute = minute;
        this.hour = hour;
    }
    public Time2(int seconds){
        if(seconds > 59){
            minute = seconds/60;
            this.seconds = seconds%60;
            if(minute > 59){
                hour = minute/60;
                minute = minute%60;
            }
        }
        else {
            this.seconds = seconds;
        }
        if(seconds < 0){
            throw new IllegalArgumentException("seconds must be greater than zero");
        }

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

    public String toString(){
        return String.format("%02d:%02d:%02d %s",
                (getHour() == 0 || getHour() == 12) ? 12 : getHour()%12,
                getMinute(),getSeconds(),(getHour() < 12) ? "AM" : "PM");
    }


}
