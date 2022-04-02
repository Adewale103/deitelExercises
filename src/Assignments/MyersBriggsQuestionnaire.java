package Assignments;
import java.util.Scanner;

public class MyersBriggsQuestionnaire {
    static Scanner input = new Scanner(System.in);
    static int countA1 = 0;
    static int countA2 = 0;
    static int countA3 = 0;
    static int countA4 = 0;
    static int countB1 = 0;
    static int countB2 = 0;
    static int countB3 = 0;
    static int countB4 = 0;
    static String EI = " ";
    static String SN = " ";
    static String TF = " ";
    static String JP = " ";

    public static void main(String[] args) {
        System.out.println("Welcome, kindly enter either of option A and B for each question");
        System.out.println();
        int counter = 1;
        for (; counter <= 20; counter++) {
            switch (counter) {
                case 1 -> Question1();
                case 2 -> Question2();
                case 3 -> Question3();
                case 4 -> Question4();
                case 5 -> Question5();
                case 6 -> Question6();
                case 7 -> Question7();
                case 8 -> Question8();
                case 9 -> Question9();
                case 10 -> Question10();
                case 11 -> Question11();
                case 12 -> Question12();
                case 13 -> Question13();
                case 14 -> Question14();
                case 15 -> Question15();
                case 16 -> Question16();
                case 17 -> Question17();
                case 18 -> Question18();
                case 19 -> Question19();
                case 20 -> Question20();
            }
        }
        if (countA1 > countB1) {
            EI = "Extrovert";
        } else EI = "Introvert";

        if (countA2 > countB2) {
            SN = "Sensor";
        } else SN = "Intuitive";

        if (countA3 > countB3) {
            TF = "Thinker";
        } else TF = "Feeler";

        if (countA4 > countB4) {
            JP = "Judger";
        } else JP = "Perceiver";
        System.out.printf("%s | %s | %s | %s |", EI, SN, TF, JP);
    }

    public static void Question1() {
        System.out.println("""
                (1)
                A.-> expend energy, enjoy groups
                B.-> conserve energy, enjoy one-on-one""");
        String option1 = input.nextLine().toUpperCase();
        if (option1.equals("A")) {
            countA1 += 1;
        } else if (option1.equals("B")) {
            countB1 += 1;
        } else Question1();
    }

    public static void Question2() {
        System.out.println("""
                (2)
                A.-> interpret literally
                B.-> look for meaning and possibilities""");
        String option2 = input.nextLine().toUpperCase();
        if (option2.equals("A")) {
            countA2 += 1;
        } else if (option2.equals("B")) {
            countB2 += 1;
        } else Question2();
    }

    public static void Question3() {
        System.out.println("""
                (3)
                A.-> logical,thinking,questioning
                B.-> empathetic,feeling,accommodating""");
        String option3 = input.nextLine().toUpperCase();
        if (option3.equals("A")) {
            countA3 += 1;
        } else if (option3.equals("B")) {
            countB3 += 1;
        } else Question3();
    }

    public static void Question4() {
        System.out.println("""
                (4)
                A.-> organised, orderly
                B.-> flexible, adaptable""");
        String option4 = input.nextLine().toUpperCase();
        if (option4.equals("A")) {
            countA4 += 1;
        } else if (option4.equals("B")) {
            countB4 += 1;
        } else Question4();
    }

    public static void Question5() {
        System.out.println("""
                (5)
                A.-> more outgoing, think out loud
                B.-> more reserved, think to yourself""");
        String option5 = input.nextLine().toUpperCase();
        if (option5.equals("A")) {
            countA1 += 1;
        } else if (option5.equals("B")) {
            countB1 += 1;
        } else Question5();
    }

    public static void Question6() {
        System.out.println("""
                (6)
                A.-> practical, realistic, experimental
                B.-> imaginative, innovative, theoretical""");
        String option6 = input.nextLine().toUpperCase();
        if (option6.equals("A")) {
            countA2 += 1;
        } else if (option6.equals("B")) {
            countB2 += 1;
        } else Question6();
    }

    public static void Question7() {
        System.out.println("""
                (7)
                A.-> candid, straight forward, frank
                B.-> tactful, kind, encouraging""");
        String option7 = input.nextLine().toUpperCase();
        if (option7.equals("A")) {
            countA3 += 1;
        } else if (option7.equals("B")) {
            countB3 += 1;
        } else Question7();
    }

