package Personal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentGradeTest {
    private StudentGrade report;
    @BeforeEach
    public void startWithThis(){
        int[][] grades = {{4, 5, 6, 3}, {40, 40, 20}, {10, 50, 70}};
        report = new StudentGrade(grades);
    }
    @Test
    public void canGetStudentSumTest(){
        assertEquals(18,report.getStudentTotalScore(0));
        assertEquals(100,report.getStudentTotalScore(1));
    }

    @Test
    public void canGetStudentAverageTest(){
        assertEquals(4.5,report.getStudentAverageScore(0));
    }

    @Test
    public void canGetStudentPositionTest(){
        assertEquals(3,report.getStudentPosition(0));
    }
}
