package Personal;


import java.util.ArrayList;
import java.util.List;

public class ArrayLIST {
    public static void main(String[] args) {
        List <Integer> primeNumbers = new ArrayList<Integer>();
        int count;
        for (int i = 2; i < 100; i++) {
            count = 0;
            for (int j = 2; j < 100; j++) {
                if (i % j == 0){count++;}
            }
            if (count == 1){
                primeNumbers.add(i);
            }
        }
        System.out.println(primeNumbers.set(0,2));
    }
}
