package Personal;


import java.util.ArrayList;
import java.util.List;

public class ArrayLIST {
    public static void main(String[] args) {
        List <Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= 100 ; i++) {
            int count = 0;
            for (int j = 2; j <= 100; j++) {
                if (i % j == 0){count++;}
            }
            if(count == 1){primeNumbers.add(i);}
        }
        for (int i = 0; i < primeNumbers.size(); i++) {
            System.out.println(primeNumbers.get(i));
        }
    }
}
