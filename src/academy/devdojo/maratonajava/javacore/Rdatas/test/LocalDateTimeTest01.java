package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {

        // Classe LocalDateTime

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // LocalDateTime metodo parse
        LocalDate date = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.parse("23:45:00");

        System.out.println(date);
        System.out.println(time);

        LocalDateTime ltd1 = date.atTime(time);
        LocalDateTime ltd2 = time.atDate(date);

        System.out.println("ltd1: " + ltd1);
        System.out.println("ltd2: " + ltd2);

    }
}
