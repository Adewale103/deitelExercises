package chapterNine;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Story of my life","2014","James Morgan");
        System.out.println(book);

        System.out.println();

        AudioBook audioBook = new AudioBook("Java","1999",
                "Madam Bob",4.5,3.21,"Jonah Brown");
        System.out.println(audioBook);

        System.out.println();

        PrintBook printBook = new PrintBook("Python","2019",
                "Hannah Bonn","Oxford Publishers","17689");
        System.out.println(printBook);
    }
}
