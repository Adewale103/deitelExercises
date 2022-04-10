package Assignments;

import java.security.SecureRandom;

public class diceGameCraps2 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int points;
        int count = 0;
        int dice1 = secureRandom.nextInt(1, 7);
        int dice2 = secureRandom.nextInt(1, 7);
        System.out.println("first dice rolls " + dice1);
        System.out.println("second dice rolls " + dice2);
        if ((dice1 + dice2 == 7) || (dice1 + dice2 == 11)) {
            System.out.println("You win!");
        } else if ((dice1 + dice2 == 2) || (dice1 + dice2 == 3) || (dice1 + dice2 == 12)) {
            System.out.println("craps, You lose!");
        } else if ((dice1 + dice2 == 4) || (dice1 + dice2 == 5) || (dice1 + dice2 == 6) || (dice1 + dice2 == 8) || (dice1 + dice2 == 9) || (dice1 + dice2 == 10)) {
            points = dice1 + dice2;
            while (count != -1) {
                dice1 = secureRandom.nextInt(1, 7);
                dice2 = secureRandom.nextInt(1, 7);
                System.out.println("first dice rolls " + dice1);
                System.out.println("second dice rolls " + dice2);
                if (dice1 + dice2 == points) {
                    System.out.println("You win!");
                    break;
                } else if (dice1 + dice2 == 7) {
                    System.out.println("You lose!");
                    break;
                }
                count++;
            }
        }
    }
}
