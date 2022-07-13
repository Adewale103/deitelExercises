package chapterFourteen;

import java.util.Scanner;

public class ComparingPortionsOfStrings {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the first String: ");
        String firstInput = scanner.nextLine();

        System.out.println("Enter the second String: ");
        String secondInput = scanner.nextLine();

        if(comparingPortionsOfStrings(firstInput,secondInput)){
            System.out.println("The compared characters are equal");
        }
        else{
            System.out.println("The compared characters are not equal");
        }

    }
    public static boolean comparingPortionsOfStrings(String word, String secondWord){
       return word.regionMatches(true,0,secondWord,4,4);
    }
}
