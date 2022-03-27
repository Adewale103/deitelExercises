package Assignments;
import java.util.Random;
import java.util.Scanner;

public class MathematicalQuiz {
   static int correctAnswerCount = 0;
   static int wrongAnswerCount = 0;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int counter = 1;

        while(counter<=10){
            int operator = random.nextInt(1,6);
            int firstRandomNumber = random.nextInt(100);
            int secondRandomNumber = random.nextInt(100);
            switch (operator) {
                case 1 -> {

                    System.out.println(firstRandomNumber + " * " + secondRandomNumber + " =");
                    administerQuiz(input.nextInt(),firstRandomNumber,secondRandomNumber,"*");
                }
                case 2 -> {

                    System.out.println(firstRandomNumber + " / " + secondRandomNumber + " =");
                    administerQuiz(input.nextInt(),firstRandomNumber,secondRandomNumber,"/");
                }

                case 3 -> {
                    System.out.println(firstRandomNumber + " + " + secondRandomNumber + " =");
                    administerQuiz(input.nextInt(),firstRandomNumber,secondRandomNumber,"+");
                }

                case 4 -> {
                    System.out.println(firstRandomNumber + " - " + secondRandomNumber + " =");
                    administerQuiz(input.nextInt(),firstRandomNumber,secondRandomNumber,"-");
                }

                case 5 -> {
                    System.out.println(firstRandomNumber + " % " + secondRandomNumber + " =");
                    administerQuiz(input.nextInt(),firstRandomNumber,secondRandomNumber,"%");
                }

            }
          counter++;
        }
        System.out.printf("You got %d right%n",correctAnswerCount);
        System.out.printf("You got %d wrong%n",wrongAnswerCount);
        System.out.printf("Your adjusted score is %d/10",correctAnswerCount-wrongAnswerCount);

    }
    public static void administerQuiz(int userInput,int firstRandomNumber, int secondRandomNumber, String operator){
        int correctAnswer = 0;
        if (operator =="+"){
            correctAnswer = firstRandomNumber + secondRandomNumber;
        }
        else if (operator == "-"){
            correctAnswer = firstRandomNumber - secondRandomNumber;
        }
        else if (operator == "*"){
            correctAnswer = firstRandomNumber * secondRandomNumber;
        }
        else if (operator == "/"){
            correctAnswer = firstRandomNumber / secondRandomNumber;
        }
        else if (operator == "%"){
            correctAnswer = firstRandomNumber % secondRandomNumber;
        }

        if (userInput == correctAnswer) correctAnswerCount++;
        else {
            wrongAnswerCount++;
            System.out.println(" ");
        }
    }
}
