package tddClass;

public class diceGame {
    private int points;
    private String status;
    private int count;

    public int getPoints() {
        return points;
    }

    public String getStatus() {
        return status;
    }

    public void rollDice(int dice1, int dice2) {
        if ((dice1 + dice2 == 7) || (dice1 + dice2 == 11)) {
            status = "win";
        } else if ((dice1 + dice2 == 2) || (dice1 + dice2 == 3) || (dice1 + dice2 == 12)) {
            status = "lose";
        } else if ((dice1 + dice2 == 4) || (dice1 + dice2 == 5) || (dice1 + dice2 == 6) || (dice1 + dice2 == 8) || (dice1 + dice2 == 9) || (dice1 + dice2 == 10)) {
            points = dice1 + dice2;
            subsequentRollTest(dice1,dice2);

        }
    }
    public void subsequentRollTest(int dice1, int dice2) {
        while (count != -1) {
            if (dice1 + dice2 == points) {
                status = "win";
                break;
            } else if (dice1 + dice2 == 7) {
                status = "lose";
                break;
            }
            else status = "try again";
            count++;
        } }
}
