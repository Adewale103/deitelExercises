package chapterFourteen;

import java.util.Scanner;

public class ManipulatingStrings {
    private static String[] list = new String[10];
    private static int count;
    private  static StringBuilder goodStrings = new StringBuilder();
    private  static StringBuilder badStrings = new StringBuilder();
    private static int notDigitOrLetterCount;
    private static int digitOrLetterCount;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        collectInput();
        manipulateString();
        printString();


    }
    private static void collectInput(){
        System.out.println("""
                Enter a list of strings, press key 'ENTER' after each entry!
                The maximum number of input you can enter is 10!
                if less than 10, press # to end entry.
                """);
        String input = scanner.nextLine();
        while(!input.equals("#")){
            if(input.length() >= 2){
                list[count] = String.valueOf(input.charAt(0)).toUpperCase()+ input.substring(1).toLowerCase();
            }
            else{
                list[count] = input.toUpperCase();
            }
            count++;
            if(count == 10){
                break;
            }
            input = scanner.nextLine();
        }
    }
    private static void manipulateString() {
        int count;
        for (int i = 0; i < list.length; i++) {
            count = 0;
            if (!(list[i] == null)) {
                for (int j = 0; j < list[i].length(); j++) {
                    if (Character.isLetterOrDigit(list[i].charAt(j))) {
                        count++;
                    }
                }
                    if (count == list[i].length()) {
                        goodStrings.append(list[i]).append(" ");
                        digitOrLetterCount++;
                    } else {
                        badStrings.append(list[i]).append(" ");
                        notDigitOrLetterCount++;
                    }
            }

        }
    }
    public static void printString(){
        System.out.println("Strings with special characters: "+badStrings.toString());
        System.out.println("count of strings with special characters: "+notDigitOrLetterCount);
        System.out.println("Strings without special characters: "+goodStrings.toString());
        System.out.println("count of strings without special characters: "+digitOrLetterCount);

    }

}
