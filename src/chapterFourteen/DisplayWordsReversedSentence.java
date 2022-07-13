package chapterFourteen;

public class DisplayWordsReversedSentence {
    public static void main(String[] args) {
        String text = "Money na good thing";
        displayWordsReversedSentence(text);
    }
    public static void displayWordsReversedSentence(String sentence){
        StringBuilder builder = new StringBuilder();
        String[] token = sentence.split(" ");
        for (int i = token.length-1; i >= 0; i--) {
            builder.append(token[i]).append(" ");
        }
        System.out.println(builder);
    }
}
