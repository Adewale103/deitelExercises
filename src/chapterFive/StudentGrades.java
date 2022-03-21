package chapterFive;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter your name; ");
            String name = input.nextLine();
            System.out.println("Enter your grade; ");
            String grade = input.nextLine();
            switch (grade) {
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "C":
                    countC++;
                    break;
                case "D":
                    countD++;
                    break;
                default:
                    System.out.println("The Grade you entered is incorrect");
            }
        }
        System.out.println("A "+countA);
        System.out.println("B "+countB);
        System.out.println("C "+countC);
        System.out.println("D "+countD);
        }

    }