    public static void Question8() {
        System.out.println("""
                (8)
                A.-> plan, schedule
                B.-> unplanned, spontaneous""");
        String option8 = input.nextLine().toUpperCase();
        if (option8.equals("A")) {
            countA4 += 1;
        } else if (option8.equals("B")) {
            countB4 += 1;
        } else Question8();
    }

    public static void Question9() {
        System.out.println("""
                (9)
                A.-> seek many tasks, public activities, interaction with others
                B.-> seek private, solitary activities with quiet to concentrate""");
        String option9 = input.nextLine().toUpperCase();
        if (option9.equals("A")) {
            countA1 += 1;
        } else if (option9.equals("B")) {
            countB1 += 1;
        } else Question9();
    }

    public static void Question10() {
        System.out.println("""
                (10)
                A.-> standard, usual, conventional
                B.-> different, novel, unique""");
        String option10 = input.nextLine().toUpperCase();
        if (option10.equals("A")) {
            countA2 += 1;
        } else if (option10.equals("B")) {
            countB2 += 1;
        } else Question10();
    }

    public static void Question11() {
        System.out.println("""
                (11)
                A.-> firm, tend to criticize, hold the line
                B.-> gentle, tend to appreciate, conciliate""");
        String option11 = input.nextLine().toUpperCase();
        if (option11.equals("A")) {
            countA3 += 1;
        } else if (option11.equals("B")) {
            countB3 += 1;
        } else Question11();
    }

    public static void Question12() {
        System.out.println("""
                (12)
                A.-> regulated,structured
                B.-> easygoing, live and let live""");
        String option12 = input.nextLine().toUpperCase();
        if (option12.equals("A")) {
            countA4 += 1;
        } else if
        (option12.equals("B")) {
            countB4 += 1;
        } else Question12();
    }
    public static void Question13(){
        System.out.println("""
                            (13)
                            A.-> external, communicative, express yourself
                            B.-> internal, reticent,keep to yourself""");
        String option13 = input.nextLine().toUpperCase();
        if (option13.equals("A")) {
            countA1 += 1;
        } else if (option13.equals("B")) {
            countB1 += 1;
        } else Question13();}
    public static void Question14(){
        System.out.println("""
                            (14)
                            A.-> focus on here-and-now
                            B.-> look to the future, global perspective, big-picture""");
        String option14 = input.nextLine().toUpperCase();
        if (option14.equals("A")) {
            countA2 += 1;
        } else if (option14.equals("B")) {
            countB2 += 1;
        } else Question14();}
    public static void Question15(){
        System.out.println("""
                            (15)
                            A.-> tough-minded,just
                            B.-> tender-hearted, merciful""");
        String option15 = input.nextLine().toUpperCase();
        if (option15.equals("A")) {
            countA3 += 1;
        } else if (option15.equals("B")) {
            countB3 += 1;
        } else Question15();}
    public static void Question16(){
        System.out.println("""
                            (16)
                            A.-> preparation, plan ahead
                            B.-> go with the flow, adapt as you go""");
        String option16 = input.nextLine().toUpperCase();
        if (option16.equals("A")) {
            countA4 += 1;
        } else if (option16.equals("B")) {
            countB4 += 1;
        } else Question16();}
    public static void Question17(){
        System.out.println("""
                            (17)
                            A.-> active, initiate
                            B.-> reflective, deliberate""");
        String option17 = input.nextLine().toUpperCase();
        if (option17.equals("A")) {
            countA1 += 1;
        } else if (option17.equals("B")) {
            countB1 += 1;
        } else Question17();}
    public static void Question18(){
        System.out.println("""
                            (18)
                            A.-> facts, things, what-is
                            B.-> ideas, dreams, what-could-be, philosophical""");
        String option18 = input.nextLine().toUpperCase();
        if (option18.equals("A")) {
            countA2 += 1;
        } else if (option18.equals("B")) {
            countB2 += 1;
        } else Question18();}
    public static void Question19(){
        System.out.println("""
                            (19)
                            A.-> matter of fact, issue-oriented
                            B.-> sensitive, people-oriented, compassionate""");
        String option19 = input.nextLine().toUpperCase();
        if (option19.equals("A")) {
            countA3 += 1;
        } else if (option19.equals("B")) {
            countB3 += 1;
        } else Question19();}
    public static void Question20(){
        System.out.println("""
                            (20)
                            A.-> control,govern
                            B.-> latitude, freedom""");
        String option20 = input.nextLine().toUpperCase();
        if (option20.equals("A")) {
            countA4 += 1;
        } else if (option20.equals("B")) {
            countB4 += 1;
        } else Question20();}
}