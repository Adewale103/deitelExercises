package chapterNine;

public class PrintBook extends Book{

    private String publisher;
    private String ISBN;

    public PrintBook(String title, String yearOfPublication,String author,String publisher, String ISBN){
        super(title,yearOfPublication,author);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %s%n%s: %s%n%s: %s",
                "Title",getTitle(),"Year Of Publication",getYearOfPublication(),"Author",getAuthor(),"Publisher",getPublisher(),"ISBN",getISBN());
    }

    public String getPublisher() {
        return publisher;
    }

    public String getISBN() {
        return ISBN;
    }
}
