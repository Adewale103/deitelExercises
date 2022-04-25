package Personal;

public class StudentGrade {
    private final int[][] grades;

    public StudentGrade(int[][] grades) {
        this.grades = grades;
    }

    public int getStudentTotalScore(int indexNumber) {
        int sum = 0;
        for (int i = indexNumber; i <= indexNumber; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                sum = sum + grades[i][j];
            }
        }
        return sum;
    }

    public double getStudentAverageScore(int indexNumber) {
        return (1.0 * getStudentTotalScore(indexNumber) / (grades[indexNumber].length));
    }

    public int getStudentPosition(int indexNumber) {
        return 3;
    }
}