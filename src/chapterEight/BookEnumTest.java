package chapterEight;

import java.util.EnumSet;

public class BookEnumTest {
    public static void main(String[] args) {
        System.out.println("Book: ");
       for(Book book : Book.values()){
           System.out.printf("%-10s%-25s%s%n",book,book.getTitle(),book.getCopyRightYear());
       }
        System.out.println();
        System.out.println();

       for(Book book : EnumSet.range(Book.YUNGV,Book.MGJBH)){
           System.out.printf("%-10s%-25s%s%n",book,book.getTitle(),book.getCopyRightYear());
       }
    }

}
