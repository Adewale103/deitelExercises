package chapterSeventeen;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateWordRemoval {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine().toLowerCase();

        String[] elements = sentence.split(" ");

        List<String> result = Stream.of(elements)
                .sorted()
                .distinct().toList();

        System.out.println(result);




    }
}
