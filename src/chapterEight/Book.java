package chapterEight;

public enum Book {
    YUNGV("Java textbook","2015"),
    APYU("Python textbook","2019"),
    MGJBH("Kotlin textbook","2012"),
    UIYTG("Springboot textbook","2012"),
    QWER("Mongo textbook","2011");

    private String title;
    private String copyRightYear;

    Book(String title, String copyRightYear) {
        this.title = title;
        this.copyRightYear = copyRightYear;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyRightYear() {
        return copyRightYear;
    }
}
