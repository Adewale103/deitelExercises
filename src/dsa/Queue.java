package dsa;

public class Queue {
    private int numberOfElements;
    int[] elements = new int[10];
    public boolean isEmpty() {
        if(numberOfElements == 0){
            return true;
        }
        return false;
    }

    public void push(int item) {
        elements[numberOfElements] = item;
        numberOfElements+=1;
    }

    public int pop() {
        return elements[numberOfElements];
    }
}
