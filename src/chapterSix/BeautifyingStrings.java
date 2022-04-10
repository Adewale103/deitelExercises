package chapterSix;

import java.util.Scanner;

public class BeautifyingStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String string = input.nextLine();
        checkIfFullStop(string);

    }
    public static void checkIfFullStop(String string){
        if (string.charAt(string.length()-1) != '.' ){
            string = string + '.';
            System.out.println(string);
        }
        else System.out.println(string);
    }

}
