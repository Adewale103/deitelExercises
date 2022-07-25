package chapterSeventeen;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPractice2 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        String result = random.ints(20,1,10)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("-"));

        System.out.println(result);

        int[] values = {34,67,8,54,21,90,44};

       String a = IntStream.of(values)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("-"));

        System.out.println(a);
    }
}
