package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    private Television user;
    @BeforeEach
    public void startWithThis(){
        user = new Television();
    }
    @Test
    public void turnOnTest() {
        assertEquals(false, user.isOn());
        user.turnOn();
        assertEquals(true, user.isOn());

    }

    @Test
    public void turnOffTest() {
        user.turnOn();
        assertEquals(true, user.isOn());
        user.turnOn();
        assertEquals(false, user.isOn());

    }

    @Test
    public void channelSelectionTest() {
        user.turnOn();
        assertEquals(true, user.isOn());
        user.setChannel(89);
        assertEquals(89, user.getChannel());
    }

    @Test
    public void channelUpTest() {
        user.turnOn();
        assertEquals(true, user.isOn());
        user.setChannel(98);
        user.channelUp();
        assertEquals(99, user.getChannel());
    }

    @Test
    public void channelDownTest() {
        user.turnOn();
        assertEquals(true, user.isOn());
        user.setChannel(56);
        user.channelDown();
        user.channelDown();
        assertEquals(54, user.getChannel());
    }

    @Test
    public void volumeSetTest() {
        user.turnOn();
        assertEquals(true, user.isOn());
        user.setVolumeLevel(23);
        assertEquals(23, user.getVolumeLevel());
    }

    @Test
    public void increaseVolumeTest() {
        user.turnOn();
        assertEquals(true, user.isOn());
        user.setVolumeLevel(25);
        user.increaseVolumeLevel();
        assertEquals(26, user.getVolumeLevel());
    }

    @Test
    public void decreaseVolumeTest() {
        user.turnOn();
        assertEquals(true, user.isOn());
        user.setVolumeLevel(25);
        user.decreaseVolumeLevel();
        user.decreaseVolumeLevel();
        user.decreaseVolumeLevel();
        assertEquals(22, user.getVolumeLevel());
    }

    @Test
    public void tvModeSwitch() {
        user.turnOn();
        assertEquals(true, user.isOn());
        user.modeSwitch();
        user.modeSwitch();
        user.modeSwitch();
        assertEquals("TV", user.getMode());
    }

    @Test
    public void muteTest() {
        user.turnOn();
        assertEquals(true, user.isOn());
        user.setVolumeLevel(24);
        user.increaseVolumeLevel();
        user.increaseVolumeLevel();
        user.toggleMute();
        user.toggleMute();
        assertFalse(user.isMute());
        assertEquals(26,user.getVolumeLevel());

    }

    @Test
    public void unmuteTest() {
        user.turnOn();
        assertEquals(true, user.isOn());
        user.setVolumeLevel(24);
        user.increaseVolumeLevel();
        user.increaseVolumeLevel();
        user.increaseVolumeLevel();
        user.toggleMute();
        user.toggleMute();

       // assertTrue(panasonic.isMute());
        assertEquals(27,user.getVolumeLevel());
    }

    @Test
    public void muteVolumeUpTest() {
        user.turnOn();
        assertEquals(true, user.isOn());
        user.setVolumeLevel(24);
        user.increaseVolumeLevel();
        user.isMute();
        user.increaseVolumeLevel();
        assertEquals(26,user.getVolumeLevel());

    }

    @Test
    public void muteVolumeDownTest() {
        user.turnOn();
        assertEquals(true, user.isOn());
        user.setVolumeLevel(24);
        user.decreaseVolumeLevel();
        user.isMute();
        user.decreaseVolumeLevel();
        assertEquals(22,user.getVolumeLevel());

    }
}
