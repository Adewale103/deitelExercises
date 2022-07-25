package chapterFourteen;

public class ThreeLetterStringsFromFiveLetterWords {
    public static void main(String[] args) {
       String name = "Demola";
       printAllPossibleThreeLetteredStrings(name);
    }

    public static void printAllPossibleThreeLetteredStrings(String word){
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < word.length(); k++) {
                    if(i==j || j==k || i==k)continue;
                    System.out.println(String.valueOf(word.charAt(i)) + String.valueOf(word.charAt(j))+String.valueOf(word.charAt(k)));
                }
            }
        }
    }

}
