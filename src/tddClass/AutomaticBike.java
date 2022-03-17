package tddClass;

public class AutomaticBike {
    private boolean isOn;
    private int speed = 0;
    private String gearType;

    public void turnOn() {
        isOn = !isOn;
    }

    public boolean getOn() {
        return isOn;
    }

    public void accelerate() {if(isOn){
        if( speed <= 20){
          speed = speed + 1;
        }else if(speed <=30){
          speed = speed + 2;
        }else if(speed <= 40){
            speed = speed + 3;
        }else {
            speed = speed + 4;
        }}
    }

    public void decelerate(){ if (isOn){
        if( speed <= 20){
            speed = speed - 1;
        }else if(speed <=30){
            speed = speed - 2;
        }else if(speed <= 40){
            speed = speed - 3;
        }else {
            speed = speed - 4;
        }}
    }

    public int getSpeed() {
        return speed;
    }

    public void gearState(int value) { if(isOn){
        if (value >= 0 && value <= 20) {gearType = "Gear1";}
        if (value >= 21 && value <= 30) {gearType = "Gear2";}
        if (value >= 31 && value <= 40) {gearType = "Gear3";}
        if (value > 40) {gearType = "Gear4";}

        }
    }
    public String getGearType(){
        return gearType;
    }
}