package Assignments;
import java.util.Random;
import java.util.Scanner;

public class MathematicalQuiz {
    static int correctAnswerCount = 0;
    static int wrongAnswerCount = 0;

    public static void main(String[] args) {
        takeTest();
        showResults();
    }


    public static void operatorSwitch(int userInput, int firstRandomNumber, int secondRandomNumber, String operator) {
        int correctAnswer = switch (operator) {
            case "+" -> firstRandomNumber + secondRandomNumber;
            case "-" -> firstRandomNumber - secondRandomNumber;
            case "*" -> firstRandomNumber * secondRandomNumber;
            case "/" -> firstRandomNumber / secondRandomNumber;
            case "%" -> firstRandomNumber % secondRandomNumber;
            default -> 0;
        };
        if (userInput == correctAnswer) correctAnswerCount++;
        else {
            wrongAnswerCount++;
            System.out.println(" ");
        }
    }
    public static void takeTest() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int counter = 1;
        while (counter <= 10) {
            int operator = random.nextInt(1, 6);
            int firstRandomNumber = random.nextInt(100);
            int secondRandomNumber = random.nextInt(100);
            switch (operator) {
                case 1 -> {
                    System.out.println(firstRandomNumber + " * " + secondRandomNumber + " =");
                    operatorSwitch(input.nextInt(), firstRandomNumber, secondRandomNumber, "*");
                }
                case 2 -> {
                    System.out.println(firstRandomNumber + " / " + secondRandomNumber + " =");
                    operatorSwitch(input.nextInt(), firstRandomNumber, secondRandomNumber, "/");
                }
                case 3 -> {
                    System.out.println(firstRandomNumber + " + " + secondRandomNumber + " =");
                    operatorSwitch(input.nextInt(), firstRandomNumber, secondRandomNumber, "+");
                }
                case 4 -> {
                    System.out.println(firstRandomNumber + " - " + secondRandomNumber + " =");
                    operatorSwitch(input.nextInt(), firstRandomNumber, secondRandomNumber, "-");
                }
                case 5 -> {
                    System.out.println(firstRandomNumber + " % " + secondRandomNumber + " =");
                    operatorSwitch(input.nextInt(), firstRandomNumber, secondRandomNumber, "%");
                }
            }
            counter++;
        }
    }
    public static void showResults() {
        System.out.printf("You got %d right%n", correctAnswerCount);
        System.out.printf("You got %d wrong%n", wrongAnswerCount);
        System.out.printf("Your adjusted score is %d/10", correctAnswerCount - wrongAnswerCount);
    }
}

