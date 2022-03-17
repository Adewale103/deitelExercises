package tddClass;

public class Television {
    private boolean isOn;
    private int channel;
    private int volumeLevel;
    private boolean isMute;
    private String mode = "TV";

    public void turnOn() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setChannel(int channel1) { if (isOn){
        if (channel1 < 0) {
            channel = 1;
        } else if
        (channel1 >= 100) {
            channel = 100;
        } else
            channel = channel1;}
    }

    public void channelUp() { if (isOn){
        if (channel < 0) {
            channel = 1;
        } else if (channel >= 100) {
            channel = 100;
        } else
            channel = channel + 1;}
    }

    public void channelDown() { if (isOn){
        if (channel < 0) {
            channel = 1;
        }
        {
            if (channel >= 100) {
                channel = 100;
            } else
                channel = channel - 1;}
        }
    }


    public int getChannel() {
        return channel;
    }

    public void setVolumeLevel(int volume) { if (isOn){
        if (volume < 0) {
            volumeLevel = 0;
        } else if (volume > 30) {
            volumeLevel = 30;
        } else volumeLevel = volume;
       }
    }

    public int getVolumeLevel() {
        if(isMute)
        volumeLevel = 0;
        return volumeLevel;
    }

    public void increaseVolumeLevel() {if (isOn){
         if (volumeLevel >= 30) {
            volumeLevel = 30;
        } else if(!isMute) volumeLevel = volumeLevel + 1;
        }
    }


    public void decreaseVolumeLevel() {if (isOn) {
        if (volumeLevel < 0) {
            volumeLevel = 0;
        } else if (volumeLevel >= 30) {
            volumeLevel = 30;
        } else if(!isMute) volumeLevel = volumeLevel - 1;
        }
    }


    public void modeSwitch() { if (isOn){
        if (mode == "TV") {
            mode = "AV1";
        } else if (mode == "AV1") {
            mode = "AV2";
        } else if (mode == "AV2") {
            mode = "TV";
        }}
    }

    public String getMode() {
        return mode;
    }

    public void toggleMute() {
        if (isOn) {
            isMute = !isMute;
        }
        }

    public boolean isMute(){
       return isMute;
    }
}


