package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutomaticBikeTest {
    private AutomaticBike user1;
    @BeforeEach
    public void startWithThis(){
        user1 = new AutomaticBike();
    }
    @Test
    public void turnOnTest(){
        user1.turnOn();
        assertEquals(true,user1.getOn());
    }

    @Test
    public void turnoffTest(){
        user1.turnOn();
        assertEquals(true,user1.getOn());
        user1.turnOn();
        assertEquals(false,user1.getOn());
    }
    @Test
    public void increaseInGear1Test(){
        user1.turnOn();
        assertEquals(true,user1.getOn());
        int number= 1;
        while(number <= 18) {
            user1.accelerate();
            number = number + 1;
        }
        assertEquals(18,user1.getSpeed());
    }

    @Test
    public void increaseInGear2Test(){
        user1.turnOn();
        assertEquals(true,user1.getOn());
        int i = 1;
        while(i <= 24){
            user1.accelerate();
            i = i + 1;
        }
        assertEquals(27,user1.getSpeed());
    }

    @Test
    public void increaseInGear3Test() {
        user1.turnOn();
        assertEquals(true,user1.getOn());
        int i = 1;
        while(i <= 21){
            user1.accelerate();
            i = i + 1;
        }

        user1.accelerate();
        user1.accelerate();
        user1.accelerate();
        user1.accelerate();
        assertEquals(29, user1.getSpeed());

    }

    @Test
    public void increaseInGear4Test(){
        user1.turnOn();
        assertEquals(true,user1.getOn());
        int i = 1;
        while(i <= 21){
            user1.accelerate();
            i = i + 1;
        }

        assertEquals(21,user1.getSpeed());
        user1.accelerate();
        user1.accelerate();
        user1.accelerate();
        user1.accelerate();
        user1.accelerate();
        assertEquals(31,user1.getSpeed());
        user1.accelerate();
        user1.accelerate();
        user1.accelerate();
        assertEquals(40,user1.getSpeed());
        user1.accelerate();
        assertEquals(43,user1.getSpeed());
        user1.accelerate();
        assertEquals(47,user1.getSpeed());
    }

    @Test
    public void decreaseInGearOneTest(){
        user1.turnOn();
        assertEquals(true,user1.getOn());
        int i = 1;
        while(i <= 21){
            user1.accelerate();
            i = i + 1;
        }
        assertEquals(21,user1.getSpeed());
        user1.accelerate();
        user1.accelerate();
        assertEquals(25,user1.getSpeed());
        user1.decelerate();
        user1.decelerate();
        assertEquals(21,user1.getSpeed());
        user1.decelerate();
        assertEquals(19,user1.getSpeed());

    }

     @Test
    public void decreaseInGearTwoTest(){
         user1.turnOn();
         assertEquals(true,user1.getOn());
         int i = 1;
         while(i <= 21){
             user1.accelerate();
             i = i + 1;
         }
         assertEquals(21,user1.getSpeed());
         user1.accelerate();
         user1.accelerate();
         user1.accelerate();
         user1.accelerate();
         user1.accelerate();
         assertEquals(31,user1.getSpeed());
         user1.accelerate();
         user1.accelerate();
         assertEquals(37,user1.getSpeed());
         user1.decelerate();
         user1.decelerate();
         assertEquals(31,user1.getSpeed());
         user1.decelerate();
         user1.decelerate();
        assertEquals(26,user1.getSpeed());
    }

    @Test
    public void decreaseInGear3Test(){
        user1.turnOn();
        assertEquals(true,user1.getOn());
        int i = 1;
        while(i <= 21){
            user1.accelerate();
            i = i + 1;
        }
        assertEquals(21,user1.getSpeed());
        user1.accelerate();
        user1.accelerate();
        user1.accelerate();
        user1.accelerate();
        user1.accelerate();
        assertEquals(31,user1.getSpeed());
        user1.accelerate();
        user1.accelerate();
        user1.accelerate();
        user1.accelerate();
        assertEquals(43,user1.getSpeed());
        user1.accelerate();
        user1.accelerate();
        assertEquals(51,user1.getSpeed());
        user1.decelerate();
        user1.decelerate();
        assertEquals(43,user1.getSpeed());
        user1.decelerate();
        assertEquals(39,user1.getSpeed());
    }
    @Test
    public void decreaseInGear4Test(){
        user1.turnOn();
        assertEquals(true,user1.getOn());
        int i = 1;
        while(i <= 21){
            user1.accelerate();
            i = i + 1;
        }
        assertEquals(21,user1.getSpeed());
        user1.accelerate();
        user1.accelerate();
        user1.accelerate();
        user1.accelerate();
        user1.accelerate();
        assertEquals(31,user1.getSpeed());
        user1.accelerate();
        user1.accelerate();
        user1.accelerate();
        user1.accelerate();
        assertEquals(43,user1.getSpeed());
        user1.accelerate();
        user1.accelerate();
        assertEquals(51,user1.getSpeed());
        user1.decelerate();
        user1.decelerate();
        assertEquals(43,user1.getSpeed());
    }

    @Test
    public void gearStatusTest1(){
        user1.turnOn();
        assertEquals(true,user1.getOn());
        user1.gearState(15);
        assertEquals("Gear1",user1.getGearType());
    }

    @Test
    public void gearStatusTest2(){
        user1.turnOn();
        assertEquals(true,user1.getOn());
        user1.gearState(26);
        assertEquals("Gear2",user1.getGearType());
    }

    @Test
    public void gearStatusTest3(){
        user1.turnOn();
        assertEquals(true,user1.getOn());
        user1.gearState(37);
        assertEquals("Gear3",user1.getGearType());
    }

    @Test
    public void gearStatusTest4(){
        user1.turnOn();
        assertEquals(true,user1.getOn());
        user1.gearState(56);
        assertEquals("Gear4",user1.getGearType());
    }
}
