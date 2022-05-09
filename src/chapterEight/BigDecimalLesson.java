package chapterEight;


import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

import static java.lang.System.out;

public class BigDecimalLesson {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
     BigDecimal principal = BigDecimal.valueOf(1000);
     BigDecimal rate = BigDecimal.valueOf(0.05);
        out.printf("%s%12s%n","year","amount");

        for (int year = 1; year <= 10; year++) {
            BigDecimal amount = principal.multiply((rate.add(BigDecimal.ONE).pow(year)));
            out.printf("%2s%16s%n",year, NumberFormat.getCurrencyInstance().format(amount));

        }



    }


}

