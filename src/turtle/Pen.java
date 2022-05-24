package turtle;

public class Pen {
    private boolean isDown;

    public void penUp(){
        isDown = false;
    }

    public void penDown(){
        isDown = true;
    }

    public boolean isDown(){
        return isDown;
    }
}
