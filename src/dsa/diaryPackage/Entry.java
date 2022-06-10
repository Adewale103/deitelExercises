package dsa.diaryPackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private LocalDateTime date = LocalDateTime.now();
    private final String title;
    private final String body;

    public Entry(String title, String body){
        this.title = title;
        this.body = body;
    }


    public String getTitle() {
        return title;
    }

    public String getDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd-MM-yyy, hh:mma");
        return dateTimeFormatter.format(date);
    }

    public String getBody() {
        return body;
    }
    @Override
    public String toString(){
       return String.format("""
               
               Date: %s
               
               Title: %s
               
               Body:
               %s
               
               ********************************************""",getDate(),getTitle(),getBody());
    }

}
