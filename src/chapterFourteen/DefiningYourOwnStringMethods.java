package chapterFourteen;

public class DefiningYourOwnStringMethods {
    public static void main(String[] args) {
        String string = "Banana";
        System.out.println(indexOf(string,'a'));
        System.out.println(lastIndexOf(string,'a'));

    }
    public static int indexOf(String theString, char value){
        for (int i = 0; i < theString.length(); i++) {
            if(theString.charAt(i) == value){
                return  i;
            }
        }
        throw new NullPointerException("character not found");
    }

    public static int lastIndexOf(String theString, char value){
        for (int i = theString.length()-1; i >= 0; i--) {
            if(theString.charAt(i) == value){
                return  i;
            }
        }
        throw new NullPointerException("character not found");
    }
}
