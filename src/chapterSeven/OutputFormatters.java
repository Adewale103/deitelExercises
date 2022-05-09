package chapterSeven;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OutputFormatters {
    public static void main(String[] args) {

        BigDecimal money = new BigDecimal("34567890678.20");
        DecimalFormat formatter = new DecimalFormat();
        formatter.setGroupingUsed(true);
        formatter.setGroupingSize(3);
        System.out.println(formatter.format(money));

        LocalDateTime hisGrandMother = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, M-dd-yyyy hh:mm:s a");
        System.out.println(dateTimeFormatter.format(hisGrandMother));

        System.out.println(DateTimeFormatter.ofPattern("E, dd-MM-yyyy, a").format(LocalDateTime.now()));
    }
}
