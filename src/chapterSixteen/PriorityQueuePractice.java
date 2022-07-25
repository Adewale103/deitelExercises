package chapterSixteen;

import java.util.PriorityQueue;

public class PriorityQueuePractice {
    public static void main(String[] args) {
        PriorityQueue<Double> numbers = new PriorityQueue<>();
        numbers.offer(3.455);
        numbers.offer(1.2345);
        numbers.offer(8.6478);
        numbers.offer(4.32);


        while(numbers.size() > 0){
            System.out.println("Peek "+numbers.peek());
            numbers.poll();
        }
    }
}
