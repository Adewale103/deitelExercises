package Assignments;
import java.util.Scanner;

public class MyersBriggsQuestionnaire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countA1 = 0;
        int countA2 = 0;
        int countA3 = 0;
        int countA4 = 0;
        int countB1 = 0;
        int countB2 = 0;
        int countB3 = 0;
        int countB4 = 0;
        String EI = " ";
        String SN = " ";
        String TF = " ";
        String JP = " ";

        System.out.println("Welcome, kindly enter either of option A and B for each question");
        System.out.println();
        int counter = 1;
        for (; counter <= 20; counter++) {
            switch (counter) {
                case 1:
                System.out.println("""
                        (1)
                        A.-> expend energy, enjoy groups
                        B.-> conserve energy, enjoy one-on-one""");
                String option1 = input.nextLine();
                if(option1.equals("A")){countA1+=1;} else if (option1.equals("B")){countB1+=1;}
                break;
                case 2:
                System.out.println("""
                        (2)
                        A.-> interpret literally
                        B.-> look for meaning and possibilities""");
                String option2 = input.nextLine();
                    if(option2.equals("A")){countA2+=1;}else if (option2.equals("B")){countB2+=1;}
                    break;
                case 3:
                System.out.println("""
                        (3)
                        A.-> logical,thinking,questioning
                        B.-> empathetic,feeling,accommodating""");
                String option3 = input.nextLine();
                    if(option3.equals("A")){countA3+=1;}else if (option3.equals("B")){countB3+=1;}
                    break;
                case 4:
                System.out.println("""
                        (4)
                        A.-> organised, orderly
                        B.-> flexible, adaptable""");
                String option4 = input.nextLine();
                    if(option4.equals("A")){countA4+=1;}else if (option4.equals("B")){countB4+=1;}
                    break;
                case 5:
                System.out.println("""
                        (5)
                        A.-> more outgoing, think out loud
                        B.-> more reserved, think to yourself""");
                String option5 = input.nextLine();
                    if(option5.equals("A")){countA1+=1;}else if (option5.equals("B")){countB1+=1;}
                    break;
                case 6:
                System.out.println("""
                        (6)
                        A.-> practical, realistic, experimental
                        B.-> imaginative, innovative, theoretical""");
                String option6 = input.nextLine();
                    if(option6.equals("A")){countA2+=1;}else if (option6.equals("B")){countB2+=1;}
                    break;
                case 7:
                System.out.println("""
                        (7)
                        A.-> candid, straight forward, frank
                        B.-> tactful, kind, encouraging""");
                String option7 = input.nextLine();
                    if(option7.equals("A")){countA3+=1;}else if (option7.equals("B")){countB3+=1;}
                    break;
                case 8:
                System.out.println("""
                        (8)
                        A.-> plan, schedule
                        B.-> unplanned, spontaneous""");
                String option8 = input.nextLine();
                    if(option8.equals("A")){countA4+=1;}else if (option8.equals("B")){countB4+=1;}
                    break;
                case 9:
                System.out.println("""
                        (9)
                        A.-> seek many tasks, public activities, interaction with others
                        B.-> seek private, solitary activities with quiet to concentrate""");
                String option9 = input.nextLine();
                    if(option9.equals("A")){countA1+=1;}else if (option9.equals("B")){countB1+=1;}
                    break;
                case 10:
                System.out.println("""
                        (10)
                        A.-> standard, usual, conventional
                        B.-> different, novel, unique""");
                String option10 = input.nextLine();
                    if(option10.equals("A")){countA2+=1;}else if (option10.equals("B")){countB2+=1;}
                    break;
                case 11:
                System.out.println("""
                        (11)
                        A.-> firm, tend to criticize, hold the line
                        B.-> gentle, tend to appreciate, conciliate""");
                String option11 = input.nextLine();
                    if(option11.equals("A")){countA3+=1;}else if (option11.equals("B")){countB3+=1;}
                    break;
                case 12:
                System.out.println("""
                        (12)
                        A.-> regulated,structured
                        B.-> easygoing, live and let live""");
                String option12 = input.nextLine();
                    if(option12 == "A"){countA4+=1;}else if
                        (option12=="B")
                { countB4+=1;}
                    break;
                case 13:
                System.out.println("""
                        (13)
                        A.-> external, communicative, express yourself
                        B.-> internal, reticent,keep to yourself""");
                String option13 = input.nextLine();
                    if(option13.equals("A")){countA1+=1;}else if (option13.equals("B")){countB1+=1;}
                    break;
                case 14:
                System.out.println("""
                        (14)
                        A.-> focus on here-and-now
                        B.-> look to the future, global perspective, big-picture""");
                String option14 = input.nextLine();
                    if(option14.equals("A")){countA2+=1;}else if (option14.equals("B")){countB2+=1;}
                    break;
                case 15:
                System.out.println("""
                        (15)
                        A.-> tough-minded,just
                        B.-> tender-hearted, merciful""");
                String option15 = input.nextLine();
                    if(option15.equals("A")){countA3+=1;}else if (option15.equals("B")){countB3+=1;}
                    break;
                case 16:
                System.out.println("""
                        (16)
                        A.-> preparation, plan ahead
                        B.-> go with the flow, adapt as you go""");
                String option16 = input.nextLine();
                    if(option16.equals("A")){countA4+=1;}else if (option16.equals("B")){countB4+=1;}
                    break;
                case 17:
                System.out.println("""
                        (17)
                        A.-> active, initiate
                        B.-> reflective, deliberate""");
                String option17 = input.nextLine();
                    if(option17.equals("A")){countA1+=1;}else if (option17.equals("B")){countB1+=1;}
                    break;
                case 18:
                System.out.println("""
                        (18)
                        A.-> facts, things, what-is
                        B.-> ideas, dreams, what-could-be, philosophical""");
                String option18 = input.nextLine();
                    if(option18.equals("A")){countA2+=1;}else if (option18.equals("B")){countB2+=1;}
                    break;
                case 19:
                System.out.println("""
                        (19)
                        A.-> matter of fact, issue-oriented
                        B.-> sensitive, people-oriented, compassionate""");
                String option19 = input.nextLine();
                    if(option19.equals("A")){countA3+=1;}else if (option19.equals("B")){countB3+=1;}
                    break;
                case 20:
                System.out.println("""
                        (20)
                        A.-> control,govern
                        B.-> latitude, freedom""");
                String option20 = input.nextLine();
                    if(option20.equals("A")){countA4+=1;}else if (option20.equals("B")){countB4+=1;}
                    break;
            }
        }
        System.out.println(countB1);
        if (countA1 > countB1){EI = "Extrovert";}
        else EI = "Introvert";

        if (countA2 > countB2){SN = "Sensor";}
        else SN = "Intuitive";

        if (countA3 > countB3){TF = "Thinker";}
        else TF = "Feeler";

        if (countA4 > countB4){JP = "Judger";}
        else JP = "Perceiver";
        System.out.printf("%s | %s | %s | %s |",EI,SN,TF,JP);
    }
}