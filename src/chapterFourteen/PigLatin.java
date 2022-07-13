package chapterFourteen;

import java.util.Scanner;

public class PigLatin {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter sentence to convert to pig latin: ");
        String input = scanner.nextLine();

        printLatinWord(input);

    }
    public static void printLatinWord(String sentence){
        String[] token = sentence.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < token.length; i++) {
            token[i] = token[i].substring(1).concat(
                    String.valueOf(token[i].charAt(0)).toLowerCase().concat("ay"));
            builder.append(token[i]).append(" ");
        }
        System.out.println(builder);
    }
}
