package Assignments;

import java.security.SecureRandom;

public class diceGameCraps2 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int points;
        int count = 0;
        int a = secureRandom.nextInt(1, 7);
        int b = secureRandom.nextInt(1, 7);
        System.out.println("first dice rolls " + a);
        System.out.println("second dice rolls " + b);
        if ((a + b == 7) || (a + b == 11)) {
            System.out.println("You win!");
        } else if ((a + b == 2) || (a + b == 3) || (a + b == 12)) {
            System.out.println("craps, You lose!");
        } else if ((a + b == 4) || (a + b == 5) || (a + b == 6) || (a + b == 8) || (a + b == 9) || (a + b == 10)) {
            points = a + b;
            while (count != -1) {
                a = secureRandom.nextInt(1, 7);
                b = secureRandom.nextInt(1, 7);
                System.out.println("first dice rolls " + a);
                System.out.println("second dice rolls " + b);
                if (a + b == points) {
                    System.out.println("You win!");
                    break;
                } else if (a + b == 7) {
                    System.out.println("You lose!");
                    break;
                }
                count++;
            }
        }
    }
}
