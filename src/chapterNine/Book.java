package chapterNine;

public class Book {
    private String title;
    private String yearOfPublication;
    private String author;

    public Book(String title, String yearOfPublication, String author){
      this.author = author;
      this.title = title;
      this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString(){
        return  String.format("%s: %s%n%s: %s%n%s: %s",
                "Author",getAuthor(),"Year Of Publication",getYearOfPublication(),
        "Title",getTitle());
    }
}
