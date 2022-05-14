package chapterNine;

public class AudioBook extends Book {
    private double bookSize;
    private double playLength;
    private String artistName;

    public AudioBook(String title, String yearOfPublication,String author,double bookSize, double playLength,String artistName){
        super(title,yearOfPublication,author);
        if(playLength < 0){
            throw new IllegalArgumentException("playLength can not be < 0");
        }
        this.bookSize = bookSize;
        this.playLength = playLength;
        this.artistName = artistName;
    }

    public double getBookSize() {
        return bookSize;
    }

    public double getPlayLength() {
        return playLength;
    }

    public String getArtistName() {
        return artistName;
    }

    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %s%n%s: %.2fMb%n%s: %.2f%n%s: %s",
                "Title",getTitle(),"Year Of Publication",getYearOfPublication(),"Author",getAuthor(),
                "Book size",getBookSize(),"play Length",getPlayLength(),"Artist Name",getArtistName());
    }
}
