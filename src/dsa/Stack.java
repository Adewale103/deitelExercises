package dsa;

public class Stack {
    int numberOfElements;
    int[] elements = new int[10];

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public void push(int element) {
        elements[numberOfElements] = element;
        numberOfElements +=1;
    }

    public int pop() {
        numberOfElements--;
        return elements[numberOfElements];
    }

    public int peek() {
        return elements[numberOfElements-1];
    }
}
