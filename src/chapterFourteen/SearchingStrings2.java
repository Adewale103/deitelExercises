package chapterFourteen;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SearchingStrings2{
    private static Scanner scanner = new Scanner(System.in);
    private static Set<Character> store = new HashSet<>();
    private static StringBuilder characters = new StringBuilder();
    private static StringBuilder values = new StringBuilder();

    public static void main(String[] args) {
        System.out.println("Enter a sentence..");
        String sentence = scanner.nextLine();
        computeEachCharacterFindings(sentence.toUpperCase());

    }


    public static void computeEachCharacterFindings(String sentence){
        for (int i = 0; i < sentence.length(); i++) {
            if(Character.isLetter(sentence.charAt(i))){
                store.add(Character.toUpperCase(sentence.charAt(i)));
            }
        }

        store.forEach(character -> {
            characters.append(character).append(" ");
            values.append(searchString(sentence,character)).append(" ");
        });
        System.out.println(characters);
        System.out.println(values);
    }

    public static int searchString(String sentence, char character) {
        int index = 0;
        int tempIndex;
        int count = 0;
        while (true) {
            tempIndex = index;
            index = sentence.indexOf(character, index)+1;
            if(index == tempIndex){
                break;
            }
            if(index == 0){
                break;
            }
            else{
                count++;
        }
      }
        return count;
   }
}
