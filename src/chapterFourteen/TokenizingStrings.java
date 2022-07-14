package chapterFourteen;

import java.util.Scanner;

public class TokenizingStrings {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence.");
        String sentence = scanner.nextLine();
        tokenizeString(sentence);
    }
    public static void tokenizeString(String sentence){
        String[] token = sentence.split(" ");
        for (int i = 0; i < token.length; i++) {
            if(Character.isUpperCase(token[i].charAt(0))){
                System.out.println(token[i]);
            }
        }
    }
}
