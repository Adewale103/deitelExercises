package chapterFourteen;

import java.util.Arrays;

public class LongestWordInASentence {
    public static void main(String[] args) {
     String sentence = " Money is a good thing sha and that's very true";
        System.out.println(longestWord(sentence));
    }
    public static String longestWord(String sentence){
        int largestLength = 0;
        int largestIndex = 0;
     String[] token = sentence.split(" ");
        for (int i = 0; i < token.length; i++) {
           if(token[i].length() > largestLength){
               largestLength = token[i].length();
               largestIndex = i;
           }
        }
        return token[largestIndex];
    }
}
