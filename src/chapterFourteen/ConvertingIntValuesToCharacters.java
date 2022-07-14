package chapterFourteen;

import java.util.Scanner;

public class ConvertingIntValuesToCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any int value to get the character value: ");
        int value = scanner.nextInt();
        convert(value);
        printAllChars();
    }
    public static void convert(int value){
        System.out.println((char)value);
    }

    public static void printAllChars(){
        for (int i = 0; i < 255; i++) {
            System.out.println((char)i);
        }
    }
}
