package tddClass;

public class AirConditioner {
    private boolean isOn;
    private int temperature = 16;

    public void turnOn() {
        isOn = !isOn;
    }

    public boolean getPowerStatus() {
        return isOn;
    }

    public void setTemperature(int value1){if(isOn){
        if (value1 > 30)
            temperature = 30;
        if (value1 >= 16) if (value1 <= 30) temperature = value1;

        else
            temperature = 16;}
    }

    public int getTemperature(){
        return temperature;
    }

    public void increaseTemperature() {if(isOn){
        if (temperature >= 16) if (temperature < 30)
            temperature = temperature + 1;
        else if (temperature > 30)
            temperature = 30;}
        else temperature = 16;
    }

    public void decreaseTemperature() {if(isOn){
        if (temperature > 16) if (temperature <= 30)
            temperature = temperature - 1;
            else temperature = 16;
    }

    }
}


