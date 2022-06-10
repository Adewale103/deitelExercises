package eBanking.class2;

public class Time {
    private int seconds;
    private int minutes;
    private int hour;


    public Time(int hour, int minutes, int seconds){
        validate(hour,minutes,seconds);
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(){
        this(0,0,0);
    }

    public Time(int seconds){
        this(0,0,seconds);
    }

    public Time(int minutes, int seconds){
        this(0,minutes,seconds);
    }






    private static void validate(int hour, int minutes, int seconds){
        validateHourWith(hour);
        validateMinuteWith(minutes);
        validateSecondsWith(seconds);
    }

    private static void validateSecondsWith(int seconds) {
        boolean secondsIsInvalid = seconds < 0 || seconds >= 60;
        if (secondsIsInvalid){throw new IllegalArgumentException("invalid seconds");}
    }

    private static void validateMinuteWith(int minutes) {
        boolean minutesIsInvalid = minutes < 0 || minutes >= 60;
        if (minutesIsInvalid){throw new IllegalArgumentException("invalid minute");}
    }

    private static void validateHourWith(int hour) {
        boolean hourIsInValid = hour < 0 || hour >= 24;
        if (hourIsInValid){throw new IllegalArgumentException("invalid hour");}
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        validateSecondsWith(seconds);
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        validateMinuteWith(minutes);
        this.minutes = minutes;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHourWith(hour);
        this.hour = hour;
    }
}
