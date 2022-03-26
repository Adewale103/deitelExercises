package Assignments;
import java.util.Random;
import java.util.Scanner;

public class MathematicalQuiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int correctAnswerCount = 0;
        int wrongAnswerCount = 0;
        int counter = 1;

        while(counter<=10){
            int operator = random.nextInt(1,6);
            int firstRandomNumber = random.nextInt(100);
            int secondRandomNumber = random.nextInt(100);
            switch (operator) {
                case 1 -> {
                    System.out.println(firstRandomNumber + " * " + secondRandomNumber + " =");
                    int correctAnswer = firstRandomNumber * secondRandomNumber;
                    int userAnswer = input.nextInt();
                    if (userAnswer == correctAnswer) correctAnswerCount++;
                    else {
                        wrongAnswerCount += 1;
                        System.out.println(" ");
                    }
                }
                //System.out.println("Incorrect, the right answer is "+correctAnswer);}
                case 2 -> {
                    System.out.println(firstRandomNumber + " / " + secondRandomNumber + " =");
                    int correctAnswer2 = firstRandomNumber / secondRandomNumber;
                    int userAnswer2 = input.nextInt();
                    if (userAnswer2 == correctAnswer2) correctAnswerCount++;
                    else {
                        wrongAnswerCount--;
                        System.out.println(" ");
                    }
                }
                //System.out.println("Incorrect, the right answer is "+correctAnswer2);}
                case 3 -> {
                    System.out.println(firstRandomNumber + " + " + secondRandomNumber + " =");
                    int correctAnswer3 = firstRandomNumber + secondRandomNumber;
                    int userAnswer3 = input.nextInt();
                    if (userAnswer3 == correctAnswer3) correctAnswerCount++;
                    else {
                        wrongAnswerCount = wrongAnswerCount + 1;
                        System.out.println(" ");
                    }
                }
                //System.out.println("Incorrect, the right answer is "+correctAnswer3);}
                case 4 -> {
                    System.out.println(firstRandomNumber + " - " + secondRandomNumber + " =");
                    int correctAnswer4 = firstRandomNumber - secondRandomNumber;
                    int userAnswer4 = input.nextInt();
                    if (userAnswer4 == correctAnswer4) correctAnswerCount = correctAnswerCount + 1;
                    else {
                        wrongAnswerCount = wrongAnswerCount + 1;
                        System.out.println(" ");
                    }
                }
                //System.out.println("Incorrect, the right answer is "+correctAnswer4);}
                case 5 -> {
                    System.out.println(firstRandomNumber + " % " + secondRandomNumber + " =");
                    int correctAnswer5 = firstRandomNumber % secondRandomNumber;
                    int userAnswer5 = input.nextInt();
                    if (userAnswer5 == correctAnswer5) correctAnswerCount = correctAnswerCount + 1;
                    else {
                        wrongAnswerCount = wrongAnswerCount + 1;
                        System.out.println(" ");
                    }
                }
                //System.out.println("Incorrect, the right answer is "+correctAnswer5);}
            }
          counter++;
        }
        System.out.printf("You got %d right",correctAnswerCount);
        System.out.printf("You got %d wrong",wrongAnswerCount);
        System.out.printf("Your adjusted score is %d/10",correctAnswerCount-wrongAnswerCount);

    }
}
