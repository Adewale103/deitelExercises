package chapterSeventeen;

import java.security.SecureRandom;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamsPractice {
    public static void main(String[] args) {
        int sum = IntStream.range(1,10).sum();
        System.out.println(sum);

       int product = IntStream.rangeClosed(1,5).
               reduce(1,(acc,x) -> x * acc);
        System.out.println(product);

        int minimum = IntStream.rangeClosed(1,8)
                .min().getAsInt();
        System.out.println(minimum);


        int triple = IntStream.rangeClosed(1,20).
                filter((x)-> x % 2 != 0)
                .map((x)-> x*x*x).sum();

        System.out.println(triple);
        SecureRandom random = new SecureRandom();

        random.ints(10,1,7)
                .filter((x) -> x % 2 == 0)
                .forEach(System.out::println);


    }
}
