package chapterFourteen;

import java.util.Scanner;

public class TokenizingAndComparingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence.");
        String sentence = scanner.nextLine();
        tokenizeAndCompare(sentence);
    }
    public static void tokenizeAndCompare(String sentence){
        String[] token = sentence.split(" ");
        for (int i = 0; i < token.length; i++) {
            if(token[i].endsWith("ED")){
                System.out.println(token[i]);
            }
        }
    }
}
