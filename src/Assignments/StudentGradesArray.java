package Assignments;

import java.util.Scanner;

public class StudentGradesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students ");
        int studentsNumber = input.nextInt();

        System.out.println("Enter the number of subjects ");
        int subjectsNumber = input.nextInt();

        int[][] array = new int[studentsNumber][subjectsNumber];
        int[][] total= new int[studentsNumber][1];
        double[][] average= new double[studentsNumber][1];


        for (int i = 0; i < studentsNumber; i++) {
            for (int a = 0; a < subjectsNumber; a++) {
                System.out.printf("Enter grade of student %d for subject %d%n", i + 1, 1 + a);
                int grade = input.nextInt();
                array[i][a] = grade;
            }
        }
        System.out.print("           course1");
        for (int i = 1; i < subjectsNumber; i++) {
            System.out.print("   course"+ (i+1));
        }
        System.out.printf("%8s","total");
        System.out.printf("%10s","average");
        System.out.println();
        int sum;
        for (int i = 0; i < studentsNumber; i++) {
            sum = 0;
            for (int a = 0; a < subjectsNumber; a++) {
                sum = sum + array[i][a];
            }
            total[i][0] = sum;
            average[i][0] = ((sum + 0.0)/subjectsNumber);
        }

        for (int i = 0; i < studentsNumber; i++) {
            System.out.print("student"+(i+1)+".    ");
            for (int a = 0; a < subjectsNumber; a++) {
                System.out.print(array[i][a] + "        ");
            }
            for (int a = 0; a < 1; a++) {
                System.out.print(total[i][a] + "     ");
            }
            for (int a = 0; a < 1; a++) {
                System.out.printf("%.2f",average[i][a]);
                System.out.print(" ".repeat(4));
            }

            System.out.println();
        }
    }
}