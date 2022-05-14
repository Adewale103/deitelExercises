package chapterEight;

public class EnhancingClassDate {
    private int day;
    private int month;
    private int year;

    private static int[] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    public EnhancingClassDate(int day, int month, int year){
        if(day<= 0 || day > daysPerMonth[month] && month != 2){
            throw new IllegalArgumentException("out of range for the specified day and month");
        }
        if(month <= 0||month > 12){
            throw new IllegalArgumentException("month must be > 0 and < 12");
        }
        if(year < 1000 ){
            throw new IllegalArgumentException("Year must be greater than 1000");
        }
        if(month == 2 && day == 29 && !((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0))){
            throw new IllegalArgumentException("out of range for the specified month and year");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }
    @Override
    public String toString(){
        return String.format("%d/%d/%d",day,month,year);
    }
    public void nextDay(){
        if(day < daysPerMonth[month]){
            if(month <= 12){
                day = day + 1;
            }
        }
        else if(day == daysPerMonth[month] && month == 12){
            month = 1;
            day = 1;
            year = year + 1;
        }
        else if(day == daysPerMonth[month] && month != 2){
            if(month < 12){
                month = month + 1;
                day = 1;
            }
        }
        else if(day == daysPerMonth[month] && month == 2 && ((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0))){
            day = day + 1;
        }
        else if(day == daysPerMonth[month] && month == 2 && !((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0))){
            month = month + 1;
            day = 1;
        }

    }


}
