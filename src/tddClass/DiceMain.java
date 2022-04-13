package tddClass;

import java.security.SecureRandom;

public class DiceMain {
    static SecureRandom secureRandom = new SecureRandom();
    static  diceGame dicegame = new diceGame();
    public static void main(String[] args) {
        int a = secureRandom.nextInt(1, 7);
        int b = secureRandom.nextInt(1, 7);
        System.out.println(a+","+b);
        dicegame.rollDice(a, b);
        System.out.println(dicegame.getStatus());
        if (dicegame.getStatus().equals("roll again")){
            a = secureRandom.nextInt(1, 7);
            b = secureRandom.nextInt(1, 7);
            System.out.println(a+","+b);
            dicegame.subsequentRollTest(a,b);
            System.out.println(dicegame.getStatus());
        }


    }
//    public void rollAgainProcess(diceGame dicegame){
//        a = secureRandom.nextInt(1, 7);
//        b = secureRandom.nextInt(1, 7);
//        System.out.println(a+","+b);
//        dicegame.subsequentRollTest(a,b);
//    }
}
