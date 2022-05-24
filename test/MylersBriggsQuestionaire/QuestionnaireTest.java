package MylersBriggsQuestionaire;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuestionnaireTest {
    private Questionnaire questionnaire;
    @BeforeEach
    public void setUp(){
        questionnaire = new Questionnaire();
    }
    @Test
    public void questionnaireCanBeCreatedTest(){
        assertNotNull(questionnaire);
    }

    @Test
    public void questionCanBeLoadedTest(){
        questionnaire.loadQuestion("A.-> expend energy, enjoy groups  B.-> conserve energy, enjoy one-on-one");
        assertEquals(1,questionnaire.getQuestionSize());
    }
    @Test
    public void multipleQuestionsCanBeLoadedTest(){
        questionnaire.loadQuestion("A.-> expend energy, enjoy groups  B.-> conserve energy, enjoy one-on-one");
        questionnaire.loadQuestion("A.-> interpret literally B.-> look ");
        assertEquals(2,questionnaire.getQuestionSize());
    }
    @Test
    public void questionCanBeServedTest(){
        questionnaire.loadQuestion("A.-> expend energy, enjoy groups  B.-> conserve energy, enjoy one-on-one");
        questionnaire.loadQuestion("A.-> interpret literally B.-> look ");
        assertEquals("A.-> expend energy, enjoy groups  B.-> conserve energy, enjoy one-on-one",questionnaire.serveQuestion(1));
    }

    @Test
    public void multipleQuestionCanBeServedTest(){
        questionnaire.loadQuestion("A.-> expend energy, enjoy groups  B.-> conserve energy, enjoy one-on-one");
        questionnaire.loadQuestion("A.-> interpret literally B.-> look ");
        assertEquals("A.-> expend energy, enjoy groups  B.-> conserve energy, enjoy one-on-one",questionnaire.serveQuestion(1));
        assertEquals("A.-> interpret literally B.-> look ",questionnaire.serveQuestion(2));
    }

    @Test
    public void answerToQuestionCanBeCollectedTest(){
        questionnaire.loadQuestion("A.-> expend energy, enjoy groups  B.-> conserve energy, enjoy one-on-one");
        questionnaire.collectAnswer("A",1);
        assertEquals("A",questionnaire.getAnswer(1));
    }

    @Test
    public void questionCanBeMarkedTest(){
        questionnaire.loadQuestion("A.-> expend energy, enjoy groups  B.-> conserve energy, enjoy one-on-one");
        questionnaire.collectAnswer("A",1);

        questionnaire.loadQuestion("A.interpret literally B.-> look ");
        questionnaire.collectAnswer("B",2);

        questionnaire.loadQuestion("A.-> logical, thinking, questioning B.-> empathetic, feeling, accommodating ");
        questionnaire.collectAnswer("A",3);

        questionnaire.loadQuestion("A.-> organised, orderly B.-> flexible, adaptable ");
        questionnaire.collectAnswer("B",4);

        questionnaire.markQuestion();
        assertEquals("Extrovert Intuitive Thinker Perceiver ",questionnaire.showResult());
    }

    @Test
    public void resultCanBeShownTest(){
        questionnaire.loadQuestion("A.-> expend energy, enjoy groups  B.-> conserve energy, enjoy one-on-one");
        questionnaire.collectAnswer("B",1);

        questionnaire.loadQuestion("A.interpret literally B.-> look ");
        questionnaire.collectAnswer("A",2);

        questionnaire.loadQuestion("A.-> logical, thinking, questioning B.-> empathetic, feeling, accommodating ");
        questionnaire.collectAnswer("A",3);

        questionnaire.loadQuestion("A.-> organised, orderly B.-> flexible, adaptable ");
        questionnaire.collectAnswer("B",4);

        questionnaire.loadQuestion("A.-> more outgoing, think out loud B.-> more reserved, think to yourself ");
        questionnaire.collectAnswer("B",5);

        questionnaire.loadQuestion("A.-> practical, realistic, experimental B.-> imaginative, innovative, theoretical ");
        questionnaire.collectAnswer("A",6);

        questionnaire.loadQuestion("A.-> candid, straight forward, frank B.-> tactful, kind, encouraging ");
        questionnaire.collectAnswer("A",7);

        questionnaire.loadQuestion("A.-> plan, schedule B.-> unplanned, spontaneous ");
        questionnaire.collectAnswer("B",8);

        questionnaire.markQuestion();
        assertEquals("Introvert Sensor Thinker Perceiver ",questionnaire.showResult());
    }
}
