package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {
    private AirConditioner user1;
    @BeforeEach
    public void startWithThis(){
        user1 = new AirConditioner();
    }
    @Test
    public void turnOnTest() {
        assertEquals(false, user1.getPowerStatus());
        user1.turnOn();
        assertEquals(true, user1.getPowerStatus());

    }

    @Test
    public void turnOffTest() {
        user1.turnOn();
        assertEquals(true, user1.getPowerStatus());
        user1.turnOn();
        assertEquals(false, user1.getPowerStatus());
    }

    @Test
    public void increaseTemperatureTest() {
        user1.turnOn();
        assertEquals(true, user1.getPowerStatus());
        user1.setTemperature(23);
        for (int i = 1; i <= 6; i++) {
            user1.increaseTemperature();

            assertEquals(29, user1.getTemperature());
        }
    }
        @Test
        public void decreaseTemperatureTest () {
            user1.turnOn();
            assertEquals(true, user1.getPowerStatus());
            user1.setTemperature(23);
            user1.decreaseTemperature();
            user1.decreaseTemperature();
            user1.decreaseTemperature();
            assertEquals(20, user1.getTemperature());
        }
        @Test
        public void below16Test () {
            user1.turnOn();
            assertEquals(true, user1.getPowerStatus());
            assertEquals(16, user1.getTemperature());
            user1.decreaseTemperature();
            assertEquals(16, user1.getTemperature());
        }
        @Test
        public void above30Test () {
            user1.turnOn();
            assertEquals(true, user1.getPowerStatus());
            user1.setTemperature(30);
            user1.increaseTemperature();
            assertEquals(30, user1.getTemperature());
        }
    }

