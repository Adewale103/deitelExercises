package personal2;

public class IntegerSet {
    private int[] set;
    private boolean[] elements;

    public IntegerSet(){
        set = new int[101];
        elements = new boolean[101];
    }
    public void addIntegerToSet(int value){
        set[value] = value;
        elements[value] = true;
    }

    public boolean[] getElements() {
        return elements;
    }
}
