package chapterFourteen;

public class Palindromes {
    public static void main(String[] args) {
        System.out.println(palindrome("Ebube"));
        System.out.println(palindrome("John"));
        System.out.println(palindrome("@123454321@"));
    }
    public static boolean palindrome(String word){
        StringBuilder reversed = new StringBuilder(word);
        return word.equalsIgnoreCase(reversed.reverse().toString());
    }
}
