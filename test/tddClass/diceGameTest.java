package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class diceGameTest {
    private diceGame player;
    @BeforeEach
    public void startWithThis(){
     player = new diceGame();
    }
    @Test
    public void sumAtFirstRollIsSevenTest(){
        player.rollDice(2,5);
        assertEquals("win",player.getStatus());
    }
    @Test
    public void sumAtFirstRollIsElevenTest(){
        player.rollDice(5,6);
        assertEquals("win",player.getStatus());
    }
    @Test
    public void sumAtFirstRollIsTwoTest(){
        player.rollDice(1,1);
        assertEquals("lose",player.getStatus());
    }
    @Test
    public void sumAtFirstRollIsThreeTest(){
        player.rollDice(1,2);
        assertEquals("lose",player.getStatus());
    }
    @Test
    public void sumAtFirstRollIsTwelveTest(){
        player.rollDice(6,6);
        assertEquals("lose",player.getStatus());
    }

    @Test
    public void sumAtFirstRollIsEightTest(){
        player.rollDice(2,6);
        assertEquals(8,player.getPoints());
    }
    @Test
    public void sumAtSubsequentRollIsSevenTest(){
        player.rollDice(5,5);
        assertEquals(10,player.getPoints());
        player.subsequentRollTest(4,3);
        assertEquals("lose",player.getStatus());
    }
    @Test
    public void sumAtSecondRollIsNotSameAsSumAtFirstRollTest(){
        player.rollDice(3,1);
        assertEquals(4,player.getPoints());
        player.subsequentRollTest(2,3);
        assertEquals("try again",player.getStatus());
    }
    @Test
    public void sumAtSecondRollIsSameAsSumAtFirstRollTest(){
        player.rollDice(3,1);
        assertEquals(4,player.getPoints());
        player.subsequentRollTest(2,2);
        assertEquals("win",player.getStatus());
    }
}
