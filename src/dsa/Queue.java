package dsa;

public class Queue {
    private int numberOfElements;
    private int popCounter;
    String[] elements = new String[10];
    public boolean isEmpty() {
        if(numberOfElements == 0){
            return true;
        }
        return false;
    }

    public void push(String item) {
        if(numberOfElements == 10){
            throw new ArrayIndexOutOfBoundsException("Queue is full!");
        }
        else {
        elements[numberOfElements] = item;
        numberOfElements+=1;}
    }

    public String pop() {
        String poppedItem = elements[popCounter];
        elements[popCounter] = null;
        popCounter++;
        return poppedItem;
    }
    public String peek() {
        return elements[numberOfElements-1];
    }
}
