package MylersBriggsQuestionaire;

import java.util.ArrayList;
import java.util.Scanner;

public class Questionnaire {
    private int countA;
    private int countB;
    private String result1;
    private String result2;
    private String result3;
    private String result4;
    private ArrayList<Question> questions = new ArrayList<>();
    private ArrayList<String> answers = new ArrayList<>();

    public void loadQuestion(String question) {
        Question question1 = new Question(question);
        questions.add(question1);
    }

    public int getQuestionSize() {
        return questions.size();
    }

    public String serveQuestion(int questionNumber) {
        return questions.get(questionNumber - 1).toString();
    }

    public void collectAnswer(String answer, int questionNumber) {
        if (answer.equalsIgnoreCase("A") || answer.equalsIgnoreCase("B")) {
            answers.add(questionNumber-1, answer.toUpperCase());
        } else {
            serveQuestion(questionNumber);
            collectAnswer(collectedInput(), questionNumber);
        }
    }

    public String collectedInput(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public String getAnswer(int questionNumber) {
        return answers.get(questionNumber-1);
    }

    public void markQuestion() {
        result1 = checkAnswersForSection(1);
        result2 = checkAnswersForSection(2);
        result3 = checkAnswersForSection(3);
        result4 = checkAnswersForSection(4);
    }

    public String showResult() {
        if (result1.equals("A")){result1 = "Extrovert";}
            else result1 = "Introvert";
        if (result2.equals("A")){result2 = "Sensor";}
            else result2 = "Intuitive";
        if (result3.equals("A")){result3 = "Thinker";}
            else result3 = "Feeler";
        if (result4.equals("A")){result4 = "Judger";}
            else result4 = "Perceiver";

        return String.format("%s %s %s %s ",result1, result2, result3, result4);
    }

    private String checkAnswersForSection(int section){
        countA = 0;
        countB = 0;
        for (int i = section-1; i < answers.size(); i+=4) {
            if (answers.get(i).equals("A")) {
                countA++;
            }
            else if (answers.get(i).equals("B")) {
                countB++;
            }
        }
        if(countA > countB){return "A";}
        return "B";
    }
}


